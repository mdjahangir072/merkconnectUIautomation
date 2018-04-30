package merkconnectUIautomation.steps;

import com.merkconnectUIautomation.core.TestException;
import com.merkconnectUIautomation.core.TestFactory;
import com.merkconnectUIautomation.pom.LaunchingPage;
import com.merkconnectUIautomation.utilities.TestConfig;

import cucumber.api.java.en.Given;

public class LauchingPageSteps 
{
	
	@Given("^MerkConnect application should be launched for \"([^\"]*)\".$") 
	public void merckLaunch(String userDtaa) throws TestException
	{
	    // Write code here that turns the phrase above into concrete actions
	  TestFactory.launchApplication(TestConfig.getConfigDetails().get("browser"));
	  LaunchingPage objLaunch = new LaunchingPage();
	  objLaunch.clickHCPorNonHCP(userDtaa);
	}
	
}
