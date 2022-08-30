package comqaTestdata;

import org.junit.Assert;
import org.testng.annotations.Test;

import comqaTestBase.TestBase;

public class TradingExecution extends TestBase {
	@Test
	public void buyShare() throws InterruptedException
	{
		Thread.sleep(2000);
		dash.enterCompanyName("Wipro");
		dash.clickOnCompanyName();
		Thread.sleep(2000);
		exchange.clickOnBuyButton1();
		exchange.clickOnLongTermButton();
		exchange.enterQuantity(1);
		Thread.sleep(5000);
		exchange.clickOnBuyButton2();
		Thread.sleep(2000);
		String actual_output= exchange.getStatus();
		System.out.println(actual_output);
		String expected_output = "Order Created successfully";
		Assert.assertEquals(expected_output,actual_output);
	}
	@Test
	public void buyShareAxis() throws InterruptedException
	{
		Thread.sleep(3000);
		dash.enterCompanyName("AXIS");
		dash.clickOnCompanyNameAxis();
		Thread.sleep(2000);
		exchange.clickOnBuyButton1();
		exchange.clickOnLongTermButton();
		exchange.enterQuantity(5);
		Thread.sleep(2000);
		exchange.clickOnBuyButton2();
		Thread.sleep(2000);
		String actual_output= exchange.getStatus();
		System.out.println(actual_output);
		String expected_output = "Order Created successfully";
		Assert.assertEquals(expected_output,actual_output);
	}

}
