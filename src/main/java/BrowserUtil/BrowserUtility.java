package BrowserUtil;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserUtility {

	private WebDriver driver;

	public WebDriver initDriver(String browserName) {
		System.out.println("browserName" + browserName);

		switch (browserName) {
		case "chrome":
			driver = new ChromeDriver();

			break;

		case "firefox":
			driver = new FirefoxDriver();

			break;

		case "Edge":
			driver = new EdgeDriver();
			break;

		
			
		case "IE":
			driver=new InternetExplorerDriver();
			break;

		default:
			break;
		}
		return driver;
	}

	public void launchUrl(String url) {
		if (url == null) {
			System.out.println("cannot be null");

		}
		if (url.indexOf("https") == 0) {
			driver.get(url);
		}

	}

	public void getTitle() {
		String title = driver.getTitle();
		System.out.println("Title" + title);
	}

	public void getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println("currentUrl" + currentUrl);
	}

	public void closeBrowser() {
		if (driver != null) {
			driver.close();
		}
	}

}
