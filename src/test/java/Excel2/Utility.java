package Excel2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Utility 
{
	//instead of creating multiple time we created at once as static, we can refer this variable in everymethod
	public static FileInputStream Fi;
	public static FileOutputStream Fo;
	public static XSSFWorkbook Wb;
	public static XSSFSheet Ws;
	public static XSSFRow row;
	public static XSSFCell cell;
	public static CellStyle style ;
	
	public static int getRowCount(String xlfile,String xlsheet) throws IOException
	{
		Fi=new FileInputStream(xlfile);
		Wb=new XSSFWorkbook(Fi);
		Ws=Wb.getSheet(xlsheet);
		int rowcount=Ws.getLastRowNum();
		Wb.close();
		Fi.close();
		return rowcount;	
		
	}
	public static int getCellCount(String xlfile,String xlsheet,int rownum) throws IOException
	{
		Fi=new FileInputStream(xlfile);
		Wb=new XSSFWorkbook(Fi);
		Ws=Wb.getSheet(xlsheet);
		row=Ws.getRow(rownum);
		int cellcount=row.getLastCellNum();
		Wb.close();
		Fi.close();
		return cellcount;
	}
	
	public static String getCellData(String xlfile,String xlsheet,int rownum,int cellnum) throws IOException
	{
		Fi=new FileInputStream(xlfile);
		Wb=new XSSFWorkbook(Fi);
		Ws=Wb.getSheet(xlsheet);
		row=Ws.getRow(rownum);
		cell=row.getCell(cellnum);
		String data=cell.toString();
		Wb.close();
		Fi.close();
		return data;
		
	}
	
	public static void setCellData(String xlfile,String xlsheet,int rownum,int cellnum,String data) throws IOException
	{
		Fi=new FileInputStream(xlfile);
		Wb=new XSSFWorkbook(Fi);
		Ws=Wb.getSheet(xlsheet);
		row=Ws.getRow(rownum);
		cell=row.createCell(cellnum);
		cell.setCellValue("data");
		Fo=new FileOutputStream(xlfile);
		Wb.close();
		Fi.close();
		Fo.close();	
	}
	public static void fillGreenColor(String xlfile,String xlsheet,int rownum,int colnum) throws IOException
	{
		Fi=new FileInputStream(xlfile);
		Wb=new XSSFWorkbook(Fi);
		Ws=Wb.getSheet(xlsheet);
		row=Ws.getRow(rownum);
		cell=row.getCell(colnum);
		
		style=Wb.createCellStyle();
		
		style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND); 
				
		cell.setCellStyle(style);
		Fo=new FileOutputStream(xlfile);
		Wb.write(Fo);
		Wb.close();
		Fi.close();
		Fo.close();
	}
	
	
	public static void fillRedColor(String xlfile,String xlsheet,int rownum,int colnum) throws IOException
	{
		Fi=new FileInputStream(xlfile);
		Wb=new XSSFWorkbook(Fi);
		Ws=Wb.getSheet(xlsheet);
		row=Ws.getRow(rownum);
		cell=row.getCell(colnum);
		
		style=Wb.createCellStyle();
		
		style.setFillForegroundColor(IndexedColors.RED.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);  
		
		cell.setCellStyle(style);		
		Fo=new FileOutputStream(xlfile);
		Wb.write(Fo);
		Wb.close();
		Fi.close();
		Fo.close();
	}

}
