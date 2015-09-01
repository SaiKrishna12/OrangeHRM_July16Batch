package com.orangehrm.testsuite;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.orangehrm.utility.ExcelOperations;
import com.orangehrm.utility.Screenshot;

public class Constants {
	ExcelOperations eo=new ExcelOperations();
	String path1="E:\\July16Batch\\OrangeHRM\\src\\com\\orangehrm\\excelfiles\\EmployeeList.xlsx";
	String path2="E:\\July16Batch\\OrangeHRM\\src\\com\\orangehrm\\dataengine\\DataEngine.xlsx";
	static RemoteWebDriver driver=null;
	Screenshot screen=new Screenshot();
}
