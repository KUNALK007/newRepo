package TestK;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinkTest {

	public static void main(String[] args) throws Exception, Exception {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //lounch chrome
//		driver.manage().window().maximize();  // Maximize window
		driver.manage().deleteAllCookies();  // delete cookies
		
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		driver.get("https://www.facebook.com/");
		
//		// 1 get the list of all link and images

		List<WebElement> linklist = driver.findElements(By.tagName("a"));
		linklist.addAll(driver.findElements(By.tagName("img")));
		System.out.println("size of link and img -->"+ linklist.size());
		
//		2 iterate linklist : exclude all the link/img - dosent have hrf attribute

		List<WebElement> activeLinks = new ArrayList<WebElement>();
		
		for (int i = 0; i < linklist.size(); i++) {
			System.out.println(linklist.get(i).getAttribute("href"));
//			if (linklist.get(i).getAttribute("href") != null && (linklist.get(i).getAttribute("herf").contains("javascript"))) {
			if (linklist.get(i).getAttribute("href") != null ) {

				activeLinks.add(linklist.get(i));
			}
		}		
// 		get the size of active link list
		System.out.println("size of active link and img -->"+activeLinks.size());
	
//		3 check the href url , with http connection api:
		// 200 -- ok
		// 404 -- not found 
		// 500 -- internal error 
		// 400 -- bad response
		for (int j = 0; j < activeLinks.size(); j++) {
			HttpURLConnection connection = (HttpURLConnection) new URL(activeLinks.get(j).getAttribute("href")).openConnection();
			connection.connect();
			String response = connection.getResponseMessage(); // ok
			connection.disconnect();
			System.out.println(activeLinks.get(j).getAttribute("href")+ "-->"+ response);
		}
		
		
	}

}
