package DataProvider;
import org.testng.annotations.DataProvider;

public  class DataProviderLogin {
    @DataProvider(name = "loginData")
    public Object[][] LoginData() {
        Object[][] data = new Object[3][2];

        data[0][0] = "test11@gmail.com";    data[0][1] = "test123";
        data[1][0] = "test22@gmail.com";     data[1][1] = "test234";
        data[2][0] = "test33@gmail.com";     data[2][1] = "test356";
        return data;
    }
}
