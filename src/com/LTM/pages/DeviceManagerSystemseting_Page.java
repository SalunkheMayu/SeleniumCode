package com.LTM.pages;


import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import com.PageFactory.utility;

public class DeviceManagerSystemseting_Page extends utility

{
	
	public WebDriver wd;

	utility selUtility=new utility();
	
	
	//Create Grp
	
	@FindBy (xpath = "(//*[contains(text(), 'DM_GRP')])[1]")
	WebElement grpaalreadypresent;
	
	@FindBy (xpath = "//span[@class='rtIn icon-Site']")
	WebElement site;
	
	@FindBy (xpath = "(//span[@class='rmText'])[1]")
	WebElement addgrp;
	
	@FindBy (xpath = "//input[@id='txtTreeGroupName']")
	WebElement txtgrpname;
	
	@FindBy (xpath = "//input[@id='ContentPlaceHolder1_btnApplySettings']")
	WebElement btnsavegrp;
	
	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_btnCloseDown']")
	WebElement btnclosegrp;
	
	@FindBy (xpath = "//label[@id='lblMsgJQ']")
	WebElement lblsavegrp;
	
	
	//Device Move to GRP
	
	@FindBy (xpath = "//input[@aria-controls='tblDatatableGI']")
	WebElement searchbar;
	
	@FindBy (xpath = "(//input[@class='dt-checkboxes'])[1]")
	WebElement chkselectdevice;
	
	@FindBy (xpath = "//a[@class='clickable removeanchor']")
	WebElement clickMACID;
	
	@FindBy (xpath = "//label[@id='ContentPlaceHolder1_lblContextMoveTo']")
	WebElement clickmoveto;
	
	@FindBy (xpath = "//select[@id='ddlGroupsforMoveto']")
	WebElement ddtargetgrp;
	
	@FindBy (xpath = "//input[@id='ContentPlaceHolder1_btnApplySettings']")
	WebElement btnapplymoveto;
	
	@FindBy (xpath = "//input[@id='chkIAgree']")
	WebElement chkiagree;
	
	@FindBy (xpath = "//input[@id='btnOKConfirmationPopup']") //Request for settings update has been processed
	WebElement btnokmoveto;
	
	@FindBy (xpath = "//label[@id='lblMsgJQ']")
	WebElement lblmovetogrp;
	
	@FindBy (xpath = "//input[@id='ContentPlaceHolder1_btnCloseDown']")
	WebElement btnclose;
	
	@FindBy (xpath = "//a[@id='ibtntHome']")
	WebElement btnhome;
	
	
	//Click Grp
	
	@FindBy(xpath = "//*[contains(text(), 'DM_GRP')]//preceding-sibling::span[@class='rtPlus']")
	WebElement clickGrp;

	@FindBy(xpath = "(//*[contains(text(), '192.168.1.127')])[1]")
	WebElement clickNode;
	
	//@FindBy(xpath = "(//*[contains(text(), '192.168.2.4')])[2]")
	//WebElement clickNode;

	@FindBy(xpath = "(//*[contains(text(), '192.168.1.158')])[1]")
	WebElement clickNode158;

	@FindBy(xpath = "//div[@id='btnExpandMenu']")
	WebElement btnExpandMenu;

	@FindBy(linkText ="System Settings")
	WebElement systemset;

	@FindBy(linkText ="Network Settings")
	WebElement networkset;
     
	// x802 Setting
	
	@FindBy (xpath = "(//label[@title='802.1x Security'])[3]")
	WebElement click802security;
	
	@FindBy (xpath = "(//a[@class='fullscreen_datatables'])[2]")
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
	
	@FindBy (xpath = "//a[@class='fullscreen_datatables on']")
	WebElement clickzoomout802;
	
	
	//Computer Name
	
	@FindBy(linkText =  "Computer Name")
	WebElement computername;

	@FindBy(xpath = "//label[@id='XP_ComputerName_lblMenuCmptrName']")
	WebElement tabcomname;

	@FindBy(xpath = "//input[@id='XP_ComputerName_chkAutomatically']")
	WebElement rdbtnautogenerate;

	@FindBy(xpath = "//input[@id='XP_ComputerName_txtDmianUname']")
	WebElement txtComUname;

	@FindBy(xpath = "//input[@id='XP_ComputerName_txtDmianPassword']")
	WebElement txtComPassoword;

	@FindBy(xpath = "//input[@id='XP_ComputerName_btnComputerNameApplyJQ']")
	WebElement ButtonApplycomputername;

	@FindBy(xpath = "//label[@id='XP_ComputerName_lblMessage']")
	WebElement labcomputername;
	
	//Ethernet Setup
	
	@FindBy (linkText ="Ethernet Setup")
	WebElement clickethernetsetup;
	
	@FindBy (xpath = "//input[@id='XPEthernetSetup_rbtnManual']")
	WebElement rdbtnmanual;
	
	@FindBy (xpath = "//input[@id='XPEthernetSetup_btnEthernetApply']")
	WebElement btnapplyethernetsetup;
	
	@FindBy(xpath = "//label[@id='XPEthernetSetup_lblMsgEthernet'] ")
	WebElement lblapplyethernetsetup;
	
	//Wireless Properties
	
	@FindBy (linkText =  "Wireless Properties")
	WebElement clickwirelessProperties;
	
	@FindBy (xpath = "//input[@id='XPWirelessProp_btnWifiNewSettings']")
	WebElement btnnewwirelessproperties;
	
	@FindBy (xpath = "//input[@id='XPWirelessProp_txtW_networkname']")
	WebElement txtnetworkSSD; //vxlsoftware
	
	@FindBy (xpath = "//select[@id='XPWirelessProp_ddlW_lN_Authontication']")
	WebElement ddnetworktype; // index (2)
	
	@FindBy (xpath = "//input[@id='XPWirelessProp_txtW_networkkey']")
	WebElement txtnetworktype; //abc1234def
	
	@FindBy (xpath="//input[@id='Checkbox8021xisautoconnect']")
	WebElement chkconnectautomatic;
	
	@FindBy (xpath = "//input[@id='XPWirelessProp_btnSaveWifi_XP']")
	WebElement btnapplywirelessproperties;
	
	@FindBy (xpath = "//label[@id='XPWirelessProp_lblMsg']")
	WebElement lblapplywirelessproperties;
	

	@FindBy(xpath = "//label[@id='XP_ComputerName_lblMenuDomain']")
	WebElement tabdomain;

	@FindBy(xpath = "//input[@id='XP_ComputerName_rbtnWorkGroup']")
	WebElement rdbtnworkgrp;

	@FindBy(xpath = "//input[@id='XP_ComputerName_txtWorkgroup']")
	WebElement txtname;

	@FindBy(xpath = "//input[@id='XP_ComputerName_txtUserName']")
	WebElement txtdmusername;

	@FindBy(xpath = "//input[@id='XP_ComputerName_txtPassword']")
	WebElement txtdmpassword;

	@FindBy(xpath = "//input[@id='XP_ComputerName_btnComputerNameApplyJQ']")
	WebElement btnapplydomain;

	// Display Setting

	@FindBy(linkText = "System Settings")
	WebElement clickSystemSettings;

	@FindBy(linkText = "Peripheral Settings")
	WebElement clickPeripheralSettings;

	@FindBy(linkText = "Display Settings")
	WebElement clickDisplaySettings;

	@FindBy(xpath = "//select[@id='WindowsDisplaySettings_ddlResolution']")
	WebElement ddDisplayResolution;

	@FindBy(xpath = "//select[@id='WindowsDisplaySettings_ddlColorDepth']")
	WebElement ddDisplayColorDepth;

	@FindBy(xpath = "//select[@id='WindowsDisplaySettings_ddlMultiDisplay']")
	WebElement ddDisplayDualDisp;

	@FindBy(xpath = "//select[@id='WindowsDisplaySettings_ddlOrienattion']")
	WebElement ddDisplayRotation;

	@FindBy(xpath = "//input[@id='WindowsDisplaySettings_btnApply']")
	WebElement btnDisplayApply;

	@FindBy(xpath = "//label[@id='WindowsDisplaySettings_lblMsg']")
	WebElement lbldisplay;

	@FindBy(linkText = "Keyboard Settings")
	WebElement clickKeyboardSettings;

	@FindBy(xpath = "(//div[@class='noUi-handle noUi-handle-lower'])[1]")
	WebElement sliderKeyboardDelay;

	@FindBy(xpath = "(//div[@class='noUi-handle noUi-handle-lower'])[2]")
	WebElement sliderKeyboardRate;

	@FindBy(xpath = "//select[@id='WindowsKeyboardSettings_ddlKeyboardLocales']")
	WebElement ddKeyboardLocales;

	@FindBy(xpath = "//input[@id='WindowsKeyboardSettings_chkRemoveExist']")
	WebElement chkKeyboard;

	@FindBy(xpath = "//input[@id='WindowsKeyboardSettings_btnApply']")
	WebElement btnKeyboardApply;

	@FindBy(xpath = "//label[@id='WindowsKeyboardSettings_lblMsg']")
	WebElement lalkeyboardapply;

	// Mouse Setting
	@FindBy(linkText =  "Mouse Settings")
	WebElement clickmousesetting;

	@FindBy(xpath = "(//div[@class='noUi-handle noUi-handle-lower'])[3]")
	WebElement sliderdoublElementclk;

	@FindBy(xpath = "(//div[@class='noUi-handle noUi-handle-lower'])[4]")
	WebElement sliderpointerspeed;

	@FindBy(xpath = "//input[@id='WindowsMouseSettings_btnApply']")
	WebElement btnapplymousesetting;

	@FindBy(xpath = "//label[@id='WindowsMouseSettings_lblMsg']")
	WebElement lblmousesettingapply;

	// Power Management

	@FindBy(linkText = "Power Management")
	WebElement clickpowerMgmt;

	@FindBy(linkText =  "Power Option")
	WebElement clickpoweroption;

	@FindBy(xpath = "//select[@id='XPPowerOption_ddlPowerplan']")
	WebElement ddpowerplan;

	@FindBy(xpath = "//select[@id='XPPowerOption_ddlDisplay']")
	WebElement dddisplay;

	@FindBy(xpath = "//select[@id='XPPowerOption_ddlSleep']")
	WebElement ddsleep;

	@FindBy(xpath = "//input[@id='XPPowerOption_btnAdvanceSettingsNew']")
	WebElement btnadvanceset;

	@FindBy(xpath = "//select[@id='ddlTurnoffharddiskafter']")
	WebElement ddturnofhddafter;

	@FindBy(xpath = "//select[@id='ddlSleepafter']")
	WebElement ddsleepafter;

	@FindBy(xpath = "//select[@id='ddlTurnoffdisplayafter']")
	WebElement ddturndisplayafter;

	@FindBy(xpath = "//select[@id='ddlSystemstandby']")
	WebElement ddsysstandby;

	@FindBy(xpath = "//select[@id='ddlPowerbuttonaction']")
	WebElement ddpowerbtnaction;

	@FindBy(xpath = "//select[@id='ddlSleepbuttonaction']")
	WebElement ddsleepbtnaction;

	@FindBy(xpath = "//input[@id='XPPowerOption_btnSave']")
	WebElement btnSavePoweroption;

	@FindBy(xpath = "//span[@id='XPPowerOption_lblpowerMsg']")
	WebElement lblpowerplan;

	@FindBy(xpath = "//input[@id='XPPowerOption_btnClose']")
	WebElement btnclosePoweroption;

	@FindBy(xpath = "//input[@id='XPPowerOption_btnPowerOptionSave']")
	WebElement btnapplypoweroption;

	@FindBy(xpath = "//label[@id='XPPowerOption_lblMessage']")
	WebElement lblpoweroption;

	// printer

	@FindBy(linkText = "Printer Settings")
	WebElement clickprinterset;

	@FindBy(linkText = "Printers")
	WebElement clickprinters;

	// @FindBy (xpath = "(//label[@title='Printers'])[3]")
	// WebElement clickprinters;

	@FindBy(xpath = "//input[@id='XPPrinter_btnNewPrinter']")
	WebElement btnaddprinter;

	@FindBy(xpath = "//select[@id='XPPrinter_ddlPrinterType']")
	WebElement ddporttype;

	@FindBy(xpath = "//input[@id='XPPrinter_txtLocalPrinterName']")
	WebElement txtprintername;

	@FindBy(xpath = "//select[@id='XPPrinter_ddlManufacturer']")
	WebElement ddmanufacture;

	@FindBy(xpath = "//select[@id='XPPrinter_ddlPrinterDriverLists']")
	WebElement ddprinterdevicelist;

	@FindBy(xpath = "//select[@id='XPPrinter_ddlPortlist']")
	WebElement ddport;

	@FindBy(xpath = "//input[@id='XPPrinter_rbtnShared']")
	WebElement rdshared;

	@FindBy(xpath = "//input[@id='XPPrinter_rbtnNotShared']")
	WebElement rdnotshared;

	@FindBy(xpath = "//input[@id='XPPrinter_btnXPPrinter']")
	WebElement btnprintersetapply;

	@FindBy(xpath = "//input[@id='XPPrinter_btnCloseXPPrinter']")
	WebElement btncloseprinter;

	@FindBy(xpath = "//input[@id='XPPrinter_txtIPAddress']")
	WebElement textipaddress;

	@FindBy(xpath = "//input[@id='XPPrinter_txtNwUserName']")
	WebElement txtusernameprinter;

	@FindBy(xpath = "//input[@id='XPPrinter_txtNwPassword']")
	WebElement txtpasswordprinter;

	@FindBy(xpath = "//label[@id='XPPrinter_lblMsgsPrinter']")
	WebElement labprintersetapply;

	// Time and Language

	@FindBy(linkText = "Time and Language")
	WebElement clicktimelanguage;

	@FindBy(linkText = "Date & Time")
	WebElement clickdatetime;

	@FindBy(linkText = "Region and Location")
	WebElement clickregionandlocation;

	@FindBy(xpath = "//label[@id='XPDatetimeSett_lblDateTime']")
	WebElement tabdatetime;

	@FindBy(xpath = "//label[@id='XPDatetimeSett_lbTimeZonec']")
	WebElement tabtimezone;

	@FindBy(xpath = "//label[@id='XPDatetimeSett_lblTimeServers']")
	WebElement tabtimeserver;

	@FindBy(xpath = "//input[@id='XPDatetimeSett_btnApplyDateTimeSetup']")
	WebElement btnapplydatetime;

	@FindBy(xpath = "//label[@id='XPDatetimeSett_lblMSg_Success']")
	WebElement lblapplydatetime; // Request for settings update has been processed

	@FindBy(xpath = "//select[@id='XPDatetimeSett_ddlTimeZone']")
	WebElement ddtimezone;

	@FindBy(xpath = "//input[@id='XPDatetimeSett_btnApplyDateTimeSetup']")
	WebElement btnapplytimezone;

	@FindBy(xpath = "//label[@id='XPDatetimeSett_lblMSg_Success']")
	WebElement lblapplytimezone;

	@FindBy(xpath = "//input[@id='XPDatetimeSett_txtCombobox']")
	WebElement ddtimeserver;

	@FindBy(xpath = "//input[@id='XPDatetimeSett_btnApplyDateTimeSetup']")
	WebElement btnapplytimeserver;

	@FindBy(xpath = "//label[@id='XPDatetimeSett_lblMSg_Success']")
	WebElement lbltimeserverapply; // Request for settings update has been processed

	// Region and location

	@FindBy(xpath = "//label[@id='XPDateTimeFormat_lblRegionLocation']")
	WebElement tabregionlocation;

	@FindBy(xpath = "//select[@id='XPDateTimeFormat_ddlLocation']")
	WebElement ddlocation;

	@FindBy(xpath = "//select[@id='XPDateTimeFormat_ddlRegion']")
	WebElement ddformat;

	@FindBy(xpath = "//input[@id='XPDateTimeFormat_btnApplyDateTimeFormat']")
	WebElement btnapplyregionlocation;

	@FindBy(xpath = "//label[@id='XPDateTimeFormat_lblMSg_Success']")
	WebElement lblapplyregionlocation;

	@FindBy(xpath = "//label[@id='XPDateTimeFormat_lblDateTimeFormat']")
	WebElement tabdateandtime;

	@FindBy(xpath = "//select[@id='XPDateTimeFormat_ddlShortDateFormat']")
	WebElement ddshortdateformat;

	@FindBy(xpath = "//select[@id='XPDateTimeFormat_ddlShortDateSeparator']")
	WebElement dddateseprator;

	@FindBy(xpath = "//select[@id='XPDateTimeFormat_ddlLongDateFormat']")
	WebElement ddlongdateformat;

	@FindBy(xpath = "//select[@id='XPDateTimeFormat_ddlTimeSettings']")
	WebElement ddtimeformat;

	@FindBy(xpath = "//input[@id='XPDateTimeFormat_btnApplyDateTimeFormat']")
	WebElement btnapplydatetimeformat;

	@FindBy(xpath = "//label[@id='XPDateTimeFormat_lblMSg_Success']")
	WebElement lblapplydatetimeformat; // Request for settings update has been processed
		
	
	//Sync Device
	
	@FindBy (xpath="//i[@class='fa fa-refresh font-red']")
	WebElement btnSyncInventory;

	@FindBy (xpath="//input[@id='ContentPlaceHolder1_btnApplySettings']")
	WebElement btnSyncInventoryApply;

	
	@FindBy (xpath="//label[@id='lblMsgJQ']")
	WebElement lblSyncInventoryApply;
	
	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_btnCloseDown']")
	WebElement btnSyncInventoryClose;
	
	
	
	
	SoftAssert softassert=new SoftAssert();
	utility sel= new utility();	
	
  
public DeviceManagerSystemseting_Page(WebDriver wd)
	{
		this.wd = wd;
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		PageFactory.initElements(wd, this);
	}

  public void addgrp() 
  {
	  
	  		Actions a= new Actions(wd);
	  		a.moveToElement(site);
		  	a.contextClick().build().perform();
		  	addgrp.click();
		  	txtgrpname.sendKeys("DM_GRP");
		  	btnsavegrp.click();
		  	utility.isVisible(lblsavegrp, wd,2000);
		  	String Return_MSG=lblsavegrp.getText();
		  	if(Return_MSG.contains("Group already exists."))
		  	{
		  		System.out.println(" This name Group Allready present");	
		  	}
		  	else
		  	{
			Assert.assertEquals(Return_MSG, "DM_GRP Group created successfully.");
			//btnclosegrp.click();
			//sel.isVisible(btnhome, wd,2000);
		  	}
	  		
	  btnclosegrp.click();
	  btnhome.click(); 
	  if (utility.isDisaplyed(By.id("ibtntHome"), wd, 6000) == true);
		 
  }
  
  public void movedevice()
   {
	 Actions a= new Actions(wd);  
	 searchbar.sendKeys("192.168.1.127");
	 //searchbar.sendKeys("192.168.2.4");
	 chkselectdevice.click(); //
	 a.moveToElement(clickMACID);
	 a.contextClick().build().perform();
	 clickmoveto.click();
	 
	 Select dropdown= new Select(ddtargetgrp);
	 dropdown.selectByVisibleText("DM_GRP");
	 btnapplymoveto.click();
	 chkiagree.click();
	 btnokmoveto.click(); //Request for settings update has been processed
	 utility.isVisible(lblmovetogrp, wd,2000);
	 
	 String Return_MSG=lblmovetogrp.getText();
	 Assert.assertEquals(Return_MSG, "Request for settings update has been processed");
	 btnclose.click();
	 btnhome.click();
	 utility.isVisible(btnhome, wd,2000);
	 
	 
    }
  
  
  public void syncdevice()
  {
	clickGrp.click();
	clickNode.click();
	btnSyncInventory.click();
	btnSyncInventoryApply.click();
	
	String Return_Msg=lblSyncInventoryApply.getText();
	Assert.assertEquals(Return_Msg, "Request for settings update has been processed");
	btnSyncInventoryClose.click();
	
  }
  
  public void x802security() 
  {
	  Actions a= new Actions(wd);
	  if(btnExpandMenu.isDisplayed()==false)
	  {
		  clickGrp.click();
		  clickNode.click();
		    
	  }
	  btnExpandMenu.click();
	  systemset.click();
	  networkset.click();
	  click802security.click();
	  clickzoomin802.click();
	
	Select dropdown= new Select(ddnetworktype802);
	dropdown.selectByIndex(0);
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
		chkremenercrediantials802.click();
	}
	
	if(chkadvancesetting802.isSelected()==false)
	{
		chkadvancesetting802.click();
		chkspecifyauthmode802.click();
	}
	else
	{
		chkspecifyauthmode802.click();	
	}
	
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
	
	String Return_Msg=lblapplyx802.getText();
	Assert.assertEquals(Return_Msg, "Windows 802.1x Security Settings applied successfully");
	clickzoomout802.click();
  }
  
  public void setComputerName(String User1,String Pass1)
  {
	 // clickGrp.click();
	 // clickNode.click();
	 // btnExpandMenu.click();
	//  systemset.click();
	 // networkset.click();
	  if(computername.isDisplayed()==false)
	  {
		  	clickGrp.click();
			clickNode.click();
			btnExpandMenu.click();
			systemset.click();
			networkset.click();
			 	  
	  }
	  computername.click();
	  tabcomname.click();
	  txtComUname.sendKeys(User1);
	  txtComPassoword.sendKeys(Pass1);
	  ButtonApplycomputername.click();
	  String Return_Msg=labcomputername.getText();
	  
	  Assert.assertEquals(Return_Msg, "Computer Name Settings applied successfully");
	  
  }

  public void setDomainName(String name,String User2,String Pass2)
  {
	 
	  if(computername.isDisplayed()==false)
	  {
		  	clickGrp.click();
			clickNode.click();
			btnExpandMenu.click();
			systemset.click();
			networkset.click();
			computername.click();
			
			 	  
	  }
	  
	  tabdomain.click();
	  rdbtnworkgrp.click();
	  txtname.clear();
	  txtname.sendKeys(name);
	  txtdmusername.sendKeys(User2);
	  txtdmpassword.sendKeys(Pass2);
	  btnapplydomain.click();
	  String Return_Msg=labcomputername.getText();
	
	 Assert.assertEquals(Return_Msg, "Computer Name Settings applied successfully");
	 
  }

  public void ethernetsetup() 
  {
	clickethernetsetup.click();
	if(rdbtnmanual.isSelected()==false)
	{
		rdbtnmanual.click();
	}
	btnapplyethernetsetup.click();
	 String Return_Msg=lblapplyethernetsetup.getText();
	 Assert.assertEquals(Return_Msg, "Ethernet Setup Settings applied successfully");
	 
  }
  
  public void wirelessproperties() 

  {
	  clickwirelessProperties.click();
	  btnnewwirelessproperties.click();
	  txtnetworkSSD.sendKeys("vxlsoftware");
	
	  Select dropdown= new Select(ddnetworktype);
	  dropdown.selectByIndex(2);
	
	  txtnetworktype.sendKeys("abc123def");
	  chkconnectautomatic.click();
	  btnapplywirelessproperties.click();
	 
	  String Return_Msg=lblapplywirelessproperties.getText();
	  Assert.assertEquals(Return_Msg, "Wireless Properties Settings applied successfully");
	 
  }
  
  public void periferal(String dualdis)
  {
	  Actions move = new Actions(wd);
	
	  //Display Setting
	  
	//  clickSystemSettings.click();
	  clickPeripheralSettings.click();
	  clickDisplaySettings.click();
	  
	  Select dropdown = new Select(ddDisplayResolution);
	  dropdown.selectByIndex(1);
	  
	  Select dropdown1 = new Select(ddDisplayDualDisp);
	  dropdown1.selectByVisibleText(dualdis);
	  if(dualdis.contains("Ext"))
	  {
		  Select dropdown2 = new Select(ddDisplayRotation);
		  dropdown2.selectByIndex(1);
	  }
	  btnDisplayApply.click();
	  String Return_Msg=lbldisplay.getText();
	  Assert.assertEquals(Return_Msg, "Display settings has been applied.");
	
	  //Keyboard Setting  
	   
	   clickKeyboardSettings.click();
	  
	   move.moveToElement(sliderKeyboardDelay).clickAndHold();
	   move.moveByOffset(20,0);
	   move.release();
	   move.build().perform();   
	   move.moveToElement(sliderKeyboardRate).clickAndHold();
	   move.moveByOffset(30,0);
	   move.release();
	   move.build().perform();
	   Select dropdown2 = new Select(ddKeyboardLocales);
	   dropdown2.selectByIndex(10);
	   btnKeyboardApply.click();
		  
	   String Return_Msg1=lalkeyboardapply.getText();
	   Assert.assertEquals(Return_Msg1, "Keyboard settings has been applied.");
		  
	  
	  // Mouse Setting
	  clickmousesetting.click();
	  
	  move.moveToElement(sliderdoublElementclk).clickAndHold();
	  move.moveByOffset(5,0);
      move.release();
      move.build().perform();
      move.moveToElement(sliderpointerspeed).clickAndHold();
	  move.moveByOffset(5,0);
      move.release();
      move.build().perform();
      
      btnapplymousesetting.click();
      String Return_Msg2=lblmousesettingapply.getText();
	  Assert.assertEquals(Return_Msg2, "Mouse settings has been applied.");
    
	  
  }
  
  public void powerMgmt()
  {
	clickpowerMgmt.click();
	clickpoweroption.click();
	
	Select dropdown = new Select(ddpowerplan);
	dropdown.selectByIndex(0);
	
	Select dropdown1 = new Select(dddisplay);
	dropdown1.selectByIndex(0);
	
	Select dropdown2 = new Select(ddsleep);
	dropdown2.selectByIndex(0);
	
	btnadvanceset.click();
	
	utility.isVisible(ddturnofhddafter, wd, 10);
	
	Select dropdown3 = new Select(ddturnofhddafter);
	dropdown3.selectByIndex(0);

	Select dropdown4 = new Select(ddturndisplayafter);
	dropdown4.selectByIndex(0);
	
	Select dropdown5 = new Select(ddsleepafter);
	dropdown5.selectByIndex(0);
     
	btnSavePoweroption.click();
	btnclosePoweroption.click();	
    
	//if(lblpowerplan.getText().contains("Power Plan Saved."))
	//{
	//	btnapplypoweroption.click();	
	//}
	btnapplypoweroption.click();
     String Return_Msg=lblpoweroption.getText();
	 Assert.assertEquals(Return_Msg, "Request for settings update has been processed");
  
	
  }
  
  public void printer(String string,String printername) 
   {
	  clickprinterset.click();
	  clickprinters.click();
	  btnaddprinter.click();
	  
	  Select dropdown1 = new Select(ddporttype);
	  dropdown1.selectByVisibleText(string);
	  //Move to end of the page
	  Actions a= new Actions(wd);
	//  a.moveToElement(btnprintersetapply).release().build().perform();
	  //Select Printer by Indexing
	  if(string.contains("local"))
	  {
		  txtprintername.sendKeys(printername);
		  Select dropdown = new Select(ddmanufacture);
		  dropdown.selectByVisibleText("Microsoft");
		  
		  Select dropdown2 = new Select(ddprinterdevicelist);
		  dropdown2.selectByVisibleText("Microsoft PS Class Driver");
		  a.moveToElement(btnprintersetapply).release().build().perform();
		  btnprintersetapply.click();
		  
		  
	  }
	  else if (string.contains("Network"))
	  
			  {
				  txtprintername.sendKeys(printername);
				  txtusernameprinter.sendKeys("administrator");
				  txtpasswordprinter.sendKeys("P@ssw0rd");
				  a.moveToElement(btnprintersetapply).release().build().perform();
				  btnprintersetapply.click();
			  }
			  
			  
			  else if (string.contains("IP"))
			 
	  
			  {
				  txtprintername.sendKeys(printername);
				  Select dropdown = new Select(ddmanufacture);
				  dropdown.selectByVisibleText("Microsoft");
				  
				  Select dropdown2 = new Select(ddprinterdevicelist);
				  dropdown2.selectByVisibleText("Microsoft PS Class Driver");
				  utility.isVisible(textipaddress, wd, 10);
				  textipaddress.sendKeys("192.168.1.188");
				  a.moveToElement(btnprintersetapply).release().build().perform();
				  btnprintersetapply.click();
			  }
		  
	  	  String Return_Msg=labprintersetapply.getText();
	  	if(Return_Msg.contains("already exists"))
	     	{
	  		  System.out.println("This printer already exists");
	     	}
			else 
			{
				Assert.assertEquals(Return_Msg, "Printer Settings applied successfully");
			}
			  	
   
   }
  
  public void timelanguage()
  	{
  		
  		
  		clicktimelanguage.click();
  		clickdatetime.click();
  		
  		//Date Time
  		//tabdateandtime.click();
  		btnapplydatetime.click();
  		
  		String Return_Msg=lblapplydatetime.getText();
  		if(Return_Msg.contains("Date time information Settings applied successfully"))
  		{
  		softassert.assertEquals(Return_Msg, "Date time information Settings applied successfully");
  		}
  		else
  		{
  		  System.out.println("Date Time Task Fail");	
  		}
  		
  		//TimeZone
  		tabtimezone.click();
  		
  		Select dropdown = new Select(ddtimezone);
		dropdown.selectByIndex(5);
		
		btnapplytimezone.click();
		
		String Return_Msg1=lblapplytimezone.getText();
		
		if(Return_Msg1.contains("Date time information Settings applied successfully"))
  		{
  		softassert.assertEquals(Return_Msg1, "Date time information Settings applied successfully");
  		}
  		else
  		{
  		  System.out.println("TimeZone Task Fail");	
  		}
  		
		//Time Server
		tabtimeserver.click();
		ddtimeserver.click();
		ddtimeserver.clear();
		ddtimeserver.sendKeys("time.windows.com",Keys.ENTER); //time.windows.com,time.nist.gov,time-nw.nist.gov,time-a.nist.gov
		//Select dropdown2 = new Select(ddtimeserver);
		//dropdown2.selectByIndex(0);
		btnapplytimeserver.click();
		utility.isVisible(lblapplytimezone, wd, 2000);
		String Return_Msg2=lblapplytimezone.getText();
		
		if(Return_Msg2.contains("Date time information Settings applied successfully"))
  		{
  		softassert.assertEquals(Return_Msg2, "Date time information Settings applied successfully");
  		}
  		else
  		{
  		  System.out.println("Time Server Task Fail");	
  		}
		softassert.assertAll();
  	}
	  
  public void regionandlocation() 
  	{
	   // Region and location
  		clickregionandlocation.click();
  		//tabregionlocation.click();
	  
  		Select dropdown=new Select(ddlocation);
  		dropdown.selectByIndex(5);
	  
  		Select dropdown1=new Select(ddformat);
  		dropdown1.selectByIndex(4);
	  
  		btnapplyregionlocation.click();
	  
  		String Return_Msg=lblapplyregionlocation.getText();
		
		if(Return_Msg.contains("Settings applied successfully"))
		{
		softassert.assertEquals(Return_Msg, "Region and Location Settings applied successfully");
		}
		else
		{
		  System.out.println("Region And Location Task Fail");	
		}
	  
	  
		// Date and time format
		
		tabdateandtime.click();
		
		Select dropdown2=new Select(ddshortdateformat);
  		dropdown2.selectByIndex(4);
		
  		Select dropdown3=new Select(ddlongdateformat);
  		dropdown3.selectByIndex(2);
		
  		Select dropdown4=new Select(ddtimeformat);
  		dropdown4.selectByIndex(3);
  		
  		btnapplydatetimeformat.click();
  		
  		String Return_Msg2=lblapplydatetimeformat.getText();
  		
  		if(Return_Msg2.contains("Date time information Settings applied successfully"))
		{
		softassert.assertEquals(Return_Msg2, "Date time information Settings applied successfully");
		}
		else
		{
		  System.out.println("Date and time format Task Fail");	
		}
  		
  		softassert.assertAll();
	  
  	}

}	

