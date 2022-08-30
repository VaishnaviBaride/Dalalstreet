package comqaTestdata;

import org.testng.annotations.Test;

import comqaPagelayer.Loginpage;

public class Executionclass extends Loginpage {
	
	@Test
	public void verifyLoginTest()
	{
		Loginpage login = new Loginpage();
		login.enterEmailAddress();
		login.enterPassword();
		login.clickOnLoginButton();
	}
}



