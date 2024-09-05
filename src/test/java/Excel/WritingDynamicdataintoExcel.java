package Excel;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDynamicdataintoExcel 
{
	public static void main(String[] args) throws IOException
	{
	
	//to open the file in writing mode
	FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\Testdata\\myfile_dynamic.xlsx");
	
	XSSFWorkbook workbook=new XSSFWorkbook();
	
	XSSFSheet sheet=workbook.createSheet("Sheet1");
	
	//take input from the user
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter how many rows?");
	int noofrows=sc.nextInt();
	
	System.out.println("Enter how many cells?");
	int noofcells=sc.nextInt();
	
	//creating the row
	for(int r=0;r<=noofrows;r++)
	{
	XSSFRow currentRow=sheet.createRow(r);	
		
	//creating the cell in particular row
		for(int c=0;c<noofcells;c++)
		{
			XSSFCell cell=currentRow.createCell(c);
			//provide the value from the user
			cell.setCellValue(sc.next()); //we don't know what value will user pass so we use next(), it will except string value
				
		}
	}
	
	workbook.write(file);
	workbook.close();
	file.close();
	System.out.println("File is created");
}
}	
