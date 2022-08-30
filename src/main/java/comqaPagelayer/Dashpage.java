package comqaPagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import comqaTestBase.TestBase;

public class Dashpage extends TestBase {

	public Dashpage() {
		PageFactory.initElements(driver, this);

	}
	//Searchbox
	@FindBy (xpath="//input[@class='form-control']")
	private WebElement searchbox;

	public void enterCompanyName(String CompanyName) {
		searchbox.sendKeys("Wipro");
	}
	@FindBy(linkText = "WIPRO")
	private WebElement wipro_options;

	public void clickOnCompanyName()
	{
		wipro_options.click();
	}

	@FindBy(partialLinkText = "AXIS")
	private WebElement axis_options;

	public void clickOnCompanyNameAxis()
	{
		axis_options.click();
	}


}





