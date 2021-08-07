package TestNG;

import org.testng.annotations.Test;

public class TestNgFeatures {

	@Test
	public void logInTest() {
		System.out.println("log in Test");
		int i = 9/0;
	}
	
	@Test(dependsOnMethods = "logInTest" )
	public void HomePageTest() {
		System.out.println("Home Page Test");
	}
	
	@Test
	public void searchPagetest() {
		System.out.println("search Page Test");
	}
	
}
