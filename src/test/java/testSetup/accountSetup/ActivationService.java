package testSetup.accountSetup;


import hr.assecosee.mobile.smap.platform.access.admin.provisioning.api.ws.*;
import testSetup.appiumSetup.DataSource;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.BindingProvider;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

public class ActivationService {

    private static ActivationService instance;

    public static final int OK = 0;
    public static final String DOMAIN = "Main";
    public static String[] codes;
    public String activationCode;


    public static void main(String args[]) {
        System.out.println(getInstance().getActivationCode(DataSource.getUserID(),"http://mobdemo01.ipa.hr.asseco-see.local:7803/SMAP/SmapWSImplService"));
    }

    private static UserTransport createUser(UserTransport user, SmapWSImpl smapProv) throws Exception {
        UserTransport userTrans;
        List<UserTransport> users = new ArrayList();
        users.add(user);
        UserResult createdUsers = smapProv.createUsers(null, users, "Main");
        checkStatus(createdUsers.getStatusInfo(), "Unable to create user.");
        userTrans = createdUsers.getUsers().get(0);
        return userTrans;
    }

    private static void checkStatus(StatusInfo statusInfo, String message) throws Exception {
        if (statusInfo.getStatusCode() != OK) {
            throw new Exception(message + " Reason: " + statusInfo.getStatusMessage());
        }
    }

    public String getActivationCode(String userId, String SMAPProvisioningURL)  {
        try {
            System.out.println("Calling getActivationCode for " + userId + " and " + SMAPProvisioningURL);
            GregorianCalendar gregCal = new GregorianCalendar();
            XMLGregorianCalendar xmlGregCal = DatatypeFactory.newInstance().newXMLGregorianCalendar(gregCal);
            UserTransport user = new UserTransport();
            user.setUserId(userId);
            user.setAddress("Address");
            user.setCity("City");
            user.setCountryCode(DataSource.getCountry());
            user.setEmail("tester@tester.com");
            user.setRegDate(xmlGregCal);
            user.setLanguageCode("EN");
            user.setName("Tester");
            user.setSurname("Tester");
            user.setPost("10000");

            String activationServiceId = DataSource.getServiceId();
            SmapWSImpl smapProv = getService(SMAPProvisioningURL);

            UserResult readUsersByUserId = smapProv.readUsersByUserId(null, Arrays.asList(user.getUserId()), null, DOMAIN);

            UserTransport userTrans = null;
            if (readUsersByUserId != null && !readUsersByUserId.getUsers().isEmpty()) {
                userTrans = readUsersByUserId.getUsers().get(0);
                //logger.info("User " + user.getUserId() + " found.");
            } else {
                userTrans = createUser(user, smapProv);
            }

            UserDeviceTransport udTrans = createUserDevice(userTrans, smapProv);
            ServiceTransport serviceTrans = getService(activationServiceId, smapProv);

            ServiceActivationResult createdServiceActivation = smapProv.createServiceActivation(null, userTrans.getId(), udTrans.getId(), serviceTrans.getId(), "Main");
            checkStatus(createdServiceActivation.getStatusInfo(), "Unable to create service activation.");

            ServiceActivationResult sActData = smapProv.readServiceActivation(null, userTrans.getId(), udTrans.getId(), serviceTrans.getId(), "Main");

            activationCode = sActData.getServiceActivations().get(0).getActivationCode().replaceAll("\\s", "");;
            System.out.println("Received activation code: " + activationCode);

        return activationCode;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return "";

    }

    private static String generateDeviceName() {
        String randomUUID = UUID.randomUUID().toString();
        return "dev_" + randomUUID.replace("-", "").substring(10);
    }

    private static UserDeviceTransport createUserDevice(UserTransport userTrans, SmapWSImpl smapProv) throws Exception {
        UserDeviceTransport udTrans = new UserDeviceTransport();
        udTrans.setDeviceId(generateDeviceName());
        udTrans.setMSISDN("1234567890");
        udTrans.setUserId(userTrans.getId());
        udTrans.setUserDeviceId(268L);
        List<UserDeviceTransport> userDevices = new ArrayList<>();
        userDevices.add(udTrans);
        UserDeviceResult createdUserDevices = smapProv.createUserDevices(null, userDevices, "Main");
        checkStatus(createdUserDevices.getStatusInfo(), "Unable to create user device.");
        udTrans = createdUserDevices.getUserDevices().get(0);
        return udTrans;
    }

    public static SmapWSImpl getService(String SMAPProvisioningURL) throws MalformedURLException {
        URL baseUrl = hr.assecosee.mobile.smap.platform.access.admin.provisioning.api.ws.SmapWSImplService.class.getResource(".");
        URL wsdlUrl = new URL(baseUrl, SMAPProvisioningURL + "?wsdl");
        SmapWSImpl smapProv = new SmapWSImplService(wsdlUrl).getSmapWSImplPort();
        BindingProvider bp = (BindingProvider) smapProv;
        bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, SMAPProvisioningURL);
        return smapProv;
    }

    private static ServiceTransport getService(String activationServiceId, SmapWSImpl smapProv) throws Exception {
        PageInfo pageInfo = new PageInfo();
        List<FilterCriteriaTransport> filterCriterias = new ArrayList<>();
        FilterCriteriaTransport fc = new FilterCriteriaTransport();
        fc.setFilterKey("serviceId");
        fc.setFilterValue(activationServiceId);
        filterCriterias.add(fc);
        FindRecordsResult findRecords = smapProv.findRecords(null, 1L, filterCriterias, pageInfo, "Main");
        List<Long> ids = findRecords.getIds();
        ServiceTransport serviceTrans;
        ServiceResult readServices = smapProv.readServices(null, ids, null, "Main");
        checkStatus(readServices.getStatusInfo(), "Unable to obtain service data.");
        serviceTrans = readServices.getServices().get(0);
        return serviceTrans;
    }

    public static ActivationService getInstance() {
        if (instance == null) {
            synchronized (ActivationService.class) {
                instance = new ActivationService();
            }
        }
        return instance;
    }

}
