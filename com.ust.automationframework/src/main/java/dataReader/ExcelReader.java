package dataReader;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	FileInputStream fis;
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	public ExcelReader(String filepath) throws IOException
	{
	
		String path="C:\\Users\\271501\\eclipse-workspace\\com.ust.automationframework\\DataSource\\DataSet.xlsx";
		  fis=new FileInputStream(path);
		  workbook=new XSSFWorkbook(fis);
		 
	}
	public String getData(int sheetnumber, int row, int col)
	{
		sheet = workbook.getSheetAt(sheetnumber);
		String data = sheet.getRow(row).getCell(col).getStringCellValue();
		return data;
		
	}
	public int getRowCount(int sheetNumber)
	{
		int rowCount = workbook.getSheetAt(sheetNumber).getLastRowNum();
		System.out.println("Total number of rows available in Excel sheet..."+rowCount);
		return rowCount;
	}

}
