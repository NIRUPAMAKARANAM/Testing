import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependency {

    @Test
    void startcar(){
        System.out.println("Car STarted");
        Assert.fail();
    }

    @Test(dependsOnMethods = {"startcar"})
    void drivecar(){
        System.out.println("Car drive");
    }
    @Test(dependsOnMethods = {"drivecar"})
    void stopcar(){
        System.out.println("Car stopped");
    }
    @Test(dependsOnMethods = {"drivecar","stopcar"},alwaysRun = true)
    void parkcar(){
        System.out.println("Car parked");
    }



}
