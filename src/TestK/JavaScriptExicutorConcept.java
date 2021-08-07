package TestK;

import java.awt.Color;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import com.google.common.io.Files;

public class JavaScriptExicutorConcept{

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\acer\\Selenium\\ChromeDriver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver ();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			driver.get("https://classic.crmpro.com/index.html");	
	
			WebElement loginBtn = driver.findElement(By.xpath("//input[@class='btn btn-small']"));  // search button 
			Flash(loginBtn, driver); // highlight element 
//			DrawBorder(loginBtn, driver); // draw border
			
			// use to generate customize alert
//			generateAlert(driver, "there is an issue with search button");
			
			// used to click any element by using java scripts
			clickElement(loginBtn, driver);
			
			//refresh page by using selenium
			driver.navigate().refresh();
			
			//refresh page by using js
			refreshpage(driver);
			
			System.out.println(getTitleByJS(driver));  // get title of page by using js
			
			System.out.println(pageInnerText(driver)); //  to get complete page text
			
	//		scrollPagrDown(driver); // to scroll down the page
			
			WebElement forgetPassLink = driver.findElement(By.xpath("//a[contains(text(),'Forgot Password?')]"));
			scrollIntoView(forgetPassLink, driver);
	}
	
	
	
	public static void Flash (WebElement element , WebDriver driver)
	{
		JavascriptExecutor js = ((JavascriptExecutor) driver );
		String bgcolor = element.getCssValue("backgroundColor");
		
		for (int i = 0; i <50 ; i++) {
			changeColor ("rgb(0,200,0)", element , driver );
			changeColor(bgcolor, element, driver);
			}	
	}

	private static void changeColor(String color, WebElement element, WebDriver driver) {

		JavascriptExecutor js = ((JavascriptExecutor)driver) ;
		js.executeScript("arguments[0].style.backgroundColor = '"+color+"'",  element);
		
		try {
			Thread.sleep(20);
			} 
		catch (Exception e)
		{
		}
	}
	
	public static void DrawBorder (WebElement element , WebDriver driver)
	{
		JavascriptExecutor js = ((JavascriptExecutor) driver );
		js.executeScript("arguments[0].style.border='3xp solid red'", element);
	}
	
	public static void generateAlert (WebDriver driver, String massage)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver ;
		js.executeScript("alert('"+massage+"')");
	}
	
	public static void clickElement (WebElement element, WebDriver driver ) {
		JavascriptExecutor js = (JavascriptExecutor)driver ;
		js.executeScript("arguments[0].click();", element);
	}
	
	public static void refreshpage (WebDriver driver ) {
		JavascriptExecutor js = (JavascriptExecutor)driver ;
		js.executeScript("history.go(0)");	
	}
	
	public static String getTitleByJS (WebDriver driver ) {
		JavascriptExecutor js = (JavascriptExecutor)driver ;
		String tittle = js.executeScript("return document.title;").toString();
		return tittle;
	}
	
	public static String pageInnerText (WebDriver driver ) {
		JavascriptExecutor js = (JavascriptExecutor)driver ;
		String pageText = js.executeScript("return document.documentElement.innerText;").toString();
		return pageText;
	}
	public static String scrollPagrDown (WebDriver driver ) {
		JavascriptExecutor js = (JavascriptExecutor)driver ;
		String pageText = js.executeScript("window.scrollTo(0,document.body.scrollHeight)").toString();
		return pageText;
	}
	
	public static void scrollIntoView(WebElement element, WebDriver driver ) {
		JavascriptExecutor js = (JavascriptExecutor)driver ;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
	
	
}
