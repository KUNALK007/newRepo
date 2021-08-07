package TestK;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\acer\\\\Selenium\\\\ChromeDriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		
		driver.get("https://tribalfusion.secure.force.com/Contact?posid=a0P1G00000DNqpYUAT");
		 
		driver.findElement(By.id("j_id0:j_id3:j_id49")).sendKeys("F:\\Kunal\\resume\\Kunal Khapekar (service).pdf");
		
	
		
	}

}
