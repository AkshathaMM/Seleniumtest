package Excel;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDatainSpecificRowandCell 
{

	public static void main(String[] args) throws IOException
	{
	
	//to open the file in writing mode
	FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\Testdata\\myfile.Specific.xlsx");
	
	XSSFWorkbook workbook=new XSSFWorkbook();
	
	XSSFSheet sheet=workbook.createSheet("Sheet1");
	XSSFRow row=sheet.createRow(3);
	XSSFCell cell=row.createCell(4);
	cell.setCellValue("Akshatha");
	
	workbook.write(file);
	workbook.close();
	file.close();
	System.out.println("File is created");
	}
}
