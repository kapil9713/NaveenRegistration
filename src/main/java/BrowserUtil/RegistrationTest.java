package BrowserUtil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationTest {

	public static void main(String[] args) {
		
		
		String browserName="chrome";
		
		BrowserUtility utility=new BrowserUtility();
		WebDriver driver = utility.initDriver(browserName);
		
		utility.launchUrl("https://www.google.com");
		
		utility.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		
		
		By email=By.id("input-email");
		By password=By.id("input-password");
		By selector = By.cssSelector("#content > div > div:nth-child(2) > div > form > input");
		By logoImage = By.className("img-responsive");
		
		
		
		
		
		ElementUtility util=new ElementUtility(driver);
		
		util.doSendKeys(email, "kapil9713@gmail.com");
		util.doSendKeys(password, "kapil7890");
		util.doClick(selector);
		
		
		
		
		
		

	}
	

}
