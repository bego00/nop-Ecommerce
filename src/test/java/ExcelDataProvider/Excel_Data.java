package ExcelDataProvider;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.util.*;


public class Excel_Data {
    FileInputStream file;
    XSSFWorkbook workbook;
    XSSFSheet sheet;

    public Excel_Data(String Path) {
        try {
            file = new FileInputStream(new File(Path));
            workbook = new XSSFWorkbook(file);
            sheet = workbook.getSheetAt(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int getRowCount() {
        int num = 0;
        try {
            num = sheet.getPhysicalNumberOfRows();
        } catch (Exception e) {
            System.out.println((e.getMessage()));
            System.out.println((e.getCause()));
            e.printStackTrace();
        }
        return num;
    }

    public int getColCount() {
        int num = 0;
        try {
            num = sheet.getRow(0).getPhysicalNumberOfCells();
        } catch (Exception e) {
            System.out.println((e.getMessage()));
            System.out.println((e.getCause()));
            e.printStackTrace();
        }
        return num;
    }

    public String Get_cell_data_String(int RowNum, int ColNum) {
        String data = "";
        try {

            data = sheet.getRow(RowNum).getCell(ColNum).getStringCellValue();

        } catch (Exception e) {
            System.out.println((e.getMessage()));
            System.out.println((e.getCause()));
            e.printStackTrace();

        }
        return data;
    }

    public void Get_cell_data_ItegerData(int RowNum, int ColNum) {
        try {

            int celldata = (int) sheet.getRow(RowNum).getCell(ColNum).getNumericCellValue();
            System.out.println(celldata);
        } catch (Exception e) {
            System.out.println((e.getMessage()));
            System.out.println((e.getCause()));
            e.printStackTrace();

        }

    }

    public String getCellByRowAndColNumber(int RowNum, int ColNum) {
        XSSFCell Cell = sheet.getRow(RowNum).getCell(ColNum);
        String CellData = Cell.getStringCellValue();
        return CellData;
    }

    public void getCellByColumnName(String colName) {
        Map<String, Integer> map = new HashMap<>(); //Create map
        XSSFRow row = sheet.getRow(0); //Get first row

        short minColIx = row.getFirstCellNum(); //get the first column index for a row
        short maxColIx = row.getLastCellNum(); //get the last column index for a row
        for (short colIx = minColIx; colIx < maxColIx; colIx++) { //loop from first to last index
            XSSFCell cell = row.getCell(colIx); //get the cell
            map.put(cell.getStringCellValue(), cell.getColumnIndex()); //add the cell contents (name of column) and cell index to the map
        }

        for (int x = 1; x <= getRowCount(); x++) {
            XSSFRow dataRow = sheet.getRow(x); //get row 1 to row n (rows containing data)

            int idxForColumn1 = map.get(colName); //get the column index for the column with header name = "Column1"
            // int idxForColumn2 = map.get("password"); //get the column index for the column with header name = "Column2"

            XSSFCell cell1 = dataRow.getCell(idxForColumn1); //Get the cells for each of the indexes
            //XSSFCell cell2 = dataRow.getCell(idxForColumn2);
            //System.out.println(cell1 + " : " + cell2);
            System.out.println(cell1);

        }
    }

    public XSSFCell getCellByColumnNameAndRowNum(String colName, int RowNum) {
        Map<String, Integer> map = new HashMap<>(); //Create map
        XSSFRow row = sheet.getRow(0); //Get first row

        short minColIx = row.getFirstCellNum(); //get the first column index for a row
        short maxColIx = row.getLastCellNum(); //get the last column index for a row
        for (short colIx = minColIx; colIx < maxColIx; colIx++) { //loop from first to last index
            XSSFCell cell = row.getCell(colIx); //get the cell
            map.put(cell.getStringCellValue(), cell.getColumnIndex()); //add the cell contents (name of column) and cell index to the map
        }
        XSSFCell cell1 = null;
        for (int x = RowNum; x <= RowNum; x++) {
            for (int col = minColIx; col < maxColIx; col++) {

                XSSFRow dataRow = sheet.getRow(x); //get row 1 to row n (rows containing data)
                int idxForColumn1 = map.get(colName); //get the column index for the column with header name = "Column1"
                cell1 = dataRow.getCell(idxForColumn1); //Get the cells for each of the indexes

            }
        }
        System.out.println(cell1);
        return cell1;
    }
}
