package Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//Excel-->Workbook-->sheets-->Rows-->Cells

public class ReadingDataFromExcel 
{
	public static void main(String[]args) throws IOException
	{
		//before reading the date first we have to open the excel in reading mode
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\Testdata\\myfile.xlsx");//if we want capture the location dynamically without hardcoding
		
		//now we have to capture the workbook
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		
		//extract the specific sheet from the workbook
		XSSFSheet sheet=workbook.getSheet("Sheet1"); //store it in variable sheet of xssfsheet type
		// or we can we can use XSSFSheet sheet=workbook.getsheetAt(1); here we provide index of the sheet
		
		int totalRow=sheet.getLastRowNum();
		
		//if we want to find no of cell first we need to capture any row in that particular row we can extract cell
		int totalCell=sheet.getRow(0).getLastCellNum();
		
		System.out.println("No of rows:"+totalRow);  //as per the excel row start from 0
		System.out.println("No of cells:"+totalCell); // as per the excel cell start from 1
		
		for(int r=0;r<=totalRow;r++)  // as per the java row start from 0
		 {
			XSSFRow currentRow=sheet.getRow(r);
			
			for(int c=0;c<totalCell;c++)		// as per the java cell start from 0
			 {
				XSSFCell cell=currentRow.getCell(c);
				//from the current row it will get particular cell from the particular cell tostring method will return the data from the cell
				//System.out.println(cell.toString());		
				System.out.print(cell.toString()+" "); //print in tabular format
			 }
				System.out.println();
		 }
	workbook.close();
	file.close();
	
	
	
	}
	
	
}
