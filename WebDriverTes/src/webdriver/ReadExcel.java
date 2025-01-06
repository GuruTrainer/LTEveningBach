package webdriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
public static void main(String[] args) throws IOException {
	
	File file=new File("E:\\Selenium\\input1.xlsx");
	FileInputStream fileInput=new FileInputStream(file);
	XSSFWorkbook wb=new XSSFWorkbook(fileInput);
	XSSFSheet  sheet=wb.getSheet("input");
	
	int rows=sheet.getLastRowNum()+1;
	
	System.out.println("Rows count ="+rows);
	
	
	XSSFRow row=sheet.getRow(0);
	
	XSSFCell cell=row.getCell(0);
	
	System.out.println(cell.getStringCellValue());
	
	
	for(int i=0;i<rows;i++){
		
		Row r=sheet.getRow(i);
		for(int j=0;j<r.getLastCellNum();j++){
			System.out.print(r.getCell(j).getStringCellValue());
		}
		System.out.println(" ");
	}
	
	
}
}
