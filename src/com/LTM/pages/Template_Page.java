package com.LTM.pages;

import java.time.Duration;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import com.PageFactory.utility;

public class Template_Page  extends utility
{
	public WebDriver wd;
	SoftAssert softassert=new SoftAssert();

	
	public Template_Page(WebDriver wd) 
	{
		this.wd = wd;
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		PageFactory.initElements(wd, this);
	}
	
	@FindBy (xpath = "//a[@id='ImageButtonTask']") 
	WebElement tabtaskmanger;
	
	@FindBy (xpath = "//div[@id='btnExpandMenu']")
	WebElement Expandmenu;
	
	//@FindBy (css = "//div[@id='htmlmenuTaskManagerView']//li[@id='lblMenu_taskmanagementTask']//label[@title='Template Manager'][normalize-space()='Template Manager']")
	//WebElement clicktempmgr;
	
	@FindBy (css = "div[id='htmlmenuTaskManagerView'] li[id='lblMenu_taskmanagementTask'] label[title='Template Manager']")
	WebElement clicktempmgr;
	
	
	@FindBy (xpath = "//span[@id='spnalltemplate']")
	WebElement taballtemp;
	
	@FindBy (xpath = "//a[@data-original-title='Add']")
	WebElement btnaddtemp;
	
	@FindBy (xpath = "//input[@id='ContentPlaceHolder1_txtTemplateName']")
	WebElement txttemplatename;
	
	@FindBy (xpath = "//select[@id='ddlostype']")
	WebElement ddostype;
	
	@FindBy (xpath = "//select[@id='ddlTemplateType']")
	WebElement ddschtype;
	
	@FindBy (xpath = "//textarea[@id='ContentPlaceHolder1_txtAddMessage_CreTem']")
	WebElement txttemostartmsg;
	
	@FindBy (xpath = "//select[@id='ddlTMPostponedDisplayTime']")
	WebElement dddispalytime;
	
	@FindBy (xpath = "//input[@id='ContentPlaceHolder1_btnCreateTemplate']")
	WebElement btnsave;
	
	@FindBy(xpath = "//label[@id='lblNewTemplate_msg']")
    WebElement lbltemplatesavemsg;
    
    @FindBy(xpath = "//input[@id='ContentPlaceHolder1_btnTemplateClose']")
    WebElement btnclosetemplate;
    
    @FindBy(xpath = "//input[@id='myInput']")
    WebElement txtseartchbar;
    
    @FindBy(xpath = "//div[@class='media-body']//*[contains(text(), 'Template_RemoteOperation')]")
    //@FindBy(xpath = "(//a[@title='View'])[414]")
    WebElement btnviewtemplate;
	
	
	@FindBy (xpath = "//input[@id='ContentPlaceHolder1_btnTemplateClose']")
	WebElement btnclose;
	
	@FindBy (xpath = "//label[@id='lblNewTemplate_msg']")
	WebElement lbltempmgr;
	
	//System Setting
	
	// Security 802
	
	/*@FindBy (xpath = "(//label[@title='802.1x Security'])[3]")
	WebElement click802;
	
	@FindBy(xpath = "//select[@id='ddl8021NetworkType']")
	WebElement ddnetworktype_802;
	
	@FindBy(xpath = "//input[@id='Text8021xSSID']")
	WebElement txtSSID_802;
	
	@FindBy(xpath = "//select[@id='ddl8021xSecurityType']")
	WebElement ddsecuritytype_802;
	
	@FindBy(xpath = "//select[@id='ddl8021xEncryptionType']")
	WebElement ddencryptiontype_802;
	
	@FindBy(xpath = "//input[@id='Text8021xDomainName']")
	WebElement txtxdomainname_802;
	
	@FindBy(xpath = "//input[@id='Text8021xUserName']")
	WebElement txtusername_802;
	
	@FindBy(xpath = "//input[@id='Text8021xPassword']")
	WebElement txtpassword_802;
	
	@FindBy(xpath = "")
	WebElement
	
	@FindBy(xpath = "")
	WebElement
	
	@FindBy(xpath = "")
	WebElement
	*/
	//Network 802
	
	@FindBy (linkText = "802.1x Security")
	WebElement click802;
	
	@FindBy (xpath = "//div[@id='lblPortletSmmryTitle']//a[@class='fullscreen']")
	WebElement clickzoomin802;
	
	@FindBy (xpath = "//select[@id='ddl8021NetworkType']")
	WebElement ddnetworktype802;
	
	@FindBy(xpath = "//input[@id='Text8021xSSID']")
	WebElement txtSSID802;
	
	@FindBy(xpath = "//select[@id='ddl8021xSecurityType']")
	WebElement ddsecirutytype802;
	
	@FindBy(xpath = "//input[@id='Text8021xUserName']")
	WebElement txtusername802;
	
	@FindBy(xpath = "//input[@id='Text8021xPassword']")
	WebElement txtpassword802;
	
	@FindBy(xpath = "//input[@id='Checkbox8021xisautoconnect']")
	WebElement Chkautomatic802;
	
	@FindBy (xpath = "//input[@id='chkbxWinAuthIEEE']")
	WebElement chkIEEE802;
	
	@FindBy (xpath = "//input[@id='chkboxRememberMeAuth']")
	WebElement chkremenercrediantials802;
	
	@FindBy (xpath = "//input[@id='chkbxWinAuthAdvancedSettings']")
	WebElement chkadvancesetting802;
	
	@FindBy (xpath = "//input[@id='chkbxWinAuthSpecifyAuthenticationMode']")
	WebElement chkspecifyauthmode802;
	
	@FindBy(xpath = "//select[@id='ddlSelectWinAuthMode']")
	WebElement dduserauth;
	
	@FindBy (xpath = "//input[@id='chkboxWinAuthEnableFastReconnect']")
	WebElement chkenablefastconnect802;
	
	@FindBy (xpath = "//input[@id='chkbxWinAuthEAPVerifyTheServer']")
	WebElement chkverifyServer802;
	
	@FindBy (xpath = "//select[@id='ddlWinAuthSelectNotificationBeforeConnection']")
	WebElement ddnotifybeforecon802;
	
	@FindBy(xpath = "//input[@id='winAuthentication_btnApply']")
	WebElement btnapplyx802;
	
	@FindBy(xpath = "//label[@id='winAuthentication_lblMessage']")
	WebElement lblapplyx802;
	
	@FindBy (xpath = "//a[@class='fullscreen on']")
	WebElement clickzoomout802; //End of 802
	
	@FindBy (linkText = "System Settings")
	WebElement clicksystemsetting;
	
	@FindBy (linkText = "BIOS Configuration")
	WebElement clickbiosconfugration;
	
	
	@FindBy (linkText = "Network Settings")
	WebElement clicknetworksetting;
	
	@FindBy(linkText = "Computer Name")
	WebElement clickcompturename;
	
	@FindBy (linkText = "Peripheral Settings")
	WebElement clickperipheralsetting;
	
	@FindBy (linkText = "Power Management")
	WebElement clickpowermgmt;
	
	@FindBy (linkText = "Printer Settings")
	WebElement clickprintersetting;
	
	@FindBy (linkText = "Time and Language")
	WebElement clicktimeandlanguage;
	
	@FindBy (xpath = "//input[@id='XP_ComputerName_txtPrefix']")
	WebElement txtprefix;
	
	@FindBy (xpath = "//input[@id='XP_ComputerName_txtpostfix']")
	WebElement txtpostfix;
	
	@FindBy (xpath = "//select[@id='XP_ComputerName_ddltypeCNWindows']")
	WebElement ddtype;
	
	@FindBy (xpath = "//input[@id='XP_ComputerName_txtSysviewUsername']")
	WebElement txtusername;
	
	@FindBy (xpath = "//input[@id='XP_ComputerName_txtSysviewPassword']")
	WebElement txtpassword;
	
	@FindBy (xpath = "//input[@id='XP_ComputerName_btnComputerNameApplyJQ']")
	WebElement btnsavecomputername;
	
	@FindBy (xpath = "//label[@id='XP_ComputerName_lblMessage']")
	WebElement lblsavecomputername; //Request for settings update has been processed
	
	@FindBy (xpath = "//label[@id='XP_ComputerName_lblMenuDomain']")
	WebElement tabdomain;
	
	@FindBy(xpath = "//label[@id='XP_ComputerName_lblMenuCmptrName']")
	WebElement tabcompturename;
	
	@FindBy(xpath = "//input[@id='XP_ComputerName_rbtnDomain']")
	WebElement rddomain;
	
	@FindBy(xpath = "//input[@id='XP_ComputerName_rbtnWorkGroup']")
	WebElement rdworkgrp;
	
	@FindBy (xpath = "//input[@id='XP_ComputerName_txtDomain']")
	WebElement txtname_Domain;
	
	@FindBy (xpath = "//input[@id='XP_ComputerName_txtUserName']")
	WebElement txtusername_Domain;
	
	@FindBy (xpath = "//input[@id='XP_ComputerName_txtPassword']")
	WebElement txtpassword_Domain;
	
	@FindBy (linkText = "Ethernet Setup")
	WebElement clickethernetsetup;

	@FindBy (xpath = "//input[@id='XPEthernetSetup_btnEthernetApply']")
	WebElement btnsaveethernetsetting;
	
	@FindBy(xpath = "//input[@id='XPEthernetSetup_ChkObtainedDNS']")
	WebElement rdobtainautomatic;

	@FindBy (xpath = "(//label[@title='Wireless Properties'])[3]")
	WebElement clickwirelessproperty;

	@FindBy (xpath = "//input[@id='XPWirelessProp_txtW_networkname']")
	WebElement txtNetworkSSID;

	@FindBy (xpath = "//input[@id='XPWirelessProp_btnSaveWifi_XP']")
	WebElement btnsavewirelessproperty;

	//@FindBy (xpath = "(//label[@title='Wireless Setup'])[2]")
	//WebElement clickwirelesssetup;

	@FindBy (linkText = "Peripheral Settings")
	WebElement clickperiferalsetting;
	
	@FindBy (linkText = "Display Settings")
	WebElement clickdispalysetting;

	@FindBy (xpath = "//input[@id='WindowsDisplaySettings_btnApply']")
	WebElement btnsavedisplaysetting;
	
	@FindBy (linkText = "Keyboard Settings")
	WebElement clickkeyboardsetting;

	@FindBy (xpath = "//input[@id='WindowsKeyboardSettings_btnApply']")
	WebElement btnsavekeyboardsetting;
	
	@FindBy (linkText = "Mouse Settings")
	WebElement clickmousesetting;

	@FindBy (xpath = "//input[@id='WindowsMouseSettings_btnApply']")
	WebElement btnsavemousesetting;
	
	@FindBy (linkText = "Power Option")
	WebElement clickpoweroption;
	
	@FindBy (xpath = "//input[@id='XPPowerOption_btnPowerOptionSave']")
	WebElement btnsavepoweroption;
	
	@FindBy (linkText = "Add Printer")
	WebElement clickaddprinter;
	
	@FindBy (xpath = "//select[@id='XPPrinter_ddlPrinterType']")
	WebElement ddporttype;
	
	@FindBy (xpath = "//input[@id='XPPrinter_txtLocalPrinterName']")
	WebElement txtprintername;
	
	@FindBy (xpath = "//select[@id='XPPrinter_ddlManufacturer']")
	WebElement ddmanufacture;
	
	@FindBy (xpath = "//select[@id='XPPrinter_ddlPrinterDriverLists']")
	WebElement ddprinterdriverlist;
	
	
	@FindBy (xpath = "//input[@id='XPPrinter_txtIPAddress']")
	WebElement txtipaddress;
	
	
	@FindBy (xpath = "//input[@id='XPPrinter_txtNwUserName']")
	WebElement txtusername_Printer;
	
	@FindBy (xpath = "//input[@id='XPPrinter_txtNwPassword']")
	WebElement txtpassword_Printer;
	
	@FindBy (xpath = "//input[@id='XPPrinter_btnXPPrinter']")
	WebElement btnsaveprinter;
	
	@FindBy (linkText = "Date & Time")
	WebElement clickdateandtime;
	
	@FindBy (xpath = "//input[@id='XPDatetimeSett_btnApplyDateTimeSetup']")
	WebElement btnsavedatetime;

	@FindBy (xpath = "//label[@id='XPDatetimeSett_lbTimeZonec']")
	WebElement tabtimezone;

	@FindBy (xpath = "//select[@id='XPDatetimeSett_ddlTimeZone']")
	WebElement ddtimezone;

	@FindBy (xpath = "//input[@id='XPDatetimeSett_btnApplyDateTimeSetup']")
	WebElement btnsavetimezone;

	@FindBy (xpath = "//label[@id='XPDatetimeSett_lblTimeServers']")
	WebElement tabtimeserver;
	

	//@FindBy (xpath = "//a[@id='XPDatetimeSett_btnCombo']")
	//WebElement ddtimeserver;
	
	@FindBy(xpath = "//input[@id='XPDatetimeSett_txtCombobox']")
	WebElement ddtimeserver;

	@FindBy (xpath = "//input[@id='XPDatetimeSett_btnApplyDateTimeSetup']")
	WebElement btnsavetimeserver;
	
	@FindBy (linkText = "Region and Location")
	WebElement clickregionandlocation;

	@FindBy (xpath = "//input[@id='XPDateTimeFormat_btnApplyDateTimeFormat']")
	WebElement btnsaveregionandlocation;

	@FindBy (xpath = "//label[@id='XPDateTimeFormat_lblDateTimeFormat']")
	WebElement tabdateandtimeformat;

	@FindBy (xpath = "//input[@id='XPDateTimeFormat_btnApplyDateTimeFormat']")
	WebElement btnsavedateandtimeformat;

	//@FindBy (xpath = "")
	//WebElement asd;

	
	
	
	
	//User Setting
	@FindBy (linkText = "User Settings")
	WebElement clickusersetting; 
	
	@FindBy (linkText = "User Interface")
	WebElement clicluserinterface;
			
	@FindBy (linkText = "Screen Saver Settings")
	WebElement clickscreensaversetting;
			
	@FindBy (linkText = "Taskbar Properties")
	WebElement clicktaskbarproperties;
			
	@FindBy (linkText = "User Interface Settings")
	WebElement clickuserinterfacesetting;
	
	@FindBy (linkText = "Wallpaper Settings")
	WebElement clickwallerpersetting;
	
	@FindBy (xpath = "//select[@id='WinScreenSaverddlScreenSaverBrowseUpload']")
	WebElement ddsource;
	
	@FindBy (xpath = "//select[@id='WinScreenSaverddlScreenSaverConnName']")
	WebElement ddconname;
	
	@FindBy (xpath = "//select[@id='WinScreenSaverddlScreenSaverFile']")
	WebElement ddnewscreensaver;
	
	@FindBy (xpath = "//input[@id='WinScreenSaverbtnScreenSaverApply']")
	WebElement btnsavescreensaversetting;
	
	@FindBy (xpath = "//input[@id='XPTaskbarbtn_XP_TaskbarPropertieSave']")
	WebElement btnsavetaskbar;
	
	@FindBy (xpath = "//input[@id='XPTaskbarcbxLockTheTaskbar']")
	WebElement cfklocktaskbar;
	
	@FindBy (xpath = "//select[@id='XPUserInterfaceddlUserListName']")
	WebElement ddusername;
	
	@FindBy (xpath = "//input[@id='XPUserInterfacecbxAutoLogon']")
	WebElement chkautolon;
	
	@FindBy (xpath = "//input[@id='XPUserInterfacetxtPassword']")
	WebElement txtpassword_Autologon;
	
	@FindBy (xpath = "//input[@id='XPUserInterfacebtnSaveUserinterfaceSettings']")
	WebElement btnsaveautologon;
	
	@FindBy (xpath = "//label[@id='XPUserInterface_lblUserInterfaceSett']")
	WebElement tabWCL;
	
	@FindBy (xpath = "//input[@id='btnUserInterfaceSettApply']")
	WebElement btnsaveWCL;
	
	@FindBy (xpath = "//select[@id='XPWallpaperddlBrowseUpload']")
	WebElement ddsource_Wallpaper;
	
	@FindBy (xpath = "//select[@id='XPWallpaperddlConnName']")
	WebElement ddconname_Wallpaper;
	
	@FindBy (xpath = "//select[@id='XPWallpaperddlFile']")
	WebElement ddfile_wallpaper;
	
	@FindBy (xpath = "//select[@id='XPWallpaperddlPositions']")
	WebElement ddpictureposition;
	
	@FindBy (xpath = "//input[@id='XPWallpaperbtnSaveWallpaper']")
	WebElement btnsavewallpapersetting;
	
	//Administration
	@FindBy (linkText = "Administration")
	WebElement clickadministration;
	
	//Security
	@FindBy (linkText = "Security")
	WebElement clicksecurity;
	
	@FindBy (linkText = "File System")
	WebElement clickfilesystem;
	
	@FindBy (linkText = "Network")
	WebElement clicknetwork;
	
	@FindBy (linkText = "Software Restriction")
	WebElement clicksoftwarerestriction;
	
	@FindBy (linkText = "System")
	WebElement clicksystem;
	
	@FindBy (linkText = "Write Filter Operations")
	WebElement clickwritefilteroperation;
	
	@FindBy(xpath = "//label[@id='WinWriteFilterlblMenuFBWFCnfgrtn']")
	WebElement tabwritefilterexclustionlist;
	

	@FindBy(xpath = "//label[@id='WinWriteFilterlblMenuFBWFCacheSize']")
	WebElement tabFBWFCache;
	
	@FindBy(xpath = "//label[@id='WinWriteFilterlblMenuOverlaySettings']")
	WebElement tabOverlaysetting;
	
	@FindBy(xpath = "//input[@id='WinWriteFilterbtnFWFSaveNew']")
	WebElement btnsavewritefilterExeList;
	
	@FindBy(xpath = "//input[@id='WinWriteFiltertxtcatchsize']")
	WebElement txtsetmaximumcachesize;
	
	@FindBy(xpath = "//input[@id='WinWriteFilterbtnFWFSaveNew']")
	WebElement btnsaveFBWF;
	
	@FindBy(xpath = "//input[@id='WinOverlaySettingbtnFWFSave']")
	WebElement btnsaveoverlaysetting;
	
	
	@FindBy (linkText = "Firewall")
	WebElement clickfirewall;

	@FindBy (xpath = "//input[@id='XPFirewall_txtName']")
	WebElement txtportname;
	
	@FindBy (xpath = "//input[@id='XPFirewall_txtFirewallPortNo']")
	WebElement txtportno;
	
	@FindBy (xpath = "//input[@id='XPFirewall_btnSavePortXP']")
	WebElement btnsaveaddport;
	
	@FindBy (xpath = "//label[@id='XPFirewall_lblMenuAddProgram']")
	WebElement tabaddprogram;
	
	@FindBy (xpath = "//input[@id='XPFirewall_txtProgramName']")
	WebElement txtname_addprogram;
	
	@FindBy (xpath = "//input[@id='XPFirewall_txtProgramPath']")
	WebElement txtpath_addprogram;
	
	@FindBy (xpath = "//input[@id='XPFirewall_btnSaveProgram']")
	WebElement btnsaveaddprogram;
	
	@FindBy (linkText = "Proxy Settings")
	WebElement clickproxysetting;
	
	@FindBy (xpath = "//input[@id='WinProxySettingsbtnApplyIESettings']")
	WebElement btnsaveproxysetting;
	
	@FindBy (xpath = "//label[@class='onoffswitch-label'][@for='XPRestrictionchkIntstall']")
	WebElement btnenabledisable;
	
	@FindBy (xpath = "//input[@id='XPRestrictionSoftwareRestrictionXP_btnSave']")
	WebElement btnsaveinstalation;
	
	@FindBy (xpath = "//a[@id='XPRestrictionlibtnApplicationRestriction']")
	WebElement tabapplicationrestriction;
	
	@FindBy (xpath = "//a[@id='XPRestrictionlibtnBrowserRestriction']")
	WebElement tabbrowserrestriction;
	
	@FindBy (xpath = "//input[@id='XPRestrictionSoftwareRestrictionXP_btnSave']")
	WebElement btnsaveapplicationrestriction;
	
	@FindBy (xpath = "//input[@id='XPRestrictionSoftwareRestrictionXP_btnSave']")
	WebElement btnsavebrowserrestriction;

	@FindBy (linkText =  "Deploy Certificate")
	WebElement clickdeploycertificate;

	@FindBy (xpath = "//select[@id='WinInstallCertificateddlBrowseUpload']")
	WebElement ddsource_Deploycertificate;
	
	@FindBy (xpath = "//select[@id='WinInstallCertificateddlConnName']")
	WebElement ddconname_Deploycertificate;
	
	@FindBy (xpath = "//select[@id='WinInstallCertificateddlFile']")
	WebElement ddfile_Deplycertificate;
	
	@FindBy (xpath = "//select[@id='WinInstallCertificateddlPositions']")
	WebElement ddcertifiactetype_Deploycertificate;
	
	@FindBy (xpath = "//select[@id='WinInstallCertificateddlStoreName']")
	WebElement ddstorename_Deplycertificate;
	
	@FindBy (xpath = "//input[@id='WinInstallCertificatebtnApply_DeployCertificate_XP']")
	WebElement btnsave_Deploycertificate;
	
	@FindBy (linkText = "Port Settings")
	WebElement clickportsetting;
	
	@FindBy (xpath = "//input[@id='WinSecuritySettingsbtnSaveSecuritySetting_JQ']")
	WebElement btnsaveportsetting;
	
	//Connection Management
	@FindBy (linkText = "Connection Management")
	WebElement clickconnmgmt;
	
	//Remote Operaion Tool
	@FindBy (linkText = "Remote Operation Tool")
	WebElement clickremoteoperationtool;
	
	//Software Deployment
	@FindBy (linkText = "Software Deployment")
	WebElement clicksoftwaredeploment;
	
	@FindBy (xpath="//input[@id='Checkbox8021xisautoconnect']")
	WebElement chkconnectautomatic;
	
	/*@FindBy (xpath = "")
	WebElement ;
	
	@FindBy (xpath = "")
	WebElement ;
	
	@FindBy (xpath = "")
	WebElement ;
	
	@FindBy (xpath = "")
	WebElement ;
	
	@FindBy (xpath = "")
	WebElement ;
	
	@FindBy (xpath = "")
	WebElement ;
	
	*/
	public void Create_Template_System_Setting(String Temp_Name) throws InterruptedException 
	{
	
		tabtaskmanger.click();
		Expandmenu.click();
		clicktempmgr.click();
		
		taballtemp.click();
		if(utility.isClicked(btnaddtemp)==true)
		//btnaddtemp.click();
			if(Temp_Name=="Template_RHS")
			{
				txttemplatename.sendKeys("Template_RHS");
			}
			else
			{
				txttemplatename.sendKeys("Template_System_Setting");
			}
		
		Select os_type=new Select(ddostype);
		os_type.selectByVisibleText("Windows");
		
		Select Sch_type=new Select(ddschtype);
		Sch_type.selectByIndex(0);
		
		Select Dis_type=new Select(dddispalytime);
		Dis_type.selectByIndex(0);
		
		btnsave.click();
		taballtemp.click();
		
		clicksystemsetting.click();
		clicknetworksetting.click();

	// Network 802
		
		Actions a= new Actions(wd);
		  
		click802.click();
		//clickzoomin802.click();
		//utility.isDisaplyedW(ddnetworktype802, wd, 1000);
		
		//WebDriverWait wt = new WebDriverWait(wd, Duration.ofSeconds(10));
		
		//WebDriverWait wait = new WebDriverWait(wd, 10);
		//WebElement element = wd.findElement(By.id("some-element-id"));
		//wt.until(ExpectedConditions.stalenessOf(ddnetworktype802));
		
		
		
		//wd.WaitForPageUntilIWebElementIsClickable(ddnetworktype802);
		Select dropdown_01= new Select(ddnetworktype802);
		dropdown_01.selectByIndex(0);
		txtSSID802.clear();
		txtSSID802.sendKeys("x802");//802New
		
		Select dropdown1= new Select(ddsecirutytype802);
		dropdown1.selectByIndex(1);
		txtusername802.clear();
		txtusername802.sendKeys("administrator");
		txtpassword802.clear();
		txtpassword802.sendKeys("Verixo#123");
		
		if(chkconnectautomatic.isSelected()==false)
			{
	     	chkconnectautomatic.click();
	       }

		if(chkIEEE802.isSelected()==false)
		{
			chkIEEE802.click();
		}
	    
		if(chkremenercrediantials802.isSelected()==false)
		{
			//a.moveToElement(chkremenercrediantials802).release().build().perform();
			chkremenercrediantials802.click();
		}
		
		if(chkadvancesetting802.isSelected()==false)
		{
			a.moveToElement(chkadvancesetting802).release().build().perform();
			chkadvancesetting802.click();
			
			
		}
		else
		{
			//chkspecifyauthmode802.click();	
		}
		a.moveToElement(chkspecifyauthmode802).release().build().perform();
		chkspecifyauthmode802.click();
		Select user= new Select(dduserauth);
		user.selectByVisibleText("User Authentication");
		
		
		if(chkverifyServer802.isSelected()==false)
		{
			a.moveToElement(chkverifyServer802).release().build().perform();
			chkverifyServer802.click();
			a.moveToElement(ddnotifybeforecon802).release().build().perform();
			Select dropdown2= new Select(ddnotifybeforecon802);
			dropdown2.selectByIndex(0);
			a.moveToElement(chkverifyServer802).release().build().perform();
			chkverifyServer802.click();		
		  	
		}
	     a.moveToElement(chkenablefastconnect802).release().build().perform();
		if(chkenablefastconnect802.isSelected()==false)
		{
			a.moveToElement(chkenablefastconnect802);
			chkenablefastconnect802.click();
		}
		
		a.moveToElement(btnapplyx802).release().build().perform();
		btnapplyx802.click();
		lblapplyx802.click();
		
		//String Return_Msg=lblapplyx802.getText();
		//Assert.assertEquals(Return_Msg, "Windows 802.1x Security Settings applied successfully");
		//clickzoomout802.click();
		
	//Computer name
		
		clickcompturename.click();
		txtprefix.sendKeys("Raj");
		Select dropdown = new Select(ddtype);
		dropdown.selectByIndex(2);
		txtusername.sendKeys("asit");
		txtpassword.sendKeys("asit#123");
		btnsavecomputername.click();
		
	//Domain
		
		tabdomain.click();
		rdworkgrp.click();
		txtusername_Domain.sendKeys("asit");
		txtpassword_Domain.sendKeys("asit#123");
		btnsavecomputername.click();
		
	//Ethernet Setup
		clickethernetsetup.click();
		rdobtainautomatic.click();
		btnsaveethernetsetting.click();
	
	//peripheral Setting
		clickperiferalsetting.click();
		clickdispalysetting.click();
		btnsavedisplaysetting.click();
		
		clickkeyboardsetting.click();
		btnsavekeyboardsetting.click();
		
		clickmousesetting.click();
		btnsavemousesetting.click();
		
	//Power MGMT
		clickpowermgmt.click();
		clickpoweroption.click();
		btnsavepoweroption.click();
	
	//Printer Setting
		clickprintersetting.click();
		clickaddprinter.click();
		
		Thread.sleep(2000);
		
		Select PName= new Select(ddporttype);
		PName.selectByIndex(1);
		
		Thread.sleep(2000);
		
		txtprintername.sendKeys("Test_01");
		
		Thread.sleep(1000);
		
		Select Manufacture= new Select(ddmanufacture);
		Manufacture.selectByVisibleText("Microsoft");
		
		Thread.sleep(500);
		
		Select Manufacture_Driver= new Select(ddprinterdriverlist);
		Manufacture_Driver.selectByVisibleText("Microsoft PS Class Driver");
		
		Thread.sleep(500);
		
		txtipaddress.sendKeys("192.168.1.63");
		
		btnsaveprinter.click();
		
	//Time and Language
		clicktimeandlanguage.click();
		clickdateandtime.click();
		btnsavedatetime.click();
		
		tabtimezone.click();
		
		Select drop_time=new Select(ddtimezone);
		drop_time.selectByVisibleText("(UTC+05:30) Chennai, Kolkata, Mumbai, New Delhi");
		
		btnsavetimezone.click();
		
		tabtimeserver.click();
		
		ddtimeserver.click();
		ddtimeserver.clear();
		ddtimeserver.sendKeys("time.windows.com",Keys.ENTER); 
		btnsavetimeserver.click();
		
		clickregionandlocation.click();
		btnsaveregionandlocation.click();
		
		tabdateandtimeformat.click();
		btnsavedateandtimeformat.click();
		
		
	}
	
	public void Create_Template_User_Setting(String Temp_Name) 
	{
		
		/*
		if(utility.isVisible(taballtemp, wd, 5)==false)
    	{
    		tabtaskmanger.click();
    		Expandmenu.click();
    		clicktempmgr.click();
    	}
    	else 
    	{
    		
    	}
    	*/
		if(Temp_Name!="Template_RHS")
		{
			taballtemp.click();
			if(utility.isClicked(btnaddtemp)==true)
				//btnaddtemp.click();
				txttemplatename.sendKeys("Template_User_Setting");
		
			Select os_type=new Select(ddostype);
			os_type.selectByVisibleText("Windows");
		
			Select Sch_type=new Select(ddschtype);
			Sch_type.selectByIndex(0);
		
			Select Dis_type=new Select(dddispalytime);
			Dis_type.selectByIndex(0);
		
			btnsave.click();
		
		
			String abc=  lbltemplatesavemsg.getText();		
			if(abc.contains("Template name already exists"))
			{
			btnclosetemplate.click();
			txtseartchbar.sendKeys("Template_RemoteOperation");	
			btnviewtemplate.click();
			}
		
		
			else
			{
			taballtemp.click();
			}
		}
		
		clickusersetting.click();
		clicluserinterface.click();
		clickscreensaversetting.click();
		
		Select dd_source_Screen=new Select(ddsource);
		dd_source_Screen.selectByVisibleText("Repository");
		
		Select dd_Conmane_Screen=new Select(ddconname);
		dd_Conmane_Screen.selectByIndex(1);
		
		Select dd_Newfile_Screen=new Select(ddnewscreensaver);
		dd_Newfile_Screen.selectByIndex(1);
		
		btnsavescreensaversetting.click();
		
		clicktaskbarproperties.click();
		
		cfklocktaskbar.click();
		btnsavetaskbar.click();
		
		clickuserinterfacesetting.click();
		chkautolon.click();
		
		Select dd_username=new Select(ddusername);
		dd_username.selectByVisibleText("Administrator");
		
		txtpassword_Autologon.sendKeys("000000");
		
		btnsaveautologon.click();
		
		tabWCL.click();
		
		btnsaveWCL.click();
		
		
		clickwallerpersetting.click();
		
		Select dd_source_Wallpaper=new Select(ddsource_Wallpaper);
		dd_source_Wallpaper.selectByIndex(2);
		
		Select dd_Conmane_Wallpaper=new Select(ddconname_Wallpaper);
		dd_Conmane_Wallpaper.selectByIndex(1);
		
		Select dd_Newfile_Wallpaper=new Select(ddfile_wallpaper);
		dd_Newfile_Wallpaper.selectByIndex(1);
		
		Select dd_Position_Wallpaper=new Select(ddpictureposition);
		dd_Position_Wallpaper.selectByIndex(3);
		
		btnsavewallpapersetting.click();
		
		}
		
		
		
		
	
	public void Create_Template_Security(String Temp_Name)
	{
		if(Temp_Name!="Template_RHS")
		{
		taballtemp.click();
		if(utility.isClicked(btnaddtemp)==true)
		//btnaddtemp.click();
		txttemplatename.sendKeys("Template_Security");
		
		Select os_type=new Select(ddostype);
		os_type.selectByVisibleText("Windows");
		
		Select Sch_type=new Select(ddschtype);
		Sch_type.selectByIndex(0);
		
		Select Dis_type=new Select(dddispalytime);
		Dis_type.selectByIndex(0);
		
		//Actions a= new Actions(wd);
		
		btnsave.click();
		taballtemp.click();
		}
		Actions a= new Actions(wd);
		clicksecurity.click();
		//File System
		clickfilesystem.click();
		clickwritefilteroperation.click();
		
		tabwritefilterexclustionlist.click();
		a.moveToElement(btnsavewritefilterExeList).release().build().perform();
		btnsavewritefilterExeList.click();
		
		a.moveToElement(tabFBWFCache).release().build().perform();
		tabFBWFCache.click();
		txtsetmaximumcachesize.sendKeys("40");
		btnsaveFBWF.click();
		
		tabOverlaysetting.click();
		btnsaveoverlaysetting.click();
		
		
		//Network
		clicknetwork.click();
		clickfirewall.click();
		txtportname.sendKeys("Demo");
		txtportno.sendKeys("443");
		btnsaveaddport.click();
		
		tabaddprogram.click();
		txtname_addprogram.sendKeys("IE");
		txtpath_addprogram.sendKeys("C:\\Program Files\\Internet Explorer\\iexplore.exe");
		btnsaveaddprogram.click();
		
		clickproxysetting.click();
		btnsaveproxysetting.click();
		
		clicksoftwarerestriction.click();
		btnenabledisable.click();
		btnsaveinstalation.click();
		
		tabapplicationrestriction.click();
		btnsaveapplicationrestriction.click();
		
		tabbrowserrestriction.click();
		btnsavebrowserrestriction.click();
		
		clicksystem.click();
		
		clickdeploycertificate.click();
		
		Select dd_source=new Select(ddsource_Deploycertificate);
		dd_source.selectByVisibleText("Repository");
		
		Select dd_Conname=new Select(ddconname_Deploycertificate);
		dd_Conname.selectByIndex(1);
		
		Select dd_File=new Select(ddfile_Deplycertificate);
		dd_File.selectByIndex(1);
		
		Select dd_Type=new Select(ddcertifiactetype_Deploycertificate);
		dd_Type.selectByVisibleText("CER");
		
		Select dd_Store=new Select(ddstorename_Deplycertificate);
		dd_Store.selectByIndex(1);
		
		btnsave_Deploycertificate.click();
		
		clickportsetting.click();
		
		btnsaveportsetting.click();
		
		
	}
}
