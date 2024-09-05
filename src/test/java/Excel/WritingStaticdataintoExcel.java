package Excel;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//Excel File-->Workbook-->Sheets-->Rows-->Cells
public class WritingStaticdataintoExcel 
{
	public static void main(String[] args) throws IOException
	{
	
	//to open the file in writing mode
	FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\Testdata\\myfile.xlsx");
	
	XSSFWorkbook workbook=new XSSFWorkbook();
	
	XSSFSheet sheet=workbook.createSheet("Sheet1");
	
	XSSFRow row1=sheet.createRow(0);
	row1.createCell(0).setCellValue("Java");
	row1.createCell(1).setCellValue("19");
	row1.createCell(2).setCellValue("Automation");
	
	XSSFRow row2=sheet.createRow(1);
	row2.createCell(0).setCellValue("Python");
	row2.createCell(1).setCellValue("3");
	row2.createCell(2).setCellValue("automation");
	
	XSSFRow row3=sheet.createRow(2);
	row3.createCell(0).setCellValue("c#");
	row3.createCell(1).setCellValue("5");
	row3.createCell(2).setCellValue("automation");
	
	//attach this workbook to the file
	
	workbook.write(file);
	workbook.close();
	file.close();
	System.out.println("File is created");
	
	}
	
	
	
}

