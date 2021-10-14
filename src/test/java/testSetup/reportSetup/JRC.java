package testSetup.reportSetup;

import com.atlassian.jira.rest.client.api.IssueRestClient;
import com.atlassian.jira.rest.client.api.JiraRestClient;
import com.atlassian.jira.rest.client.api.JiraRestClientFactory;
import com.atlassian.jira.rest.client.api.domain.BasicIssue;
import com.atlassian.jira.rest.client.api.domain.Issue;
import com.atlassian.jira.rest.client.api.domain.input.AttachmentInput;
import com.atlassian.jira.rest.client.api.domain.input.ComplexIssueInputFieldValue;
import com.atlassian.jira.rest.client.api.domain.input.IssueInput;
import com.atlassian.jira.rest.client.api.domain.input.IssueInputBuilder;
import com.atlassian.jira.rest.client.internal.async.AsynchronousJiraRestClientFactory;
import io.atlassian.util.concurrent.Promise;
import testSetup.Base;
import testSetup.appiumSetup.DataSource;

import java.io.FileInputStream;
import java.net.URI;
import java.util.Collections;
import java.util.List;

public class JRC extends Base {

    public static String getApplicationVersion() {
        if (appVersion != null) {
            return appVersion;
        } else {
            return DataSource.getVersion();
        }
    }


    public static Issue getIssue(String issueKey) throws Exception
    {
        final URI jiraServerUri = new URI(DataSource.getJiraUri());
        final JiraRestClient restClient = new AsynchronousJiraRestClientFactory().createWithBasicHttpAuthentication(jiraServerUri, DataSource.getJiraUser(), DataSource.getJiraPassword());

        System.out.println("\n connecting... ");

        Promise issuePromise = restClient.getIssueClient().getIssue(issueKey);
        System.out.println("issuePromise... ");

        return (Issue) issuePromise.claim();
    }

    public static void newIssue(String summary, String description) throws Exception {

        final URI jiraServerUri = new URI(DataSource.getJiraUri());


        System.out.println("CREATING AN ISSUE... ");

        JiraRestClientFactory restClientFactory = new AsynchronousJiraRestClientFactory();
        JiraRestClient restClient = restClientFactory.createWithBasicHttpAuthentication(jiraServerUri, DataSource.getJiraUser(), DataSource.getJiraPassword());
        IssueRestClient issueClient = restClient.getIssueClient();

        IssueInputBuilder newIssue = new IssueInputBuilder(DataSource.getJiraProject(), 1l, summary);
        newIssue.setDescription(description)
                .setComponentsNames(List.of(DataSource.getPlatform()))
                .setAffectedVersionsNames(List.of("UCB"+"_"+DataSource.getPlatform()+"_"+getApplicationVersion()))
                .setReporterName(DataSource.getJiraUser())
                .setAssigneeName(DataSource.getJiraUser())
                .setFieldValue("labels",List.of("AUTO_test","COMPONENT_Test"))
                .setFieldValue("customfield_11520", DataSource.getUserID())
                .setFieldValue("customfield_11521", DataSource.getTimestamp())
                .setFieldValue("customfield_10800", DataSource.getEpicLink())
                .setFieldValue("customfield_11522", "Samsung S9")
                .setFieldValue("customfield_11523", DataSource.getOSVersion())
                .setFieldValue("customfield_11500", List.of(ComplexIssueInputFieldValue.with("value", DataSource.getCountry())))
                .setFieldValue("customfield_11503", List.of(ComplexIssueInputFieldValue.with("value", DataSource.getEnvironment())));

        IssueInput issue = newIssue.build();
        BasicIssue issueObj = issueClient.createIssue(issue).claim();

        String issueKey = issueObj.getKey();

        //ADD SCREENSHOT

        final Issue updateIssue = issueClient.getIssue(issueKey).claim();

        issueClient.addAttachments(updateIssue.getAttachmentsUri(),
                new AttachmentInput(screenshotLocation, new FileInputStream(screenshotLocation))).claim();

        System.out.println(String.format("NEW CREATED ISSUE IS: %s\r\n", issueKey));
        String issueLink = "https://jira.asseco-see.hr/browse/"+issueKey;
        System.out.println("LINK: "+ issueLink);

    }

}
