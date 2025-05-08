package com.LTM.pages;


import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.PageFactory.utility;

public class LinuxDM_Page 
{
	public WebDriver wd;
   
	public LinuxDM_Page(WebDriver wd) 
    {
 	   this.wd = wd;
 	   wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
 	   PageFactory.initElements(wd, this);
    }
    
    SoftAssert softassert=new SoftAssert();
    
    @FindBy(xpath = "//a[@id='ibtntHome']")
    WebElement btnhome;
    
    @FindBy(xpath = "//*[contains(text(), 'DM_GRP')]//preceding-sibling::span[@class='rtPlus']")
	WebElement clickGrp;
	
	@FindBy(xpath = "//*[contains(text(), 'DM_GRP')]")
	WebElement grp;

	@FindBy(xpath = "(//*[contains(text(), '192.168.1.129')])[1]")
	WebElement clickNode;
	
	@FindBy(xpath = "//div[@id='btnExpandMenu']")
	WebElement btnExpandMenu;

	@FindBy(linkText =  "System Settings")
	WebElement systemset;
	
    
    @FindBy(xpath = "(//li[@id='lblMenu_Bios_Linux'])[2]")
    WebElement clickbiosconfugration;
    
    
    @FindBy(xpath = "//input[@id='Linux_BiosInfo_btnbiosInfoApplyJquery']")
    WebElement btnapplybiosconfug;
    
    @FindBy(linkText ="Date and Time")
    WebElement clickdatetime;
    
    @FindBy(linkText = "Date & Time Setup")
    WebElement clickdateandtimesetup;
    
    @FindBy(xpath = "//input[@id='LX_DateTime_btnSaveDateTimeSettings']")
    WebElement btnapplydatetime;
    
    @FindBy(xpath = "//label[@id='LX_DateTime_lblTimeZone']")
    WebElement tabtimezone;
    
    @FindBy(xpath = "//input[@id='LX_DateTime_btnSaveDateTimeSettings0']")
    WebElement btnapplytimezone;
    
    @FindBy(xpath = "//label[@id='LX_DateTime_lblTimeServer']")
    WebElement tabtimeserver;
    
    @FindBy(xpath = "//input[@id='LX_DateTime_btnSaveDateTimeSettings1']")
    WebElement btnapplytimeserver;
    
    @FindBy(xpath = "(//label[@title='Fonts Management'])[2]")
    WebElement clickfontmgmt;
    
    @FindBy(xpath = "//input[@id='Linux_FontManagement_btnFontApply']")
    WebElement btnapplyimportfont;
    
    @FindBy(xpath = "//label[@id='Linux_FontManagement_lblFontServer']")
    WebElement tabfontserver;
    
    @FindBy(xpath = "//input[@id='Linux_FontManagement_btnFontApply']")
    WebElement btnapplyfontserver;
    
    @FindBy(linkText = "Language")
    WebElement clicklanguage;
    
    @FindBy(xpath = "//input[@id='Linux_Language_btnApplyLanguageApplye']")
    WebElement btnapplylanguage;
    
    @FindBy(linkText = "Network Settings")
    WebElement clicknetworksetting;
    
    @FindBy(linkText = "802.1x Security")
    WebElement click802;
    
    @FindBy(xpath = "//input[@id='lx802_btnSave']")
    WebElement btnapply802;
    
    @FindBy(linkText =  "Computer Name")
    WebElement clickcomputename;
    
    @FindBy(xpath = "//input[@id='LXComputerName_btnComputerSave']")
    WebElement btnapplycomputername;
    
    @FindBy(xpath = "//label[@id='LXComputerName_lblDomainsett']")
    WebElement tabdomain;
    
    @FindBy(xpath = "//input[@id='LXComputerName_btnComputerSave']")
    WebElement btnapplydomian;
    
    @FindBy(linkText =  "CronTab")
    WebElement clickcrontab;
    
    @FindBy(xpath = "//input[@id='LXCronTab_btnNew_Crontab']")
    WebElement btnnewcrontab;
    
    @FindBy(xpath = "//input[@id='LXCronTab_btnApply_Crontab']")
    WebElement btnapplycommand;
    
    @FindBy (xpath = "//label[@id='LXCronTab_lblConnectionCrontab']")
    WebElement tabconnection;
    
    @FindBy(xpath = "//input[@id='LXCronTab_btnApply_Crontab']")
    WebElement btnapplyconnction;
    
    @FindBy(xpath = "//label[@id='LXCronTab_lblApplicationCrontab']")
    WebElement tabapplication;
    
    @FindBy(xpath = "//input[@id='LXCronTab_btnApply_Crontab']")
    WebElement btnapplyapplication;
    
    @FindBy(xpath = "//label[@id='LXCronTab_lblShellScriptCrontab']")
    WebElement tabshellscript;
    
    @FindBy(xpath = "//input[@id='LXCronTab_rbtnInstantApply']")
    WebElement chkshellscript;
    
    @FindBy(xpath = "//input[@id='LXCronTab_btnApply_Crontab']")
    WebElement btnapplyshellscript;
    
    
    @FindBy(linkText = "DNS And Gateway")
    WebElement clickDNSgateway;
    
    @FindBy(xpath = "//input[@id='LXDNSandGateway_btnAppyDNSSetting_LX']")
    WebElement btnapplyDNS;
    
    @FindBy(xpath = "//label[@id='LXDNSandGateway_lblGateway']")
    WebElement tabgateway;
    
    @FindBy(xpath = "//input[@id='LXDNSandGateway_btnApplyGatewaySetting_LX']")
    WebElement btnapplygateway;
    
    @FindBy(xpath = "//label[@id='LXDNSandGateway_lbldomainSuffix']")
    WebElement tabDNSSuffix;
    
    @FindBy(xpath = "//input[@id='LXDNSandGateway_btnSuffixApply']")
    WebElement btnapplyDNSSuffix;
    
    @FindBy(linkText = "Ethernet Setup")
    WebElement clickethernatesetup;
    
    @FindBy(xpath = "//input[@id='LXEthernetSetup_btnApplyEthernetsettings']")
    WebElement btnapplyethernetsetup;
    
    @FindBy(linkText = "Firewall Configurator")
    WebElement clickfirewallconfug;
    
    @FindBy(xpath = "//input[@id='LXFirewallConfig_btnAddNewConfig']")
    WebElement btnnewfirewallsetting;
    
    @FindBy(xpath = "//label[@id='LXFirewallConfig_lblIPtable']")
    WebElement tabIPtable;
    
    @FindBy(xpath = "//input[@id='LXFirewallConfig_btnApplyIPTable']")
    WebElement btnapplyIPtable;
    
    @FindBy(linkText = "Hosts Xhost Settings")
    WebElement clickHostsXhostSet;
    
    @FindBy(xpath = "//input[@id='LinuxXhost_btnSave_Host']")
    WebElement btnapplyxhost;
    
    @FindBy(xpath = "//label[@id='LinuxXhost_lblMenuHosts']")
    WebElement tabHosts;
    
    @FindBy(xpath = "//input[@id='LinuxXhost_btnSave_Host']")
    WebElement btnapplyHosts;
    
    @FindBy(linkText = "Wireless Properties")
    WebElement clickwirelessproperties;
    
    @FindBy(xpath = "//input[@id='LXWirelessProp_btnNewSettings']")
    WebElement btnnewwirelessproperties;
    
    @FindBy(linkText = "Network Proxy")
    WebElement clicknetworkproxy;
    
    @FindBy(xpath = "//input[@id='LxNetworkProxybtnApplyPartition']")
    WebElement btnapplynetworkproxy;
    
    @FindBy(linkText = "Peripheral Settings")
    WebElement clickperiferalsetting;
    
    @FindBy(linkText = "Display Settings")
    WebElement clickdispalysetting;
    
    @FindBy(linkText = "Fabulatech")
    WebElement clickfabulatech;
    
    @FindBy(linkText = "Keyboard Settings")
    WebElement clickkeyboardset;
    
    @FindBy(xpath = "//input[@id='LXKBrbtnInstant']")
    WebElement chkexcutivenowkeyboeard;
    
    @FindBy(linkText = "SerialPort Settings")
    WebElement clickserialportsetting;
    
    @FindBy(linkText ="Sound Management")
    WebElement clicksoundmgmt;
    
    @FindBy(linkText = "Mouse Settings")
    WebElement clickmousestiing;
    
    @FindBy(linkText = "PhilipsSpeech")
    WebElement clickphikips;
     
    @FindBy(xpath = "//input[@id='LxDsp_btnSave']")
    WebElement btnapplyDisplaysetting;
    
    @FindBy(xpath = "//input[@id='LXFabulaTech_btn_Apply']")
    WebElement btnapplyfabulatech;
    
    @FindBy(xpath = "//input[@id='LXKBbtnSave']")
    WebElement btnapplykeyboardsetting;
    
    @FindBy(xpath = "//input[@id='LXSPbtnLinux_Save']")
    WebElement btnapplyserialportset;
    
    
    @FindBy(xpath = "//input[@id='LXMousebtnLinuxMouseSettingApply']")
    WebElement btnapplymousesetting;
    
    @FindBy(xpath = "//input[@id='lx_services_btnApply_ServicesSett']")
    WebElement btnapplyphilipsspeech;
    
    @FindBy(linkText = "Printer Settings")
    WebElement clickprintersetting;
    
    @FindBy(linkText = "Printers")
    WebElement clickprinters;
    
    @FindBy(linkText = "Thin Print")
    WebElement clickthinprint;
    
    @FindBy(linkText =  "Shutdown Procedure")
    WebElement clickshutdownprocesure;
    
    @FindBy(xpath = "//input[@id='LXSDPbtnSave_LX_Shut']")
    WebElement btnapplyshudownprocess;
    
    @FindBy(xpath = "//label[@id='LXSDPlblMenuS3']")
    WebElement tabS3;
    
    @FindBy(xpath = "//input[@id='LXSDPbtnSave_LX_Shut']")
    WebElement btnapplyS3;
    
    @FindBy(xpath = "//input[@id='LXPrinter_btnAddNewPrinter']")
    WebElement btnaddnewprinter;
    
    
    @FindBy(xpath = "//input[@id='LXThinPrint_btnSaveThinPrintApplye']")
    WebElement btnapplythinprint;
    
    @FindBy(linkText = "User Settings")
    WebElement clickusersetting;
    
    @FindBy(linkText ="User Interface")
    WebElement clickuserinterface;
    
    @FindBy(linkText ="Background")
    WebElement clickbackground;
    
    @FindBy(linkText ="Screen Saver Settings")
    WebElement clickscreensaverset;
    
    @FindBy(linkText = "User Interface Settings")
    WebElement clickuserinterfaceset;
    
    @FindBy(xpath = "//input[@id='LXUIrbtnUserInstant']")
    WebElement chkexcutivrnowuserinterface;

    @FindBy(xpath = "//input[@id='LXBackground_btnsave']")
    WebElement btnapplybackground;
    
    @FindBy(xpath = "//input[@id='LXScreenSaver_btnapplyScreenSaver']")
    WebElement btnapplyscreensaver;
    
    

    @FindBy(xpath = "//label[@id='LXScreenSaver_lblMonitorpower']")
    WebElement tabmonitorpower;
    
    @FindBy(xpath = "//input[@id='LXScreenSaver_btnapply']")
    WebElement btnapplymonitorpower;
    
    @FindBy(xpath = "//input[@id='LXUIbtnSaveUserinterface']")
    WebElement btnapplyuserinterfaceset;
     
    // Security
    
    @FindBy(linkText ="Security")
    WebElement clicksecurity;
    
    
    @FindBy(linkText ="Applications")
    WebElement clickapplication;
    
    @FindBy(linkText = "Software Restriction")
    WebElement clicksoftwarerestriction;
    
    @FindBy(xpath = "//input[@id='LX_Application_btnApplyLxApplicationsApplye']")
    WebElement btnapplyapplication_LX;
    
    @FindBy(xpath = "//input[@id='LXSoftRestriction_btnSave']")
    WebElement btnapplysoftrestriction;
    
    
    //Upgrade Manegment
    
    @FindBy(linkText = "Upgrade Management")
    WebElement clickugrademgmt;
    
    @FindBy(linkText =  "File Transfer")
    WebElement clickfiletransfer;
     
    @FindBy(linkText = "Import Export Settings")
    WebElement clickimportfilesetting;
    
    @FindBy(linkText = "Software Upgrade Management")
    WebElement clicksoftupgrademgmt;
    
    @FindBy(linkText =  "Software Upgrade")
    WebElement clicksoftwareupgrade;
    
    @FindBy(xpath = "//input[@id='LXFileTransfer_btnTransfer']")
    WebElement btnapplyfiletransfer;
    
    @FindBy(xpath = "//input[@id='LXImportExport_btnImportExportApply']")
    WebElement btnapplyexportfromdevice;
    
    @FindBy(xpath = "//label[@id='LXImportExport_lblImporttodevice']")
    WebElement tabimporttodevice;
    
    @FindBy(xpath = "//input[@id='LXImportExport_btnImportExportApply']")
    WebElement btnapplyimporttodevice;
    
    @FindBy(xpath = "//input[@id='LXSoftwareUpgrade_btnNew_Install']")
    WebElement btnnewupgrade;

    //Administration
    
    @FindBy(linkText = "Administration")
    WebElement clickadministration;
    
    @FindBy(linkText = "Certificate Manager")
    WebElement clickcertificatemgr;
    
    @FindBy(xpath = "//input[@id='LXCertificateManager_btnNewImport']")
    WebElement btnnewimport;
    
    @FindBy(xpath = "//label[@id='LXCertificateManager_lblMenuKeys']")
    WebElement tabkey;
    
    
    @FindBy(xpath = "//input[@id='LXCertificateManager_btnNewImport']")
    WebElement btnnewimportkeys;
    
    @FindBy(xpath = "//label[@id='LXCertificateManager_SCEP']")
    WebElement tabSCEP;
    
    @FindBy(xpath = "//input[@id='LXCertificateManager_btnApplyCertificate']")
    WebElement btnapplySCEP;
    
    
    @FindBy(linkText = "Custom Partition")
    WebElement clickcustompartition;
    
    @FindBy(xpath = "//input[@id='LxCustomPartitionbtnNewPartition']")
    WebElement btnnewcustompartition;
    
    @FindBy(linkText = "Custom Scripts")
    WebElement clickcustomscripts;
    
    @FindBy(xpath = "//input[@id='btnCustomScriptsApply']")
    WebElement btnapplycustomscript;
    
    @FindBy(xpath = "//label[@id='lblEnvironmentVariables']")
    WebElement tabEnvVariable;
    
    @FindBy(xpath = "//input[@id='LxCustomScriptsBtnAdd']")
    WebElement btnaddEnvVariable;
    
    @FindBy(linkText = "Disclaimer")
    WebElement clickdisclaimer;
    
    @FindBy(xpath = "//input[@id='LXDisclaimerbtnApplyDisclaimerApplye']")
    WebElement btnapplydisclaimer;
    
    @FindBy(linkText = "Remote Agent")
    WebElement clickremotesetting;
    
    @FindBy(linkText = "Advanced Settings")
    WebElement clickadvacesetting;
    
    @FindBy(linkText = "Change VNC Password")
    WebElement clickchangeVNCpass;
    
    @FindBy(linkText = "General Settings")
    WebElement clickgeneralsetting;
    
    @FindBy(xpath = "//input[@id='LxAdvancedSettingsbtnApplyLinuxAdvancedSettings']")
    WebElement btnapplyadvancesetting;
    
    @FindBy(xpath = "//input[@id='LXVNCbtnVNC_Apply']")
    WebElement btnapplyVNCPass;
    
    @FindBy(xpath = "//input[@id='LXGeneralSettingsbtnApply']")
    WebElement btnapplygeneralsetting;
    
    @FindBy(linkText = "Services")
    WebElement clickservices;
    
    @FindBy(xpath = "//input[@id='lx_services_btnServiceApply_JQ']")
    WebElement btnapplyservices;
     
    @FindBy(linkText = "Shortcut Keys")
    WebElement clickshortkeys;
    
    
    @FindBy(xpath = "//input[@id='Linux_ShortcutKeys_btnApplyShortcutKey']")
    WebElement btnapplyshortcurkeys;
    
    @FindBy(linkText ="Storage")
    WebElement clickstorage;
    
    @FindBy(xpath = "//label[@id='LXNSFlblNFS']")
    WebElement tabNFS;
    
    @FindBy(xpath = "//label[@id='LXNSFlblUSB']")
    WebElement tabUSB;
    
    @FindBy(xpath = "//label[@id='LXNSFlblCSROM']")
    WebElement tabCDROM;
    
    @FindBy(xpath = "//label[@id='LXNSFlbl_MobileStorageAnc']")
    WebElement tabmobilestorage;
    
    @FindBy(xpath = "//input[@id='LXNSFchkSMB']")
    WebElement rdEnableSMB;
    
    @FindBy(xpath = "//input[@id='LXNSFchkNFS']")
    WebElement rdEnableNFS;
    
    @FindBy(xpath = "//input[@id='LXNSFbtnSaveUSB_JQ']")
    WebElement btnapplyUSB;
    
    @FindBy(xpath = "//input[@id='LXNSFbtnSaveCDROM']")
    WebElement btnapplyCDROM;
    
    @FindBy(xpath = "//input[@id='LXNSFbtnApplyMobileStorage']")
    WebElement btnapplymobilestorage;
    
    @FindBy(linkText ="Threshold Settings")
    WebElement clickthresholdset;
    
    @FindBy(xpath = "//input[@id='LXThresholdSetting_btnApplyThreshold']")
    WebElement btnapplythresholdset;
    
    @FindBy(linkText ="USB Device Manager")
    WebElement clickUSBDevicemgr;
    
    @FindBy(xpath = "//input[@id='LX_USBdev_btnNewConnection']")
    WebElement btnnewclassrule;
    
    @FindBy(xpath = "//label[@id='LX_USBdev_lbldevicerule']")
    WebElement tabdevicerule;
    
    @FindBy(xpath = "//input[@id='LX_USBdev_btnNewConnectionDR']")
    WebElement btnnewdevicerule;
    
    @FindBy(linkText = "User Management")
    WebElement clickusermgmt;
    
    @FindBy(linkText = "Authentication")
    WebElement clickauthentication;
    
    @FindBy(linkText = "User Access")
    WebElement clickuseracess;
    
    @FindBy(xpath = "//input[@id='LX_Authen_btnSaveAuthentication']")
    WebElement btnapplyauthentication;
    
    @FindBy(xpath = "//input[@id='LX_Useraccess_btnSaveDateTimeSettings']")
    WebElement btnapplyuseracess;
    
    //@FindBy(xpath = "")
    //WebElement
    
    @FindBy (xpath = "//input[@aria-controls='tblDatatableGI']")
   	WebElement searchbar;
      
    @FindBy(xpath = "//td[@class='sorting_1']")
    WebElement clicknodeDLV;
    
    
    public void Linux_Readacess_SystemSetting(String LinuxIP) 
    {
    	btnhome.click();
    	utility.isVisible(btnhome, wd, 15);
    	Actions a=new Actions(wd);
    	 searchbar.sendKeys(LinuxIP);
    	 clicknodeDLV.click();
    	
    	//clickGrp.click();
    	//clickNode.click();
    	btnExpandMenu.click();
    	systemset.click();
    	
    	/*
    	 clickbiosconfugration.click();
    	
    	if(btnapplybiosconfug.isDisplayed()==false)
    		{
    		Assert.assertTrue(true);
        	}
        	
        	else 
        	{
        		Assert.assertTrue(false);
        		System.out.println("Bios Confugration Fail");
    		}
        	*/
    	clickdatetime.click();
    	clickdateandtimesetup.click();
    	
    	if(btnapplydatetime.isDisplayed()==false)
		{
		Assert.assertTrue(true);
    	}
    	
    	else 
    	{
    		Assert.assertTrue(false);
    		System.out.println("Bios Confugration Fail");
		}
    
    	tabtimezone.click();
    	
    	if(btnapplytimezone.isDisplayed()==false)
		{
		Assert.assertTrue(true);
    	}
    	
    	else 
    	{
    		Assert.assertTrue(false);
    		System.out.println("Bios Confugration Fail");
		}
    	
    	tabtimeserver.click();
    	
    	if(btnapplytimeserver.isDisplayed()==false)
		{
		Assert.assertTrue(true);
    	}
    	
    	else 
    	{
    		Assert.assertTrue(false);
    		System.out.println("Bios Confugration Fail");
		}
    	
    	clickfontmgmt.click();
    	
    	if(btnapplyimportfont.isDisplayed()==false)
		{
		Assert.assertTrue(true);
    	}
    	
    	else 
    	{
    		Assert.assertTrue(false);
    	}
    	
    	tabfontserver.click();
    	
    	if(btnapplyfontserver.isDisplayed()==false)
		{
		Assert.assertTrue(true);
    	}
    	
    	else 
    	{
    		Assert.assertTrue(false);
    	}
    	
    	clicklanguage.click();
    	
    	if(btnapplylanguage.isDisplayed()==false)
		{
		Assert.assertTrue(true);
    	}
    	
    	else 
    	{
    		Assert.assertTrue(false);
    	}
    	
    	clicknetworksetting.click();
    	click802.click();
    	
    	if(btnapply802.isDisplayed()==false)
		{
		Assert.assertTrue(true);
    	}
    	
    	else 
    	{
    		Assert.assertTrue(false);
    	}
    	
    	
    	clickcomputename.click();
    	
    	if(btnapplycomputername.isDisplayed()==false)
		{
		  Assert.assertTrue(true);
    	}
    	
    	else 
    	{
    		Assert.assertTrue(false);
    	}
    	
    	tabdomain.click();
    	
    	if(btnapplydomian.isDisplayed()==false)
		{
		Assert.assertTrue(true);
    	}
    	
    	else 
    	{
    		Assert.assertTrue(false);
    	}
    	
    	clickcrontab.click();
    	
    	btnnewcrontab.click();
    	
    	if(btnapplycommand.isDisplayed()==false)
		{
		Assert.assertTrue(true);
    	}
    	
    	else 
    	{
    		Assert.assertTrue(false);
    	}
    	
    	tabconnection.click();
    	
    	if(btnapplyconnction.isDisplayed()==false)
		{
		Assert.assertTrue(true);
    	}
    	
    	else 
    	{
    		Assert.assertTrue(false);
    	}
    	
    	tabapplication.click();
    	
    	if(btnapplyapplication.isDisplayed()==false)
		{
		Assert.assertTrue(true);
    	}
    	
    	else 
    	{
    		Assert.assertTrue(false);
    	}
    	
    	tabshellscript.click();
    	
    	a.moveToElement(chkshellscript).release().build().perform();
    	
    	if(btnapplyshellscript.isDisplayed()==false)
		{
		Assert.assertTrue(true);
    	}
    	
    	else 
    	{
    		Assert.assertTrue(false);
    	}
    	
    	
    	clickDNSgateway.click();
    	
    	if(btnapplyDNS.isDisplayed()==false)
		{
		Assert.assertTrue(true);
    	}
    	
    	else 
    	{
    		Assert.assertTrue(false);
    	}
    	
    	tabgateway.click();
    	
    	if(btnapplygateway.isDisplayed()==false)
		{
		Assert.assertTrue(true);
    	}
    	
    	else 
    	{
    		Assert.assertTrue(false);
    	}
    	
    	tabDNSSuffix.click();
    	
    	if(btnapplyDNSSuffix.isDisplayed()==false)
		{
		Assert.assertTrue(true);
    	}
    	
    	else 
    	{
    		Assert.assertTrue(false);
    	}
    	
    	clickethernatesetup.click();
    	if(btnapplyethernetsetup.isDisplayed()==false)
		{
		Assert.assertTrue(true);
    	}
    	
    	else 
    	{
    		Assert.assertTrue(false);
    	}
    	
    	clickfirewallconfug.click();
    	if(btnnewfirewallsetting.isDisplayed()==false)
		{
		Assert.assertTrue(true);
    	}
    	
    	else 
    	{
    		Assert.assertTrue(false);
    	}
    	
    	tabIPtable.click();
    	
    	if(btnapplyIPtable.isDisplayed()==false)
		{
		Assert.assertTrue(true);
    	}
    	
    	else 
    	{
    		Assert.assertTrue(false);
    	}
    	
    	clickHostsXhostSet.click();
    	
    	if(btnapplyxhost.isDisplayed()==false)
		{
		Assert.assertTrue(true);
    	}
    	
    	else 
    	{
    		Assert.assertTrue(false);
    	}
    	
    	tabHosts.click();
    	
    	if(btnapplyHosts.isDisplayed()==false)
		{
		Assert.assertTrue(true);
    	}
    	
    	else 
    	{
    		Assert.assertTrue(false);
    	}
    	
    	clickwirelessproperties.click();
    	
    	if(btnnewwirelessproperties.isDisplayed()==false)
		{
		Assert.assertTrue(true);
    	}
    	
    	else 
    	{
    		Assert.assertTrue(false);
    	}
    	
    	clicknetworkproxy.click();
    	
    	if(btnapplynetworkproxy.isDisplayed()==false)
		{
		Assert.assertTrue(true);
    	}
    	
    	else 
    	{
    		Assert.assertTrue(false);
    	}
    	
    	clickperiferalsetting.click();
    	clickdispalysetting.click();
    	
    	if(btnapplyDisplaysetting.isDisplayed()==false)
		{
		Assert.assertTrue(true);
    	}
    	
    	else 
    	{
    		Assert.assertTrue(false);
    	}
    	
    	clickfabulatech.click();
    	
    	if(btnapplyfabulatech.isDisplayed()==false)
		{
		Assert.assertTrue(true);
    	}
    	
    	else 
    	{
    		Assert.assertTrue(false);
    	}
    	
    	clickkeyboardset.click();
    	
    	a.moveToElement(chkexcutivenowkeyboeard).release().build().perform();
    	
    	if(btnapplykeyboardsetting.isDisplayed()==false)
		{
		Assert.assertTrue(true);
    	}
    	
    	else 
    	{
    		Assert.assertTrue(false);
    	}
    	
    	clickserialportsetting.click();
    	if(btnapplyserialportset.isDisplayed()==false)
		{
		Assert.assertTrue(true);
    	}
    	
    	else 
    	{
    		Assert.assertTrue(false);
    	}
    	
    	
    	//clicksoundmgmt.click();
    	clickmousestiing.click();
    	
    	if(btnapplymousesetting.isDisplayed()==false)
		{
		Assert.assertTrue(true);
    	}
    	
    	else 
    	{
    		Assert.assertTrue(false);
    	}
    	
    	clickphikips.click();
    	
    	if(btnapplyphilipsspeech.isDisplayed()==false)
		{
		Assert.assertTrue(true);
    	}
    	
    	else 
    	{
    		Assert.assertTrue(false);
    	}
    	
    	clickprintersetting.click();
    	clickprinters.click();
    	
    	if(btnaddnewprinter.isDisplayed()==false)
		{
		Assert.assertTrue(true);
    	}
    	
    	else 
    	{
    		Assert.assertTrue(false);
    	}
    	
    	clickthinprint.click();
    	
    	if(btnapplythinprint.isDisplayed()==false)
		{
		Assert.assertTrue(true);
    	}
    	
    	else 
    	{
    		Assert.assertTrue(false);
    	}
    	
    	clickshutdownprocesure.click();
    	
    	if(btnapplyshudownprocess.isDisplayed()==false)
		{
		Assert.assertTrue(true);
    	}
    	
    	else 
    	{
    		Assert.assertTrue(false);
    	}
    	
    	tabS3.click();
    	
    	
    	if(btnapplyS3.isDisplayed()==false)
		{
		Assert.assertTrue(true);
    	}
    	
    	else 
    	{
    		Assert.assertTrue(false);
    	}
    	
    	
    	softassert.assertAll();
    	}
    
    public void Linux_Readacess_UserSetting() 
    {
    	if(clickusersetting.isDisplayed())
		{
    		clickusersetting.click();
			
		}
		else
		{
			clickGrp.click();
	    	clickNode.click();
	    	btnExpandMenu.click();
	    	clickusersetting.click();
		}
    	
    	clickuserinterface.click();
    	clickbackground.click();
    	
    	if(btnapplybackground.isDisplayed()==false)
		{
		Assert.assertTrue(true);
    	}
    	
    	else 
    	{
    		Assert.assertTrue(false);
    		System.out.println("Bios Confugration Fail");
		}
    	
    	clickscreensaverset.click();
    	
    	if(btnapplyscreensaver.isDisplayed()==false)
		{
		Assert.assertTrue(true);
    	}
    	
    	else 
    	{
    		Assert.assertTrue(false);
    		System.out.println("Bios Confugration Fail");
		}
    	
    	tabmonitorpower.click();
    	
    	if(btnapplymonitorpower.isDisplayed()==false)
		{
		Assert.assertTrue(true);
    	}
    	
    	else 
    	{
    		Assert.assertTrue(false);
    		System.out.println("Bios Confugration Fail");
		}
    	
            	
    	clickuserinterfaceset.click();
    	Actions a= new Actions(wd);
    	a.moveToElement(chkexcutivrnowuserinterface).release().build().perform();
    	
    	if(btnapplyuserinterfaceset.isDisplayed()==false)
		{
		Assert.assertTrue(true);
    	}
    	
    	else 
    	{
    		Assert.assertTrue(false);
    		System.out.println("Bios Confugration Fail");
		}
    	
    	softassert.assertAll();
	}
    
    public void Linux_Readacess_Security()
    {

    	if(clicksecurity.isDisplayed())
		{
    		clicksecurity.click();
			
		}
		else
		{
			clickGrp.click();
	    	clickNode.click();
	    	btnExpandMenu.click();
	    	clicksecurity.click();
		}
    
      clickapplication.click();
    
		if (btnapplyapplication_LX.isDisplayed() == false) 
		{
			Assert.assertTrue(true);
		}

		else {
			Assert.assertTrue(false);
			System.out.println("Linux Application");
		}  
      
		clicksoftwarerestriction.click();
		
	    
			if (btnapplysoftrestriction.isDisplayed() == false) 
			{
				Assert.assertTrue(true);
			}

			else {
				Assert.assertTrue(false);
				System.out.println("Linux Soft Restriction");
			}
     
			softassert.assertAll();
    }
    
    public void Linux_Readacess_UpgradeMGMT()
    {

    	if(clickugrademgmt.isDisplayed())
		{
    		clickugrademgmt.click();
			
		}
		else
		{
			clickGrp.click();
	    	clickNode.click();
	    	btnExpandMenu.click();
	    	clickugrademgmt.click();
		}
    
    	clickfiletransfer.click();
    	

		if (btnapplyfiletransfer.isDisplayed() == false) 
		{
			Assert.assertTrue(true);
		}

		else {
			Assert.assertTrue(false);
			System.out.println("Linux File Transfer");
		}
    	
    	clickimportfilesetting.click();

		if (btnapplyexportfromdevice.isDisplayed() == false) 
		{
			Assert.assertTrue(true);
		}

		else {
			Assert.assertTrue(false);
			System.out.println("Linux Export from device");
		}
    	
    	tabimporttodevice.click();
    	

		if (btnapplyimporttodevice.isDisplayed() == false) 
		{
			Assert.assertTrue(true);
		}

		else {
			Assert.assertTrue(false);
			System.out.println("Linux Import to device");
		}
		
		clicksoftupgrademgmt.click();
		clicksoftwareupgrade.click();
		

		if (btnnewupgrade.isDisplayed() == false) 
		{
			Assert.assertTrue(true);
		}

		else {
			Assert.assertTrue(false);
			System.out.println("Linux new Upgrade");
		}
		softassert.assertAll();
	 	
    }

    public void Linux_Readacess_Administration() throws InterruptedException
    {
    	if(clickadministration.isDisplayed())
		{
    		clickadministration.click();
			
		}
		else
		{
			clickGrp.click();
	    	clickNode.click();
	    	btnExpandMenu.click();
	    	clickadministration.click();
		}
    
    	clickcertificatemgr.click();

		if (btnnewimport.isDisplayed() == false) 
		{
			Assert.assertTrue(true);
		}

		else {
			Assert.assertTrue(false);
			System.out.println("cetificate");
		}

		tabkey.click();
		
		if (btnnewimportkeys.isDisplayed() == false) 
		{
			Assert.assertTrue(true);
		}

		else {
			Assert.assertTrue(false);
			System.out.println("Keys");
		}

		tabSCEP.click();
		
		if (btnapplySCEP.isDisplayed() == false) 
		{
			Assert.assertTrue(true);
		}

		else {
			Assert.assertTrue(false);
			System.out.println("SCEP");
		}

      /* clickcustompartition.click();
       
		if (btnnewcustompartition.isDisplayed() == false) 
		{
			Assert.assertTrue(true);
		}

		else {
			Assert.assertTrue(false);
			System.out.println("Custom");
		}
       */
       clickcustomscripts.click();
       
       if (btnapplycustomscript.isDisplayed() == false) 
		{
			Assert.assertTrue(true);
		}

		else {
			Assert.assertTrue(false);
			System.out.println("Custom Script");
		}
       
      /* tabEnvVariable.click();
       
       if (btnaddEnvVariable.isDisplayed() == false) 
		{
			Assert.assertTrue(true);
		}

		else {
			Assert.assertTrue(false);
			System.out.println("ENC Variable");
		}
       */
       clickdisclaimer.click();
       
       if (btnapplydisclaimer.isDisplayed() == false) 
		{
			Assert.assertTrue(true);
		}

		else {
			Assert.assertTrue(false);
			System.out.println("Custom");
		}
       
       clickremotesetting.click();
       clickadvacesetting.click();
       
       if (btnapplyadvancesetting.isDisplayed() == false) 
		{
			Assert.assertTrue(true);
		}

		else {
			Assert.assertTrue(false);
			System.out.println("Custom");
		}
       
       clickchangeVNCpass.click();
       

       if (btnapplyVNCPass.isDisplayed() == false) 
		{
			Assert.assertTrue(true);
		}

		else {
			Assert.assertTrue(false);
			System.out.println("Custom");
		}
       
       clickgeneralsetting.click();

       if (btnapplygeneralsetting.isDisplayed() == false) 
		{
			Assert.assertTrue(true);
		}

		else 
		{
			Assert.assertTrue(false);
			System.out.println("Custom");
		}
       
       clickservices.click();
       
       if (btnapplyservices.isDisplayed() == false) 
		{
			Assert.assertTrue(true);
		}

		else 
		{
			Assert.assertTrue(false);
			System.out.println("Services");
		}
       
       clickshortkeys.click();

       if (btnapplyshortcurkeys.isDisplayed() == false) 
		{
			Assert.assertTrue(true);
		}

		else 
		{
			Assert.assertTrue(false);
			System.out.println("Shortcut Key");
		}
    
       clickstorage.click();
       utility.isVisible(tabNFS, wd, 3);
       
       if (rdEnableSMB.isEnabled() == false) 
		{
			Assert.assertTrue(true);
		}

		else 
		{
			Assert.assertTrue(false);
			System.out.println("SMB");
		}
       
       /*tabNFS.click();
       
       if (rdEnableNFS.isDisplayed() == false) 
		{
			Assert.assertTrue(true);
		}

		else 
		{
			Assert.assertTrue(false);
			System.out.println("NFS");
		}
       */
       tabUSB.click();
       if (btnapplyUSB.isDisplayed() == false) 
		{
			Assert.assertTrue(true);
		}

		else 
		{
			Assert.assertTrue(false);
			System.out.println("USB");
		}
       
       tabCDROM.click();
       
       if (btnapplyCDROM.isDisplayed() == false) 
		{
			Assert.assertTrue(true);
		}

		else 
		{
			Assert.assertTrue(false);
			System.out.println("CD ROM");
		}
       
       tabmobilestorage.click();
       if (btnapplymobilestorage.isDisplayed() == false) 
		{
			Assert.assertTrue(true);
		}

		else 
		{
			Assert.assertTrue(false);
			System.out.println("Mobile Storage");
		}
       
       clickthresholdset.click();
       if (btnapplythresholdset.isDisplayed() == false) 
		{
			Assert.assertTrue(true);
		}

		else 
		{
			Assert.assertTrue(false);
			System.out.println("Threshold");
		}
       
       clickUSBDevicemgr.click();
       Thread.sleep(1000);
       /*if (btnnewclassrule.isDisplayed() == false) 
		{
			Assert.assertTrue(true);
		}

		else 
		{
			Assert.assertTrue(false);
			System.out.println("Class Rule");
		}*/
       
       /*tabdevicerule.click();
       if (btnnewdevicerule.isDisplayed() == false) 
		{
			Assert.assertTrue(true);
		}

		else 
		{
			Assert.assertTrue(false);
			System.out.println("Device Rule");
		}*/
       
       clickusermgmt.click();
       clickauthentication.click();
       if (btnapplyauthentication.isDisplayed() == false) 
		{
			Assert.assertTrue(true);
		}

		else 
		{
			Assert.assertTrue(false);
			System.out.println("Device Rule");
		}
       
       clickuseracess.click();
       
       if (btnapplyuseracess.isDisplayed() == false) 
		{
			Assert.assertTrue(true);
		}

		else 
		{
			Assert.assertTrue(false);
			System.out.println("Device Rule");
		}
       
       softassert.assertAll();
       
    }

}
    
    
    
    
    
    


