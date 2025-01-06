package webdriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
public static void main(String[] args) throws IOException {
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	//webdriver instance
		WebDriver driver=new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
		
		try{
		driver.findElement(By.name("txtUserName")).sendKeys("Guru");
		driver.findElement(By.name("txtPassword")).sendKeys("Guru");
		
		driver.findElement(By.name("Submit")).click();
		
		driver.findElement(By.linkText("Logout")).click();
		
		}catch(Exception e){
			
		File file=	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(file, new File("E:\\LoginFaield.png"));
		}
		
		
		driver.close();
		
}
}
