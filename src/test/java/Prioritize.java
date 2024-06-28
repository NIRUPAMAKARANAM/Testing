import org.testng.annotations.Test;

public class Prioritize {
    @Test(priority = 1)
    void test1(){
        System.out.println("This will execute test 1");
    }
    @Test(priority = 2)
    void test2(){
        System.out.println("This will execute test 2");
    }
    @Test(priority = 3)
    void test3(){
        System.out.println("This will execute test 3");
    }
    @Test(priority = 4, enabled = false)
    void test4(){
        System.out.println("This will execute test 4");
    }
}
