import org.testng.annotations.*;

public class Tc1 {
   @BeforeClass
    void beforeclassA(){
        System.out.println("This will execute beforemethod");
    }
    @BeforeMethod
   void beforemethodA(){
       System.out.println("This will execute before  of Test A");
   }

     @Test
    void testA(){
        System.out.println("This is test A annotations");
    }
    @AfterMethod
    void aftermethodA(){
        System.out.println("This will execute aftermethod of Test A");
    }
    @AfterClass
    void afterclassA(){
        System.out.println("this will execute afterall methods of Test A");
    }

    @BeforeClass
    void beforeclassB(){
        System.out.println("This will execute beforemethodof Test B");
    }
    @BeforeMethod
    void beforemethodB(){
        System.out.println("This will execute beforemethod of Test B");
    }
    @Test
    void testB(){
        System.out.println("This is test B annotations");
    }
    @AfterMethod
    void aftermethodB(){
        System.out.println("This will execute aftermethod of Test B");
    }

    @AfterClass
    void afterclassB(){
        System.out.println("this will execute afterall methods of Test B");
    }
@BeforeTest
    void beforetest(){
        System.out.println("this will execute first ");
    }
@AfterTest
    void aftertest(){
        System.out.println("this will execute last ");
    }

}
