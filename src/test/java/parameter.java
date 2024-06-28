import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class parameter {

    WebDriver driver;

    @BeforeClass
    @Parameters({"browser", "url"})
    void setup(String browser, String app) {
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nirupama Karanam\\Jar files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        }
        else if (browser.equalsIgnoreCase("edge")) {

            System.setProperty("webdriver.msedgedriver.driver", "C:\\Users\\Nirupama Karanam\\Downloads\\edgedriver_win64\\msedgedriver.exe");
            driver = new EdgeDriver();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        }
        driver.get(app);
    }


    //@Test(priority = 1)
//    void logotest(){
//       WebElement logo= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/form/div/div[1]/img"));
//        Assert.assertTrue(logo.isDisplayed(),"logo not displayed on page");
//    }
    @Test(priority = 2)
    void homepagetitle() {
        String title = driver.getTitle();
        Assert.assertEquals(title, "mSeva", "title not matched");
    }

//Assertions


}
