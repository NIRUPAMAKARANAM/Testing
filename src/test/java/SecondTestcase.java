import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTestcase {

    @Test(priority = 1)
    void setup(){
        System.out.println("This is setup TestNg");
    }
@Test(priority = 2)
    void login(){
        System.out.println("This is login to application");
    }
    @Test(priority = 3)
    void createUser(){
        System.out.println("This is Create Divisionuser");
        Assert.assertEquals(1,1);
    }
@Test(priority = 4)
    void close(){
        System.out.println("This is closing the browswe");
    }
}
