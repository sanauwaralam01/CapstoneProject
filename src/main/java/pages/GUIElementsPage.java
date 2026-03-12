package pages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GUIElementsPage {
	WebDriver driver;
	public GUIElementsPage(WebDriver driver) {
		this.driver=driver;
	}
	public void enterName(String name) {
		driver.findElement(By.id("name")).sendKeys(name);

	}
	public void enterEmail(String email) {
	    driver.findElement(By.id("email")).sendKeys(email);
	}
	public void enterPhone(String phone) {
	    driver.findElement(By.id("phone")).sendKeys(phone);
	}

	public void enterAddress(String address) {
	    driver.findElement(By.id("textarea")).sendKeys(address);
	}

	public void selectGender() {
	     driver.findElement(By.id("male")).click();
	}
	public void selectDays() {

        driver.findElement(By.id("monday")).click();
        driver.findElement(By.id("wednesday")).click();
        driver.findElement(By.id("friday")).click();
    }

    public void selectCountry() {

        Select country = new Select(driver.findElement(By.id("country")));
        country.selectByVisibleText("India");
    }

    public void selectColor() {

        Select color = new Select(driver.findElement(By.id("colors")));


        for(WebElement option : color.getOptions()) {
            if(option.getText().equals("Red")) {
                option.click();
                break;   // stops after selecting first Red
            }
        }
    }

    public void selectSortedList() {

        Select sorted = new Select(driver.findElement(By.id("animals")));
        sorted.selectByVisibleText("Lion");
    }

    public void selectDate() {

        WebElement date = driver.findElement(By.id("datepicker"));
        date.sendKeys("03/06/2026");
    }
    public void selectDate2() {

        WebElement date2 = driver.findElement(By.id("txtDate"));
        date2.sendKeys("06/06/2026");
    }

    public void uploadFile() {

        driver.findElement(By.id("singleFileInput"))
        .sendKeys("C:\\Users\\Md Sanauwar Alam\\Downloads\\The Ultimate Python Handbook.pdf");
    }
    public void UploadMultipleFiles() {

        driver.findElement(By.id("multipleFilesInput"))
        .sendKeys("C:\\Users\\Md Sanauwar Alam\\Downloads\\MySQL Handbook.pdf");
    }
    public void Section1() {
    	driver.findElement(By.id("input1")).sendKeys("first Input by tester");
    	driver.findElement(By.id("btn1")).click();
    }
    public void Section2() {
    	driver.findElement(By.id("input2")).sendKeys("Second Input by tester");
    	driver.findElement(By.id("btn2")).click();
    }
    public void Section3() {
    	driver.findElement(By.id("input3")).sendKeys("Second Input by tester");
    	driver.findElement(By.id("btn3")).click();
    }
    public void Start() {
    	driver.findElement(By.className("start")).click();
    }

    public void Wikipedia() {
    	driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys("srk");
    	driver.findElement(By.xpath("//input[@type='submit']")).click();
    }
    public void openAndCloseWikipedia() throws InterruptedException {

        String mainWindow = driver.getWindowHandle();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // wait for wikipedia result
        WebElement result = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//div[@id='Wikipedia1_wikipedia-search-results']//a")));

        result.click();

        // switch to new tab
        for (String window : driver.getWindowHandles()) {
            driver.switchTo().window(window);
        }
        Thread.sleep(2000);

        // close wikipedia tab
        driver.close();

        // switch back to main page
        driver.switchTo().window(mainWindow);
    }

    public void sliderAction() {

        WebElement slider = driver.findElement(By.xpath("//*[@id=\"slider-range\"]/div"));

        Actions act = new Actions(driver);
        act.dragAndDropBy(slider, 50, 0).perform();
    }

    public void handleAlert() {

        driver.findElement(By.id("alertBtn")).click();
        driver.switchTo().alert().accept();
    }

    public void doubleClick() {

        WebElement button = driver.findElement(By.xpath("//*[@id=\"HTML10\"]/div[1]/button"));

        Actions act = new Actions(driver);
        act.doubleClick(button).perform();
    }

    public void dragDrop() {

        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));

        Actions act = new Actions(driver);
        act.dragAndDrop(source, target).perform();
    }
    public void DropDown() {
    		driver.findElement(By.id("comboBox")).sendKeys("Item 1");
    }
    
   
  public void Youtube() throws InterruptedException {
	  WebElement button = driver.findElement(By.xpath("//*[@id=\"HTML16\"]/div[1]/a"));

      Actions act = new Actions(driver);
      act.click(button).perform();
      Thread.sleep(1000);
  }
    
  }

