package com.POS.Utilities;

import com.POS.BaseClass.BaseClass;

public class DataProvider extends BaseClass {
	
	public Object[][] getLoginUsers() {
		Object[][] logindata = new Object[3][2];
		logindata[0][0] = "InvalidUn";
		logindata[0][1] = "InvalidPw";
		logindata[1][0] = "Admin";
		logindata[1][1] = "InvalidPw";
		logindata[2][0] = "InvalidUn";
		logindata[2][1] = "password";
		return logindata;
	}

}
