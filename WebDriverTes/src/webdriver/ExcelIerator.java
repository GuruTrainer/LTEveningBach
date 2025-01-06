package webdriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelIerator {
public static void main(String[] args) throws IOException {
	
	File file=new File("E:\\Selenium\\ExcelIterator.xlsx");
	FileInputStream fileInput=new FileInputStream(file);
	XSSFWorkbook wb=new XSSFWorkbook(fileInput);
	XSSFSheet  sheet=wb.getSheet("input");
	
	Iterator<Row> rowitr=sheet.iterator();
	while(rowitr.hasNext()){	
		Row row=rowitr.next();
		
		Iterator<Cell> cellitr=row.iterator();
		
		while(cellitr.hasNext()){
			Cell cell=cellitr.next();
			
			
			switch(cell.getCellType()){
			
			case Cell.CELL_TYPE_BOOLEAN:
				System.out.println(cell.getBooleanCellValue());
				break;
			case Cell.CELL_TYPE_NUMERIC:
				System.out.println(cell.getNumericCellValue());
				break;
			case Cell.CELL_TYPE_STRING:	
			System.out.println(cell.getStringCellValue());
			break;
			}
		}
	}
}
}
