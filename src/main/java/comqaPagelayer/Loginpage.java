package comqaPagelayer;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import comqaTestBase.TestBase;

public class Loginpage extends TestBase {
	
	public Loginpage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//email adress 
	
	@FindBy(xpath ="//input[@name='email']")
	private WebElement emailbox;
	public void enterEmailAddress()
	{
		emailbox.sendKeys("baridevaishnavi@gmail.com");
	}
	
	//password
	
	@FindBy(xpath = "//input[@name='password']")
	private WebElement passwordbox;
	
	public void enterPassword()
	{
		passwordbox.sendKeys("Vaishnavi@03");
	}
	
	//login button
	
	@FindBy(xpath ="//button[@class='btn btn-dark btn-block']")
	private WebElement loginbtn;
	
	public void clickOnLoginButton()
	{
		loginbtn.click();
	}
}

	


