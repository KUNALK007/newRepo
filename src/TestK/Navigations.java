package TestK;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Navigations {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.google.com/");
		
		driver.navigate().to("https://www.amazon.in/");
//		driver.get("https://www.amazon.in/");
		
		// Take Screenshot and store as file format
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// now copy the screenshot in desire location 
		Files.copy(src, new File("C:\\Users\\acer\\eclipse-workspace\\KunalSe\\src\\TestK\\amazon.png"));
		Thread.sleep(5000);
		
		driver.navigate().back();
		File ss = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(ss, new File("C:\\Users\\acer\\eclipse-workspace\\KunalSe\\src\\TestK\\google.png"));
		
		
		
	}

}
