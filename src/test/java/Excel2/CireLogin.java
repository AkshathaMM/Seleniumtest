package Excel2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CireLogin 
{
	    public static void main(String[] args) throws IOException {
	        // Create the Testdata directory if it doesn't exist
	        String directoryPath = System.getProperty("user.dir") + "\\Testdata";
	        File directory = new File(directoryPath);
	        if (!directory.exists())
	        {
	            directory.mkdirs();
	        }

	        // Create the file output stream
	        FileOutputStream file = new FileOutputStream(directoryPath + "\\MyPC.xlsx");

	        // Create the workbook and sheet
	        XSSFWorkbook workbook = new XSSFWorkbook();
	        XSSFSheet sheet = workbook.createSheet("Sheet1");

	        // Create rows and cells with data
	        XSSFRow row1 = sheet.createRow(0);
	        row1.createCell(0).setCellValue("UserName:");
	        row1.createCell(1).setCellValue("administrator");

	        XSSFRow row2 = sheet.createRow(1);
	        row2.createCell(0).setCellValue("Password:");
	        row2.createCell(1).setCellValue("Netm0an1");

	        // Write the workbook to the file
	        workbook.write(file);

	        // Close the workbook and file output stream
	        workbook.close();
	        file.close();
	        
	        System.out.println("File is created at: " + directoryPath + "\\MyPC.xlsx");
	    }
	}

