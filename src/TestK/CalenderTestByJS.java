package TestK;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderTestByJS {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //lounch chrome
		driver.manage().window().maximize();  // Maximize window
		driver.manage().deleteAllCookies();  // delete cookies
		
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		driver.get("https://www.spicejet.com/");
		
		WebElement date = driver.findElement(By.id("ctl00_mainContent_view_date1"));
		String dateVal ="10/07";
		
		SelectDateByJS(date, driver, dateVal);		
	}
	
	private static void SelectDateByJS(WebElement element, WebDriver driver, String dateVal) {
		JavascriptExecutor js = ((JavascriptExecutor)driver) ;
		js.executeScript("arguments[0].setAttribute('value','"+dateVal+"');",  element);	
	}
}
