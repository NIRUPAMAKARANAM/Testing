package paralleltesting;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HrmsCredentials {

    @Test(priority = 3)
    void mgramtitle() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nirupama Karanam\\Jar files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://mgramseva-uat.psegs.in/mgramseva-web/employee/user/login");
        Assert.assertEquals(driver.getTitle(),"mSeva");
        // Thread.sleep(5000);
    }
}
