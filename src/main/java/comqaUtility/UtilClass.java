package comqaUtility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import comqaTestBase.TestBase;

public class UtilClass extends TestBase{

	public static void takeSS(String name)
	{
		try 
		{
			TakesScreenshot ts = (TakesScreenshot)driver;
			File src =ts.getScreenshotAs(OutputType.FILE);
			String path = "D:\\Velocity\\setup\\Eclipse_Workspace2022-03\\Gang\\Screenshots\\";

			File des = new File(path+name+".png");
			FileHandler.copy(src, des);
		} 
		catch (IOException e) 
		{
			System.out.println("Please provide correct path");
		}
	}

}

