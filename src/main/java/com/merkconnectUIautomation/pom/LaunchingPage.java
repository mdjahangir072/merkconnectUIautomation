package com.merkconnectUIautomation.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//import com.core.Testfactory;
import com.merkconnectUIautomation.core.TestException;
import com.merkconnectUIautomation.core.TestFactory;
import com.merkconnectUIautomation.utilities.TestCapture;

public class LaunchingPage extends TestFactory
{
	@FindBy(xpath="//a[text()='I am a Health Care Professional']")
	private WebElement lnkHCP;
	
	@FindBy(xpath="//a[text()='I am not a Health Care Professional']")
	private WebElement lnkNonHCP;
	
	public LaunchingPage()
	{
		PageFactory.initElements(TestFactory.driver, this);
	}
		
	public void clickHCPorNonHCP(String strHCPType) throws TestException 
	{
		try {
			if(lnkHCP.getText().equalsIgnoreCase(strHCPType))
				TestFactory.webElementClick(lnkHCP);
			else if(lnkNonHCP.getText().equalsIgnoreCase(strHCPType))
				TestFactory.webElementClick(lnkNonHCP);
			} catch (TestException e) {
				// TODO Auto-generated catch block
				TestCapture.captureScreenShot(TestFactory.driver, "LaunchedFailed");
				throw new TestException("Launch failed");
			}
	
	}

}
