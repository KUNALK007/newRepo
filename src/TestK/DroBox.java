package TestK;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DroBox {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.way2fresher.com/job/vdx-tv-hiring-freshers-for-ad-operations-associatetrainee-job-openings-in-2021/");
		
		
//		Alert alt = driver.switchTo().alert();
//		System.out.println(alt.getText());
//		alt.dismiss();
//		
		
		
		
		
	}

}
