import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class customdataprovider {

    @DataProvider(name = "LoginDataprovider")
    public Object[][] getData(){
        Object[][] data = {{"abc@gmail.com","abc"},{"mno@gmail.com","mno"},{"niru@gmail.com","niru"}};
        return data;
    }

}
