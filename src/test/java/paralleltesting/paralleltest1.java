package paralleltesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class paralleltest1  {

    WebDriver driver;
//    @Test
//    void mgramsevalogo() throws InterruptedException{
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nirupama Karanam\\Jar files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.get("https://mgramseva-uat.psegs.in/mgramseva-web/employee/user/login");
//        WebElement logo = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/form/div/div[1]/img"));
//        Assert.assertEquals(logo.isDisplayed());
//        Thread.sleep(5000);
//    }

@Test(priority = 3)
    void mgramtitle() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nirupama Karanam\\Jar files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://mgramseva-uat.psegs.in/mgramseva-web/employee/user/login");
        Assert.assertEquals(driver.getTitle(),"mSeva");
       // Thread.sleep(5000);
        }

    @Test(priority = 2)
    void naljaltitletest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nirupama Karanam\\Jar files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://naljal-uat.digit.org/mgramseva/");
        Assert.assertEquals(driver.getTitle(),"NalJalSeva");
        // Thread.sleep(5000);
    }
    @Test(priority = 1)
    void muktatitle() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nirupama Karanam\\Jar files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://mukta-uat.digit.org/works-ui/employee");
        Assert.assertEquals(driver.getTitle(),"MUKTASoft");
        // Thread.sleep(5000);
    }

//        @AfterClass
//        void teardown(){
//        driver.quit();
//        }
}
