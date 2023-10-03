package ExcelUtility;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelsheet {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//File location
		String FileLocation = "./test-data/Login-Data.xlsx";
		//Getting the location and assigning to Wbook
		XSSFWorkbook Wbook = new XSSFWorkbook(FileLocation);
		//Mentioning the sheet in workbook and returning sheet
		 XSSFSheet Sheet = Wbook.getSheetAt(0);
		 //To get dynamically
		int lastRowNum =Sheet.getLastRowNum();
		int phyNumofRows = Sheet.getPhysicalNumberOfRows();
		System.out.println("No.of Rows:"+ lastRowNum );
		System.out.println("Inclusive of Header Rows:"+ phyNumofRows );
		short lastcellNum =Sheet.getRow(0).getLastCellNum();
		 //for (int j=1; j<=2;j++) {
		 for (int j=1; j<=lastRowNum;j++) {
		 XSSFRow row = Sheet.getRow(j);
		 for (int i = 0; i < lastcellNum; i++) {
			XSSFCell cell = row.getCell(i);
			String value = cell.getStringCellValue();
			System.out.println(value);
		 	}
		 }
		 Wbook.close();
		
	}
	 

}
