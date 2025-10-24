package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
	private static WebDriver driver;
	private static String browserName;

	public static WebDriver inItBrowser(String browserName) {

		if (browserName.equalsIgnoreCase("Edge")) {
			EdgeOptions options = new EdgeOptions();
			options.addArguments("--headless");
			//driver = new EdgeDriver(options);
			driver = new EdgeDriver();

		} else if (browserName.equalsIgnoreCase("Chrome")) {
			ChromeOptions options = new ChromeOptions();
	        options.addArguments("--headless=new");   
			//driver = new ChromeDriver(options);
			driver = new ChromeDriver();
			
		} else if (browserName.equalsIgnoreCase("Firefox"))
		{
			driver = new FirefoxDriver();

		} else {

			throw new IllegalArgumentException("Browser instance can not be initialized");
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		return driver;
	}
	
	public static void quitDriver() {
		if (driver != null) {
			driver.quit();
		}
	}

	public static String getBrowserName() {
		return browserName;
	}

	public static void setBrowserName(String browserName) {
		DriverFactory.browserName = browserName;
	}
}
