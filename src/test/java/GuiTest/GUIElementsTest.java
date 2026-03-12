package GuiTest;
import org.testng.annotations.Test;

import Base.BaseTest;
import pages.GUIElementsPage;
import utility.ScreenshotUtility;

public class GUIElementsTest extends BaseTest {



	@Test

    public void GUIFormTest() throws Exception {

        GUIElementsPage page = new GUIElementsPage(driver);

        page.enterName("Tausif");
        page.enterEmail("tausif@test.com");
        page.enterPhone("9999999999");
        page.enterAddress("Nawada Bihar");

        page.selectGender();

        page.selectDays();

        page.selectCountry();

        page.selectColor();

        page.selectSortedList();

        page.selectDate();

        page.uploadFile();

        page.UploadMultipleFiles();
        
        page.Section1();
        page.Section2();
        page.Section3();

        page.Start();

        page.Wikipedia();

        page.openAndCloseWikipedia();

        page.sliderAction();

        page.handleAlert();

        page.doubleClick();

        page.dragDrop();

        page.DropDown();
       
        page.Youtube();
        
      




        ScreenshotUtility.takeScreenshot(driver,"GUIElements");
    }
}