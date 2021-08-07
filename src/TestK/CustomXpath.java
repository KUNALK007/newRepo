package TestK;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver dvr = new ChromeDriver();
		dvr.manage().window().maximize();
		dvr.manage().deleteAllCookies();

		dvr.get("https://www.facebook.com/");
		
		dvr.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		dvr.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		//1 get the total count of link in page 
		// all link represent by html tag <a>
		
		List <WebElement> linklist = dvr.findElements(By.tagName("a"));
		System.out.println(linklist.size());  // size of link
		
		// print each text of link
		for (int i = 0; i < linklist.size(); i++) {
			String str = linklist.get(i).getText();
			System.out.println(str);
			
		}
		

	}

}
