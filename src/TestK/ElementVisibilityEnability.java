package TestK;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisibilityEnability {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		driver.get("https://register.freecrm.com/register/");
		
		boolean b1 = driver.findElement(By.name("action")).isDisplayed();
		System.out.println(b1); //true
		
		boolean b2 = driver.findElement(By.name("action")).isEnabled();
		System.out.println(b2); //true   
		// if the button is enable after clicking checkbox then its shows false
		
		driver.findElement(By.name("terms")).click();
		
		boolean b3 = driver.findElement(By.name("terms")).isSelected();
		System.out.println(b3); // true
		
		driver.findElement(By.name("terms")).click();
		
		boolean b4 = driver.findElement(By.name("terms")).isSelected();
		System.out.println(b4); // false
		
		
		
		
		
		
	}

}
