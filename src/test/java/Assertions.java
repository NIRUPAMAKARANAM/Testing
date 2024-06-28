import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Assertions {

    WebDriver driver;

    @BeforeClass
    void setup()
    {
        //Chrome browser
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nirupama Karanam\\Jar files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");

    }

    @Test
    void logoTest()
    {
        WebElement logo=driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img"));
        Assert.assertTrue(logo.isDisplayed(),"Logo not displayed");
    }

    @Test
    void homePageTitleTest()
    {
        Assert.assertEquals("OrangeHRM",driver.getTitle(),"Title not matched");
    }

    @AfterClass
    void tearDown()
    {
        driver.quit();
    }


}
