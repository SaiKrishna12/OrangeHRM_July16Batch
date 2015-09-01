package com.orangehrm.testsuite;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class Logout extends Constants {
	
	@Test
	public void logoutTest() throws IOException
	{
		String runMode=eo.getCellData(path2,0,4,2);
		if(runMode.equals("N"))
		{
			throw new SkipException("Logout test case skipped");
		}
		else
		{
			Menu menu=PageFactory.initElements(driver,Menu.class);
			menu.logout();
		}
	}

}
