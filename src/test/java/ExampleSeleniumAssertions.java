import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ExampleSeleniumAssertions {

    WebDriver driver;
    @BeforeClass
    void setup(){
    System.setProperty("webdriver.chrome.driver","C:\\Users\\Nirupama Karanam\\Jar files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
    driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    driver.get("https://mgramseva-uat.psegs.in/mgramseva-web/employee/user/login");

    }
//@Test(priority = 1)
//    void logotest(){
//       WebElement logo= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/form/div/div[1]/img"));
//        Assert.assertTrue(logo.isDisplayed(),"logo not displayed on page");
//    }
@Test(priority = 2)
    void homepagetitle(){
        String title= driver.getTitle();
        Assert.assertEquals(title,"mSeva","title not matched");
}

//Assertions


}
