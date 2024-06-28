package paralleltesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class paralleltest2 {
    WebDriver driver;

    @Test
    void logintest(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nirupama Karanam\\Jar files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://mgramseva-uat.psegs.in/mgramseva-web/employee/user/login");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.findElement(By.xpath(("//input[@name='username']"))).sendKeys("4000000001");
        driver.findElement(By.name("password")).sendKeys("eGov@123");
        //WebElement element = driver.findElement(By.name("submit-bar w-full"));
        //element.click();
    }




}
