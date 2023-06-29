package DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Tricentis2 {
		
		WebDriver driver;
		
		@Test
		public void t1(String cases,String usrn,String pass) throws InterruptedException {
			
			driver = new ChromeDriver();
			
			driver.get("https://demowebshop.tricentis.com/");
			Thread.sleep(1500);

			driver.findElement(By.xpath("//a[@class='ico-login']")).click();
			
			driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(usrn);
			
			driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(pass);
			
			driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
			
			
			if(cases.equalsIgnoreCase("valid-valid")) {
				String exp = "nalamasa.shivashanker007@gmail.com";
				WebElement ele = driver.findElement(By.xpath("//a[@class='account'][1]"));
				String act = ele.getText();
				Assert.assertEquals(act, exp,"right");
			}
				else if(cases.equalsIgnoreCase("valid-invalid")) {
					String exp = "nalamasa.shivashanker007@gmail.com";
					WebElement ele = driver.findElement(By.xpath("//a[@class='account'][12]"));
					String act = ele.getText();
					Assert.assertEquals(act, exp,"worng");
					
					
				}

			if(cases.equalsIgnoreCase("invalid-valid")) {
				String exp = "nalamasa.shivashaner07@gmail.com";
				WebElement ele = driver.findElement(By.xpath("//a[@class='account'][222]"));
				String act = ele.getText();
				Assert.assertEquals(act, exp,"worng");
			}

			if(cases.equalsIgnoreCase("invalid-invalid")) {
				String exp = "nalamasa.shivashankr007@gmail.com";
				WebElement ele = driver.findElement(By.xpath("//a[@class='account'][12r2]"));
				String act = ele.getText();
				Assert.assertEquals(act, exp,"worng");
			}
		}}


