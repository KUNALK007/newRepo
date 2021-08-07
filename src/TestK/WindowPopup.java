package TestK;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopup {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.seleniumeasy.com/test/window-popup-modal-demo.html");
		
		driver.findElement(By.cssSelector("body > div.container-fluid.text-center > div > div.col-md-6.text-left > div:nth-child(2) > "
				+ "div > div.panel-body > div:nth-child(1) > a")).click();;
		
		Thread.sleep(2000);
		
		Set<String> handler = driver.getWindowHandles();
		Iterator<String> it = handler.iterator();
		
		String ParentWindowId = it.next();
		System.out.println("parent window ID"+ ParentWindowId);
		
		String ChildWindowId = it.next();
		System.out.println("child window ID"+ ChildWindowId);
		
		
		driver.switchTo().window(ChildWindowId);
		Thread.sleep(2000);
		System.out.println("child window title "+ driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(ParentWindowId);
		System.out.println("parent window title "+ driver.getTitle());
		
	}

}
