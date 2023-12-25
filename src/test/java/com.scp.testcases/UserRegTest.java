package com.scp.testcases;


import com.scp.base.BaseTest;
import org.testng.annotations.Test;

import utilities.DataUtil;

public class UserRegTest extends BaseTest {
	
	@Test(dataProviderClass = DataUtil.class, dataProvider = "dp1")
	public void registerUser(String firstName, String lastName) {
		
		System.out.println(firstName+"---"+lastName);
	}

	
	
	
}
