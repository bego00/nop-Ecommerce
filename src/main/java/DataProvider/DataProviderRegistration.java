package DataProvider;

import org.testng.annotations.DataProvider;
public class DataProviderRegistration {
    @DataProvider(name = "registerData")
    public Object[][] RegisterData() {
        Object[][] data = new Object[3][6];

        data[0][0] = "ahmed";      data[0][1] = "mohamed";   data[0][2] = "test11@gmail.com";
        data[0][3] = "VOIS";       data[0][4] = "test123";    data[0][5] = "test123";

        data[1][0] = "Joe";        data[1][1] = "Doe";       data[1][2] = "test22@gmail.com";
        data[1][3] = "elbaraka";   data[1][4] = "test234";    data[1][5] = "test234";

        data[2][0] = "hussein";    data[2][1] = "khaled";    data[2][2] = "test33@gmail.com";
        data[2][3] = "elrayan";    data[2][4] = "test356";   data[2][5] = "test356";
        return data;
    }
}
