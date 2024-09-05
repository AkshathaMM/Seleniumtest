package Excel2;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Calci {

    public static void main(String[] args) throws IOException {

        // To open the file in writing mode
        FileOutputStream file = new FileOutputStream(
                System.getProperty("user.dir") + "\\Testdata\\calc.xlsx");

        XSSFWorkbook workbook = new XSSFWorkbook();

        XSSFSheet sheet = workbook.createSheet("Sheet1");

        XSSFRow row1 = sheet.createRow(0);
        row1.createCell(0).setCellValue("Principle");
        row1.createCell(1).setCellValue("Rate of Interest");
        row1.createCell(2).setCellValue("Period");
        row1.createCell(3).setCellValue("Frequency");
        row1.createCell(4).setCellValue("Maturity value");
        row1.createCell(5).setCellValue("Expected");
        row1.createCell(6).setCellValue("Result");

        // Create the font
        XSSFFont font = workbook.createFont();
        font.setColor(IndexedColors.BROWN.getIndex());
        font.setBold(true);

        // Create the cell style and set the font
        CellStyle style = workbook.createCellStyle();
        style.setFont(font);

        // Apply the style to each cell in the first row
        for (int i = 0; i < 7; i++) {
            row1.getCell(i).setCellStyle(style);
        }

        XSSFRow row2 = sheet.createRow(1);
        row2.createCell(0).setCellValue("20000");
        row2.createCell(1).setCellValue("10");
        row2.createCell(2).setCellValue("2");
        row2.createCell(3).setCellValue("Simple interest");
        row2.createCell(4).setCellValue("24000");
        
        XSSFRow row3 = sheet.createRow(2);
        row3.createCell(0).setCellValue("40000");
        row3.createCell(1).setCellValue("15");
        row3.createCell(2).setCellValue("5");
        row3.createCell(3).setCellValue("Simple interest");
        row3.createCell(4).setCellValue("74000");
        
        
        XSSFRow row4 = sheet.createRow(3);
        row4.createCell(0).setCellValue("10000");
        row4.createCell(1).setCellValue("12");
        row4.createCell(2).setCellValue("5");
        row4.createCell(3).setCellValue("Simple interest");
        row4.createCell(4).setCellValue("74000.45");
        
        // Attach this workbook to the file
        workbook.write(file);
        workbook.close();
        file.close();
        System.out.println("File is created");
        

        
        
    }
}
