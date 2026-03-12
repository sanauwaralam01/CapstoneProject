package Config_;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
	Properties prop;

    public ConfigReader() throws Exception {

        prop = new Properties();

        FileInputStream fis = new FileInputStream("src/test/resources/config.properties");

        prop.load(fis);
    }

    public String getURL() {

        return prop.getProperty("url");
    }
    public String getBrowser() {
        return prop.getProperty("browser");
    }

}
