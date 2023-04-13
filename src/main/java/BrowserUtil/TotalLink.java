package BrowserUtil;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLink {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		
		driver.get("https:\\www.amazon.com");
		
		List<WebElement> totalLink = driver.findElements(By.tagName("a"));
		int totalCount = totalLink.size();
		System.out.println("totalLink:"+totalCount);
		
		for(int i=0;i<totalCount;i++) {
			String text = totalLink.get(i).getText();
			if(text.length()>0) {
				System.out.println(i+":"+ text);
			}
		}
		
		
		
		

	}

}
