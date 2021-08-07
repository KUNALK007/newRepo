package TestK;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadPropFile {

	static WebDriver driver;
	public static void main(String[] args) throws Exception {

		Properties prop = new Properties();
		
		FileInputStream ip = new FileInputStream("C:\\Users\\acer\\eclipse-workspace\\KunalSe\\src\\TestK\\kkk.properties");
		
		prop.load(ip);
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("age"));
		
		String urlName = prop.getProperty("url");
		System.out.println(urlName);
		
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);
		
		if (browserName.equals("chrome"))
		{	System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\Selenium\\ChromeDriver\\chromedriver.exe");
			 driver = new ChromeDriver ();
			driver.get(urlName);	
		} 
		else
		{//code for firefox
		}
		System.out.println(driver.getCurrentUrl());
	
		driver.findElement(By.cssSelector(prop.getProperty("email_css"))).sendKeys(prop.getProperty("emailid"));
		// copy email_css data and sendKey data from file
		
		driver.findElement(By.id(prop.getProperty("continue_btn"))).click();
		
	}

}
