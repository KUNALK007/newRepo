package TestK;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeKK {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://tribalfusion.secure.force.com/Contact?posid=a0P1G00000DNqpYUAT");

		driver.findElement(By.id("j_id0:j_id3:j_id33")).sendKeys("kunal");
		driver.findElement(By.id("j_id0:j_id3:j_id35")).sendKeys("khapekar");
		driver.findElement(By.id("j_id0:j_id3:j_id37")).sendKeys("7276148362");
		driver.findElement(By.name("j_id0:j_id3:j_id39")).sendKeys("khapekar7@gmail.com");
		driver.findElement(By.name("j_id0:j_id3:j_id41")).sendKeys("nagpur");
		driver.findElement(By.cssSelector("#j_id0\\:j_id3\\:j_id47")).sendKeys("yes");
		
		Select slt = new Select(driver.findElement(By.id("j_id0:j_id3:j_id43")));
		slt.selectByVisibleText("Social Media");
		
	}
}