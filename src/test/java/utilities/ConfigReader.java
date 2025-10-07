package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	public static Properties prop;

	public static void loadProperties() {

		FileInputStream fis;
		try {
			fis = new FileInputStream("src/test/resources/config/config.properties");
			prop = new Properties();
			try {
				prop.load(fis);
			} catch (IOException e) {
				e.printStackTrace();
				throw new RuntimeException("Config properties file not found");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();

		}
	}

	public static String getProperty(String key) {
		if (prop == null) {
			throw new RuntimeException("Config file is not loaded");
		}
		return prop.getProperty(key);

		
	
		
		// String configFilePath = "config/config.properties";
		/*
		 * try { input = new FileInputStream(configFilePath); } catch
		 * (FileNotFoundException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); throw new
		 * RuntimeException("config.properties not found at config file path " +
		 * configFilePath); } try { properties.load(input); } catch (IOException e) { //
		 * TODO Auto-generated catch block e.printStackTrace(); } }
		 * 
		 * public String getBrowserName() { return properties.getProperty("browser"); }
		 * 
		 * public String getURL() { return properties.getProperty("URL");
		 */
	}
	
	public static void main(String[] args) {
		loadProperties();
		String browserName =getProperty("browser");
		System.out.println(browserName);
		
	}
}
