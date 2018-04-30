package com.merkconnectUIautomation.core;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.merkconnectUIautomation.utilities.TestCapture;
import com.merkconnectUIautomation.utilities.TestConfig;

public abstract class TestFactory 
{
	public static WebDriver driver;
	//final static String CHROMEBROWSER="chrome";
	public static WebDriverWait wait;
	public static final long MAX_TIME_OUT_IN_SECS = 120L;
	
	public static void launchApplication(String bwsrNmae)
	{
		String path = System.getProperty("user.dir");
		System.out.println(path);
		switch(bwsrNmae)
			{
			case "chrome":
				System.setProperty("webdriver.chrome.drievr", path+"/src/main/resources/drivers/chromedriver.exe");
				driver=new ChromeDriver();
				break;
				
			case "firefox":
				System.setProperty("webdriver.gecko.driver",path+"/src/main/resources/drivers/geckodriver.exe");
				driver=new FirefoxDriver();
				break;
				
			default:
				System.out.println("");
			}
		
		driver.get(TestConfig.getConfigDetails().get("url"));
		driver.manage().window().maximize();

	}
	
	public static void webElementClick(WebElement element) throws TestException 
	{

		if(!element.isEnabled())
			throw new TestException("WebElement "+element.getText()+" is not clicked as It is disabled");
	
		 try
			{
		//	 highLight(element);
				element.click();
		    }
		 catch(Exception e)
		 {
			 TestCapture.captureScreenShot(TestFactory.driver, "execption");
		 }
	}
	
	
	public static void webElementSendKeys(WebElement element, String str) throws TestException
	{
		if(!element.isEnabled())
			throw new TestException("WebElement "+element+" is not editabe as It is disabled");
	
		 try
			{
			 highLight(element);
				element.sendKeys(str);
		    }
		 catch(Exception e)
		 {
			 
		 }
	}
	
	
	public static void highLight(WebElement element)
	{
		JavascriptExecutor js=(JavascriptExecutor)TestFactory.driver; 
		js.executeScript("arguments[0].setAttribute('style', 'border: 3px solid yellow;');", element);
		try 
			{
				Thread.sleep(1000);
				js.executeScript("arguments[0].setAttribute('style','border: solid 2px white');", element);
			} 
		catch (InterruptedException e) 
			{
				System.out.println(e.getMessage());
			} 
			
	}
	

}
