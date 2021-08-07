package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {

	WebDriver driver;

	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\Selenium\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver(); // lounch chrome
		driver.manage().window().maximize(); // Maximize window
		driver.manage().deleteAllCookies(); // delete cookies

		// dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		driver.get("https://www.google.com");
	}

//	@Test(priority = 3,groups = "Tittle")
//	public void googleTittleTest() {
//		String tittle = driver.getTitle();
//		System.out.println(tittle);
//	}
//
//	@Test(priority = 1, groups = "Logo")
//	public void googleLogoTest() {
//		boolean b = driver.findElement(By.id("image")).isDisplayed();
//	}
//
//	@Test(priority = 2, groups = "Link test")
//	public void gmailLinkTest() {
//		boolean l = driver.findElement(By.linkText("Gmail")).isDisplayed();
//	}
//
//	@Test(priority = 4, groups = "Test")
//	public void test1() {
//		System.out.println("test 1");
//	}
//
//	@Test(priority = 5, groups = "Test")
//	public void test2() {
//		System.out.println("test 2");
//	}
//
//	@Test(priority = 6, groups = "Test")
//	public void test3() {
//		System.out.println("test 3");
//	}
	
	@Test
	public void googleTittleTest() {
		String tittle = driver.getTitle();
		System.out.println(tittle);
		Assert.assertEquals(tittle, "google12", "tittle is not match");
	}
	
	

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
