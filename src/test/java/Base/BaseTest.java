package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Config_.ConfigReader;

public class BaseTest {
	protected WebDriver driver ;
	ConfigReader config;
	@BeforeMethod
	/*public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com");
	}*/
	public void setup() throws Exception {

		config = new ConfigReader();

        // Launch Browser
        //driver = new ChromeDriver();

        String browser = config.getBrowser();

        if(browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        }
        else if(browser.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        }

        // Maximize window
        driver.manage().window().maximize();


        // Open URL from config.properties
        driver.get(config.getURL());
    }

	@AfterMethod
	public void teardown() {
		if(driver != null) {
			driver.quit();
		}
	}

}
