package DataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTricentis {
	
	WebDriver driver;
	@Test(dataProvider="data")
	
	public void t1(String username,String password) throws InterruptedException {
		
		driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//a[@class=\"ico-login\"]")).click();
		Thread.sleep(1500);

		driver.findElement(By.xpath("//input[@class=\"email\"]")).sendKeys(username);
		Thread.sleep(1500);

		driver.findElement(By.xpath("//input[@class=\"password\"]")).sendKeys(password);
		Thread.sleep(1500);

		driver.findElement(By.xpath("//input[@class=\"button-1 login-button\"]")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@DataProvider(name="data")
	
		public String[][]alldata(){
		
		String [][] values= {{"one@gmail.com","123@one"},{"two@gmail.com","456@two"},{"three@gmail.com ","789@three"}};
		
		return values;
			
			
		}
		
	@AfterTest
	public void exit() {
		
		driver.quit();

		
		
	}
		
	}
	
	

