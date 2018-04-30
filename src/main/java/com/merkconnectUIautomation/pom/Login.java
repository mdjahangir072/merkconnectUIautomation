package com.merkconnectUIautomation.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.merkconnectUIautomation.core.TestException;
import com.merkconnectUIautomation.core.TestFactory;

public class Login extends TestFactory
{
	@FindBy(xpath="//input[@id='j_username']")
	private WebElement edtUsrName;
	
	@FindBy(xpath="//input[@id='j_password']")
	private WebElement edtPassWord;
	
	@FindBy(xpath="//input[@id='loginMainFormAjaxButton']")
	private WebElement btnLogIn;
	
	public Login()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void loginApplication(String userName,String passWord)
	{
		try {
			TestFactory.webElementSendKeys(edtUsrName, userName);
			TestFactory.webElementSendKeys(edtPassWord, passWord);
			TestFactory.webElementClick(btnLogIn);
		} catch (TestException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
