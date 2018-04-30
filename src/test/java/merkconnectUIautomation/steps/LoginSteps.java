package merkconnectUIautomation.steps;

import com.merkconnectUIautomation.pom.Login;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class LoginSteps 
{
	//@When("^Enter login username \"([^\"]*)\" and password \"([^\"]*)\"$")
	@And("^Enter login username \"([^\"]*)\" and password \"([^\"]*)\"$") 
	public void enterCredentials(String userName, String passWord)
	{
		Login objLogin = new Login();
		objLogin.loginApplication(userName, passWord);
	}
	
	
}
