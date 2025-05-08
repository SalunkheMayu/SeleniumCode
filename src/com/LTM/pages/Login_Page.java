package com.LTM.pages;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.PageFactory.utility;


public class Login_Page extends utility 
{
	public WebDriver wd;
	
	@FindBy(id="UserName")
	WebElement username ;
	
	@FindBy(id="PWD")
	WebElement password ;
	
	@FindBy(xpath = "//input[@id='btnLogin']")
	WebElement login ;
	
	@FindBy(xpath = "//select[@id='ddlRedirectToView']")
	WebElement view;
	
	//@FindBy(xpath="//span[@id='ViewHeader']")
	//WebElement Terminal;
	
	@FindBy (xpath = "//select[@id='ddlRedirectToView']")
	WebElement pageredirect;
	
	@FindBy(xpath = "//label[@id='lblFailureText']")
	WebElement lblfailmsg;

	public Login_Page(WebDriver wd)
	  {
		this.wd = wd;
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		PageFactory.initElements(wd, this);
	  }
	
	public void login_details(String User,String Pass)
	{
		username.sendKeys(User);
		password.sendKeys(Pass);
		
		/*
		if(utility.isDisaplyedW(pageredirect, wd, 1)==true)
		{
			Select drop=new Select(pageredirect);
			drop.selectByVisibleText("Default View - Device Manager");
		}
		*/
		login.click();
		username.clear();
		password.clear();
		
	//	if (utility.isDisaplyedW(Terminal, wd, 15)==true)
		{
	//		System.out.println("0.Login Sucessfull");
	//		Assert.assertTrue(true);
		}
		
		/*
		if(utility.isDisaplyedW(lblfailmsg, wd, 5)==true)
		{
			String abc=lblfailmsg.getText();
			if(abc.contains("Invalid username or password entered."));
			System.out.println(abc);
			Assert.assertFalse(false);
			wd.close();
		}
		
		else 
		{
			if (utility.isDisaplyedW(Terminal, wd, 15)==true)
			{
				System.out.println("0.Login Sucessfull");
				Assert.assertTrue(true);
			}
				
		}
		
		 
		*/
	}
/*
	public void user(String User) 
	  {
		wd.findElement(username).sendKeys(User);
	  }

	public void pass(String Pass)
		{
		wd.findElement(password).sendKeys(Pass);
		}

	public void loginbt() 
		{
		wd.findElement(login).click();
		}
    */
}
