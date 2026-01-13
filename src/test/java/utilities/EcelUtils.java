package utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class EcelUtils {

	
	public static FileInputStream fi;
	public static FileOutputStream fo;
	public static XSSFWorkbook wb;
	public static XSSFSheet ws;
	public static XSSFRow row;
	public static XSSFCell cell;
	public static CellStyle style;
     static String path;
	 
	 public EcelUtils (String path) {
		 
		 this.path=path;
		 
	 }
	 
	 
	public static int getRowCount(String XlSheet) throws IOException
	
	
	{
		fi= new FileInputStream(path);
		wb= new XSSFWorkbook(fi);
		ws= wb.getSheet(XlSheet);
		int rowcount =ws.getLastRowNum();
		wb.close();
		fi.close();
		return rowcount;
	}
	
	public static int getCellCount( String XlSheet, int rownum  ) throws IOException
	
	{
		fi= new FileInputStream(path);
		wb= new XSSFWorkbook(fi);
		ws= wb.getSheet(XlSheet);
		row=ws.getRow(rownum);
		int cellcount =row.getLastCellNum();
		wb.close();
		fi.close();
		return cellcount;
		
		
	}
	public static String getCellData( String XlSheet, int rownum,int coulmn) throws IOException
	
	
	{
		
		fi= new FileInputStream(path);
		wb= new XSSFWorkbook(fi);
		ws= wb.getSheet(XlSheet);
		row=ws.getRow(rownum);
		cell=row.getCell(coulmn);
		String data;
		try
		{
			DataFormatter Formatter = new DataFormatter();
			
			data= Formatter.formatCellValue(cell);//Returns Formmated Vale into string
			
		}
		catch(Exception e)
		{
			data="";
			wb.close();
			fi.close();
			
		}	
		
		return data;
		
	}
	
	public static void setCellData( String XlSheet, int rownum,int coulmn, String Data) throws IOException
	{
		
		fi= new FileInputStream(path);
		wb= new XSSFWorkbook(fi);
		ws= wb.getSheet(XlSheet);
		row=ws.getRow(rownum);
		cell=row.createCell(coulmn);
		cell.setCellValue(Data);
		fo = new FileOutputStream(path);
		wb.write(fo);
		wb.close();
		fi.close();
		fo.close();
		
	}
	
}
