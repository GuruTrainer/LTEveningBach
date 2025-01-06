package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

	@Test(dataProvider="UserDetails")
	public void loginApplication(String user,String password){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		//webdriver instance
		WebDriver driver=new ChromeDriver();
			//maximize the window
			driver.manage().window().maximize();	
		
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys(user);
		driver.findElement(By.name("txtPassword")).sendKeys(password);
		driver.findElement(By.name("Submit")).click();
		Reporter.log("Application login successfully");
	}
	
	@DataProvider(name="UserDetails")
	public Object[][] getData(){
		return new Object[][]{{"admin","admin"},{"Guru","Guru"},{"admin","admin"}};
	}
}
