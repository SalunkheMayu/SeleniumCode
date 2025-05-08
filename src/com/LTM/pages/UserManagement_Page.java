package com.LTM.pages;


import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.PageFactory.utility;

public class UserManagement_Page extends utility

{

	public WebDriver wd;
	SoftAssert softassert=new SoftAssert();

	// To Acess User Management

	@FindBy(xpath = "//li[@id='divConfigurationSetup']")
	WebElement tabconfig;

	@FindBy(xpath = "//div[@id='btnExpandMenu']")
	WebElement btnExpandMenu;

	@FindBy(xpath = "(//label[@title='User management'])[2]")
	WebElement clickusermgm;

	// Create New user role

	@FindBy(xpath = "//label[@id='ContentPlaceHolder1_lblMenuUserRole']")
	WebElement tabuserrole;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_btnnewUserRole']")
	WebElement btnaddnewrole;

	@FindBy(xpath = "//input[@id='txt_UserRole']")
	WebElement txtrolename;

	@FindBy(xpath = "//input[@id='txt_UserDescription']")
	WebElement txtroledesc;

	// if full acess just click on save button

	@FindBy(xpath = "(//input[@id='idModulesWindowsRolechkAllFull_Access'])[1]")
	WebElement winfullacess;

	@FindBy(xpath = "(//input[@id='idModulesWindowsRolechkAllRead'])[1]")
	WebElement winreadacess;

	@FindBy(xpath = "(//input[@id='idModulesWindowsRolechkAlNo_Access'])[1]")
	WebElement winnoacess;

	@FindBy(xpath = "(//input[@id='idModuleLinuxRolechkAllFull_Access'])[1]")
	WebElement linuxfullacess;

	@FindBy(xpath = "(//input[@id='idModuleLinuxRolechkAllRead'])[1]")
	WebElement linuxreadacess;

	@FindBy(xpath = "(//input[@id='idModuleLinuxRolechkAllNoAccess'])[1]")
	WebElement linuxnoacess;

	@FindBy(xpath = "(//input[@id='idModulesApplicationSettingsRolechkAllFull_Access'])[1]")
	WebElement appsetfullacess;

	@FindBy(xpath = "(//input[@id='idModulesApplicationSettingsRolechkAllRead'])[1]")
	WebElement appsetreadacess;

	@FindBy(xpath = "(//input[@id='idModulesApplicationSettingsRolechkAllNo_Access'])[1]")
	WebElement appsetnoacess;

	@FindBy(xpath = "(//input[@id='idModulesReportsRolechkAllFull_Access'])[1]")
	WebElement reportfullacess;

	@FindBy(xpath = "(//input[@id='idModulesReportsRolechkAllRead'])[1]")
	WebElement reportreadacess;

	@FindBy(xpath = "(//input[@id='idModulesReportsRolechkAlNoAccess'])[1]")
	WebElement reportnoacess;

	@FindBy(xpath = "(//input[@id='idModuleRemoteControlSettingsRolechkAllFull_Access'])[1]")
	WebElement contexmenufullacess;

	@FindBy(xpath = "(//input[@id='idModuleRemoteControlSettingsRolechkAllRead'])[1]")
	WebElement contexmenureadacess;

	@FindBy(xpath = "(//input[@id='idModuleRemoteControlSettingsRolechkAlNoAccess'])[1]")
	WebElement contexmenunoacess;

	@FindBy(xpath = "(//input[@id='iddivRemoteSettingsFullAccess'])[1]")
	WebElement contexmenuremotefullacess;

	@FindBy(xpath = "(//input[@id='iddivRemoteSettingsReadAccess'])[1]")
	WebElement contexmenuremotereadacess;

	@FindBy(xpath = "(//input[@id='iddivRemoteSettingsNoAccess'])[1]")
	WebElement contexmenuremotenoacess;

	@FindBy(xpath = "(//input[@id='iddivGroupSettingsFull'])[1]")
	WebElement contexmenugrpfullacess;

	@FindBy(xpath = "(//input[@id='iddivGroupSettingsRead'])[1]")
	WebElement contexmenugrpreadacess;

	@FindBy(xpath = "(//input[@id='iddivGroupSettingsNA'])[1]")
	WebElement contexmenugrpnoacess;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_btnUserSaveRole']")
	WebElement btnsaveuserrole;
	
	@FindBy (xpath = "//label[@id='lblUserSaveRole']")
	WebElement lblsaveuserrole;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_btnUserCancelRole']")
	WebElement btncloseuserrole;

	// Create new user_Group

	@FindBy(xpath = "//label[@id='ContentPlaceHolder1_lblMenuUserGroup']")
	WebElement tabusergrp;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_btnAddNewUserGroup']")

	WebElement btnnewgroup;

	@FindBy(xpath = "//input[@id='txt_UserGroupName']")
	WebElement txtusergrp;

	@FindBy(xpath = "//select[@id='ddlSelectUserRole']")
	WebElement ddselectuserrole;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_btnSaveGroupDetails']")
	WebElement btnsaveusergrp;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_btnCancelGroupDetails']")
	WebElement btncloseusergrp;

	// Create New User

	@FindBy(xpath = "//label[@id='ContentPlaceHolder1_lblMenuUser']")
	WebElement tabuser;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_btnNewUser']")
	//input[@id='ContentPlaceHolder1_btnNewUser']
	WebElement btnnewuser;

	@FindBy(xpath = "//input[@id='txtUserName']")
	WebElement txtusername;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_btnCheckAvailability']")
	WebElement brncheckuseravaible;

	@FindBy(xpath = "//label[@id='lbluserAuthentication']")
	WebElement lbluseravaibility;

	@FindBy(xpath = "//input[@id='txtNewPassword']")
	WebElement txtpassword;

	@FindBy(xpath = "//input[@id='txtConfirmPassword']")
	WebElement txtconfirmpassword;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_btnNext_userAuthentication']")
	WebElement btnuserauthnext;

	@FindBy(xpath = "//input[@id='txtUserDetailsFirstName']")
	WebElement txtfirstname;

	@FindBy(xpath = "//input[@id='txtUserDetailsLastName']")
	WebElement txtlastname;

	@FindBy(xpath = "//input[@id='txtUserDetailsEmailID']")
	WebElement txtEmailid;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_btnBack_personalDetails']")
	WebElement btnbackuser;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_btnNext_personalDetails']")
	WebElement btnnextpersonaldetailsuser;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_btnCancel_personalDetails']")
	WebElement btncloseuser;

	@FindBy(xpath = "//select[@id='ddlSelectUserGroup']")
	WebElement ddselectusergrp;

	@FindBy	(xpath = "//input[@id='ContentPlaceHolder1_btnSave_associationDetails']")
	WebElement btnsavenewuser;
	
	@FindBy	(xpath = "//label[@id='lblUserDetailsMessage']")
	WebElement lblsavenewuser;
	
	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_btnBack_associationDetails']")
	WebElement btnbacknewuser;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_btnSaveGroupDetails']")
	WebElement btnsavenewusergrp;
	
	@FindBy(xpath = "//label[@id='lblSaveGroupDetailsMessage']")
	WebElement lblsavenewusergrp;
	
	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_btnCancelGroupDetails']")
	WebElement btnclosenewusergrp;
	

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_btnCancel_associationDetails']")
	WebElement btnclosenewuser;

	//@FindBy(xpath = "//label[@id='lblSaveGroupDetailsMessage']")
	//WebElement lblsavenewuser;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_btnRefrsh']")
	WebElement btnrefresh;

	// Domain user

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_btnDomainUser']")
	WebElement tabDomainUser;

	@FindBy(xpath = "//input[@id='txtDomainName']")
	WebElement txtDomainName;

	@FindBy(xpath = "//input[@id='txtDomainUser']")
	WebElement txtDomainUserName;

	@FindBy(xpath = "//input[@id='txtDomainPassword']")
	WebElement txtDomainPassword;

	@FindBy(xpath = "//select[@id='tbConUser_tbNewUser_DropDownListType']")
	WebElement ddDomainType;

	@FindBy(xpath = "//input[@id='tbConUser_tbNewUser_TxtSearch']")
	WebElement txtSearch;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_btnOKDomain']")
	WebElement btnDomainOk;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_btnCancelDomain']")
	WebElement btnDomainClose;

	@FindBy(xpath = "//label[@id='lblDomainMessage']")
	WebElement msgDomainOk;

	@FindBy(xpath = "//input[@aria-controls='tblMultipleUserGroupDomain'] ")
	WebElement txtserchdomain;

	@FindBy(xpath = "//i[@class='jstree-icon jstree-checkbox']")
	WebElement chkallgrpsite;
	
	@FindBy(xpath = "(//input[@class='dt-checkboxes'])[1]")
	WebElement rdbtnselectDomainusergrp;
	
	@FindBy (xpath="//input[@id='Domain Users']")
	WebElement rdbtnselectDomainUser;

	@FindBy (xpath="//select[@id='selDomainUserGroupForMultiple']") //192.168.2.131
	//@FindBy(xpath = "//select[@id='selDomainUserUserGroup']")
	WebElement ddselectusergrpDomain;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_btnSaveDomainUser']")
	WebElement btnsaveDomainuser;
	
	@FindBy (xpath = "//label[@id='lblMessageDomainUserGroup']")
	WebElement lblsaveDomainuser;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_btnCancelDomainUserDetails']")
	WebElement btncloseDomainuser;

	// Mailer Engine
	@FindBy(xpath = "(//label[@title='Mailer Engine Configuration'])[2]")
	WebElement tabmailerEngine;

	@FindBy(xpath = "//label[@id='ContentPlaceHolder1_lblmenuSMTPServerConfiguration']")
	WebElement tabSmtpServerConfig;

	@FindBy(xpath = "//input[@id='txtSmtpServerAddress']")
	WebElement txtSmtpServer;

	@FindBy(xpath = "//input[@id='txtAccName']")
	WebElement txtSmtpAccountName;

	@FindBy(xpath = "//input[@id='txtPassword']")
	WebElement txtSmtpPassword;

	@FindBy(xpath = "//input[@id='chkPort']")
	WebElement rdSmtpenableSSL;

	@FindBy(xpath = "//input[@id='txtSenderAddress']")
	WebElement txtSmtpDisplayName;

	@FindBy(xpath = "//input[@id='txtPort']")
	WebElement txtSmtpPortNo;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_btnSaveSMPT']")
	WebElement btnSmtpSave;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_btnTestSMPT']")
	WebElement btnSmtpTestConnection;

	@FindBy(xpath = "//label[@id='ContentPlaceHolder1_lblSaveSMPT']")
	WebElement lblSmtpcontest;
	
	@FindBy(xpath="//div[@class='col-md-12 loading']")
	WebElement Loader;

	
	public UserManagement_Page(WebDriver wd) 
	{
		this.wd = wd;
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		PageFactory.initElements(wd, this);
	}

	public void userrole(String Role_Name) throws InterruptedException 
	{
		Actions a= new Actions(wd);
		//Boolean dis=btnaddnewrole.isDisplayed();
		//if(dis==false)
		
		tabconfig.click();
		if (utility.isDisaplyed(By.id("ibtntHome"), wd, 7000) == true);
		btnExpandMenu.click();
		clickusermgm.click();
		tabuserrole.click();
		
		btnaddnewrole.click();
		txtrolename.sendKeys(Role_Name);
		txtroledesc.sendKeys(Role_Name);
		
		if (Role_Name.contains("Full_Read")) 
		{
			//winfullacess.click();
			linuxreadacess.click();
			a.moveToElement(appsetfullacess).release().build().perform();
			//appsetfullacess.click();
			a.moveToElement(reportreadacess).release().build().perform();
			reportreadacess.click();
			a.moveToElement(contexmenufullacess).release().build().perform();
			contexmenufullacess.click();
			a.moveToElement(contexmenuremotereadacess).release().build().perform();
			contexmenuremotereadacess.click();
			
		}
		if (Role_Name.contains("Read_no")) {
			winreadacess.click();
			linuxnoacess.click();
			a.moveToElement(appsetnoacess).release().build().perform();
			appsetnoacess.click();
			a.moveToElement(reportnoacess).release().build().perform();
			reportnoacess.click();
			a.moveToElement(contexmenureadacess).release().build().perform();
			contexmenureadacess.click();
			a.moveToElement(contexmenuremotenoacess).release().build().perform();
			contexmenuremotenoacess.click();

		}
        a.moveToElement(btnsaveuserrole).release().build().perform();
		btnsaveuserrole.click();
		Thread.sleep(5000);
		a.moveToElement(lblsaveuserrole).release().build().perform();
		//utility.isVisible(lblsaveuserrole, wd, 20);
		String return_Msg = lblsaveuserrole.getText();
		Thread.sleep(3000);
		Assert.assertEquals(return_Msg, "Saved Successfully");
		
	}

	public void usergrp(String Usergrp) throws InterruptedException 
	{
		Actions a= new Actions(wd);
		tabusergrp.click();
		btnnewgroup.click();
		txtusergrp.sendKeys(Usergrp);

		if (Usergrp.contains("Full_Read")) 
		{
			Select dropdown = new Select(ddselectuserrole);
			dropdown.selectByVisibleText(Usergrp);

		}
		
		if (Usergrp.contains("Read_no")) 
		{
			Select dropdown = new Select(ddselectuserrole);
			dropdown.selectByVisibleText(Usergrp);

		}
		Thread.sleep(4000);
		a.moveToElement(btnsavenewusergrp).release().build().perform();
		btnsavenewusergrp.click();
		Thread.sleep(5000);
		//utility.isVisible(lblsavenewusergrp, wd, 20);
		a.moveToElement(lblsavenewusergrp).release().build().perform();
		String return_Msg = lblsavenewusergrp.getText();
		Thread.sleep(3000);
		Assert.assertEquals(return_Msg, "Saved Successfully");
		
		btnclosenewusergrp.click();

	}

	public void createmixuser(String Username, String Password, String FName, String LName, String Email, String Usergrp) throws InterruptedException
	{
		Actions a= new Actions(wd);
		tabuser.click();
		btnnewuser.click();
		txtusername.sendKeys(Username);
		brncheckuseravaible.click();
		String user = lbluseravaibility.getText();
		if (user.contains("already exists")) 
		{
			System.out.println("This User name all ready Exist");
			btncloseuser.click();
		}
		else
		{
		txtpassword.sendKeys(Password);
		txtconfirmpassword.sendKeys(Password);
		btnuserauthnext.click();
		a.moveToElement(btnnextpersonaldetailsuser).release().build().perform();
		txtfirstname.sendKeys(FName);
		txtlastname.sendKeys(LName);
		txtEmailid.sendKeys(Email);
		btnnextpersonaldetailsuser.click();
		Thread.sleep(2000);
		Select dropdown = new Select(ddselectusergrp);
		dropdown.selectByVisibleText(Usergrp);
		Thread.sleep(2000);
		a.moveToElement(btnsavenewuser).release().build().perform();
		btnsavenewuser.click();
		
		utility.isVisible(lblsavenewuser, wd, 20);
		String return_Msg = lblsavenewuser.getText();
		Thread.sleep(4000);
		Assert.assertEquals(return_Msg, "Saved successfully");
		
		btnclosenewuser.click();
		}

	}

	public void domainuser(String DName, String DUser, String DPassword,String UserRole) throws InterruptedException
	{
		Actions a= new Actions(wd);
		
		tabconfig.click();
		//if (utility.isDisaplyed(By.id("ibtntHome"), wd, 6000) == true);
		btnExpandMenu.click();
		clickusermgm.click();
		tabDomainUser.click();
		txtDomainName.sendKeys(DName);
		txtDomainUserName.sendKeys(DUser);
		txtDomainPassword.sendKeys(DPassword);
		Select dropdown = new Select(ddDomainType);
		dropdown.selectByVisibleText("Domain User Groups");
		btnDomainOk.click();
		a.moveToElement(txtserchdomain).release().build().perform();
		txtserchdomain.sendKeys("Administrator");
		//a.moveToElement(rdbtnselectDomainusergrp).release().build().perform();
		rdbtnselectDomainusergrp.click();
		
		txtserchdomain.clear();
		txtserchdomain.sendKeys("Domain User");
		//a.moveToElement(rdbtnselectDomainUser).release().build().perform();
		rdbtnselectDomainusergrp.click();
		
		a.moveToElement(ddselectusergrpDomain).release().build().perform();
		
		Select dduser = new Select(ddselectusergrpDomain);
		dduser.selectByVisibleText("ADMIN");
		
		chkallgrpsite.click();
		chkallgrpsite.click();
		
		a.moveToElement(btnsaveDomainuser).release().build().perform();
		
		btnsaveDomainuser.click();
		
		utility.isVisible(lblsaveDomainuser, wd, 20);
		String return_Msg = lblsaveDomainuser.getText();
		Thread.sleep(3000);
		Assert.assertEquals(return_Msg, "Saved successfully");
		
		btncloseDomainuser.click();
		btnDomainClose.click();
	}

	// Mailer Engine Confugration
	public void mailerEngine() throws InterruptedException
	{
		if(tabmailerEngine.isDisplayed()==false)
		{
		tabconfig.click();
		btnExpandMenu.click();
		}
		
		tabmailerEngine.click();
		tabSmtpServerConfig.click();
		txtSmtpServer.clear();
		txtSmtpServer.sendKeys("mail.vxlsoftware.com");
		txtSmtpDisplayName.clear();
		txtSmtpDisplayName.sendKeys("Support_Admin");
		txtSmtpAccountName.clear();
		txtSmtpAccountName.sendKeys("support@vxlsoftware.com");
		txtSmtpPortNo.clear();
		txtSmtpPortNo.sendKeys("25");
		
		txtSmtpPassword.sendKeys("VXl#124");
		
		rdSmtpenableSSL.click();
		btnSmtpTestConnection.click();
		
		utility.isInvisible(Loader, wd, 20);
		
		String Return_MSG = lblSmtpcontest.getText();
		
		if(Return_MSG.contains("Test Connection Failed."))
		{
			rdSmtpenableSSL.click();
			btnSmtpTestConnection.click();
			
			String Return_MSG1 = lblSmtpcontest.getText();
			utility.isInvisible(Loader, wd, 20);
			if(Return_MSG1.contains("Test connection successfully"))
			{
				btnSmtpSave.click();
					
			}
			
			
		}
		
		else if(Return_MSG.contains("Test connection successfully"))
		{
			//rdSmtpenableSSL.click();
			btnSmtpSave.click();
		}
		
		else 
		{
			System.out.println(Return_MSG);	
		}
		Thread.sleep(3000);
		String Return_MSG2 = lblSmtpcontest.getText();
		Assert.assertEquals(Return_MSG2, "Settings saved successfully.");
		

	}
	
	//Default User
	
	public void defaultnoacessuser() throws InterruptedException 
	{
	Actions a= new Actions(wd);
	
	if(btnnewuser.isDisplayed()==false)
	 {
	 clickusermgm.click();
	// tabuser.click();
	 }
	 
	 btnnewuser.click();
	 txtusername.sendKeys("no");
	 txtpassword.sendKeys("admin@123");
	 txtconfirmpassword.sendKeys("admin@123");
	 btnuserauthnext.click();
	
	 a.moveToElement(btnnextpersonaldetailsuser).release().build().perform();
	 
	 txtfirstname.sendKeys("no");
	 txtlastname.sendKeys("no");
	 txtEmailid.sendKeys("no@no.com");
	 btnnextpersonaldetailsuser.click();
	 
	 Select ddusergrp = new Select(ddselectusergrp);
	 ddusergrp.selectByVisibleText("NO ACCESS");
	 a.moveToElement(btnsavenewuser).release().build().perform();
	 btnsavenewuser.click();
	 Thread.sleep(4000);
	 String return_Msg = lblsavenewuser.getText();
	 utility.isVisible(lblsavenewuser, wd, 15);
	 Thread.sleep(3000);
	 Assert.assertEquals(return_Msg, "Saved successfully");
	 
	 btnclosenewuser.click();
	 Thread.sleep(2000);
	}
	
	public void defaultnreadcessuser() throws InterruptedException 
	{
	 Actions a= new Actions(wd);	
	 
	 if(btnnewuser.isDisplayed()==false)
	 {
	 clickusermgm.click();
	// tabuser.click();
	 }
	 Thread.sleep(2000);
	 btnnewuser.click();
	 txtusername.sendKeys("read");
	 txtpassword.sendKeys("admin@123");
	 txtconfirmpassword.sendKeys("admin@123");
	 btnuserauthnext.click();
	 Thread.sleep(2000);
	 a.moveToElement(btnnextpersonaldetailsuser).release().build().perform();
	 Thread.sleep(2000);
	 txtfirstname.sendKeys("read");
	 txtlastname.sendKeys("read");
	 txtEmailid.sendKeys("read@read.com");
	 btnnextpersonaldetailsuser.click();
	 
	 Select ddusergrp = new Select(ddselectusergrp);
	 ddusergrp.selectByVisibleText("READ");
	 a.moveToElement(btnsavenewuser).release().build().perform();
	 btnsavenewuser.click();
	 Thread.sleep(3000);
	 utility.isVisible(lblsavenewuser, wd, 15);
	 
	 String return_Msg = lblsavenewuser.getText();
	 Thread.sleep(3000);
	 Assert.assertEquals(return_Msg, "Saved successfully");
	 
	 
	 btnclosenewuser.click();
	}

	public void defaultnadmincessuser() throws InterruptedException 
	{
		
	 Actions a= new Actions(wd);	
	 if(btnnewuser.isDisplayed()==false)
	 {
	 clickusermgm.click();
	// tabuser.click();
	 }
	 else
	 btnnewuser.click();
	 Thread.sleep(3000);
	 txtusername.sendKeys("Rajendra");
	 txtpassword.sendKeys("admin@123");
	 txtconfirmpassword.sendKeys("admin@123");
	 btnuserauthnext.click();
	 
	 String user = lbluseravaibility.getText();
		if (user.contains("already exists")) {
			System.out.println("This User name all ready Exist");
			btncloseuser.click();
		}
		
		else 
		{
	 
	 a.moveToElement(btnnextpersonaldetailsuser).release().build().perform();
	 
	 txtfirstname.sendKeys("Rajendra");
	 txtlastname.sendKeys("Mane");
	 txtEmailid.sendKeys("rajendra.mane@vxlsoftware.com");
	 btnnextpersonaldetailsuser.click();
	 
	 Select ddusergrp = new Select(ddselectusergrp);
	 ddusergrp.selectByVisibleText("ADMIN");
	 a.moveToElement(btnsavenewuser).release().build().perform();
	 btnsavenewuser.click();
	 Thread.sleep(3000);
	 utility.isVisible(lblsavenewuser, wd, 15);
	 
	 String return_Msg = lblsavenewuser.getText();
	 Thread.sleep(3000);
	 Assert.assertEquals(return_Msg, "Saved successfully");
	 
	 btnclosenewuser.click();
	}

	}
}
