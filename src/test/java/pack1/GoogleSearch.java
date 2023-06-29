package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class GoogleSearch {
	
	public static WebDriver driver;
	
	@BeforeClass 
	
	public void googlesearch() {
		
		driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		System.out.println("pulled");
		
	}
	

}
