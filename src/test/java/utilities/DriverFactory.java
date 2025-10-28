package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
	private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
	private static ThreadLocal<String> browserName = new ThreadLocal<>();

	public static WebDriver inItBrowser() {

		String browserName =getBrowser();

		System.out.println(browserName + "Init browser");

		if (browserName.equalsIgnoreCase("Edge")) {

			EdgeOptions options = new EdgeOptions();

			options.addArguments("--headless");

			// driver = new EdgeDriver(options);

			 //driver = new EdgeDriver();

		driver.set(new EdgeDriver());



		} else if (browserName.equalsIgnoreCase("Chrome")) {

			//ChromeOptions options = new ChromeOptions();

		//	options.addArguments("--headless=new");

			// driver = new ChromeDriver(options);

			driver.set(new ChromeDriver());

			//driver = new ChromeDriver();

		} else if (browserName.equalsIgnoreCase("Firefox")) {

			driver.set(new FirefoxDriver());



		} else {



			throw new IllegalArgumentException("Browser instance can not be initialized");

		}

	//	localDriver = (WebDriver) driver.get();

	//	localDriver.manage().window().maximize();

	//	localDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		return driver.get();

	}



	public static String getBrowser() {

		String browser =(String)browserName.get();

		Thread currentThread = Thread.currentThread();

		String threadID = currentThread.getName();

		System.out.println(threadID);

		System.out.println("Get Browser method Browser Name : "+ browser);



		if (browser == null) {

			browser = ConfigReader.getProperty("browser");

		}

		return browser;

	}



	public static WebDriver getDriver() {

				if (driver.get() == null) {

			DriverFactory.inItBrowser();

		}

	

		return driver.get();

	}

	public static void quitDriver() {

		if (driver.get() != null) {



			driver.get().quit();

		driver.remove();



		}

	}



	public static String getBrowserName() {

		return browserName.get();

	}



	public static void setBrowserName(String browserName) {

		Thread currentThread = Thread.currentThread();

		String threadID = currentThread.getName();

		System.out.println(threadID);

		System.out.println("Print browser name for set browserName method : "+browserName);

		DriverFactory.browserName.set(browserName);

		System.out.println();

	}
}
