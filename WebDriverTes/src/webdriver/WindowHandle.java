package webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	//webdriver instance
		WebDriver driver=new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com/it-jobs?src=gnbjobs_homepage_srch");
		
		driver.findElement(By.xpath("//div[text()='Services']")).click();
	Set	<String> window=driver.getWindowHandles();
	for(String win:window){
		
		driver.switchTo().window(win);
		
	}
	
	driver.findElement(By.xpath("//span[text()='CONTACT US']")).click();
	
}
}
