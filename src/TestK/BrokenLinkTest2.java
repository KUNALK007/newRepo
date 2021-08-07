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

public class BrokenLinkTest2 {

	public static void main(String[] args) throws Exception, Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //lounch chrome
//		driver.manage().window().maximize();  // Maximize window
		driver.manage().deleteAllCookies();  // delete cookies
		
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		driver.get("https://www.gymtela.com/");
		driver.findElement(By.id("details-button")).click();
		driver.findElement(By.id("proceed-link")).click();
		
	// List<WebElement> linklist = driver.findElement(By.tagName("a"));
		
		List<WebElement> linklist = driver.findElements(By.tagName("a"));
		linklist.addAll(driver.findElements(By.tagName("img")));
		System.out.println("link size"+ linklist.size());
		
		List<WebElement> activeList = new ArrayList<WebElement>();
		for (int i = 0; i < linklist.size(); i++) {
			System.out.println(linklist.get(i).getAttribute("href"));
	//		if (linklist.get(i).getAttribute("href") != null && (linklist.get(i).getAttribute("herf").contains("javascript"))) {
			if (linklist.get(i).getAttribute("href") != null ) {

				activeList.add(linklist.get(i));
			}
		}
		System.out.println("size of active link and img -->"+activeList.size());
		
		for (int j = 0; j < activeList.size(); j++) {
			HttpURLConnection connection = (HttpURLConnection) new URL(activeList.get(j).getAttribute("href")).openConnection();
			connection.connect();
			String response = connection.getResponseMessage(); // ok
			connection.disconnect();
			System.out.println(activeList.get(j).getAttribute("href")+ "-->"+ response);
		}
	}

}
