package ExcelDataProvider;

import org.apache.poi.xssf.usermodel.XSSFCell;

public class demo {
    public static void main(String[] args) {
   // String path = "G:\\AutomationTasks\\Nopecommerce\\Excel\\DATA_TEST.xlsx";
        Excel_Data data = new Excel_Data("./Excel/DATA_TEST.xlsx","Sheet1");
        XSSFCell Email =data.getCellByColumnNameAndRowNum("password",1);
        XSSFCell Passwords =data.getCellByColumnNameAndRowNum("mail",1);
    }
}
