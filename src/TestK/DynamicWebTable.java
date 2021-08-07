package TestK;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		driver.get("https://freecrm.com/");
		driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/div/div/a/span[2]")).click();
		driver.findElement(By.name("email")).sendKeys("kunalkhapekar7@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Test@12345");
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]")).click();
		
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.xpath("//th[contains(text(),'Address')]")).click(); // to clear the sliding of manu
//	// Method :- 1	
//		//*[@id="main-content"]/div/div[2]/div/table/tbody/tr[1]/td[2]
//		//*[@id="main-content"]/div/div[2]/div/table/tbody/tr[2]/td[2]
//		//*[@id="main-content"]/div/div[2]/div/table/tbody/tr[3]/td[2]
//		
//		String Before_xpath = "//*[@id=\"main-content\"]/div/div[2]/div/table/tbody/tr[";
//		String After_xpath = "]/td[2]";
//		
//		for (int i = 1; i<=3; i++) {
//		String name = driver.findElement(By.xpath(Before_xpath+i+After_xpath)).getText();
//			System.out.println(name);
//			if (name.contains("Pankaj Nandankar")) {
//				driver.findElement(By.xpath(Before_xpath+i+After_xpath)).click();	
//			}
//		}
//			
	// Method :- 2  
		driver.findElement(By.xpath("//a[contains(text(),'Mukesh  Khapekar')]/parent::td/parent::tr/td/div[@class='ui fitted read-only checkbox']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Pankaj Nandankar')]//parent::td//parent::tr/td/div[@class='ui fitted read-only checkbox']")).click();						
	
	}
	
}
