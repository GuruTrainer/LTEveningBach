package webdriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {
public static void main(String[] args) throws IOException {
	
	File file=new File("E:\\Selenium\\output1.xlsx");
	FileInputStream fileInput=new FileInputStream(file);
	XSSFWorkbook wb=new XSSFWorkbook(fileInput);
	XSSFSheet  sheet=wb.getSheet("Output");
	
	XSSFRow row=sheet.createRow(0);
	XSSFCell cell=row.createCell(0);
	
	cell.setCellType(Cell.CELL_TYPE_STRING);
	
	String str="Hello...Guru welcome to livetech";
	cell.setCellValue(str);
	
	
	FileOutputStream fo=new FileOutputStream(file);
	wb.write(fo);
	fo.close();
	
}
}
