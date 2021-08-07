package TestK;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AddDataUsingXLsheet {

	public static void main(String[] args) throws Exception {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://freecrm.com/");

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/div/div/a/span[2]")).click();
		driver.findElement(By.name("email")).sendKeys("kunalkhapekar7@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Test@12345");
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]")).click();
		
//		driver.findElement(By.linkText("Contacts")).click();
//		driver.findElement(By.xpath("//button[@class='ui linkedin button']/i[@class='edit icon']")).click();
//		Thread.sleep(5000);
		
//		driver.findElement(By.cssSelector("#main-content > div > div.ui.fluid.container.main-content > form > div:nth-child(1) > div:nth-child(1) > div > div > input[type=text]")).sendKeys("kunal");
//		driver.findElement(By.name("last_name")).sendKeys("khapekar");
		
	Actions act = new Actions(driver);
	act.moveToElement(driver.findElement(By.xpath("//a[@class='item' and @href='/contacts']"))).build().perform();
	Thread.sleep(2000);
	
	driver.findElement(By.linkText("Contacts")).click();
	driver.findElement(By.xpath("//div[@class='menu-item-wrapper']//a[@href='/contacts']//following-sibling::button[@class='ui mini basic icon button']")).click();
	driver.findElement(By.xpath("//input[@name='first_name' and @type='text']")).sendKeys("kunal");
	driver.findElement(By.xpath("//input[@class='search']")).sendKeys("google");
	driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("khapekar");
	
	Select select = new Select(driver.findElement(By.xpath("//div[@name='status']/i[@class='dropdown icon']")));
	select.selectByVisibleText("New");
	}

}
