package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasics {

	@BeforeSuite
	public static void setUp() {
		System.out.println("@BeforeSuite -- setUp system property for chrome");
	}

	@BeforeTest
	public static void launchBrowser() {
		System.out.println("@BeforeTest -- launch Browser");
	}

	@BeforeClass
	public static void login() {
		System.out.println("@BeforeClass -- login to app");
	}

	@BeforeMethod
	public static void enterUrl() {
		System.out.println("@BeforeMethod -- enter url");
	}
	
	@Test
	public static void getTittle() {
		System.out.println("@Test -- Tittle test");
	}

	@Test
	public static void logo() {
		System.out.println("@Test -- logo test");
	}

	@Test
	public static void search() {
		System.out.println("@Test -- Search test ");
	}

	@AfterMethod
	public static void logout() {
		System.out.println("@AfterMethod -- logout from app");
	}

	@AfterClass
	public static void closeBrowser() {
		System.out.println("@AfterClass -- close browser");
	}

	@AfterTest
	public static void DeleteAllCookies() {
		System.out.println("@AfterTest -- Delete All Cookies");
	}
	
	

}
