package com.demo.action;

import com.demo.locator.LoginLocators;

public class LoginAction extends BaseClass  {
	LoginLocators loginLocators = new LoginLocators(driver);
	
	public void login()
	{
		loginLocators.getUsername().sendKeys("Ankita");
		loginLocators.getbtn().click();
		
	}

	
}
