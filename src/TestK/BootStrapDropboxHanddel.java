package TestK;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BootStrapDropboxHanddel {

	public static void main(String[] args) throws Exception {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\Selenium\\ChromeDriver\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("window-size=1400,800");
		options.addArguments("headless");
		
		WebDriver driver = new ChromeDriver(options); //lounch chrome
//		driver.manage().window().maximize();  // Maximize window
		driver.manage().deleteAllCookies();  // delete cookies
		
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[@class='multiselect dropdown-toggle btn btn-default']")).click();
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='multiselect-container dropdown-menu']//li//a//label"));
		System.out.println(list.size());
		
		// selecting all the chekbox
				for (int i = 0; i <list.size(); i++) {
					System.out.println( list.get(i).getText());
				}
	}
}
