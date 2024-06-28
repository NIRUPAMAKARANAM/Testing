import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FbLogin {

    WebDriver driver = null;
    @Test(priority = 1)
    public void chromeDriverSetup() {
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

    }
    @DataProvider(name ="data")
    public Object[][] details(){

        return new Object[][] {
                {"alex@gmail.com","alex1234"},
                {"advik@outlook.in","advik@ak"},
                {"sam@abx.co","SamDom"}
        };
    }

    @Test(priority = 2,dataProvider ="data" )
    public void LoginWithDiffrentData(String email, String password)  {

        System.out.println("login with Email :"+email + " and password :"+password);

        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("pass")).sendKeys(password);

        //click on login button
        driver.findElement(By.name("login")).click();


    }

}
