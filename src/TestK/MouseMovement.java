package TestK;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovement {
 
	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\acer\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies(); // before entiring the url
		
		driver.get("https://www.spicejet.com/");
		
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.id("highlight-addons"))).build().perform();
		
		
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("#header-addons > ul > li:nth-child(4) > a")).click();
		
	}

}
