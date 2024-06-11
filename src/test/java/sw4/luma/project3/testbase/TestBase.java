package sw4.luma.project3.testbase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import sw4.luma.project3.propertyreader.PropertyReader;
import sw4.luma.project3.utilities.Utility;

public class TestBase extends Utility {

    String browser = PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod
    public void setUp() {
        selectBrowser(browser);
    }

    @AfterMethod
    public void tearDown() {
        closeBrowser();
    }
}
