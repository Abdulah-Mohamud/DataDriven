package com.scp.testcases;


import com.scp.base.BaseTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilities.DataUtil;

public class LoginTest extends BaseTest {

	@Test(dataProviderClass = DataUtil.class, dataProvider = "dp1")
	public void doLogin(String username, String password) throws InterruptedException {
		
		type("username_ID",username);
		Thread.sleep(2000);
	}
	
	
	
	
}
