package BrowserUtil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementIsDisplayed {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		 //driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 
		 
		 
		By logoImage = By.className("img-responsive");
		By search = By.name("search");
		By click = By.cssSelector("#search > span > button");
		
		if(elementIsDisplayed(logoImage)) 
			System.out.println("logo image present");
		
		
		if(elementIsDisplayed(search)) 
			System.out.println("search is present");
			doSendKeys(search, "macbook");
			doClick(click);
		
		
		
		
		
		
		
		

	}
	public static  WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static boolean elementIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}
	public static  WebElement doSendKeys(By locator,String value) {
		return getElement(locator);
	}
	public static  void doClick(By locator) {
		 getElement(locator).click();
	}
	

}
