import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataproviderexample {
    @Test(dataProvider = "LoginDataprovider", dataProviderClass = customdataprovider.class)
    public void loginTest(String email,String pwd){
        System.out.println(email+  "    " +pwd);

    }



}
