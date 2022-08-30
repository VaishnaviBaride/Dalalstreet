package comqaUtility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import comqaTestBase.TestBase;

public class ListenerSetup extends TestBase implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) 
	{
		logger.info("Test execution started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		logger.info("Test execution Completed and testcase passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		logger.info("Test execution stopped and test case failed");
		UtilClass.takeSS(result.getName()+System.currentTimeMillis());
		logger.info("Screenshot taken");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		logger.info("Test execution skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}


}
