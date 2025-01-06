package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollToElement {
public static void main(String[] args) {
	
	

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	//webdriver instance
		WebDriver driver=new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		WebElement home=driver.findElement(By.linkText("Home"));
		
		js.executeScript("arguments[0].scrollIntoView(true);", home);
		
		
		
		
		
}
}
