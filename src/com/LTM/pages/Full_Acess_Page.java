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

public class Full_Acess_Page 
{

		public WebDriver wd;
	  
		public Full_Acess_Page(WebDriver wd) 
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

		@FindBy(xpath = "(//*[contains(text(), '192.168.1.151')])[1]")
		WebElement clickNode;

		@FindBy(xpath = "(//*[contains(text(), '192.168.1.158')])[1]")
		WebElement clickNode198;

		@FindBy(xpath = "//div[@id='btnExpandMenu']")
		WebElement btnExpandMenu;

		@FindBy(xpath = "(//label[@title='System Settings'])[3]")
		WebElement systemset;

		@FindBy(xpath = "(//label[@title='Network Settings'])[3]")
		WebElement Clicknetworkset;

		// Bios Confugration

		@FindBy(xpath = "(//label[@title='BIOS Configuration'])[3]")
		WebElement clickbiosconfug;

		@FindBy(xpath = "//input[@id='XPBiosInfo_btnbiosInfoApplyJquery']")
		WebElement btnapplybiosconfug;

		// X802
		@FindBy(xpath = "(//label[@title='802.1x Security'])[3]")
		WebElement click802security;

		@FindBy(xpath = "//input[@id='winAuthentication_btnApply']")
		WebElement btnapplyx802;

		// Computer name

		@FindBy(xpath = "(//label[@title='Computer Name'])[3]")
		WebElement clickcomputername;

		@FindBy(xpath = "//input[@id='XP_ComputerName_btnComputerNameApplyJQ']")
		WebElement ButtonApplycomputername;

		// Domian

		@FindBy(xpath = "//label[@id='XP_ComputerName_lblMenuDomain']")
		WebElement tabdomain;

		@FindBy(xpath = "//input[@id='XP_ComputerName_btnComputerNameApplyJQ']")
		WebElement btnapplydomain;

		// Ethernet Setup

		@FindBy(xpath = "(//label[@title='Ethernet Setup'])[3]")
		WebElement clickethernetsetup;

		@FindBy(xpath = "//input[@id='XPEthernetSetup_btnEthernetApply']")
		WebElement btnapplyethernetsetup;

		// Wireless Properties

		@FindBy(xpath = "(//label[@title='Wireless Properties'])[3]")
		WebElement clickwirelessProperties;

		@FindBy(xpath = "//input[@id='XPWirelessProp_btnSaveWifi_XP']")
		WebElement btnapplywirelessproperties;

		// Wireless Setup

		@FindBy(xpath = "(//label[@title='Wireless Setup'])[2]")
		WebElement clickwirelesssetup;

		@FindBy(xpath = "//input[@id='XPWirelessSetup_btnWirelessSetupApplyJQ']")
		WebElement buttonapplywirelesssetup;

		// Periferal Setting

		// Display setting

		@FindBy(xpath = "(//label[@title='Peripheral Settings'])[3]")
		WebElement clickPeripheralSettings;

		@FindBy(xpath = "(//label[@title='Display Settings'])[3]")
		WebElement clickDisplaySettings;

		@FindBy(xpath = "//input[@id='WindowsDisplaySettings_btnApply']")
		WebElement btnApplyDisplay;

		// Keyboard Setting

		@FindBy(xpath = "(//label[@title='Keyboard Settings'][normalize-space()='Keyboard Settings'])[3]")
		WebElement clickKeyboardSettings;

		@FindBy(xpath = "//input[@id='WindowsKeyboardSettings_btnApply']")
		WebElement btnApplyKeyboard;

		// Mouse Setting

		@FindBy(xpath = "(//label[@title='Mouse Settings'])[3]")
		WebElement clickmousesetting;

		@FindBy(xpath = "//input[@id='WindowsMouseSettings_btnApply']")
		WebElement btnapplymousesetting;

		// Power Management

		@FindBy(xpath = "(//label[@title='Power Management'])[2]")
		WebElement clickpowerMgmt;

		@FindBy(xpath = "(//label[@title='Power Option'])[2]")
		WebElement clickpoweroption;

		@FindBy(xpath = "//input[@id='XPPowerOption_btnPowerOptionSave']")
		WebElement btnapplypoweroption;

		// printer

		@FindBy(xpath = "(//label[@title='Printer Settings'])[3]")
		WebElement clickprinterset;

		@FindBy(xpath = "(//label[@title='Printers'])[3]")
		WebElement clickprinters;

		@FindBy(xpath = "//input[@id='XPPrinter_btnXPPrinter']")
		WebElement btnapplyprinterset;

		// Time and Language

		@FindBy(xpath = "(//label[@title='Time and Language'])[2]")
		WebElement clicktimelanguage;

		@FindBy(xpath = "(//label[@title='Date & Time'])[2]")
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

		@FindBy(xpath = "(//label[@title='Region and Location'])[2]")
		WebElement clickregionandlocation;

		@FindBy(xpath = "//input[@id='XPDateTimeFormat_btnApplyDateTimeFormat']")
		WebElement btnapplyregionlocation;

		@FindBy(xpath = "//label[@id='XPDateTimeFormat_lblDateTimeFormat']")
		WebElement tabdateandtime;

		@FindBy(xpath = "//input[@id='XPDateTimeFormat_btnApplyDateTimeFormat']")
		WebElement btnapplydatetimeformat;
		
		
		//User Setting
		
		@FindBy (xpath = "(//label[@title='User Settings'])[3]")
		WebElement clickuserseting;
		
		@FindBy (xpath = "(//label[@title='User Interface'])[3]")
		WebElement clickuserinterface;
		
		//Screen Save Setting
		
		@FindBy (xpath = "(//label[@title='Screen Saver Settings'])[3]")
		WebElement clickscreensvaerset;
		
		@FindBy (xpath = "//input[@id='WinScreenSaverbtnScreenSaverApply']")
		WebElement btnapplyscreensaver;
		
		//Taskbar Properties
		
		@FindBy (xpath = "(//label[@title='Taskbar Properties'])[2]")
		WebElement clicktaskbarproperties;
		
		@FindBy (xpath = "//input[@id='XPTaskbarbtn_XP_TaskbarPropertieSave']")
		WebElement btnapplytaskbarproperties;
		
		//User Interface Setting
		
		@FindBy (xpath = "(//label[@title='User Interface Settings'])[3]")
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
		
		@FindBy (xpath = "(//label[@title='Wallpaper Settings'])[2]")
		WebElement clickwallpaperset;
		
		@FindBy (xpath = "//input[@id='XPWallpaperbtnSaveWallpaper']")
	    WebElement btnapplywallpapersetting;
		
		//Administration
		
		@FindBy (xpath = "(//label[@title='Administration'])[3]")
	    WebElement Clickadministration;
		
		 // Application 
		
	    @FindBy (xpath = "(//label[@title='Application Command'])[2]")
	    WebElement Clickapplicationcommand;
		
	    @FindBy (xpath = "//input[@id='WinAPPCMDbtnApplyRDP']")
	    WebElement btnapplyapplication;
	    
	    //Command 
	    
	    @FindBy (xpath = "//label[@id='WinAPPCMDlblcommand']")
	    WebElement tabCommand;
	    
	    @FindBy (xpath = "//input[@id='WinAPPCMDbtnApplyRDP']")
	    WebElement btnapplyCommand;
	    
		//Envirememt Variable
	    
	    @FindBy (xpath = "(//label[@title='Environment Variable'])[2]")
	    WebElement clickEnvironmentVariable;
		
	    
	    @FindBy (xpath = "//input[@id='XPEnvironmentVari_btnEnvVarApplye']")
	    WebElement btnapplyEnvVariable;
	    
	    //Performance MGMT
	    
	    @FindBy (xpath = "(//label[@title='Performance Management'])[2]")
	    WebElement clickperformancemgmt;
	    
	    //History Cleaner
	    
	    @FindBy (xpath = "(//label[@title='History Cleaner'])[2]")
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
	    
	    @FindBy (xpath = "(//label[@title='Registry Backup Restore'])[2]")
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
	    
	    @FindBy (xpath = "(//label[@title='Startup Application List'])[2]")
	    WebElement ClickStartupapplicationlist;
	    
	    @FindBy (xpath = "//input[@id='XPStartUpApp_btnApply']")
	    WebElement btnapplyviewapplicationlist;
	    
	    //Add Application List
	    
	    @FindBy (xpath = "//label[@id='XPStartUpApp_lbladdapplicationlist']")
	    WebElement tabaddapplicationlist;
	    
	    @FindBy (xpath = "//input[@id='XPStartUpApp_btnAddAppSave']")
	    WebElement btnapplyaddapplicationlist;
	    
	    //Task Scheduler
	    
	    @FindBy (xpath = "(//label[@title='Task Scheduler'])[2]")
	    WebElement clickTaskshedular;
	    
	    @FindBy (xpath = "//input[@id='XPTaskScheduler_btnDeleteXPTaskSch']")
	    WebElement btndeletetaskshedular;
	    
	    // Remote Setting
	    
	    @FindBy (xpath = "(//label[@title='Remote Agent'])[3]")
	    WebElement clickremoteagent;
	     
	    // Advance Setting
	    
	    @FindBy (xpath = "(//label[@title='Advanced Settings'])[3]")
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
	    
	    @FindBy (xpath = "(//label[@title='Change VNC Password'])[3]")
	    WebElement clickchangevncpass;
	    
	    @FindBy (xpath = "//input[@id='WinVNCpw_btnVNC_Apply']")
	    WebElement btnapplyvncpass;
	    
	    //General Setting
	    
	    @FindBy (xpath = "(//label[@title='General Settings'])[3]")
	    WebElement clickgeneralsetting;
	    
	    @FindBy (xpath = "//input[@id='WinGenSetting_btnApplyGS']")
	    WebElement btnapplygeneraleset;
	    
	    
	    //Service MGMT
	    
	    @FindBy (xpath = "(//label[@title='Service Management'])[2]")
	    WebElement Clickservicemgmt;
	    
	    @FindBy (xpath = "(//label[@title='Services'])[3]")
	    WebElement Clickservices;
	    
	    @FindBy (xpath = "//input[@id='XPService_btnRestartSysView']")
	    WebElement btnrestartservices;
	    

	    //USB Device Manager
	    
	    @FindBy (xpath = "(//label[@title='USB Device Manager'])[3]")
	    WebElement clickUSBDevicemanager;
	    
	    @FindBy (xpath = "//input[@id='XPUSBbtnSave']")
	    WebElement btnapplyUSBDevicemanager;
	    
	    //User Management
	    
	    @FindBy (xpath = "(//label[@title='User Management'])[3]")
	    WebElement ClickUsermgmt;
	    
	    @FindBy (xpath = "//input[@id='XPUserManagement_btnNewUser']")
	    WebElement btnnewuser;
	    
	    @FindBy (xpath = "//input[@id='XPUserManagement_btnAdd']")
	    WebElement btnapplyuserMGMT;
	    
	    
		// Security
	   	
	   	@FindBy (xpath = "(//label[@title='Security'])[3]")
	    WebElement clicksecurity;
	    
	    @FindBy (xpath = "(//label[@title='File System'])[2]")
	    WebElement clickfilesystem;
	    
	    //Write FIlter Setting
	    
	    @FindBy (xpath = "(//label[@title='Write Filter Operations'])[2]")
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
	    
	    @FindBy (xpath = "(//label[@title='Network'])[2]")
	    WebElement clicknetwork;
	    
	    @FindBy (xpath = "(//label[@title='Firewall'])[2]")
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
	    
	    @FindBy (xpath = "(//label[@title='Proxy Settings'])[2]")
	    WebElement clickproxysetting;
	    
	    @FindBy(xpath = "//input[@id='WinProxySettingsrbtnGlobalSettngsInstant']")
	    WebElement chkexcutivenowproxy;
	    
	    @FindBy (xpath = "//input[@id='WinProxySettingsbtnApplyIESettings']")
	    WebElement btnapplyproxysetting;
	    
	    //Soft Restriction
	    
	    @FindBy (xpath = "(//label[@title='Software Restriction'])[3]")
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
	    
	    @FindBy (xpath = "(//label[@title='System'])[2]")
	    WebElement clicksystem;
	    
	    @FindBy (xpath = "(//label[@title='Deploy Certificate'])[2]")
	    WebElement clickdeplycertificate;
	    
	    @FindBy (xpath = "//input[@id='WinInstallCertificatebtnApply_DeployCertificate_XP']")
	    WebElement btnapplydeplycertificate;
	    
	    @FindBy (xpath = "(//label[@title='Port Settings'])[2]")
	    WebElement clickpostsetting;
	    
	    @FindBy (xpath = "//input[@id='WinSecuritySettingsbtnSaveSecuritySetting_JQ']")
	    WebElement btnapplyposrtsetting;
	    
	    //Connection Management
	    
	    @FindBy (xpath = "(//label[@title='Connection Management'])[3]")
	    WebElement clickconnmgmt;
	    
	    @FindBy (xpath = "(//label[@title='Connections'])[3]")
	    WebElement clickconnection;

	    @FindBy (xpath = "//input[@id='WinConbtnNewConnection']")
	    WebElement btnaddnewconn;
	    
	    //VM View Global Setting
	    
	    @FindBy (xpath = "(//label[@title='VMView Global Settings'])[3]")
	    WebElement clickVMGlobalset;
	    
	    @FindBy (xpath = "//input[@id='WinVMViewbtnVmViewGlobalApply']")
	    WebElement btnapplyVMGlobalset;
	    
	    
		// Software Deployment

		@FindBy(xpath = "(//label[@title='Software Deployment'])[2]")
		WebElement Clicksoftdeplyment;

		@FindBy(xpath = "(//label[@title='File Transfer'])[3]")
		WebElement Clickfiletransfer;
		
		@FindBy (xpath = "//input[@id='WinFileTransferbtnFTApplyJQ']")
	   	WebElement btnapplyfiletransfer;

		@FindBy (xpath = "//label[@id='WinFileTransferlnkbtnfolder']")
	   	WebElement tabfoldertransfer;
		
		@FindBy (xpath = "//input[@id='WinFileTransferbtnFTApplyJQ']")
	   	WebElement btnapplyfoldertransfer;
		
		//Import File
		
		@FindBy (xpath = "(//label[@title='Import File'])[2]")
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
		
		@FindBy (xpath = "(//label[@title='Software & Patch Install/Uninstall'])[2]")
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
	    
	    @FindBy(xpath = "//li[@id='myProfile2FAuth']")//label[@id='lbl2FAuthentication']
	    WebElement tabtwofactorauthentication;
	    
	    @FindBy(xpath = "//input[@id='btnSaveAuthentication']")
	    WebElement btnsavetwofactorauthentication;
	    
	    @FindBy(xpath = "//a[@id='linkcloseProfilePopup']")
	    WebElement btnclosewindow;
	    
	    @FindBy(xpath = "//a[@id='ibtntHome']")
	    WebElement btnhome;
		
		
		
		

		public void VerifyFullAcess_SystemSetting() 
	    {
			
		
    	clickGrp.click();
    	clickNode.click();
    	btnExpandMenu.click();
    	systemset.click();
    	
    	clickbiosconfug.click();
    	if(btnapplybiosconfug.isDisplayed()==true)
    	{
    		Assert.assertTrue(false);
    	}
    	
    	else 
    	{
    		//softassert.assertfalse(true);
    		Assert.assertTrue(true);
		}
    	
    	
    	Clicknetworkset.click();
    	click802security.click();
    	
    	if(btnapplyx802.isDisplayed()==true)
    	{
    		Assert.assertTrue(false);
    		//softassert.assertfalse(false);
    	}
    	
    	
    	else 
    	{
    		Assert.assertTrue(true);
    		//softassert.assertfalse(true);
		}
    	
    	
    	clickcomputername.click();
    	if(ButtonApplycomputername.isDisplayed()==true)
    	{
    		Assert.assertTrue(false);
    		//softassert.assertfalse(false);
    	}
    	
    	else 
    	{
    		Assert.assertTrue(true);
    		//softassert.assertfalse(true);
		}
    	
    	
    	tabdomain.click();
    	if(btnapplydomain.isDisplayed()==true)
    	{
    		Assert.assertTrue(false);
    		//softassert.assertfalse(false);
    	}
    	
    	else 
    	{
    		Assert.assertTrue(true);
    		//softassert.assertfalse(true);
		}
    	
    	
    	clickethernetsetup.click();
    	
    	if(btnapplyethernetsetup.isDisplayed()==true)
    	{
    		Assert.assertTrue(false);
    		//softassert.assertfalse(false);
    	}
    	
    	else 
    	{
    		Assert.assertTrue(true);
    		//softassert.assertfalse(true);
		}
    	
    	clickwirelessProperties.click();
    	
    	if(btnapplywirelessproperties.isDisplayed()==true)
    	{
    		Assert.assertTrue(false);
    		//softassert.assertfalse(false);
    	}
    	
    	else 
    	{
    		Assert.assertTrue(true);
    		//softassert.assertfalse(true);
		}
    	
    	clickwirelesssetup.click();
    	if(buttonapplywirelesssetup.isDisplayed()==true)
    	{
    		Assert.assertTrue(false);
    		//softassert.assertfalse(false);
    	}
    	else 
    	{
    		Assert.assertTrue(true);
    		//softassert.assertfalse(true);
		}
    	
    	clickPeripheralSettings.click();
    	clickDisplaySettings.click();
    	
    	if(btnApplyDisplay.isDisplayed()==true)
    	{
    		Assert.assertTrue(false);
    		//softassert.assertfalse(false);
    	}
    	else 
    	{
    		Assert.assertTrue(true);
    		//softassert.assertfalse(true);
		}
    	
    	clickKeyboardSettings.click();
    	
    	if(btnApplyKeyboard.isDisplayed()==true)
    	{
    		Assert.assertTrue(false);
    		//softassert.assertfalse(false);
    	}
    	else 
    	{
    		Assert.assertTrue(true);
    		//softassert.assertfalse(true);
		}
    	
    	clickmousesetting.click();
    	if(btnapplymousesetting.isDisplayed()==true)
    	{
    		Assert.assertTrue(false);
    		//softassert.assertfalse(false);
    	}
    	else 
    	{
    		Assert.assertTrue(true);
    		//softassert.assertfalse(true);
		}
    	
    	
    	clickpowerMgmt.click();
    	clickpoweroption.click();
    	
    	if(btnapplypoweroption.isDisplayed()==true)
    	{
    		Assert.assertTrue(false);
    		//softassert.assertfalse(false);
    	}
    	else 
    	{
    		Assert.assertTrue(true);
    		//softassert.assertfalse(true);
		}
    	
    	clickprinterset.click();
    	clickprinters.click();
    	
    	if(btnapplyprinterset.isDisplayed()==true)
    	{
    		Assert.assertTrue(false);
    		//softassert.assertfalse(false);
    	}
    	else 
    	{
    		Assert.assertTrue(true);
    		//softassert.assertfalse(true);
		}
    	
    	clicktimelanguage.click();
    	clickdatetime.click();
    	
    	if(btnapplydatetime.isDisplayed()==true)
    	{
    		Assert.assertTrue(false);
    		//softassert.assertfalse(false);
    	}
    	else 
    	{
    		Assert.assertTrue(true);
    		//softassert.assertfalse(true);
		}
    	
    	tabtimezone.click();

    	if(btnapplytimezone.isDisplayed()==true)
    	{
    		Assert.assertTrue(false);
    		//softassert.assertfalse(false);
    	}
    	else 
    	{
    		Assert.assertTrue(true);
    		//softassert.assertfalse(true);
		}
    	
    	tabtimeserver.click();
    	
    	if(btnapplytimeserver.isDisplayed()==true)
    	{
    		Assert.assertTrue(false);
    		//softassert.assertfalse(false);
    	}
    	else 
    	{
    		Assert.assertTrue(true);
    		//softassert.assertfalse(true);
		}
    	
    	clickregionandlocation.click();
    	
    	if(btnapplyregionlocation.isDisplayed()==true)
    	{
    		Assert.assertTrue(false);
    		//softassert.assertfalse(false);
    	}
    	else 
    	{
    		Assert.assertTrue(true);
    		//softassert.assertfalse(true);
		}
    	
    	tabdateandtime.click();
    	
    	if(btnapplydatetimeformat.isDisplayed()==true)
    	{
    		Assert.assertTrue(false);
    		//softassert.assertfalse(false);
    	}
    	else 
    	{
    		Assert.assertTrue(true);
    		//softassert.assertfalse(true);
		}
    	
    	//softassert.assertAll();
    	
	}
 
    public void VerifyFullAcess_UserSetting()
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
		
		if(btnapplyscreensaver.isDisplayed()==true)
    	{
    		softassert.assertTrue(false);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(true);
		}
    	
		clicktaskbarproperties.click();
		
		if(btnapplytaskbarproperties.isDisplayed()==true)
    	{
    		softassert.assertTrue(false);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(true);
		}
    	
		clickuserinterfacesetting.click();
		
		if(btnapplyautologon.isDisplayed()==true)
    	{
    		softassert.assertTrue(false);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(true);
		}
    	
		tabWCLInterfaceSett.click();
		
		if(btnapplyWCLSetting.isDisplayed()==true)
    	{
    		softassert.assertTrue(false);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(true);
		}
    	
		clickwallpaperset.click();
		if(btnapplywallpapersetting.isDisplayed()==true)
    	{
    		softassert.assertTrue(false);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(true);
		}
    	
		softassert.assertAll();
		
		
	}
    
    public void VerifyFullAcess_Administration() 
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
		
		if(btnapplyapplication.isDisplayed()==true)
    	{
    		softassert.assertTrue(false);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(true);
		}
		
		tabCommand.click();
		
		if(btnapplyCommand.isDisplayed()==true)
    	{
    		softassert.assertTrue(false);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(true);
		}
		
		clickEnvironmentVariable.click();
		if(btnapplyEnvVariable.isDisplayed()==true)
    	{
    		softassert.assertTrue(false);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(true);
		}
		
		clickperformancemgmt.click();
		clickHistoryCleaner.click();
		
		if(btnapplyWebBrowser.isDisplayed()==true)
    	{
    		softassert.assertTrue(false);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(true);
		}
		
		tabwindowsCleaner.click();
		
		if(btnapplywindowscleaner.isDisplayed()==true)
    	{
    		softassert.assertTrue(false);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(true);
		}
		
		ClickRegistryBackupRestore.click();
		
		if(btnapplyObtainregistory.isDisplayed()==true)
    	{
    		softassert.assertTrue(false);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(true);
		}
		
		tabregistoryBackup.click();
		if(btnapplyregistorybackup.isDisplayed()==true)
    	{
    		softassert.assertTrue(false);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(true);
		}
		
		ClickStartupapplicationlist.click();
		if(btnapplyviewapplicationlist.isDisplayed()==true)
    	{
    		softassert.assertTrue(false);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(true);
		}
		
		tabaddapplicationlist.click();
		
		if(btnapplyaddapplicationlist.isDisplayed()==true)
    	{
    		softassert.assertTrue(false);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(true);
		}
		
		
		clickTaskshedular.click();
		
		if(btndeletetaskshedular.isDisplayed()==true)
    	{
    		softassert.assertTrue(false);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(true);
		}
		
		clickremoteagent.click();
		clickadvancsetting.click();
		
		Actions a=new Actions(wd);
		a.moveToElement(excutivenowremoteagent).release().build().perform();
		
		if(btnapplyremotesetting.isDisplayed()==true)
    	{
    		softassert.assertTrue(false);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(true);
		}
		
		a.moveToElement(tabDHCP).release().build().perform();
		tabDHCP.click();
		
		if(btnapplyDHCP.isDisplayed()==true)
    	{
    		softassert.assertTrue(false);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(true);
		}
		
		clickchangevncpass.click();
		if(btnapplyvncpass.isDisplayed()==true)
    	{
    		softassert.assertTrue(false);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(true);
		}
		
		clickgeneralsetting.click();
		
		if(btnapplygeneraleset.isDisplayed()==true)
    	{
    		softassert.assertTrue(false);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(true);
		}
		
		Clickservicemgmt.click();
		Clickservices.click();
		
		if(btnrestartservices.isEnabled()==true)
    	{
    		softassert.assertTrue(false);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(true);
		}
		
		clickUSBDevicemanager.click();
		
		if(btnapplyUSBDevicemanager.isDisplayed()==true)
    	{
    		softassert.assertTrue(false);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(true);
		}
		
		ClickUsermgmt.click();
		//if(btnapplyuserMGMT.isDisplayed()==true)
		if(btnnewuser.isDisplayed()==true)
    	{
    		softassert.assertTrue(false);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(true);
		}
		
		softassert.assertAll();
	}

    public void VerifyFullAcess_Security() 
    
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
		if(btnapplyWritefilterset.isDisplayed()==true)
    	{
    		softassert.assertTrue(false);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(true);
		}
		
		tabwritefilterexclist.click();
	    a.moveToElement(chkecutive).release().build().perform();	
		if(btnapplywritefilterexclist.isDisplayed()==true)
    	{
    		softassert.assertTrue(false);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(true);
		}
		
		
		a.moveToElement(tabcachesize).release().build().perform();
		tabcachesize.click();
		
		if(btnapplycachesize.isDisplayed()==true)
    	{
    		softassert.assertTrue(false);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(true);
		}
		
		tabComitcachefile.click();
		
		if(btnapplynComitcachefile.isDisplayed()==true)
    	{
    		softassert.assertTrue(false);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(true);
		}
		
		taboverlaysetiing.click();
		if(btnapplyoverlayset.isDisplayed()==true)
    	{
    		softassert.assertTrue(false);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(true);
		}
		
		clicknetwork.click();
		clickfirewall.click();
		tabaddport.click();
		
		if(btnapplyaddport.isDisplayed()==true)
    	{
    		softassert.assertTrue(false);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(true);
		}
		
		tabaddprogram.click();
		
		if(btnapplyaddprogram.isDisplayed()==true)
    	{
    		softassert.assertTrue(false);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(true);
		}
		
		clickproxysetting.click();
		a.moveToElement(chkexcutivenowproxy).release().build().perform();
		
		if(btnapplyproxysetting.isDisplayed()==true)
    	{
    		softassert.assertTrue(false);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(true);
		}
		
		clicksoftrestriction.click();
		
		if(btnapplyinstalluninstall.isDisplayed()==true)
    	{
    		softassert.assertTrue(false);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(true);
		}
		
		tabapprestriction.click();
		
		if(btnapplysoftrestriction.isDisplayed()==true)
    	{
    		softassert.assertTrue(false);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(true);
		}
		
		tabbrowserrestriction.click();
		if(btnapplybrowserrestriction.isDisplayed()==true)
    	{
    		softassert.assertTrue(false);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(true);
		}
		
		
		clicksystem.click();
		clickdeplycertificate.click();
		
		if(btnapplydeplycertificate.isDisplayed()==true)
    	{
    		softassert.assertTrue(false);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(true);
		}
		
		clickpostsetting.click();
		
		if(btnapplyposrtsetting.isDisplayed()==true)
    	{
    		softassert.assertTrue(false);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(true);
		}
		
		clickconnmgmt.click();
		clickconnection.click();
		
		if(btnaddnewconn.isDisplayed()==true)
    	{
    		softassert.assertTrue(false);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(true);
		}
		
		clickVMGlobalset.click();
		
		if(btnapplyVMGlobalset.isDisplayed()==true)
    	{
    		softassert.assertTrue(false);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(true);
		}
		
		softassert.assertAll();
		
	}

    public void VerifyFullAcess_softwaredeploment() 
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
		
		if(btnapplyfiletransfer.isDisplayed()==true)
    	{
    		softassert.assertTrue(false);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(true);
		}
		
		tabfoldertransfer.click();
		
		if(btnapplyfoldertransfer.isDisplayed()==true)
    	{
    		softassert.assertTrue(false);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(true);
		}
		
		clickimportfile.click();
		if(btnapplyimportfile.isDisplayed()==true)
    	{
    		softassert.assertTrue(false);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(true);
		}
		
		tabimportfolder.click();
		
		if(btnapplyimportfolder.isDisplayed()==true)
    	{
    		softassert.assertTrue(false);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(true);
		}
		
		tabfoldersync.click();
		if(btnapplyfoldersysnc.isDisplayed()==true)
    	{
    		softassert.assertTrue(false);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(true);
		}
		
		clicksoftwareandpathinstall.click();
		
		if(btnNewInstallsoftware.isDisplayed()==true)
    	{
    		softassert.assertTrue(false);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(true);
		}
		softassert.assertAll();
	}

    public void VerifyFullAcess_ContexMenu() throws InterruptedException 
    {
    	Actions a=new Actions(wd);
    	
    	//Site
    	btnhome.click();
    	utility.isVisible(site, wd, 10);
    	Thread.sleep(2000);
    	a.contextClick(site).build().perform();
    	
    	if(addgrp.isDisplayed()==false)
    	
    	{
    		softassert.assertTrue(false);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(true);
    		System.out.println("Add Grp Fail");
		}
    	
    	if(arrangenode.isDisplayed()==false)
    	{
    		softassert.assertTrue(false);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(true);
    		System.out.println("Arrange node Fail");
		}
    	
    	if(appliedpolicies.isDisplayed()==false)
    	{
    		softassert.assertTrue(false);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(true);
    		System.out.println("Applied policies Fail");
		}
    	
    	a.contextClick(grp).build().perform();
    	a.moveToElement(groupmgmt).release().build().perform();
    	Thread.sleep(1000);
    	if(Addsubgrp.isDisplayed()==false)
    	{
    		softassert.assertTrue(false);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(true);
    		System.out.println("Add Sub Grp Fail");
		}
    	
    	if(Editgrp.isDisplayed()==false)
    	{
    		softassert.assertTrue(false);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(true);
    		System.out.println("Edit Grp Fail");
		}
    	
    	if(Deletegrp.isDisplayed()==false)
    	{
    		softassert.assertTrue(false);
    		
    	}
    	
    	else 
    	{
    		softassert.assertTrue(true);
    		System.out.println("Delete Grp Fail");
		}
    	
    	a.moveToElement(grpsetting).build().perform();
    	
    	if(repoconfirmation.isDisplayed()==false)
    	{
    		softassert.assertTrue(false);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(true);
    		System.out.println("Edit Grp Fail");
		}
    	
    	a.moveToElement(remoteoperation).build().perform();
    	Thread.sleep(1000);
    	
    	if(sendmsgall.isDisplayed()==false)
    	{
    		softassert.assertTrue(false);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(true);
    		System.out.println("Remote Operation Fail");
		}
    	
    	
    	
    	if(syncall.isDisplayed()==false)
    	{
    		softassert.assertTrue(false);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(true);
		}
    	
    	
    	if(Shutdownall.isDisplayed()==false)
    	{
    		softassert.assertTrue(false);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(true);
		}
    	
    	if(restartall.isDisplayed()==false)
    	{
    		softassert.assertTrue(false);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(true);
		}
    	
    	
    	a.moveToElement(Shadowing).build().perform();
    	
    	if(vnc.isDisplayed()==false)
    	{
    		softassert.assertTrue(false);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(true);
		}
    	
    	
    	
    	
             	
    	a.moveToElement(clonedeploy).build().perform();
    	
    	if(deployImage.isDisplayed()==false)
    	{
    		softassert.assertTrue(false);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(true);
		}
    	
    	
    	if(deployproperties.isDisplayed()==false)
    	{
    		softassert.assertTrue(false);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(true);
		}
    	
        
    	if(Unregisterdevice.isDisplayed()==false)
    	{
    		softassert.assertTrue(false);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(true);
		}
        
    	if(ChangeVNCPass.isDisplayed()==false)
    	{
    		softassert.assertTrue(false);
    	}
    	
    	else 
    	{
    		softassert.assertTrue(true);
		}
    	
    	
    	softassert.assertAll();
	}

	
}
