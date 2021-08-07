package TestK;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {

	public static void main(String[] args) throws Exception {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //lounch chrome
		driver.manage().window().maximize();  // Maximize window
		driver.manage().deleteAllCookies();  // delete cookies
		
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("java");
		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='ClJ9Yb']"));
		System.out.println("total no. of suggestion in search box-->" + list.size());
		
		Thread.sleep(3000);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getText());
			if (list.get(i).getText().contains("java download")) {
				list.get(i).click();
				break;
				
				// program is correct but result not show 
								
			}
		}
	}

}
