package TestK;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HTMLunitDriver {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\acer\\Selenium\\ChromeDriver\\chromedriver.exe");
	//	WebDriver driver = new ChromeDriver ();
		
		 WebDriver driver = new HtmlUnitDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.amazon.in/");
		System.out.println(driver.getTitle());
				
		driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).click();
		System.out.println(driver.getTitle());
		Thread.sleep(2000);


		driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("kunalkhapekar7@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		Thread.sleep(2000);

		System.out.println(driver.getTitle());
		
	}

}
