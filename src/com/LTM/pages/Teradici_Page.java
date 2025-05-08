package com.LTM.pages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.PageFactory.utility;

public class Teradici_Page extends utility
{
	 WebDriver wd;
	
	
	public Teradici_Page(WebDriver wd)
	{
		//super(wd);
		this.wd = wd;
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		PageFactory.initElements(wd, this);
	}
   
	//Object Of utility
	utility sel= new utility();	
	//Mouse Action
	
	JavascriptExecutor js = (JavascriptExecutor)wd;
     	
	@FindBy (xpath = "(//*[contains(text(), 'TERADICI')])[1]")
	WebElement grpaalreadypresent;
	
	@FindBy(xpath = "//span[@class='rtIn icon-Site']")
	//@FindBy (xpath = "(//*[contains(text(), 'VXL')])[6]")
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
	
	
	
	@FindBy (xpath="//a[@id='ibtntHome']")
     WebElement btnhome;
	
	@FindBy (id="btnExpandMenu")
	WebElement ExpandMenu;
	
	@FindBy(linkText="Teradici")
	WebElement Teradicci;
	
	@FindBy(linkText="Configuration")
	WebElement Trust;
	
	@FindBy(linkText = "Anyware Trust Center configuration")
	//@FindBy(linkText="Teradici Configuration")
	WebElement Tera_Con;
	
	@FindBy (xpath = "//*[contains(text(), 'https://trust-center.vdi.com:32443/api/v1')]")
	WebElement trustcenterallredyexist_Trust;
	
	@FindBy (xpath = "(//*[contains(text(), 'No data available ')])[6]")
	WebElement trustcenterallredyexist_Tabel;
	
	//Add Trust center
	
	@FindBy (xpath="//input[@id='btnteradicicinfigurationadd']")
	WebElement btnaddTrustCenter;

	@FindBy (xpath="//input[@id='txtserverlink']")
	WebElement txtServerLinkTrustCenter;

	@FindBy (xpath="//input[@id='txtTeradiciSettingsUsername']")
	WebElement txtUsernameTrustCenter;

	@FindBy (xpath="//input[@id='txtlblTeradiciSettingsPassword']")
	WebElement txtPasswordTrustCenter;

	@FindBy (xpath="//input[@id='chkteradicichkresetpassword']")
	WebElement txtResetPasswordTrustCenter;

	@FindBy (xpath="//select[@id='ddlteradicidefaultgroup']")
	WebElement ddDefaultgroupTrustCenter;

	@FindBy (xpath="//input[@id='btnSaveTeradiciConfig']")
	WebElement btnsaveTrustCenter;
	
	@FindBy (xpath = "//label[@id='lblCSTeradiciMsgConfig']")
	WebElement lblsavetrustcenter;
	
	@FindBy (xpath = "(//div[@class='col-md-12 loading'])[1]")
	WebElement loaderaddtrustcenter;
	
	@FindBy (xpath = "//input[@id='btnteradicicinfigurationclose']")
	WebElement btnclosetrustcenter;
	
	@FindBy(xpath="(//i[@class='fa fa-refresh'])[3]")
	WebElement Click_Trust;
	
	@FindBy(id="btnSyncTrustCenterOk")
	WebElement Sync_Ok;
	
	@FindBy(xpath="//*[contains(text(), 'TERADICI')]//preceding-sibling::span[@class='rtPlus']")
	WebElement Grp;
	
	@FindBy(xpath="//*[contains(text(), '192.168.1.153')]")
	WebElement Node;
	
	@FindBy(linkText="Upgrade Management")
	WebElement Upgrade;
	@FindBy(linkText="Software Upgrade Management")
	WebElement Soft_mng;
	
	@FindBy(id="btnteradiciSoftwareupgrade")
	WebElement FirmUd;
	
	@FindBy (xpath = "//label[@id='lblCSTeradiciSoftwareupgrade']")
	WebElement lblfirmwareupgrade;
	
	//OTA Update
	
	@FindBy(linkText = "OTA Update")
	WebElement TabOTAupdate;
	
	@FindBy(xpath = "//input[@id='23.04.0-rc6']")
	WebElement chkOTAupdate;
	
	@FindBy(xpath = "//input[@id='btnOTAUpdateOTAUpdate']")
	WebElement btnOTAupdate;
	
	@FindBy(xpath = "//input[@id='btnOTAUpdateApply']")
	WebElement btnapplyOTAUpdate;
	
	@FindBy(xpath = "//label[@id='lblMsgOTAUpdatediv']")
	WebElement lblapplyOTAUpdate; //OTA Update Settings applied successfully.
	
	@FindBy(xpath = "//input[@id='btnOTAUpdateClose']")
	WebElement btncloseOTAupdate;
	
	
	
	//Desired
	
	@FindBy(linkText = "Desired")
	WebElement Desired;
	
	@FindBy(linkText = "Trusted Broker")
	WebElement Trsut_Broker;
	
	@FindBy(id="btnteradiciadd")
	WebElement Trust_Add;
	
	@FindBy(id="TD_txtaddress")
	WebElement Trust_address; //teraagent2.vdi.com
	
	@FindBy(id="TD_txtConntype")
	WebElement drp_Ele;
	
	@FindBy(xpath="//input[@id='TD_btntrustedbroker']")
	WebElement Trust_Apply;
	
	@FindBy(id="TD_lblMsg_trustedbroker")
	WebElement Trusted_Broker;
	
	@FindBy(id="btnteradiciclose")
	WebElement Trusted_Close;
	
	@FindBy(id="TD_lblMsg_trustedbroker")
	WebElement Trusted_Broker_MSG;
	
	@FindBy(id="btnsynctrustcenter")
	WebElement All_Sync;
	
	@FindBy (xpath="//div[@class='col-md-12 loading']")
	WebElement loader;
	
	@FindBy (xpath="//input[@id='btnSyncTrustCenterOk']")
	WebElement btnok;
	
	
	@FindBy (xpath="a[onclick=\"$('#divSyncTrustCenterAuto').removeClass('hidden');\"]")
	WebElement trustdevice;
	
	@FindBy(id="txtTeradiciNTPAddress")
	WebElement T_Address;
	
	@FindBy(id="txtTeradiciNTPPort")
	WebElement T_Port;
	
	@FindBy(id="txtTeradiciNTPIntervalSec")
	WebElement T_Query_Int;
	
	@FindBy(id="btnTeradiciNTPApply")
	WebElement NTP_apply;
	
	@FindBy(xpath="//label[@id='lblTeradiciNTPApplyMsg']")
	WebElement NTP_Lable;
	
	@FindBy(xpath = "//label[@id='lblTeradiciTimeZoneTabs']")
	WebElement tabTime_zone;
	
	@FindBy(id="ddlTeradiciTimezone")
	WebElement Drp_Time_Zone;
	
	@FindBy(id="txtTeradiciTimezoneTimeDisFormate")
	WebElement Time_Dis_Format;
	
	@FindBy(id="btnTeradiciTimezoneApply")
	WebElement Time_Zone_Apply;
	
	@FindBy(linkText = "Date & Time")
	WebElement Date_Time;
	
	@FindBy(linkText="Time Zone")
	WebElement NTP;
	
	@FindBy(id="lblTeradiciTimezoneApplyMsg")
	WebElement Time_Zone_lbl;
	
	@FindBy(linkText ="Log Level")
	WebElement Log_Level;
	
	@FindBy(id="txtTeradiciLogLevel")
	WebElement Drp_Log;
	
	@FindBy(id="btnTeradiciLogLevelApply")
	WebElement Log_Apply;
	
	@FindBy(id="TD_lblMsg_loglevel")
	WebElement Log_label;
	
	
	@FindBy (linkText = "Keyboard Settings")
	WebElement lblkeyboard;
	
	@FindBy (xpath = "//select[@id='ddlTeradiciKeyboardLayout']")
	WebElement ddkeyboardlay;
	
	@FindBy (xpath="//select[@id='ddlTeradiciKeyboardVarient']")
	WebElement ddkeyboardvar;
	
	@FindBy (xpath = "(//div[@class='noUi-handle noUi-handle-lower'])[1]")
	WebElement barrepeatdeply;
	
	@FindBy (xpath = "(//div[@class='noUi-handle noUi-handle-lower'])[2]")
	WebElement barrepeatrate;
	
	@FindBy (xpath = "//input[@id='btnTeradiciKeyboardApply']")
	WebElement btnapplykeyboard;
	
	@FindBy (xpath = "//label[@id='lblkeyboardmesg']")
	WebElement return_msg_Keyboard;
	
	@FindBy(linkText="Command")
	WebElement Command;
	
	@FindBy(linkText="Restart")
	WebElement Restart;
	
	@FindBy(id="btnTeadiciRebootAPPLY")
	WebElement Restart_Apply;
	
	@FindBy(id="lblTeadiciRebootApplyMsg")
	WebElement Restsrt_Label;
	
	@FindBy(linkText="Factory Reset")
	WebElement Factory_Reset;
	
	@FindBy(id="btnTeradiciFactoryResetApply")
	WebElement Factory_Apply;
	
	@FindBy(id="lblTeradiciFactoryResetApplyMsg")
	WebElement Factory_Label;
	
	@FindBy(linkText = "Shutdown")
	WebElement Shutdown;
	
	@FindBy(xpath ="//input[@id='btnTeradiciPowerOffApply']")
	WebElement btnShutdownApply;
	
	@FindBy (xpath = "//label[@id='lblTeradiciPowerOffApplyMsg']")
	WebElement lblshutdownmsg;
	
	
	//USB Authorization
	
	@FindBy(linkText = "USB Authorization")
	WebElement tabUSB;
	
	@FindBy(xpath = "//input[@id='24601']")
	WebElement chk_mouse;
	
	@FindBy(xpath = "//label[@for='onoffswitchUSBAuthorization']")
	WebElement chkauthorization;
	
	@FindBy (xpath = "//input[@id='btnteradiciUSBAuthorizationApply']")
	WebElement btnapplyUSB;
	
	@FindBy(xpath = "//label[@id='lblCSTeradiciUSBAuthorization']")
	WebElement lblapplyUSB;
	
	
	
	
	//Audio:-

	@FindBy(linkText ="Audio")
	WebElement tabAudio;

	@FindBy(xpath ="//label[@for='chkTeradiciAudioAVSync']")
	WebElement chkSync;

	@FindBy(xpath = "//input[@id='btnTeradiciAudioApply']")
	WebElement btnApplyaudio;
	
	@FindBy(xpath = "//label[@id='lblTeradiciAudioApplyMsg']")
	WebElement lblApplyaudio;
	
	//Branding:-

	@FindBy(linkText = "Branding")
	WebElement tabBranding ;


	@FindBy(id = "txtTeradiciBrandingAssetID")
	WebElement txtAessetId ;


	@FindBy(id = "txtTeradiciBrandingAssetHash")
	WebElement txtaessetHash;


	@FindBy(id = "btnTeradiciBrandingApply")
	WebElement btnbradingApply ;
	
	@FindBy(xpath = " //label[@id='lblTeradiciBrandingApplyMsg']")
	WebElement lblbradingApply ;
	
	//Imaging:-

	@FindBy(linkText = "Imaging")
	WebElement tabimaging ;

	@FindBy(id = "chkTeradiciImagingPcoIPUltraCpu")
	WebElement chkCPU ;

	@FindBy(id = "chkTeradiciImagingPcoIPUltraGpu")
	WebElement chkGPU ;

	@FindBy(id = "btnTeradiciImagingApply")
	WebElement btnimagingApply;
	
	@FindBy(xpath = " //label[@id='lblTeradiciImagingApplyMsg']")
	WebElement lblimagingApply;
	
	//Power:-

	@FindBy(linkText = "Power")
	WebElement tabPower;


	@FindBy(xpath = "//label[@for='chkTeradiciWakeOnLanEnable']")
	WebElement chkWakeOn ;

	@FindBy(id = "ddlTeradiciWakeOnLanPowerButtonFunction")
	WebElement ddlPowerbutton;


	@FindBy(id = "btnTeradiciWakeOnLanApply")
	WebElement btnpowerApply ;
	
	@FindBy(xpath = "//label[@id='lblTeradiciWakeOnLanApplyMsg']")
	WebElement lblpowerApply ;	
	
	//Network
	
	@FindBy(linkText = "Network")
	WebElement tabnetwork;
	
	@FindBy(xpath ="//input[@id='chkTeradiciNetworkDHCP']")
	WebElement chkDHCPU;
	
	@FindBy(xpath = "//input[@id='chkTeradiciNetworkIPV4']")
	WebElement chkiv4;
	
	@FindBy(xpath = "//input[@id='chkTeradiciNetworkIPV6']")
	WebElement chkiv6;
	
	@FindBy(xpath = "//input[@id='chkTeradiciNetworkWIFI']")
	WebElement chkwifi;
	
	@FindBy(xpath = "//input[@id='txtTeradiciBrandingDNSServers']")
	WebElement txtDNSServer;
	
	@FindBy(xpath = "//input[@id='txtTeradiciBrandingDomainName']")
	WebElement txtDomainName;
	
	@FindBy(xpath = "//input[@id='txtTeradiciBrandingHostName']")
	WebElement txtHostName; //Power Settings applied successfully.
	
	@FindBy(xpath = "//input[@id='btnTeradiciNetworkApply']")
	WebElement btnapplynetwork;
	
	@FindBy(xpath = "//label[@id='lblTeradiciNetworkApplyMsg']")
	WebElement lblapplynetwork;
	
	public void addgroup() 
	{
	  	Actions a= new Actions(wd);
	  	
	  	if(utility.isClickable(grpaalreadypresent, wd, 3)==true)
	  	//(grpaalreadypresent.isDisplayed()==true) 
	  	{
	  		System.out.println(" This name Group Allready present");
	  	}
	  	else 
	  	{
	  		a.moveToElement(site);
	  		a.contextClick(site).build().perform();;
		  	//a.contextClick().build().perform();
		  	addgrp.click();
		  	txtgrpname.sendKeys("TERADICI");
		  	btnsavegrp.click();
		  	utility.isVisible(lblsavegrp, wd,2000);
		  	String Return_MSG=lblsavegrp.getText();
			Assert.assertEquals(Return_MSG, "TERADICI Group created successfully.");
			btnclosegrp.click();
			utility.isVisible(btnhome, wd,3000);
			
		}
	  }
	
	public void addtrustcenter()
	{
		
		ExpandMenu.click();
		Teradicci.click();
		Trust.click();
		Tera_Con.click();
		utility.isInvisible(loaderaddtrustcenter, wd, 3000);
		
		//if(sel.isDisaplyedW(trustcenterallredyexist, wd, 1000)==true)
		if(utility.isClickable(trustcenterallredyexist_Trust, wd, 3)==true)
		//if(trustcenterallredyexist_Trust.isDisplayed()==true)
		{
			System.out.println("This Trust Center all ready present");
		}
		else 
		{
			btnaddTrustCenter.click();
			txtServerLinkTrustCenter.sendKeys("https://api.trea-new.vdi.com:32443/api/v1");
			txtUsernameTrustCenter.sendKeys("tcAdmin");
			txtPasswordTrustCenter.sendKeys("u61a86lnjzcZbydyLZG6BWV3eHhYWdyQ");
			
			Select dropdown= new Select(ddDefaultgroupTrustCenter);
			dropdown.selectByVisibleText("TERADICI");
			
			btnsaveTrustCenter.click();
			//sel.isVisible(lblsavetrustcenter, wd,2000);
			utility.isInvisible(loaderaddtrustcenter, wd, 2000);
			String Return_MSG=lblsavetrustcenter.getText();
			if(Return_MSG.contains("Record saved successfully"))
			{
			  System.out.println("Trust Center added Sucessfully");	
			}
	        
			else
			{
				System.out.println("Trust Center Not added");
			}
			btnclosetrustcenter.click();
			
		}
		
		
		utility.isVisible(btnhome, wd,3000);
	}
	
	public void trust_cen_config()
	{
		
		utility.isDisaplyedW(All_Sync, wd, 20);
		
		if(All_Sync.isDisplayed()==false)
		{
			ExpandMenu.click();
			Teradicci.click();
			Trust.click();
			Tera_Con.click();
			All_Sync.click();
				
		}
		else {
			//ExpandMenu.click();
			//Teradicci.click();
			//Trust.click();
			//Tera_Con.click();
			All_Sync.click(); //For All Sync Center
				
		    }
		WebDriverWait wait = new WebDriverWait(wd, Duration.ofSeconds(50));
		wait.until(ExpectedConditions.invisibilityOf(loader));
		btnok.click();
		wait.until(ExpectedConditions.visibilityOf(btnhome));
		System.out.println("1:Trust Center Sync Sucessfully ");
		
	}
	
	 @FindBy (xpath = "//input[@aria-controls='tblDatatableGI']")
	 WebElement searchbar;
	   
	 @FindBy(xpath = "//td[@class='sorting_1']")
	 WebElement clicknodeDLV;
	   
	
	public void firemware(String TeraIP)
	{
		WebDriverWait wait = new WebDriverWait(wd,Duration.ofSeconds(15));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".classlocator")));
		
		
		//WebDriverWait wait = new WebDriverWait(wd, Duration.ofSeconds(20));
		//wait.until(ExpectedConditions.visibilityOf(Grp));
		//Grp.click();
		
		searchbar.sendKeys(TeraIP);
   	 	clicknodeDLV.click();
		//Node.click();
		ExpandMenu.click();
		Upgrade.click();
		Soft_mng.click();
		FirmUd.click();
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@id='theprogress']//div[@class='col-md-12 loading']")));
		String Return_MSG=lblfirmwareupgrade.getText();
		Assert.assertEquals(Return_MSG, "Software Details Downlaoded successfully.");
		System.out.println("2.Firmware Upgrade Sucessfully");
		
	}
	
	public void OTAupdate()
	{
		TabOTAupdate.click();
		chkOTAupdate.click();
		btnOTAupdate.click();
		btnapplyOTAUpdate.click();
		
		String Return_MSG=lblapplyOTAUpdate.getText();
        Assert.assertEquals(Return_MSG, "OTA Update Settings applied successfully.");
		System.out.println("3:OTA Update Settings Test Pass");
		btncloseOTAupdate.click();
		
	}
	
	public void trust_broker(String Trust_add,String visible)
	{
		Actions a= new Actions(wd);
		Desired.click();
		Trsut_Broker.click();
		Trust_Add.click();
		Trust_address.sendKeys(Trust_add);
		
		a.moveToElement(Trust_Apply).release().build().perform();
		
		Select dropdown = new Select(drp_Ele);
		dropdown.selectByVisibleText(visible);
		Trust_Apply.click();
        String Return_MSG=Trusted_Broker_MSG.getText();
        Assert.assertEquals(Return_MSG, "Trusted Broker Settings applied successfully.");
		System.out.println("4:Trusted Broker Test Pass");
		Trusted_Close.click();
		
	}
	
	public void datetime_NTP(String Address,String Port,String Query_Int)
	{
		//(Desired).click();
		Date_Time.click();
		//(NTP).click();
		T_Address.sendKeys(Address);
		T_Port.sendKeys(Port);
		T_Query_Int.sendKeys(Query_Int);
		NTP_apply.click();
		String Return_MSG=NTP_Lable.getText();
		Assert.assertEquals(Return_MSG,"NTP Settings applied successfully.");
		System.out.println("5:NTP TimeZone Test Pass");
		
		
		
	}
	
	public void Time_Zone(String Time_Z,String Time_Format)

	{
		tabTime_zone.click();
		Select dropdown = new Select(Drp_Time_Zone);
		dropdown.selectByVisibleText(Time_Z);
		Time_Dis_Format.clear();
		Time_Dis_Format.sendKeys(Time_Format);
		Time_Zone_Apply.click();
		String Return_MSG=(Time_Zone_lbl).getText();
		Assert.assertEquals(Return_MSG, "Time Zone Settings applied successfully.");
		System.out.println("6:Time Zone Test Pass");
		
	}
	
	public void log_level(String Log)

	{
		Log_Level.click();
		Select dropdown = new Select(Drp_Log);
		dropdown.selectByVisibleText(Log);
		Log_Apply.click();
		utility.isVisible(Log_label, wd, 1000);
		String Return_MSG=Log_label.getText();
		Assert.assertEquals(Return_MSG, "Log level Settings applied successfully.");
		System.out.println("7:Log Level Test Pass");
		
	}
	
	public void Keyboard() throws InterruptedException
	{
		if(lblkeyboard.isDisplayed())
		{
			
		}
		else {
		Grp.click();
		Node.click();
		ExpandMenu.click();
		Desired.click();
		}
	  	lblkeyboard.click();
	  	
	  	Select dropdown = new Select(ddkeyboardlay);
		dropdown.selectByVisibleText("Albanian");
		//Thread.sleep(3000);
		///Select dropdown1 = new Select(ddkeyboardvar);
		//dropdown1.selectByVisibleText("Albanian (Plisi D1)");//"Albanian (Plisi D1)"
		
		Actions move = new Actions(wd);
		move.moveToElement(barrepeatdeply).clickAndHold();
		move.moveByOffset(100,0);
        move.release().build().perform();
        // move.build().perform();
        move.moveToElement(barrepeatrate).clickAndHold();
        move.moveByOffset(120,0);
        move.release().build().perform();
        //move.build().perform();
        btnapplykeyboard.click();
		utility.isVisible(return_msg_Keyboard, wd, 2000);
		
		String Return_MSG=return_msg_Keyboard.getText();
		Assert.assertEquals(Return_MSG, "Keyboard Settings applied successfully.");
		System.out.println("8:Keyboard Test Pass");
		
		
	}

	public void USB()
	{
		tabUSB.click();
		chk_mouse.click();
		chkauthorization.click();
		btnapplyUSB.click();
		String Return_MSG=lblapplyUSB.getText();
		Assert.assertEquals(Return_MSG, "USB Authorization Settings applied successfully.");
		System.out.println("9:Audio Setting Test Pass");
		
	}
	
	public void Audio()
	{
		tabAudio.click();
		chkSync.click();
		btnApplyaudio.click();
		String Return_MSG=lblApplyaudio.getText();
		Assert.assertEquals(Return_MSG, "Audio Settings applied successfully.");
		System.out.println("10:Audio Setting Test Pass");
		
	}
	
	public void Branding(String A_ID,String A_Hash)
	{
		tabBranding.click();
		txtAessetId.sendKeys(A_ID);
		txtaessetHash.sendKeys(A_Hash);
		btnbradingApply.click();
		
		String Return_MSG=lblbradingApply.getText();
		Assert.assertEquals(Return_MSG, "Branding Settings applied successfully.");
		System.out.println("11:Branding Setting Test Pass");
		
		
	}
	
	public void Imaging()
	{
		tabimaging.click();
		chkCPU.click();
		chkGPU.click();
		btnimagingApply.click();
		
		String Return_MSG=lblimagingApply.getText();
		Assert.assertEquals(Return_MSG, "Imaging Settings applied successfully.");
		System.out.println("12:Imaging Setting Test Pass");
		
	}
	
	public void command_Restart()
	{
		Command.click();
		Restart.click();
		Restart_Apply.click();
		//sel.isVisible(Restsrt_Label, wd, 1000);
		String Return_MSG=Restsrt_Label.getText();
		Assert.assertEquals(Return_MSG, "Restart Settings applied successfully.");
		System.out.println("13:Restart Test Pass");
		
		
	}
	
	public void Power()
	{
		tabPower.click();
		chkWakeOn.click();
		btnpowerApply.click();
		String Return_MSG=lblpowerApply.getText();
		Assert.assertEquals(Return_MSG, "Power Settings applied successfully.");
		System.out.println("14:Power Setting Test Pass");
	}
	
	public void Network()
	{
		tabnetwork.click();
		chkDHCPU.click();
		chkiv4.click();
		chkiv6.click();
		chkwifi.click();
		txtDNSServer.clear();
		txtDNSServer.sendKeys("192.168.2.101");
		txtDomainName.clear();
		txtDomainName.sendKeys("vdi	");
		txtHostName.clear();
		txtHostName.sendKeys("Teradici");
		btnapplynetwork.click();
		
		String Return_MSG=lblapplynetwork.getText();
		Assert.assertEquals(Return_MSG, "Network Settings applied successfully.");
		System.out.println("15:Network Settings Test Pass");
		
	}
	
	public void command_FactoryReset()
	{
		Factory_Reset.click();
		Factory_Apply.click();
		//sel.isVisible(Factory_Label, wd, 1000);
		String Return_MSG=Factory_Label.getText();
		Assert.assertEquals(Return_MSG, "Factory Reset Settings applied successfully.");
		System.out.println("16:Factory Reset Test Pass");
		
	}
		
	public void command_Shutdown()
	{
      Shutdown.click();
      btnShutdownApply.click();
      String Return_MSG=lblshutdownmsg.getText();
      Assert.assertEquals(Return_MSG, "Shutdown Settings applied successfully.");
      System.out.println("17:Shutdown Test Pass");
      
		
	}
	
	@FindBy(xpath = "//input[@id='btnsynctrustcenterSystemHealth']")
	WebElement lblsystemhealth;
	
	@FindBy(xpath = "//label[@id='lblTeradiciSystemHealthSuccessFailedMsg']")
	WebElement textsystemhealth;
	
	
	public void SystemHelty() 
	{
		Trust.click();
		Tera_Con.click();
		//loaderaddtrustcenter
		utility.isInvisible(loaderaddtrustcenter, wd, 15000);
		lblsystemhealth.click();
		utility.isInvisible(loaderaddtrustcenter, wd, 3000);
		
		String health= textsystemhealth.getText();
		if(health.contains("System Healthy"))
		{
			System.out.println("System Healthy");
		}
		
		else 
		{
		  System.out.println(health);	
		}
		
		Assert.assertEquals(health, "System Healthy");
	    System.out.println("18:System Is Helath");
		
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
	
	@FindBy (xpath = "//input[@id='ContentPlaceHolder1_btnCreateTemplate']")
	WebElement btnsave;
	
	
public void create_Template(String Temp_Name, String Trust_add,String Log) 
{
	tabtaskmanger.click();
	Expandmenu.click();
	clicktempmgr.click();
	taballtemp.click();
	if(utility.isClicked(btnaddtemp)==true)
	{
		txttemplatename.sendKeys(Temp_Name);
		Select os_type = new Select(ddostype);
		os_type.selectByVisibleText("Teradici");

		btnsave.click();
		taballtemp.click();

	// Trusted Broker
	Actions a = new Actions(wd);
	Desired.click();
	Trsut_Broker.click();
	//Trust_Add.click();
	Trust_address.sendKeys(Trust_add);

	a.moveToElement(Trust_Apply).release().build().perform();

	Select dropdown = new Select(drp_Ele);
	dropdown.selectByIndex(1);
	Trust_Apply.click();
	String Return_MSG = Trusted_Broker_MSG.getText();
	if (Return_MSG.contains("Request for settings update has been processed.")) {
		System.out.println("Trusted Broker Task added to Temp");
	} else {
		System.out.println("Trusted Broker Task failed to add");
	}

	// Time

	Date_Time.click();
	T_Address.sendKeys("times.google.com");
	T_Port.sendKeys("143");
	T_Query_Int.sendKeys("1356");
	NTP_apply.click();
	String Return_MSG1 = NTP_Lable.getText();

	if (Return_MSG1.contains("Request for settings update has been processed.")) {
		System.out.println("Date Time Task added to Temp");
	} else {
		System.out.println("Date Time Task failed to add");
	}

	// NTP
	tabTime_zone.click();
	Select dropdown1 = new Select(Drp_Time_Zone);
	dropdown1.selectByVisibleText("UTC");
	Time_Zone_Apply.click();
	String Return_MSG2 = (Time_Zone_lbl).getText();

	if (Return_MSG2.contains("Request for settings update has been processed.")) {
		System.out.println("NTP Task added to Temp");
	} else {
		System.out.println("NTP Task failed to add");
	}

	// Log Level
	Log_Level.click();
	Select dropdown2 = new Select(Drp_Log);
	dropdown2.selectByVisibleText(Log);
	Log_Apply.click();
	utility.isVisible(Log_label, wd, 1000);
	String Return_MSG3 = Log_label.getText();

	if (Return_MSG3.contains("Request for settings update has been processed.")) {
		System.out.println("Log Level Task added to Temp");
	} else {
		System.out.println("Log Level Task failed to add");
	}

	// Keyboard Setting
	lblkeyboard.click();

	Select dropdown3 = new Select(ddkeyboardlay);
	dropdown3.selectByVisibleText("Albanian");
	Actions move = new Actions(wd);
	move.moveToElement(barrepeatdeply).clickAndHold();
	move.moveByOffset(100, 0);
	move.release().build().perform();
	move.moveToElement(barrepeatrate).clickAndHold();
	move.moveByOffset(120, 0);
	move.release().build().perform();
	btnapplykeyboard.click();
	utility.isVisible(return_msg_Keyboard, wd, 2000);

	String Return_MSG4 = return_msg_Keyboard.getText();
	if (Return_MSG4.contains("Request for settings update has been processed.")) {
		System.out.println("Keyboard Task added to Temp");
	} else {
		System.out.println("Keyboard Task failed to add");
	}

	// USB Authorization
	tabUSB.click();
	chk_mouse.click();
	a.moveToElement(btnapplyUSB).release().build().perform();
	chkauthorization.click();
	btnapplyUSB.click();
	utility.isVisible(lblapplyUSB, wd, 5000);
	String Return_MSG5 = lblapplyUSB.getText();
	if (Return_MSG5.contains("Request for settings update has been processed.")) {
		System.out.println("USB Task added to Temp");
	} else {
		System.out.println("USB Task failed to add");
	}

	// Audio
	tabAudio.click();
	chkSync.click();
	btnApplyaudio.click();
	utility.isVisible(lblApplyaudio, wd, 5000);
	String Return_MSG6 = lblApplyaudio.getText();
	if (Return_MSG6.contains("Request for settings update has been processed.")) {
		System.out.println("Audio Task added to Temp");
	} else {
		System.out.println("Audio Task failed to add");
	}

	// Imaging
	tabimaging.click();
	chkCPU.click();
	chkGPU.click();
	btnimagingApply.click();
	utility.isVisible(lblimagingApply, wd, 5000);
	String Return_MSG7 = lblimagingApply.getText();
	if (Return_MSG7.contains("Request for settings update has been processed.")) {
		System.out.println("Imaging Task added to Temp");
	} else {
		System.out.println("Imaging Task failed to add");
	}

	// Power
	tabPower.click();
	chkWakeOn.click();
	btnpowerApply.click();
	utility.isVisible(lblpowerApply, wd, 5000);
	String Return_MSG8 = lblpowerApply.getText();
	if (Return_MSG8.contains("Request for settings update has been processed.")) {
		System.out.println("Power Task added to Temp");
	} else {
		System.out.println("Power Task failed to add");
	}

	// Network
	tabnetwork.click();
	chkDHCPU.click();
	chkiv4.click();
	chkiv6.click();
	chkwifi.click();
	txtDNSServer.clear();
	txtDNSServer.sendKeys("192.168.2.101");
	txtDomainName.clear();
	txtDomainName.sendKeys("vdi	");
	txtHostName.clear();
	txtHostName.sendKeys("Teradici");
	btnapplynetwork.click();
	utility.isVisible(lblapplynetwork, wd, 5000);
	String Return_MSG9 = lblapplynetwork.getText();
	if (Return_MSG9.contains("Request for settings update has been processed.")) {
		System.out.println("Network Task added to Temp");
	} else {
		System.out.println("Network Task failed to add");
	}
 }
	else 
	{
	 System.out.println("Failed To add template");	
	}
  }

}

