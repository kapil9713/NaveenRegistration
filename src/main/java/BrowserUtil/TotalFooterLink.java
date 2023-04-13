package BrowserUtil;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalFooterLink {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		driver.get("http://www.amazon.com");
		
		List<WebElement> totalFooterLink = driver.findElements(By.xpath("//div[@id='navFooter']//div"));
		System.out.println(totalFooterLink.size());
		
		for(WebElement e:totalFooterLink) {
			String text = e.getText();
			System.out.println(text);
		}

	}

}
