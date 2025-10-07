package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

	static WebDriver driver;

	public static void inItBrowser() {

		String browserName = ConfigReader.getProperty("browser");

		if (browserName.equalsIgnoreCase("Edge")) {

			driver = new EdgeDriver();
			// return new EdgeDriver();

		} else if (browserName.equalsIgnoreCase("Chrome")) {

			driver = new ChromeDriver();

		} else if (browserName.equalsIgnoreCase("Firefox"))

		{
			driver = new FirefoxDriver();

		} else {

			throw new IllegalArgumentException("Browser instance can not be initialized");
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	}

	public static WebDriver getDriver() {
		return driver;

	}

	public static void quitDriver() {
		if (driver != null) {
			driver.quit();

		}
	}
}
