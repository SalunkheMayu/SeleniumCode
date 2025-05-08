package com.LTM.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.LTM.pages.Full_Acess_Page;
import com.LTM.pages.Login_Page;
import com.PageFactory.utility;

public class Full_Acessuser {
	WebDriver wd = utility.startBrowser("chrome", "https://192.168.2.131");
	Login_Page abc = new Login_Page(wd);
	Full_Acess_Page fa = new Full_Acess_Page(wd);

	@Test(priority = 1)
	public void login() 
	{
		abc.login_details("admin", "admin");
		if (utility.isDisaplyed(By.id("ibtntHome"), wd, 6000) == true);
			
	}

	@Test(priority = 2)
	public void Full_SystemSetting() 
	{
		fa.VerifyFullAcess_SystemSetting();
	}

	@Test(priority = 3)
	public void Full_UserSetting() 
	{
		fa.VerifyFullAcess_UserSetting();
	}

	@Test(priority = 4)
	public void Full_Administration() 
	
	{
		fa.VerifyFullAcess_Administration();
	}

	@Test(priority = 5)
	public void Full_Security() 
	{
		fa.VerifyFullAcess_Security();
	}

	@Test(priority = 6)
	public void Full_softwaredeploment() 
	{
		fa.VerifyFullAcess_softwaredeploment();
	}

	@Test(priority = 7)
	public void Full_ContexMenu() throws InterruptedException 
	{
		fa.VerifyFullAcess_ContexMenu();
	}

	@Test(priority = 8)
	public void quit() 
	{
		wd.quit();
	}

}
