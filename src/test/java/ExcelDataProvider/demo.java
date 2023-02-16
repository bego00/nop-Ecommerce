package ExcelDataProvider;

public class demo {
    public static void main(String[] args) {
    String path = "G:\\AutomationTasks\\Nopecommerce\\Excel\\DATA_TEST.xlsx";
    String SheetName = "Sheet1";
        Excel_Data data = new Excel_Data(path);
        data.getCellByColumnNameAndRowNum("password",2);

    }
}
