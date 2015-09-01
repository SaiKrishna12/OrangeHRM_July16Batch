package com.orangehrm.testsuite;

import java.io.IOException;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TakeScreenshot  extends Constants{
	@Test
	public void screenshtoTest() throws IOException
	{
		String runMode=eo.getCellData(path2,0,3,2);
		if(runMode.equals("N"))
		{
			throw new SkipException("Screenshot test case skipped");
		}
		else
		{
			screen.getScreenshot(driver,"AddEmp");
		}
	}

}
