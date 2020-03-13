package Utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {

    private static Properties configFiles;

    static {

        String path = "configuration.properties";
        try {
            FileInputStream input = new FileInputStream(path);
            configFiles = new Properties();
            configFiles.load(input);
            input.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static String getProperty (String keyValue){
        return configFiles.getProperty(keyValue);
    }
}
