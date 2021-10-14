package testSetup.appiumSetup;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CreateTranslations {

    public static void main() throws IOException {
        String inputPath = "product_lang.csv";
        String className = "Translations";
        String packageName = "package appObjects;";
        String fileName = "src/test/java/appObjects/"+className + ".java";
        List<Translation> translations = getTranslations(inputPath);
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        writer.write(packageName+"\n"+"public class " + className + " {");
        writer.newLine();
        for (Translation translation : translations) {
            writer.write("\tpublic static final String " + translation.key.replace(".","_") + " = \"" + translation.value.replace("\"", "") + "\""+";");
            writer.newLine();
        }
        writer.write("}");
        writer.flush();
    }
    static class Translation {
        private String key;
        private String value;
        public Translation(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }
    public static List<Translation> getTranslations(String filePath) throws IOException {
        List<Translation> translations = new ArrayList();
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        while((line = reader.readLine()) != null) {
            String[] splited = line.split(";");
            if (splited.length < 4) continue;
            String key = splited[0];
            String value = splited[3];
            if (value.isEmpty()) {
                value = splited[3];
            }
            translations.add(new Translation(key, value));
        }
        return translations;
    }
}
