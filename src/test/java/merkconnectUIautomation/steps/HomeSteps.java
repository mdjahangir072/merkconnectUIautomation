package merkconnectUIautomation.steps;

import org.testng.Assert;

import com.merkconnectUIautomation.core.TestException;
import com.merkconnectUIautomation.pom.Home;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomeSteps 
{

	@When("^Navigate to login page.$") 
	public void navigateToLogin()
	{
		Home objHome = new Home();
		objHome.clickLogInButton();
	}
	
	@Then("^Verify if user \"([^\"]*)\" is logged in successfully.$")
	public void verifyLogin(String usrName)
	{
		Home objHome = new Home();
		try {
			objHome.verifyLogin(usrName);
		} catch (TestException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
