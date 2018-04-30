package com.merkconnectUIautomation.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TestCapture 
{
	public static void captureScreenShot(WebDriver driver, String screenshotname)
	{
		// Take screenshot and store as a file format            
		String path = System.getProperty("user.dir");
		 File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);           
		try {
			
			FileUtils.copyFile(src, new File(path+"/MerckonnectScreenShots/"+screenshotname+".jpeg"));
	
		}
		catch (IOException e)
		{
		  System.out.println(e.getMessage());
		}
	}
}
