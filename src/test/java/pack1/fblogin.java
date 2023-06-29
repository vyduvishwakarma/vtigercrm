package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class fblogin {

	WebDriver driver;
	@BeforeTest
	public void lauch() {
		
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
	}

	@Test
	public void login() throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("abc");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("passwrd");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	}
	
}
