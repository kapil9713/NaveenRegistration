package BrowserUtil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementDislay {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		By logoImage = By.className("img-responsive");
		By search = By.name("search");
		By loginBtn = By.cssSelector("#search > span > button");
		
		if(elementDisplayed(logoImage))
			System.out.println("logo is present");
		
		if(elementDisplayed(search))
			System.out.println("search is present");
		doSendKeys(search, "macbook");
		doClick(loginBtn);

	}
	public static  WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static void doSendKeys(By locator,String value) {
		getElement(locator).sendKeys(value);
	}
	public static void doClick(By locator) {
		getElement(locator).click();
	}
	public static  boolean elementDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}

}
