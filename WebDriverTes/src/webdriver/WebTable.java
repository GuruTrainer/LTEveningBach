package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
public static void main(String[] args) {
	

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	//webdriver instance
		WebDriver driver=new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		driver.get("https://www.xe.com/currencycharts/");
		
		List<WebElement> listRow=driver.findElements(By.xpath("(//table[@class='sc-621fdd77-0 fFOksQ'])[1]/tbody/tr"));
		

		List<WebElement> listColum=driver.findElements(By.xpath("(//table[@class='sc-621fdd77-0 fFOksQ'])[1]/tbody/tr[1]/td"));
		
		int rows=listRow.size();
		
		int colum=listColum.size();
		
		
		System.out.println("Row size ="+rows);
		
		System.out.println("Colums size ="+colum);
		
		for(int i=1;i<rows;i++){
			
			for(int j=1;j<colum;j++){
				String value =driver.findElement(By.xpath("(//table[@class='sc-621fdd77-0 fFOksQ'])[1]/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.print(value+" ");
				
			}
			System.out.println();
		}
		
		driver.close();
}
}
