package TestK;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) throws Exception {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		
		driver.manage().window().maximize(); // maximize the window
		driver.manage().deleteAllCookies(); // to delete the cookies 
		
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");

		driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.name("fname")).sendKeys("kk");
		driver.switchTo().parentFrame();
		Thread.sleep(5000);
		driver.close();
	}

}
