package com.merkconnectUIautomation.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import com.merkconnectUIautomation.core.TestException;
import com.merkconnectUIautomation.core.TestFactory;

public class Home extends TestFactory
{
	@FindBy(xpath="//a[text()='Log In']")
	private WebElement btnLogin;
	
	@FindBy(xpath="//a[@name='register']")
	private WebElement btnUseName;
	
	@FindBy(xpath="//span[text()='User Name: ']/..")
	private WebElement stcusrName;
	
	public Home()
	{
		PageFactory.initElements(TestFactory.driver, this);
	}
	
	public void clickLogInButton() 
	{
		try {
		//	TestFactory.wait.until(ExpectedConditions.visibilityOf(btnLogin));
			Thread.sleep(5000);
			TestFactory.webElementClick(btnLogin);
		} catch (TestException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	public void verifyLogin(String user) throws TestException
	{
		TestFactory.webElementClick(btnUseName);
		
		if(stcusrName.getText().trim().equalsIgnoreCase(user))
		{
			Assert.assertEquals(stcusrName.getText().trim(), "User Name: "+user,"User is logged in successfully");
		}
		else
		{
			Assert.assertEquals(stcusrName.getText().trim(), "User Name: "+user,"User is not logged in successfully");
		}
		
	}
}
