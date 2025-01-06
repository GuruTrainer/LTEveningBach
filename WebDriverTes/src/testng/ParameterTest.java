package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {

	WebDriver driver;
	
	
	@BeforeClass
	public void openBrowser(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		//webdriver instance
			 driver=new ChromeDriver();
			//maximize the window
			driver.manage().window().maximize();	
			Reporter.log("Browser lunched.....");
	}
	
	@AfterClass
	public void closeBrowser(){
		driver.close();
		Reporter.log("Browser closed...");
	}
	
	@Parameters({"user","password"})
	@Test
	public void loginApplication(String user,String password){
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys(user);
		driver.findElement(By.name("txtPassword")).sendKeys(password);
		driver.findElement(By.name("Submit")).click();
		Reporter.log("Application login successfully");
	}
	
	@Test
	public void logoutApplication(){
		driver.findElement(By.linkText("Logout")).click();
		Reporter.log("Logout successfully");
	}
}
