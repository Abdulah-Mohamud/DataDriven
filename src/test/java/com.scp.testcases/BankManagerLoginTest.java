package com.scp.testcases;

import com.scp.base.BaseTest;
import org.testng.annotations.Test;


public class BankManagerLoginTest extends BaseTest {
	
	@Test
	public void loginAsBankManager() {
		
		click("bmlBtn_XPATH");
		isElementPresent("addCustomerBtn_XPATH");
		
	}

}
