package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import org.openqa.selenium.firefox.FirefoxDriver;



public class DriverFactory {

	//private static ThreadLocal<WebDriver> threadDriver = new ThreadLocal<>();
	private static WebDriver driver;

	public static WebDriver inItBrowser() {
		String browserName = ConfigReader.getProperty("browser");

		if (browserName.equalsIgnoreCase("Edge")) {
			EdgeOptions options = new EdgeOptions();
			options.addArguments("--headless");
			driver = new EdgeDriver(options);
			//return new EdgeDriver();

		} else if (browserName.equalsIgnoreCase("Chrome")) {
			ChromeOptions options = new ChromeOptions();
	        options.addArguments("--headless=new");   
			driver = new ChromeDriver(options);

		} else if (browserName.equalsIgnoreCase("Firefox"))

		{
			driver = new FirefoxDriver();

		} else {

			throw new IllegalArgumentException("Browser instance can not be initialized");
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//threadDriver.set(driver);
		return driver;
	}

	/*public static WebDriver getDriver() {
		WebDriver driver = threadDriver.get();
		if (driver == null) {
            driver = new EdgeDriver(); // Or WebDriverManager setup
            driver.manage().window().maximize();
            threadDriver.set(driver);
        }
		return driver;
	}*/
	
	public static void quitDriver() {
		if (driver != null) {
			driver.quit();
			//threadDriver.remove();
		}
	}
}
