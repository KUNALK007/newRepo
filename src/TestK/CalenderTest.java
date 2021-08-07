	
package TestK;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderTest {

	public static void main(String[] args) throws Exception {


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
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Calendar")).click();
		
//		driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div[2]/div/div[2]/div/div[1]/span[1]/button[3]")).click();
//		driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div[2]/div/div[2]/div/div[1]/span[1]/button[3]")).click();
		
//		driver.findElement(By.linkText("10")).click();
		
		String FullDate = "10-August-2021";
		String dateArray [] = FullDate.split("-");
		String day = dateArray[0];
		String month = dateArray[1];
		String year = dateArray[2];
		
		
		//*[@id="main-content"]/div/div[2]/div/div[2]/div/div[2]/div[2]/div[1]/div[1] (2/1)
		//*[@id="main-content"]/div/div[2]/div/div[2]/div/div[2]/div[2]/div[1]/div[2] (2/2)
		//*[@id="main-content"]/div/div[2]/div/div[2]/div/div[2]/div[2]/div[1]/div[7] (2/7)
		
		//*[@id="main-content"]/div/div[2]/div/div[2]/div/div[2]/div[3]/div[1]/div[1] (3/1)
		 
		String Before_xpath = "//*[@id=\"main-content\"]/div/div[2]/div/div[2]/div/div[2]/div[2]/div[";
		String After_xpath = "]/div[";
		
		final int weekDays = 7;
		
		for (int row = 2; row <=5; row++) {
			for (int col = 1; col <=weekDays; col++) {
				WebElement dayVal = driver.findElement(By.xpath(Before_xpath+row+After_xpath+col+"]"));
				System.out.println(dayVal.getText());
				
			}
			
		}
		
	
		
	}

}
