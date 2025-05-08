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

public class Readacess_Page extends utility
{
	public WebDriver wd;
    
	public Readacess_Page(WebDriver wd) 
    {
 	   this.wd = wd;
 	   wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
 	   PageFactory.initElements(wd, this);
    }
    
    SoftAssert softassert=new SoftAssert();
    
       
    
	@FindBy(xpath = "//*[contains(text(), 'DM_GRP')]//preceding-sibling::span[@class='rtPlus']")
	WebElement clickGrp;
	
	@FindBy(xpath = "//*[contains(text(), 'DM_GRP')]")
	WebElement grp;
	
	@FindBy (xpath = "//input[@aria-controls='tblDatatableGI']")
	WebElement seartchbar;

	@FindBy(xpath = "(//*[contains(text(), '192.168.1.237')])[1]")
	//@FindBy(xpath = "//span[@class='icon-262--windows_green-dot'][normalize-space()='192.168.1.151']")
	WebElement clickNode;

	@FindBy(xpath = "(//*[contains(text(), '192.168.1.158')])[1]")
	WebElement clickNode198;

	@FindBy(xpath = "//div[@id='btnExpandMenu']")
	WebElement btnExpandMenu;

	@FindBy(linkText = "System Settings")
	WebElement systemset;

	@FindBy(linkText =  "Network Settings")
	WebElement Clicknetworkset;

	// Bios Confugration

	@FindBy(linkText = "BIOS Configuration")
	WebElement clickbiosconfug;

	@FindBy(xpath = "//input[@id='XPBiosInfo_btnbiosInfoApplyJquery']")
	WebElement btnapplybiosconfug;

	// X802
	@FindBy(xpath = "(//label[@title='802.1x Security'])[3]")
	WebElement click802security;

	@FindBy(xpath = "//input[@id='winAuthentication_btnApply']")
	WebElement btnapplyx802;

	// Computer name

	@FindBy(linkText = "Computer Name")
	WebElement clickcomputername;

	@FindBy(xpath = "//input[@id='XP_ComputerName_btnComputerNameApplyJQ']")
	WebElement ButtonApplycomputername;

	// Domian

	@FindBy(xpath = "//label[@id='XP_ComputerName_lblMenuDomain']")
	WebElement tabdomain;

	@FindBy(xpath = "//input[@id='XP_ComputerName_btnComputerNameApplyJQ']")
	WebElement btnapplydomain;

	// Ethernet Setup

	@FindBy(linkText ="Ethernet Setup")
	WebElement clickethernetsetup;

	@FindBy(xpath = "//input[@id='XPEthernetSetup_btnEthernetApply']")
	WebElement btnapplyethernetsetup;

	// Wireless Properties

	@FindBy(linkText = "Wireless Properties")
	WebElement clickwirelessProperties;

	@FindBy(xpath = "//input[@id='XPWirelessProp_btnSaveWifi_XP']")
	WebElement btnapplywirelessproperties;

	// Wireless Setup

	@FindBy(linkText ="Wireless Setup")
	WebElement clickwirelesssetup;

	@FindBy(xpath = "//input[@id='XPWirelessSetup_btnWirelessSetupApplyJQ']")
	WebElement buttonapplywirelesssetup;

	// Periferal Setting

	// Display setting

	@FindBy(linkText = "Peripheral Settings")
	WebElement clickPeripheralSettings;

	@FindBy(linkText = "Display Settings")
	WebElement clickDisplaySettings;

	@FindBy(xpath = "//input[@id='WindowsDisplaySettings_btnApply']")
	WebElement btnApplyDisplay;

	// Keyboard Setting

	@FindBy(linkText = "Keyboard Settings")
	WebElement clickKeyboardSettings;

	@FindBy(xpath = "//input[@id='WindowsKeyboardSettings_btnApply']")
	WebElement btnApplyKeyboard;

	// Mouse Setting

	@FindBy(linkText = "Mouse Settings")
	WebElement clickmousesetting;

	@FindBy(xpath = "//input[@id='WindowsMouseSettings_btnApply']")
	WebElement btnapplymousesetting;

	// Power Management

	@FindBy(linkText = "Power Management")
	WebElement clickpowerMgmt;

	@FindBy(xpath = "(//label[@title='Power Option'])[2]")
	WebElement clickpoweroption;

	@FindBy(xpath = "//input[@id='XPPowerOption_btnPowerOptionSave']")
	WebElement btnapplypoweroption;

	// printer

	@FindBy(linkText = "Printer Settings")
	WebElement clickprinterset;

	@FindBy(xpath = "(//label[@title='Printers'])[3]")
	WebElement clickprinters;

	@FindBy(xpath = "//input[@id='XPPrinter_btnXPPrinter']")
	WebElement btnapplyprinterset;

	// Time and Language

	@FindBy(linkText = "Time and Language")
	WebElement clicktimelanguage;

	@FindBy(linkText = "Date & Time")
	WebElement clickdatetime;

	@FindBy(xpath = "//input[@id='XPDatetimeSett_btnApplyDateTimeSetup']")
	WebElement btnapplydatetime;

	// Time Zone

	@FindBy(xpath = "//label[@id='XPDatetimeSett_lbTimeZonec']")
	WebElement tabtimezone;

	@FindBy(xpath = "//input[@id='XPDatetimeSett_btnApplyDateTimeSetup']")
	WebElement btnapplytimezone;

	// Time Server

	@FindBy(xpath = "//label[@id='XPDatetimeSett_lblTimeServers']")
	WebElement tabtimeserver;

	@FindBy(xpath = "//input[@id='XPDatetimeSett_btnApplyDateTimeSetup']")
	WebElement btnapplytimeserver;

	// Region and Location

	@FindBy(linkText = "Region and Location")
	WebElement clickregionandlocation;

	@FindBy(xpath = "//input[@id='XPDateTimeFormat_btnApplyDateTimeFormat']")
	WebElement btnapplyregionlocation;

	@FindBy(xpath = "//label[@id='XPDateTimeFormat_lblDateTimeFormat']")
	WebElement tabdateandtime;

	@FindBy(xpath = "//input[@id='XPDateTimeFormat_btnApplyDateTimeFormat']")
	WebElement btnapplydatetimeformat;
	
	
	//User Setting
	
	@FindBy (linkText =  "User Settings")
	WebElement clickuserseting;
	
	@FindBy (xpath = "(//label[@title='User Interface'])[3]")
	WebElement clickuserinterface;
	
	//Screen Save Setting
	
	@FindBy (linkText = "Screen Saver Settings")
	WebElement clickscreensvaerset;
	
	@FindBy (xpath = "//input[@id='WinScreenSaverbtnScreenSaverApply']")
	WebElement btnapplyscreensaver;
	
	//Taskbar Properties
	
	@FindBy (linkText = "Taskbar Properties")
	WebElement clicktaskbarproperties;
	
	@FindBy (xpath = "//input[@id='XPTaskbarbtn_XP_TaskbarPropertieSave']")
	WebElement btnapplytaskbarproperties;
	
	//User Interface Setting
	
	@FindBy (linkText = "User Interface Settings")
	WebElement clickuserinterfacesetting;
	
	//Auto Logon
	
	@FindBy (xpath="//label[@id='XPUserInterface_lblAutoLogon']")
	WebElement tabautologon;
	
	@FindBy (xpath = "//input[@id='XPUserInterfacebtnSaveUserinterfaceSettings']")
	WebElement btnapplyautologon;
	
	//WCL Interface setting 
	
	@FindBy (xpath = "//label[@id='XPUserInterface_lblUserInterfaceSett']")
	WebElement tabWCLInterfaceSett;
	
	@FindBy (xpath="//input[@id='btnUserInterfaceSettApply']")
    WebElement btnapplyWCLSetting;
	
	//Wallpaper Setting
	
	@FindBy (linkText = "Wallpaper Settings")
	WebElement clickwallpaperset;
	
	@FindBy (xpath = "//input[@id='XPWallpaperbtnSaveWallpaper']")
    WebElement btnapplywallpapersetting;
	
	//Administration
	
	@FindBy (linkText = "Administration")
    WebElement Clickadministration;
	
	 // Application 
	
    @FindBy (linkText = "Application Command")
    WebElement Clickapplicationcommand;
	
    @FindBy (xpath = "//input[@id='WinAPPCMDbtnApplyRDP']")
    WebElement btnapplyapplication;
    
    //Command 
    
    @FindBy (xpath = "//label[@id='WinAPPCMDlblcommand']")
    WebElement tabCommand;
    
    @FindBy (xpath = "//input[@id='WinAPPCMDbtnApplyRDP']")
    WebElement btnapplyCommand;
    
	//Envirememt Variable
    
    @FindBy (linkText = "Environment Variable")
    WebElement clickEnvironmentVariable;
	
    
    @FindBy (xpath = "//input[@id='XPEnvironmentVari_btnEnvVarApplye']")
    WebElement btnapplyEnvVariable;
    
    //Performance MGMT
    
    @FindBy (linkText = "Performance Management")
    WebElement clickperformancemgmt;
    
    //History Cleaner
    
    @FindBy (linkText =  "History Cleaner")
    WebElement clickHistoryCleaner;
        // Web Browser
    
    @FindBy (xpath = "//input[@id='XPWebBrowser_btnSavebrowser']")
    WebElement btnapplyWebBrowser;
    
    //Windows Cleaner
    
    @FindBy (xpath = "//label[@id='XPWebBrowser_lblMenuWndwsClnr']")
    WebElement tabwindowsCleaner;
    
    @FindBy (xpath = "//input[@id='XPWindowsCleaner_btnApplyCleaner1']")
    WebElement btnapplywindowscleaner;
    
    //Registry Backup Restore
    
    @FindBy (linkText =  "Registry Backup Restore")
    WebElement ClickRegistryBackupRestore;
    
    @FindBy (xpath = "//label[@id='XPRegistrybackup_lblviewregistrybackup']")
    WebElement tabObtainregistory;
    
    @FindBy (xpath = "//input[@id='XPRegistoryBackUpObt_Btnapplobtainreg']")
    WebElement btnapplyObtainregistory;
     
    //Registry Backup
    
    @FindBy (xpath = "//label[@id='XPRegistrybackup_lbladdregistrybackup']")
    WebElement tabregistoryBackup;
   
    @FindBy (xpath = "//input[@id='XPRegistrybackup_btnRestoreApply']")
    WebElement btnapplyregistorybackup;
    
    //Startup Application List
    
    @FindBy (linkText = "Startup Application List")
    WebElement ClickStartupapplicationlist;
    
    @FindBy (xpath = "//input[@id='XPStartUpApp_btnApply']")
    WebElement btnapplyviewapplicationlist;
    
    //Add Application List
    
    @FindBy (xpath = "//label[@id='XPStartUpApp_lbladdapplicationlist']")
    WebElement tabaddapplicationlist;
    
    @FindBy (xpath = "//input[@id='XPStartUpApp_btnAddAppSave']")
    WebElement btnapplyaddapplicationlist;
    
    //Task Scheduler
    
    @FindBy (linkText =  "Task Scheduler")
    WebElement clickTaskshedular;
    
    @FindBy (xpath = "//input[@id='XPTaskScheduler_btnDeleteXPTaskSch']")
    WebElement btndeletetaskshedular;
    
    // Remote Setting
    
    @FindBy (linkText =  "Remote Agent")
    WebElement clickremoteagent;
     
    // Advance Setting
    
    @FindBy (linkText =  "Advanced Settings")
    WebElement clickadvancsetting;
    
    @FindBy(xpath = "//input[@id='WinAdvSettrbtnApplnSettngInstant']")
    WebElement excutivenowremoteagent;
    
    @FindBy (xpath = "//input[@id='WinAdvSettbtnSave']")
    WebElement btnapplyremotesetting;
    
    //DHCP
    
    @FindBy (xpath = "//a[@id='WinAdvSettlicDHCP']")
    WebElement tabDHCP;

    @FindBy (xpath = "//input[@id='WinAdvSettbtnDHCPApply']")
    WebElement btnapplyDHCP;
    
    //Change VNC Password
    
    @FindBy (linkText = "Change VNC Password")
    WebElement clickchangevncpass;
    
    @FindBy (xpath = "//input[@id='WinVNCpw_btnVNC_Apply']")
    WebElement btnapplyvncpass;
    
    //General Setting
    
    @FindBy (linkText = "General Settings")
    WebElement clickgeneralsetting;
    
    @FindBy (xpath = "//input[@id='WinGenSetting_btnApplyGS']")
    WebElement btnapplygeneraleset;
    
    
    //Service MGMT
    
    @FindBy (linkText = "Service Management")
    WebElement Clickservicemgmt;
    
    @FindBy (linkText =  "Services")
    WebElement Clickservices;
    
    @FindBy (xpath = "//input[@id='XPService_btnRestartSysView']")
    WebElement btnrestartservices;
    

    //USB Device Manager
    
    @FindBy (linkText =  "USB Device Manager")
    WebElement clickUSBDevicemanager;
    
    @FindBy (xpath = "//input[@id='XPUSBbtnSave']")
    WebElement btnapplyUSBDevicemanager;
    
    //User Management
    
    @FindBy (linkText = "User Management")
    WebElement ClickUsermgmt;
    
    @FindBy (xpath = "//input[@id='XPUserManagement_btnNewUser']")
    WebElement btnnewuser;
    
    @FindBy (xpath = "//input[@id='XPUserManagement_btnAdd']")
    WebElement btnapplyuserMGMT;
    
    
	// Security
   	
   	@FindBy (linkText =  "Security")
    WebElement clicksecurity;
    
    @FindBy (xpath = "(//label[@title='File System'])[2]")
    WebElement clickfilesystem;
    
    //Write FIlter Setting
    
    @FindBy (linkText =  "Write Filter Operations")
    WebElement clickwritefilter;
    
    @FindBy (xpath = "//input[@id='WinWriteFilterbtnFWFSaveNew']")
    WebElement btnapplyWritefilterset;
    
    @FindBy (xpath = "//label[@id='WinWriteFilterlblMenuFBWFCnfgrtn']")
    WebElement tabwritefilterexclist;
    
    @FindBy(xpath = "//input[@id='WinWriteFilterrbtnFBWFInstant']")
    WebElement chkecutive;
    
    @FindBy (xpath = "//input[@id='WinWriteFilterbtnFWFSaveNew']")
    WebElement btnapplywritefilterexclist;
    
    @FindBy (xpath = "//label[@id='WinWriteFilterlblMenuFBWFCacheSize']")
    WebElement tabcachesize;
    
    @FindBy (xpath = "//input[@id='WinWriteFilterbtnFWFSaveNew']")
    WebElement btnapplycachesize;
    
    @FindBy (xpath = "//label[@id='WinWriteFilterlblMenuCmmtCchFle']")
    WebElement tabComitcachefile;
    
    @FindBy (xpath = "//input[@id='WinWriteFilterbtnFWFSaveNew']")
    WebElement btnapplynComitcachefile;
    
    @FindBy (xpath = "//label[@id='WinWriteFilterlblMenuOverlaySettings']")
    WebElement taboverlaysetiing;
    
    @FindBy (xpath = "//input[@id='WinOverlaySettingbtnFWFSave']")
    WebElement btnapplyoverlayset;
    
    // Network
    
    @FindBy (linkText =  "Network")
    WebElement clicknetwork;
    
    @FindBy (linkText = "Firewall")
    WebElement clickfirewall;
    
    @FindBy (xpath = "//label[@id='XPFirewall_lblMenuAddPort']")
    WebElement tabaddport;
    
    @FindBy (xpath = "//input[@id='XPFirewall_btnSavePortXP']")
    WebElement btnapplyaddport;
    
    @FindBy (xpath = "//label[@id='XPFirewall_lblMenuAddProgram']")
    WebElement tabaddprogram;
    
    @FindBy (xpath = "//input[@id='XPFirewall_btnSaveProgram']")
    WebElement btnapplyaddprogram;
    
    // Proxy Setting
    
    @FindBy (linkText =  "Proxy Settings")
    WebElement clickproxysetting;
    
    @FindBy(xpath = "//input[@id='WinProxySettingsrbtnGlobalSettngsInstant']")
    WebElement chkexcutivenowproxy;
    
    @FindBy (xpath = "//input[@id='WinProxySettingsbtnApplyIESettings']")
    WebElement btnapplyproxysetting;
    
    //Soft Restriction
    
    @FindBy (linkText = "Software Restriction")
    WebElement clicksoftrestriction;
    
    @FindBy (xpath = "//input[@id='XPRestrictionSoftwareRestrictionXP_btnSave']")
    WebElement btnapplyinstalluninstall;
    
    @FindBy (xpath = "//a[@id='XPRestrictionlibtnApplicationRestriction']")
    WebElement tabapprestriction;
    
    @FindBy (xpath = "//input[@id='XPRestrictionSoftwareRestrictionXP_btnSave']")
    WebElement btnapplysoftrestriction;
    
    @FindBy (xpath = "//a[@id='XPRestrictionlibtnBrowserRestriction']")
    WebElement tabbrowserrestriction;
    
    @FindBy (xpath = "//input[@id='XPRestrictionSoftwareRestrictionXP_btnSave']")
    WebElement btnapplybrowserrestriction;
    
    //System
    
    @FindBy (linkText =  "System")
    WebElement clicksystem;
    
    @FindBy (linkText = "Deploy Certificate")
    WebElement clickdeplycertificate;
    
    @FindBy (xpath = "//input[@id='WinInstallCertificatebtnApply_DeployCertificate_XP']")
    WebElement btnapplydeplycertificate;
    
    @FindBy (linkText = "Port Settings")
    WebElement clickpostsetting;
    
    @FindBy (xpath = "//input[@id='WinSecuritySettingsbtnSaveSecuritySetting_JQ']")
    WebElement btnapplyposrtsetting;
    
    //Connection Management
    
    @FindBy (linkText = "Connection Management")
    WebElement clickconnmgmt;
    
    @FindBy (linkText = "Connections")
    WebElement clickconnection;

    @FindBy (xpath = "//input[@id='WinConbtnNewConnection']")
    WebElement btnaddnewconn;
    
    //VM View Global Setting
    
    @FindBy (linkText = "VMView Global Settings")
    WebElement clickVMGlobalset;
    
    @FindBy (xpath = "//input[@id='WinVMViewbtnVmViewGlobalApply']")
    WebElement btnapplyVMGlobalset;
    
    
	// Software Deployment

	@FindBy(linkText = "Software Deployment")
	WebElement Clicksoftdeplyment;

	@FindBy(linkText = "File Transfer")
	WebElement Clickfiletransfer;
	
	@FindBy (xpath = "//input[@id='WinFileTransferbtnFTApplyJQ']")
   	WebElement btnapplyfiletransfer;

	@FindBy (xpath = "//label[@id='WinFileTransferlnkbtnfolder']")
   	WebElement tabfoldertransfer;
	
	@FindBy (xpath = "//input[@id='WinFileTransferbtnFTApplyJQ']")
   	WebElement btnapplyfoldertransfer;
	
	//Import File
	
	@FindBy (linkText =  "Import File")
	WebElement clickimportfile;
	
	@FindBy (xpath = "//input[@id='btnApplyWindowsImportFile']")
   	WebElement btnapplyimportfile;
	
	@FindBy (xpath = "//label[@id='WindowsImportFile_lilblImportFolder']")
   	WebElement tabimportfolder;
	
	@FindBy (xpath = "//input[@id='btnApplyWindowsImportFile']")
   	WebElement btnapplyimportfolder;
	
	@FindBy (xpath = "//label[@id='WindowsImportFile_lilblFolderSync']")
   	WebElement tabfoldersync;
	
	@FindBy (xpath = "//input[@id='WindowsImportFile_btnFolderSyncApply']")
   	WebElement btnapplyfoldersysnc;
	
	//Software and Path Install
	
	@FindBy (linkText = "Software & Patch Install/Uninstall")
	WebElement clicksoftwareandpathinstall;
	
	@FindBy (xpath = "//input[@id='XPSoftwareUpgrade_btnInstallDelete']")
   	WebElement btnUninstallsoftware;
	
	@FindBy (xpath = "//input[@id='XPSoftwareUpgrade_btnNewInstall']")
   	WebElement btnNewInstallsoftware;
	
	@FindBy (xpath = "//input[@id='XPSoftwareUpgrade_btnInstall']")
   	WebElement btnapplySoftwareInstall;
	

	
	//Contex Menu 
    
    @FindBy(xpath = "//span[@class='rtIn icon-Site']")
    WebElement site;
    
    //@FindBy(xpath = "(//span[@class='rmText'])[1]")
    @FindBy(xpath = "//a[@class='rmLink rmDisabled']//*[contains(text(), 'Add Group')]")
    WebElement addgrp;
    
    @FindBy(xpath = "//a[@class='rmLink rmDisabled']//*[contains(text(), 'Arrange Nodes')]")
    WebElement arrangenode;
    
    @FindBy(xpath = "//a[@class='rmLink rmDisabled']//*[contains(text(), 'Applied Policies')]")
    WebElement appliedpolicies;
    
    @FindBy(xpath = "(//span[contains(text(),'Group Management')])[1]")
    WebElement groupmgmt;
    
    @FindBy(xpath = "(//a[@class='rmLink rmDisabled']//*[contains(text(), 'Add SubGroup')])[1]")
    //@FindBy(xpath = "(//span[@class='rmText'])[1]")
    WebElement Addsubgrp;
    
    @FindBy(xpath = "(//a[@class='rmLink rmDisabled']//*[contains(text(), 'Edit Group')])[1]")
    WebElement Editgrp;
    
    @FindBy(xpath = "(//a[@class='rmLink rmDisabled']//*[contains(text(), 'Delete Group')])[1]")
    WebElement Deletegrp;
    
    @FindBy(linkText = "Group Settings")
    WebElement grpsetting;
    
    @FindBy(xpath ="(//a[@class='rmLink rmDisabled']//*[contains(text(), 'Repository Configuration')])[1]")
    WebElement repoconfirmation;
    
    @FindBy(linkText = "Remote Operation")
    WebElement remoteoperation;
    
    @FindBy(xpath = "(//a[@class='rmLink rmDisabled']//*[contains(text(), 'Shutdown All')])[1]")
    WebElement Shutdownall;
    

    @FindBy(xpath = "(//a[@class='rmLink rmDisabled']//*[contains(text(), 'Restart All')])[1]")
    WebElement restartall;
    
    //
    @FindBy(xpath = "(//a[@class='rmLink rmDisabled']//*[contains(text(), 'Synchronise Inventory')])[1]")
    WebElement syncall;

    //
   
    @FindBy(xpath = "(//a[@class='rmLink rmDisabled']//*[contains(text(), 'Send Message All')])[1]")
    WebElement sendmsgall;
    
    
    @FindBy(linkText = "Clone & Deploy")
    WebElement clonedeploy;
    
    
    @FindBy(xpath =  "(//a[@class='rmLink rmDisabled']//*[contains(text(), 'Deploy Image All')])[1]")
    WebElement deployImage;
    
    @FindBy(xpath =  "(//a[@class='rmLink rmDisabled']//*[contains(text(), 'Deploy Properties All')])[1]")
    WebElement deployproperties;
    
    //
    @FindBy(linkText = "Shadowing")
    WebElement Shadowing;
    
    @FindBy(xpath =  "(//a[@class='rmLink rmDisabled']//*[contains(text(), 'VNC')])[1]")
    WebElement vnc;
    
    @FindBy(xpath = "(//a[@class='rmLink rmDisabled']//*[contains(text(), 'Unregister Device')])[1]")
    WebElement Unregisterdevice;

    @FindBy(xpath = "(//a[@class='rmLink rmDisabled']//*[contains(text(), 'Change VNC Password')])[1]")
    WebElement ChangeVNCPass;

    
    // Menu Option
    
    @FindBy (xpath="//li[@id='divViewDiscovery']")
    WebElement tabDiscovery_Menu;
    
    @FindBy(xpath = "//label[@id='ContentPlaceHolder1_lblMenuRegister']")
    WebElement tabregister;
    
    @FindBy (xpath = "//label[@id='ContentPlaceHolder1_lblMenuView']")
    WebElement tabview;
    
    @FindBy(xpath = "//label[@id='ContentPlaceHolder1_lblMenuDiscovery']")
    WebElement tabDiscovery;
    
    @FindBy(xpath ="//label[@id='ContentPlaceHolder1_lblMenuUnRegister']")
    WebElement tabUnregister;

    @FindBy(xpath = "//input[@id='btnRegisterRefresh']")
    WebElement btnrefresh_Register;
    
    @FindBy(xpath = "//input[@id='ContentPlaceHolder1_btnRegisterResetDA'][@disabled='disabled']")
    WebElement claerlogs_Registertab;
    
    @FindBy(xpath = "//div[@id='ContentPlaceHolder1_divDiscoverRights']")
    WebElement btnrefresh_Discovery;
    
    @FindBy(xpath = "//input[@id='ContentPlaceHolder1_btnDiscoveryReset'][@disabled='disabled']")
    WebElement clearlogs;
    
    @FindBy(xpath = "//input[@id='btnUnRegister'][@value='UnRegister']")
    WebElement btnunregister;
    
    @FindBy (xpath = "//div[@class='AjaxLoaderOuter']")
    WebElement loader;
    
    @FindBy(xpath = "//li[@id='divTask']")
    WebElement tabTaskmgr;
    
    @FindBy(xpath = "//span[@id='spUserName']")
    WebElement clickuser;
    
    @FindBy(xpath = "//label[@id='lblManageAccount']")
    WebElement tabmanageaccount;
    
    @FindBy (xpath = "//input[@id='btnChangeProfilePhoto']")
    WebElement btnsaveprofilephoto;
    
    @FindBy(xpath = "//input[@id='btnChangeEmailID']")
    WebElement btnsavemailID;
    
    @FindBy(xpath = "//input[@id='btnChangeContactDetails']")
    WebElement btnsavecontactdetails;
    
    @FindBy(xpath = "//label[@id='lblChangePassword']") //li[@id='myProfileChangePwd']
    WebElement tabchangepassword;
    
    @FindBy(xpath = "//input[@id='btnSaveChangePassword']")
    WebElement btnsavechangepassword;
    
    @FindBy(id = "lbl2FAuthentication")//label[@id='lbl2FAuthentication']
    WebElement tabtwofactorauthentication;
    
    @FindBy(xpath = "//input[@id='btnSaveAuthentication']")
    WebElement btnsavetwofactorauthentication;
    
    @FindBy(xpath = "//a[@id='linkcloseProfilePopup']")
    WebElement btnclosewindow;
    
    @FindBy(xpath = "//a[@id='ibtntHome']")
    WebElement btnhome;
    
    @FindBy (xpath = "//input[@aria-controls='tblDatatableGI']")
	WebElement searchbar;
   
    @FindBy(xpath = "//td[@class='sorting_1']")
    WebElement clicknodeDLV;
    /*
    @FindBy(xpath = "")
    WebElement
    
    @FindBy(xpath = "")
    WebElement
    */
    
    public void VerifyReadAcess_SystemSetting(String WindowsIP) throws InterruptedException 
    {
    	 searchbar.sendKeys(WindowsIP);
    	 clicknodeDLV.click();
    	//clickGrp.click();
    	//clickNode.click();
    	btnExpandMenu.click();
    	systemset.click();
    	
    	/*clickbiosconfug.click();
    	if(btnapplybiosconfug.isDisplayed()==false)
    	{
    		Assert.assertTrue(true);
    	}
    	
    	else 
    	{
    		//softassert.assertTrue(false);
    		Assert.assertTrue(false);
		}
    	*/
    	
    	Clicknetworkset.click();
    	click802security.click();
    	Thread.sleep(2000);
    	if(btnapplyx802.isDisplayed()==false)
    	{
    		Assert.assertTrue(true);
    		//softassert.assertTrue(true);
    	}
    	
    	
    	else 
    	{
    		Assert.assertTrue(false);
    		//softassert.assertTrue(false);
		}
    	
    	
    	clickcomputername.click();
    	if(ButtonApplycomputername.isDisplayed()==false)
    	{
    		Assert.assertTrue(true);
    		//softassert.assertTrue(true);
    	}
    	
    	else 
    	{
    		Assert.assertTrue(false);
    		//softassert.assertTrue(false);
		}
    	
    	
    	tabdomain.click();
    	if(btnapplydomain.isDisplayed()==false)
    	{
    		Assert.assertTrue(true);
    		//softassert.assertTrue(true);
    	}
    	
    	else 
    	{
    		Assert.assertTrue(false);
    		//softassert.assertTrue(false);
		}
    	
    	
    	clickethernetsetup.click();
    	
    	if(btnapplyethernetsetup.isDisplayed()==false)
    	{
    		Assert.assertTrue(true);
    		//softassert.assertTrue(true);
    	}
    	
    	else 
    	{
    		Assert.assertTrue(false);
    		//softassert.assertTrue(false);
		}
    	
    	clickwirelessProperties.click();
    	
    	if(btnapplywirelessproperties.isDisplayed()==false)
    	{
    		Assert.assertTrue(true);
    		//softassert.assertTrue(true);
    	}
    	
    	else 
    	{
    		Assert.assertTrue(false);
    		//softassert.assertTrue(false);
		}
    	
    	clickwirelesssetup.click();
    	if(buttonapplywirelesssetup.isDisplayed()==false)
    	{
    		Assert.assertTrue(true);
    		//softassert.assertTrue(true);
    	}
    	else 
    	{
    		Assert.assertTrue(false);
    		//softassert.assertTrue(false);
		}
    	
    	clickPeripheralSettings.click();
    	clickDisplaySettings.click();
    	
    	if(btnApplyDisplay.isDisplayed()==false)
    	{
    		Assert.assertTrue(true);
    		//softassert.assertTrue(true);
    	}
    	else 
    	{
    		Assert.assertTrue(false);
    		//softassert.assertTrue(false);
		}
    	
    	clickKeyboardSettings.click();
    	
    	if(btnApplyKeyboard.isDisplayed()==false)
    	{
    		Assert.assertTrue(true);
    		//softassert.assertTrue(true);
    	}
    	else 
    	{
    		Assert.assertTrue(false);
    		//softassert.assertTrue(false);
		}
    	
    	clickmousesetting.click();
    	if(btnapplymousesetting.isDisplayed()==false)
    	{
    		Assert.assertTrue(true);
    		//softassert.assertTrue(true);
    	}
    	else 
    	{
    		Assert.assertTrue(false);
    		//softassert.assertTrue(false);
		}
    	
    	
    	clickpowerMgmt.click();
    	clickpoweroption.click();
    	
    	if(btnapplypoweroption.isDisplayed()==false)
    	{
    		Assert.assertTrue(true);
    		//softassert.assertTrue(true);
    	}
    	else 
    	{
    		Assert.assertTrue(false);
    		//softassert.assertTrue(false);
		}
    	
    	clickprinterset.click();
    	clickprinters.click();
    	
    	if(btnapplyprinterset.isDisplayed()==false)
    	{
    		Assert.assertTrue(true);
    		//softassert.assertTrue(true);
    	}
    	else 
    	{
    		Assert.assertTrue(false);
    		//softassert.assertTrue(false);
		}
    	
    	clicktimelanguage.click();
    	clickdatetime.click();
    	
    	if(btnapplydatetime.isDisplayed()==false)
    	{
    		Assert.assertTrue(true);
    		//softassert.assertTrue(true);
    	}
    	else 
    	{
    		Assert.assertTrue(false);
    		//softassert.assertTrue(false);
		}
    	
    	tabtimezone.click();

    	if(btnapplytimezone.isDisplayed()==false)
    	{
    		Assert.assertTrue(true);
    		//softassert.assertTrue(true);
    	}
    	else 
    	{
    		Assert.assertTrue(false);
    		//softassert.assertTrue(false);
		}
    	
    	tabtimeserver.click();
    	
    	if(btnapplytimeserver.isDisplayed()==false)
    	{
    		Assert.assertTrue(true);
    		//softassert.assertTrue(true);
    	}
    	else 
    	{
    		Assert.assertTrue(false);
    		//softassert.assertTrue(false);
		}
    	
    	clickregionandlocation.click();
    	
    	if(btnapplyregionlocation.isDisplayed()==false)
    	{
    		Assert.assertTrue(true);
    		//softassert.assertTrue(true);
    	}
    	else 
    	{
    		Assert.assertTrue(false);
    		//softassert.assertTrue(false);
		}
    	
    	tabdateandtime.click();
    	
    	if(btnapplydatetimeformat.isDisplayed()==false)
    	{
    		Assert.assertTrue(true);
    		//softassert.assertTrue(true);
    	}
    	else 
    	{
    		Assert.assertTrue(false);
    		//softassert.assertTrue(false);
		}
    	
    	//softassert.assertAll();
    	
	}
 
    public void VerifyReadAcess_UserSetting()
    {
		if(clickuserseting.isDisplayed())
		{
			clickuserseting.click();
			
		}
		else
		{
			clickGrp.click();
	    	clickNode.click();
	    	btnExpandMenu.click();
	    	clickuserseting.click();
		}
		
		clickuserinterface.click();
		clickscreensvaerset.click();
		
		if(btnapplyscreensaver.isDisplayed()==false)
    	{
    		softassert.assertTrue(true);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(false);
		}
    	
		clicktaskbarproperties.click();
		
		if(btnapplytaskbarproperties.isDisplayed()==false)
    	{
    		softassert.assertTrue(true);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(false);
		}
    	
		clickuserinterfacesetting.click();
		
		if(btnapplyautologon.isDisplayed()==false)
    	{
    		softassert.assertTrue(true);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(false);
		}
    	
		tabWCLInterfaceSett.click();
		
		if(btnapplyWCLSetting.isDisplayed()==false)
    	{
    		softassert.assertTrue(true);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(false);
		}
    	
		clickwallpaperset.click();
		if(btnapplywallpapersetting.isDisplayed()==false)
    	{
    		softassert.assertTrue(true);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(false);
		}
    	
		softassert.assertAll();
		
		
	}
    
    public void VerifyReadAcess_Administration() 
    {

		if(Clickadministration.isDisplayed())
		{
			Clickadministration.click();
			
		}
		else
		{
			clickGrp.click();
	    	clickNode.click();
	    	btnExpandMenu.click();
	    	Clickadministration.click();
		}
		
		
		Clickapplicationcommand.click();
		
		if(btnapplyapplication.isDisplayed()==false)
    	{
    		softassert.assertTrue(true);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(false);
		}
		
		tabCommand.click();
		
		if(btnapplyCommand.isDisplayed()==false)
    	{
    		softassert.assertTrue(true);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(false);
		}
		
		clickEnvironmentVariable.click();
		if(btnapplyEnvVariable.isDisplayed()==false)
    	{
    		softassert.assertTrue(true);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(false);
		}
		
		clickperformancemgmt.click();
		clickHistoryCleaner.click();
		
		if(btnapplyWebBrowser.isDisplayed()==false)
    	{
    		softassert.assertTrue(true);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(false);
		}
		
		tabwindowsCleaner.click();
		
		if(btnapplywindowscleaner.isDisplayed()==false)
    	{
    		softassert.assertTrue(true);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(false);
		}
		
		ClickRegistryBackupRestore.click();
		
		if(btnapplyObtainregistory.isDisplayed()==false)
    	{
    		softassert.assertTrue(true);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(false);
		}
		
		tabregistoryBackup.click();
		if(btnapplyregistorybackup.isDisplayed()==false)
    	{
    		softassert.assertTrue(true);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(false);
		}
		
		ClickStartupapplicationlist.click();
		if(btnapplyviewapplicationlist.isDisplayed()==false)
    	{
    		softassert.assertTrue(true);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(false);
		}
		
		tabaddapplicationlist.click();
		
		if(btnapplyaddapplicationlist.isDisplayed()==false)
    	{
    		softassert.assertTrue(true);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(false);
		}
		
		
		clickTaskshedular.click();
		
		if(btndeletetaskshedular.isDisplayed()==false)
    	{
    		softassert.assertTrue(true);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(false);
		}
		
		clickremoteagent.click();
		clickadvancsetting.click();
		
		Actions a=new Actions(wd);
		a.moveToElement(excutivenowremoteagent).release().build().perform();
		
		if(btnapplyremotesetting.isDisplayed()==false)
    	{
    		softassert.assertTrue(true);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(false);
		}
		
		a.moveToElement(tabDHCP).release().build().perform();
		tabDHCP.click();
		
		if(btnapplyDHCP.isDisplayed()==false)
    	{
    		softassert.assertTrue(true);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(false);
		}
		
		clickchangevncpass.click();
		if(btnapplyvncpass.isDisplayed()==false)
    	{
    		softassert.assertTrue(true);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(false);
		}
		
		clickgeneralsetting.click();
		
		if(btnapplygeneraleset.isDisplayed()==false)
    	{
    		softassert.assertTrue(true);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(false);
		}
		
		Clickservicemgmt.click();
		Clickservices.click();
		
		if(btnrestartservices.isEnabled()==false)
    	{
    		softassert.assertTrue(true);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(false);
		}
		
		clickUSBDevicemanager.click();
		
		if(btnapplyUSBDevicemanager.isDisplayed()==false)
    	{
    		softassert.assertTrue(true);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(false);
		}
		
		ClickUsermgmt.click();
		//if(btnapplyuserMGMT.isDisplayed()==false)
		if(btnnewuser.isDisplayed()==false)
    	{
    		softassert.assertTrue(true);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(false);
		}
		
		softassert.assertAll();
	}

    public void VerifyReadAcess_Security() throws InterruptedException 
    
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
		
		Actions a=new Actions(wd);
		clickfilesystem.click();
		clickwritefilter.click();
		if(btnapplyWritefilterset.isDisplayed()==false)
    	{
    		softassert.assertTrue(true);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(false);
		}
		
		tabwritefilterexclist.click();
	    a.moveToElement(chkecutive).release().build().perform();	
		if(btnapplywritefilterexclist.isDisplayed()==false)
    	{
    		softassert.assertTrue(true);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(false);
		}
		
		
		a.moveToElement(tabcachesize).release().build().perform();
		tabcachesize.click();
		
		if(btnapplycachesize.isDisplayed()==false)
    	{
    		softassert.assertTrue(true);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(false);
		}
		
		tabComitcachefile.click();
		
		if(btnapplynComitcachefile.isDisplayed()==false)
    	{
    		softassert.assertTrue(true);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(false);
		}
		
		taboverlaysetiing.click();
		if(btnapplyoverlayset.isDisplayed()==false)
    	{
    		softassert.assertTrue(true);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(false);
		}
		
		clicknetwork.click();
		clickfirewall.click();
		tabaddport.click();
		
		if(btnapplyaddport.isDisplayed()==false)
    	{
    		softassert.assertTrue(true);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(false);
		}
		
		tabaddprogram.click();
		
		if(btnapplyaddprogram.isDisplayed()==false)
    	{
    		softassert.assertTrue(true);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(false);
		}
		
		clickproxysetting.click();
		a.moveToElement(chkexcutivenowproxy).release().build().perform();
		
		if(btnapplyproxysetting.isDisplayed()==false)
    	{
    		softassert.assertTrue(true);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(false);
		}
		
		clicksoftrestriction.click();
		
		if(btnapplyinstalluninstall.isDisplayed()==false)
    	{
    		softassert.assertTrue(true);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(false);
		}
		
		tabapprestriction.click();
		
		if(btnapplysoftrestriction.isDisplayed()==false)
    	{
    		softassert.assertTrue(true);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(false);
		}
		
		tabbrowserrestriction.click();
		if(btnapplybrowserrestriction.isDisplayed()==false)
    	{
    		softassert.assertTrue(true);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(false);
		}
		
		
		clicksystem.click();
		clickdeplycertificate.click();
		
		if(btnapplydeplycertificate.isDisplayed()==false)
    	{
    		softassert.assertTrue(true);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(false);
		}
		
		clickpostsetting.click();
		
		if(btnapplyposrtsetting.isDisplayed()==false)
    	{
    		softassert.assertTrue(true);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(false);
		}
		
		clickconnmgmt.click();
		clickconnection.click();
		
		if(btnaddnewconn.isDisplayed()==false)
    	{
    		softassert.assertTrue(true);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(false);
		}
		
		clickVMGlobalset.click();
		Thread.sleep(2000);
		if(btnapplyVMGlobalset.isDisplayed()==false)
    	{
    		softassert.assertTrue(true);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(false);
		}
		
		softassert.assertAll();
		
	}

    public void VerifyReadAcess_softwaredeploment() throws InterruptedException 
    {
    	if(Clicksoftdeplyment.isDisplayed())
		{
    		Clicksoftdeplyment.click();
			
		}
		else
		{
			clickGrp.click();
	    	clickNode.click();
	    	btnExpandMenu.click();
	    	Clicksoftdeplyment.click();
		}
		
		Clickfiletransfer.click();
		
		if(btnapplyfiletransfer.isDisplayed()==false)
    	{
    		softassert.assertTrue(true);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(false);
		}
		
		tabfoldertransfer.click();
		
		if(btnapplyfoldertransfer.isDisplayed()==false)
    	{
    		softassert.assertTrue(true);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(false);
		}
		
		clickimportfile.click();
		if(btnapplyimportfile.isDisplayed()==false)
    	{
    		softassert.assertTrue(true);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(false);
		}
		
		tabimportfolder.click();
		
		if(btnapplyimportfolder.isDisplayed()==false)
    	{
    		softassert.assertTrue(true);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(false);
		}
		
		tabfoldersync.click();
		if(btnapplyfoldersysnc.isDisplayed()==false)
    	{
    		softassert.assertTrue(true);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(false);
		}
		
		clicksoftwareandpathinstall.click();
		Thread.sleep(2000);
		if(btnNewInstallsoftware.isDisplayed()==false)
    	{
    		softassert.assertTrue(true);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(false);
		}
		softassert.assertAll();
	}

    public void VerifyReadAcess_ContexMenu() throws InterruptedException 
    {
    	Actions a=new Actions(wd);
    	
    	//Site
    	btnhome.click();
    	utility.isVisible(site, wd, 10);
    	Thread.sleep(2000);
    	a.contextClick(site).build().perform();
    	Thread.sleep(1000);
    	if(addgrp.isDisplayed()==true)
    	{
    		softassert.assertTrue(true);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(false);
    		System.out.println("Add Grp Fail");
		}
    	
    	if(arrangenode.isDisplayed()==true)
    	{
    		softassert.assertTrue(true);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(false);
    		System.out.println("Arrange node Fail");
		}
    	
    	if(appliedpolicies.isDisplayed()==true)
    	{
    		softassert.assertTrue(true);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(false);
    		System.out.println("Applied policies Fail");
		}
    	
    	seartchbar.click();
    	a.contextClick(grp).build().perform();
    	utility.isDisaplyedW(groupmgmt, wd, 10);
    	a.moveToElement(groupmgmt).release().build().perform();
    	Thread.sleep(1000);
    	if(Addsubgrp.isDisplayed()==true)
    	{
    		softassert.assertTrue(true);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(false);
    		System.out.println("Add Sub Grp Fail");
		}
    	
    	if(Editgrp.isDisplayed()==true)
    	{
    		softassert.assertTrue(true);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(false);
    		System.out.println("Edit Grp Fail");
		}
    	
    	if(Deletegrp.isDisplayed()==true)
    	{
    		softassert.assertTrue(true);
    		
    	}
    	
    	else 
    	{
    		softassert.assertTrue(false);
    		System.out.println("Delete Grp Fail");
		}
    	
    	a.moveToElement(grpsetting).build().perform();
    	
    	if(repoconfirmation.isDisplayed()==true)
    	{
    		softassert.assertTrue(true);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(false);
    		System.out.println("Edit Grp Fail");
		}
    	
    	a.moveToElement(remoteoperation).build().perform();
    	Thread.sleep(1000);
    	
    	if(sendmsgall.isDisplayed()==true)
    	{
    		softassert.assertTrue(true);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(false);
    		System.out.println("Remote Operation Fail");
		}
    	
    	
    	
    	if(syncall.isDisplayed()==true)
    	{
    		softassert.assertTrue(true);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(false);
		}
    	
    	
    	if(Shutdownall.isDisplayed()==true)
    	{
    		softassert.assertTrue(true);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(false);
		}
    	
    	if(restartall.isDisplayed()==true)
    	{
    		softassert.assertTrue(true);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(false);
		}
    	
    	
    	a.moveToElement(Shadowing).build().perform();
    	
    	if(vnc.isDisplayed()==true)
    	{
    		softassert.assertTrue(true);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(false);
		}
    	
    	
    	
    	
             	
    	a.moveToElement(clonedeploy).build().perform();
    	
    	if(deployImage.isDisplayed()==true)
    	{
    		softassert.assertTrue(true);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(false);
		}
    	
    	
    	if(deployproperties.isDisplayed()==true)
    	{
    		softassert.assertTrue(true);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(false);
		}
    	
        
    	if(Unregisterdevice.isDisplayed()==true)
    	{
    		softassert.assertTrue(true);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(false);
		}
        
    	if(ChangeVNCPass.isDisplayed()==true)
    	{
    		softassert.assertTrue(true);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(false);
		}
    	
    	
    	softassert.assertAll();
	}

    public void VerifyReadAcess_tab_Profile() throws InterruptedException 
    {
    	btnhome.click();
    	//utility.isInvisible(btnhome, wd, 10);
    	if(tabTaskmgr.isDisplayed()==false)
        	
    	{
    		softassert.assertTrue(true);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(false);
    		System.out.println("Task Manager Fail");
		}
    	
    	tabDiscovery_Menu.click();
    	//utility.isVisible(tabregister, wd, 10);
    	tabDiscovery.click();
    	
    	if(clearlogs.isDisplayed()==true)
        	
    	{
    		softassert.assertTrue(true);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(false);
		}
    	
    	tabregister.click();
    	Thread.sleep(1000);
    	if(claerlogs_Registertab.isDisplayed()==true)
        	
    	{
    		softassert.assertTrue(true);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(false);
		}
    	
    	tabUnregister.click();
    	Thread.sleep(1000);
    	if(utility.isClickable(btnunregister, wd, 3)==false)
    	//if(btnunregister.isDisplayed())
        	
    	{
    		softassert.assertTrue(true);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(false);
    		System.out.println("Tab Register Fail");
		}
    	btnhome.click();
    	Thread.sleep(1000);
    	clickuser.click();
    	Thread.sleep(1000);
    	tabmanageaccount.click();
    	
    	if(btnsaveprofilephoto.isDisplayed()==false)
        	
    	{
    		softassert.assertTrue(true);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(false);
		}
    	
    	if(btnsavemailID.isDisplayed()==false)
        	
    	{
    		softassert.assertTrue(true);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(false);
		}
    	

    	if(btnsavecontactdetails.isDisplayed()==false)
        	
    	{
    		softassert.assertTrue(true);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(false);
		}
    	
    	btnclosewindow.click();
    	
    	clickuser.click();
    	//if(utility.isClicked(tabchangepassword)==true);
    	//tabchangepassword.click();
    	Thread.sleep(1000);
    	//tabchangepassword.click();
    	if(utility.isClicked(tabchangepassword)==false)
    	//if(tabchangepassword.isDisplayed()==false)
        	
    	{
    		softassert.assertTrue(true);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(false);
    		System.out.println("Change Password Fail");
		}
    	

    	//btnclosewindow.click();
    	//clickuser.click();
    	Thread.sleep(2000);
    	tabtwofactorauthentication.click();
    	Thread.sleep(2000);
    	if(btnsavetwofactorauthentication.isDisplayed()==false)
        	
    	{
    		softassert.assertTrue(true);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(false);
		}
    	btnclosewindow.click();
    	
    	softassert.assertAll();
    	
	}

}
