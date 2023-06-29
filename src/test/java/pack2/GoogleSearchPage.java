package pack2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pack1.GoogleSearch;

public class GoogleSearchPage extends GoogleSearch {

	public void search(WebDriver driver) {
		
		this.driver=driver;
	
	}
	By linkslocator=By.tagName("a");
	
	public int totallinks() {
		
		List<WebElement> eles=driver.findElements(linkslocator);
		
		int count=eles.size();
		
		System.out.println(count);
		
		return count;

	}

	public int visibletext() {
		
		List<WebElement> vis=driver.findElements(linkslocator);
		
		int total=vis.size();
		int visible=0;
		
		for(WebElement ele:vis) {
			
			if(ele.isDisplayed()) {
				
				visible++;
			}
		}
		System.out.println(visible);
		return visible;
	}
		public int invisible() {
			
			int left=totallinks()-visibletext();
			
			System.out.println(left);
			return left;
				
		}
		
		public void gettext() {
			
			List<WebElement> texts=driver.findElements(linkslocator);
			
			for(WebElement ele:texts) {
				
				String linkstexts=ele.getText();
				System.out.println(linkstexts);
			}
			
			
			
		}

		
	
	
	
	
	
}
