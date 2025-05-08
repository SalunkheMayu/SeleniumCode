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

public class LinuxConMGMT_Page 
{
	public WebDriver wd;

	public LinuxConMGMT_Page(WebDriver wd) 
	{
		this.wd = wd;
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		PageFactory.initElements(wd, this);
	}
	
	
	@FindBy(xpath = "//*[contains(text(), 'DM_GRP')]//preceding-sibling::span[@class='rtPlus']")
	WebElement clickGrp;
	
	@FindBy(xpath = "//*[contains(text(), 'DM_GRP')]")
	WebElement grp;

	@FindBy(xpath = "(//*[contains(text(), '192.168.2.97')])[1]")
	WebElement clickNode;
	
	@FindBy(xpath = "//div[@id='btnExpandMenu']")
	WebElement btnExpandMenu;
	
	@FindBy(xpath = "(//label[@title='Connection Management'])[4]")
	WebElement clickConmgmt;
	
	@FindBy (xpath = "(//label[@title='Connections'])[4]")
	WebElement clickconn;
	
	@FindBy(xpath = "//input[@id='LinuxConnectionbtnImportConnection']")
	WebElement btnimportcon;
	
	@FindBy(xpath = "(//label[@title='Global Settings'])[2]")
	WebElement  clickglobalsetting;
	
	@FindBy(xpath = "(//label[@title='Browser Global Settings'])[2]")
	WebElement clickbrowserglobalsetting;
	
	@FindBy(xpath = "(//label[@title='Citrix Global Settings'])[2]")
	WebElement clickcitrixglobalsetting;
	
	@FindBy(xpath = "(//label[@title='PNAgent Global Settings'])[2]")
	WebElement  clickPNAagentsetting;
	
	@FindBy(xpath = "(//label[@title='RDP Global Settings'])[2]")
	WebElement clickRDPglobalsetting;
	
	@FindBy(xpath = "(//label[@title='VMView Global Settings'])[4]")
	WebElement  clickvmviewglobalsetting;
	
	@FindBy(xpath = "(//label[@title='Imprivata Global'])[2]")
	WebElement clickImprivataglobal;
	
	@FindBy(xpath = "(//label[@title='Generic Settings'])[2]")
	WebElement clickgenericsetting;
	
	@FindBy(xpath = "//input[@id='Linux_GlobBrowser_btnSave']")
	WebElement btnapplyproxysetting;
	
	@FindBy(xpath = "//label[@id='Linux_GlobBrowser_lnkbtnBGDisplay']")
	WebElement tabdisplay;
	
	@FindBy(xpath = "//input[@id='Linux_GlobBrowser_btnSave']")
	WebElement btnapplydisplay;
	
	@FindBy(xpath = "//input[@id='Linux_GlobalSettICA_btnICASave']")
	WebElement btnapplykeyboardsetting;
	
	@FindBy(xpath = "//label[@id='Linux_GlobalSettICA_lblPreferences']")
	WebElement tabpreferences;
	
	@FindBy(xpath = "//label[@id='Linux_GlobalSettICA_lnkbtnKeyboardShortcuts']")
	WebElement tabkeyboardshortcut;
	
	@FindBy(xpath = "//input[@id='Linux_GlobalSettICA_btnICASave']")
	WebElement btnapplykeyboardshortcut;
	
	@FindBy(xpath = "//label[@id='Linux_GlobalSettICA_lnkbtnWindow']")
	WebElement tabwindows;
	
	@FindBy(xpath = "//input[@id='Linux_GlobalSettICA_btnICASave']")
	WebElement btnapplywindows;
	
	@FindBy(xpath = "//label[@id='Linux_GlobalSettICA_lnkbtnServerLocation']")
	WebElement tabserverloaction;
	
	@FindBy(xpath = "//input[@id='Linux_GlobalSettICA_btnICASave']")
	WebElement btnapplyserverlocation;
	
	@FindBy(xpath = "//label[@id='Linux_GlobalSettICA_lblMapping']")
	WebElement tabmapping;
	
	@FindBy(xpath = "//label[@id='Linux_GlobalSettICA_lnkbtnDriveMapping']")
	WebElement tabdrivermapping;
	
	@FindBy(xpath = "//label[@id='Linux_GlobalSettICA_lnkbtnComPorts']")
	WebElement tabCOMPorts;
	
	@FindBy(xpath = "//label[@id='Linux_GlobalSettICA_lnkbtnPrinter']")
	WebElement tabprinter;
	
	@FindBy(xpath = "//input[@id='Linux_GlobalSettICA_btnICASave']")
	WebElement btnapplydrivemappingCOMPortPrinter;
	
	@FindBy(xpath = "//label[@id='Linux_GlobalSettICA_lblOthers']")
	WebElement tabothers;
	
	@FindBy(xpath = "//a[@id='Linux_GlobalSettICA_A6']")
	WebElement tabreconnect;
	
	@FindBy(xpath = "//label[@id='Linux_GlobalSettICA_lnkbtnFirewall']")
	WebElement tabfirewall;
	
	@FindBy(xpath = "//label[@id='Linux_GlobalSettICA_lnkbtnDiskCache']")
	WebElement tabdiskcache;
	
	@FindBy(xpath = "//label[@id='Linux_GlobalSettICA_lnkbtnFont']")
	WebElement tabfont;
	
	@FindBy(xpath = "//label[@id='Linux_GlobalSettICA_lnkbtnRestore']")
	WebElement  tabrestore;
	
	@FindBy(xpath = "//input[@id='Linux_GlobalSettICA_btnICASave']")
	WebElement btnapplyOthers;
	
	@FindBy(xpath = "//label[@id='Linux_GlobalSettICA_lblAuthentication']")
	WebElement tabauthentication;
	
	@FindBy(xpath = "//input[@id='Linux_GlobalSettICA_btnICASave']")
	WebElement btnapplyauthentication;
	
	@FindBy(xpath = "//label[@id='Linux_GlobalSettICA_Label1']")
	WebElement tabdomain;
	
	@FindBy(xpath = "//input[@id='Linux_GlobalSettICA_btnICASave']")
	WebElement btnapplydomain;
	
	@FindBy(xpath = "//input[@id='LinuxPNA_btnApply']")
	WebElement btnapplyclassrule;
	
	@FindBy(xpath = "//label[@id='LinuxPNA_lbldevicerule']")
	WebElement tabdevicerule;
	
	@FindBy(xpath = "//input[@id='LinuxPNA_btnApply']")
	WebElement btnapplydevicerule;
	
	@FindBy(xpath = "//label[@id='LinuxPNA_lblOthers']")
	WebElement tabothers_PNA;
	
	@FindBy(xpath = "//input[@id='LinuxPNA_btnApply']")
	WebElement btnapplyothers_PNA;
	
	@FindBy(xpath = "//label[@id='LinuxPNA_lblAuthentication']")
	WebElement tabauth_PNA;
	
	@FindBy(xpath = "//input[@id='LinuxPNA_btnApply']")
	WebElement btnapplyauth_PNA;
	
	@FindBy(xpath = "//label[@id='LinuxPNA_lblPNAgentGlobalOptimization']")
	WebElement taboptimization;
	
	@FindBy(xpath = "//input[@id='LinuxPNA_btnApply']")
	WebElement  btnapplyoptimation;
	
	@FindBy(xpath = "//label[@id='LinuxPNA_lblWorkspaceApp']")
	WebElement tabworkspaceapp;
	
	@FindBy(xpath = "//input[@id='LinuxPNA_btnApply']")
	WebElement btnapplyworkspaceapp; 
	
	@FindBy(xpath = "//input[@id='LinuxRDPGlobalSettings_btnRDPSave']")
	WebElement btnapplydisplay_RDP;
	
	@FindBy(xpath = "//label[@id='LinuxRDPGlobalSettings_lnkbtnLocalResources']")
	WebElement tablocalresources;
	
	@FindBy(xpath = "//input[@id='LinuxRDPGlobalSettings_btnRDPSave']")
	WebElement btnapplylocalresources;
	
	@FindBy(xpath = "//label[@id='LinuxRDPGlobalSettings_lnkbtnPrograms']")
	WebElement tabprogram;
	
	@FindBy(xpath = "//input[@id='LinuxRDPGlobalSettings_btnRDPSave']")
	WebElement btnapplyprogram;
	
	@FindBy(xpath = "//label[@id='LinuxRDPGlobalSettings_lblMapping']")
	WebElement tabmapping_RDP;
	
	@FindBy(xpath = "//label[@id='LinuxRDPGlobalSettings_lnkbtnComPorts']")
	WebElement tabport_RDp;
	
	@FindBy(xpath = "//input[@id='LinuxRDPGlobalSettings_btnRDPSave']")
	WebElement btnapplymapping_RDP;
	
	@FindBy(xpath = "//label[@id='LinuxRDPGlobalSettings_lblAdvanced']")
	WebElement tabadvanced;
	
	@FindBy(xpath = "//label[@id='LinuxRDPGlobalSettings_lnkbtnExperience']")
	WebElement tabexperience;
	
	@FindBy(xpath = "//input[@id='LinuxRDPGlobalSettings_btnRDPSave']")
	WebElement btnapplyadvanced;
	
	@FindBy(xpath = "//label[@id='LinuxRDPGlobalSettings_lblRDPGlobalDomain']")
	WebElement tabdomain_RDP;
	
	@FindBy(xpath = "//input[@id='LinuxRDPGlobalSettings_btnRDPSave']")
	WebElement btnapplydomain_RDP;
	
	@FindBy(xpath = "//label[@id='LinuxVMViewGlobal_labelUSBRedirection']")
	WebElement tabUSBredirection;
	
	@FindBy(xpath = "//input[@id='LinuxVMViewGlobal_btnSave']")
	WebElement btnapplyUSBredirection;
	
	@FindBy(xpath = "//label[@id='LinuxVMViewGlobal_lblAuthentication']")
	WebElement tabauthentication_VM;
	
	@FindBy(xpath = "//input[@id='LinuxVMViewGlobal_btnSave']")
	WebElement btnapplyauthentication_VM;
	
	@FindBy(xpath = "//label[@id='LinuxVMViewGlobal_lblMisc']")
	WebElement tabMISC;
	
	@FindBy(xpath = "//input[@id='LinuxVMViewGlobal_btnSave']")
	WebElement btnapplyMISC;
	
	@FindBy(xpath = "//label[@id='LinuxVMViewGlobal_lblBlastSettings']")
	WebElement tabblastsetting;
	
	@FindBy(xpath = "//input[@id='LinuxVMViewGlobal_btnSave']")
	WebElement btnapplyblastsetting;
	
	@FindBy(xpath = "//input[@id='btnLXImprivataGlobalApply']")
	WebElement btnapplyImpriviaglobal;
	
	@FindBy(xpath = "//input[@id='btnLXGenericSettingsApply']")
	WebElement btnapplyAWS;
	
	@FindBy(xpath = "//label[@id='lblLXGenericSettingsBrowser']")
	WebElement tabbrowser;
	
	@FindBy(xpath = "//input[@id='btnLXGenericSettingsApply']")
	WebElement btnapplybrowser;
	
	@FindBy(xpath = "//input[@id='Linux_GlobalSettICA_rbtnInstantApply']")
	WebElement chkexecutivenowkeyboardshortcut;
	
	SoftAssert softassert=new SoftAssert();
	
   public  void ConMGMT() 
   {
	   
	   if(clickConmgmt.isDisplayed()==false)
	   {
		   clickGrp.click();
	    	clickNode.click();
	    	btnExpandMenu.click();
	    	clickConmgmt.click();
	   }
	   else 
	   {
		   clickConmgmt.click();
	   }
	 clickconn.click();
	 

 	if(btnimportcon.isDisplayed()==false)
 		{
 		Assert.assertTrue(true);
     	}
     	
     	else 
     	{
     		Assert.assertTrue(false);
     		System.out.println("Connection");
 		}
	 
	 clickglobalsetting.click();
	 clickbrowserglobalsetting.click();
	 

 	if(btnapplyproxysetting.isDisplayed()==false)
 		{
 		Assert.assertTrue(true);
     	}
     	
     	else 
     	{
     		Assert.assertTrue(false);
     		System.out.println("Proxy Setting");
 		}
	 
	 tabdisplay.click();
	 

 	if(btnapplydisplay.isDisplayed()==false)
 		{
 		Assert.assertTrue(true);
     	}
     	
     	else 
     	{
     		Assert.assertTrue(false);
     		System.out.println("Display");
 		}
	 
	 
	 clickcitrixglobalsetting.click();
	 

 	if(btnapplykeyboardsetting.isDisplayed()==false)
 		{
 		Assert.assertTrue(true);
     	}
     	
     	else 
     	{
     		Assert.assertTrue(false);
     		System.out.println("Bios Confugration Fail");
 		}
	 
 	Actions a=new Actions(wd);
	 tabpreferences.click();
	 tabkeyboardshortcut.click();
	 a.moveToElement(chkexecutivenowkeyboardshortcut).release().build().perform();
	 

	 	if(btnapplykeyboardshortcut.isDisplayed()==false)
	 		{
	 		Assert.assertTrue(true);
	     	}
	     	
	     	else 
	     	{
	     		Assert.assertTrue(false);
	     		System.out.println("Bios Confugration Fail");
	 		}
	 	a.moveToElement(tabwindows).release().build().perform();
	 	tabwindows.click();
	 	

	 	if(btnapplywindows.isDisplayed()==false)
	 		{
	 		Assert.assertTrue(true);
	     	}
	     	
	     	else 
	     	{
	     		Assert.assertTrue(false);
	     		System.out.println("Bios Confugration Fail");
	 		}
	 	
	 	
	 	tabserverloaction.click();
	 
	 	if(btnapplyserverlocation.isDisplayed()==false)
 		{
 		Assert.assertTrue(true);
     	}
     	
     	else 
     	{
     		Assert.assertTrue(false);
     		System.out.println("Bios Confugration Fail");
 		}
	 
	 tabmapping.click();
	 tabdrivermapping.click();
	 
	 if(btnapplydrivemappingCOMPortPrinter.isDisplayed()==false)
		{
		Assert.assertTrue(true);
		}
  	
  		else 
  		{
  		Assert.assertTrue(false);
  		System.out.println("Bios Confugration Fail");
		}
	 
	 tabmapping.click();
	 tabCOMPorts.click();
	
	 
	 if(btnapplydrivemappingCOMPortPrinter.isDisplayed()==false)
		{
		Assert.assertTrue(true);
		}
  	
  		else 
  		{
  		Assert.assertTrue(false);
  		System.out.println("Bios Confugration Fail");
		}
	 
	 
	 tabmapping.click();
	 tabprinter.click();
	 
	 if(btnapplydrivemappingCOMPortPrinter.isDisplayed()==false)
		{
		Assert.assertTrue(true);
		}
	
	 else 
	 	{
		Assert.assertTrue(false);
		System.out.println("Bios Confugration Fail");
		}
	 
	 
	 tabothers.click();
	 tabreconnect.click();
	 
	 if(btnapplyOthers.isDisplayed()==false)
		{
		Assert.assertTrue(true);
		}
	
	 else 
		{
		Assert.assertTrue(false);
		System.out.println("Bios Confugration Fail");
		}
	 
	 tabothers.click();
	 tabfirewall.click();
	 
	 if(btnapplyOthers.isDisplayed()==false)
		{
		Assert.assertTrue(true);
		}
	
	 else 
		{
		Assert.assertTrue(false);
		System.out.println("Bios Confugration Fail");
		}
	 
	 tabothers.click();
	 tabdiskcache.click();
	
	 if(btnapplyOthers.isDisplayed()==false)
		{
		Assert.assertTrue(true);
		}
	
	 else 
		{
		Assert.assertTrue(false);
		System.out.println("Bios Confugration Fail");
		}
	
	 tabothers.click();
	 tabfont.click();
	
	 if(btnapplyOthers.isDisplayed()==false)
		{
		Assert.assertTrue(true);
		}
	
	 else 
		{
		Assert.assertTrue(false);
		System.out.println("Bios Confugration Fail");
		}
	 
	 tabothers.click();
	 tabrestore.click();
	
	 if(btnapplyOthers.isDisplayed()==false)
		{
		Assert.assertTrue(true);
		}
	
	 else 
		{
		Assert.assertTrue(false);
		System.out.println("Bios Confugration Fail");
		}
	
	 tabauthentication.click();
	 
	 if(btnapplyauthentication.isDisplayed()==false)
		{
		Assert.assertTrue(true);
		}
	
	 else 
		{
		Assert.assertTrue(false);
		System.out.println("Bios Confugration Fail");
		}
	
	 
	 tabdomain.click();
	 
	 if(btnapplydomain.isDisplayed()==false)
		{
		Assert.assertTrue(true);
		}
	
	 else 
		{
		Assert.assertTrue(false);
		System.out.println("Bios Confugration Fail");
		}
	
	  clickPNAagentsetting.click();
	  
	  if(btnapplyclassrule.isDisplayed()==false)
		{
		Assert.assertTrue(true);
		}
	
	 else 
		{
		Assert.assertTrue(false);
		System.out.println("Bios Confugration Fail");
		}
	
	  tabdevicerule.click();
	  
	  if(btnapplydevicerule.isDisplayed()==false)
		{
		Assert.assertTrue(true);
		}
	
	 else 
		{
		Assert.assertTrue(false);
		System.out.println("Bios Confugration Fail");
		}
	
	  tabothers_PNA.click();
	
	  if(btnapplyothers_PNA.isDisplayed()==false)
		{
		Assert.assertTrue(true);
		}
	
	 else 
		{
		Assert.assertTrue(false);
		System.out.println("Bios Confugration Fail");
		}
	
	tabauth_PNA.click();
	
	 if(btnapplyauth_PNA.isDisplayed()==false)
		{
		Assert.assertTrue(true);
		}
	
	 else 
		{
		Assert.assertTrue(false);
		System.out.println("Bios Confugration Fail");
		}
	
	 taboptimization.click();
	 
	 if(btnapplyoptimation.isDisplayed()==false)
		{
		Assert.assertTrue(true);
		}
	
	 else 
		{
		Assert.assertTrue(false);
		System.out.println("Bios Confugration Fail");
		}
	
	
	 tabworkspaceapp.click();
	 
	 if(btnapplyworkspaceapp.isDisplayed()==false)
		{
		Assert.assertTrue(true);
		}
	
	 else 
		{
		Assert.assertTrue(false);
		System.out.println("Bios Confugration Fail");
		}
	
	
	clickRDPglobalsetting.click();
	utility.isVisible(tablocalresources, wd, 5);
	 
	 if(btnapplydisplay_RDP.isDisplayed()==false)
		{
		Assert.assertTrue(true);
		}
	
	 else 
		{
		Assert.assertTrue(false);
		System.out.println("Bios Confugration Fail");
		}
	
	 tablocalresources.click();
	 
	 if(btnapplylocalresources.isDisplayed()==false)
		{
		Assert.assertTrue(true);
		}
	
	 else 
		{
		Assert.assertTrue(false);
		System.out.println("Bios Confugration Fail");
		}
	
	
	 tabprogram.click();
	 
	 if(btnapplyprogram.isDisplayed()==false)
		{
		Assert.assertTrue(true);
		}
	
	 else 
		{
		Assert.assertTrue(false);
		System.out.println("Bios Confugration Fail");
		}
	
	 tabmapping_RDP.click();
	 tabport_RDp.click();
	 
	 if(btnapplymapping_RDP.isDisplayed()==false)
		{
		Assert.assertTrue(true);
		}
	
	 else 
		{
		Assert.assertTrue(false);
		System.out.println("Bios Confugration Fail");
		}
	

	 tabadvanced.click();
	 tabexperience.click();
	 
		
	 if(btnapplyadvanced.isDisplayed()==false)
		{
		Assert.assertTrue(true);
		}
	
	 else 
		{
		Assert.assertTrue(false);
		System.out.println("Bios Confugration Fail");
		}



	 tabdomain_RDP.click();
	 
		
	 if(btnapplydomain_RDP.isDisplayed()==false)
		{
		Assert.assertTrue(true);
		}
	
	 else 
		{
		Assert.assertTrue(false);
		System.out.println("Bios Confugration Fail");
		}

	clickvmviewglobalsetting.click();
	tabUSBredirection.click();
	
	 if(btnapplyUSBredirection.isDisplayed()==false)
		{
		Assert.assertTrue(true);
		}
	
	 else 
		{
		Assert.assertTrue(false);
		System.out.println("Bios Confugration Fail");
		}

	tabauthentication_VM.click();
	
	 if(btnapplyauthentication_VM.isDisplayed()==false)
		{
		Assert.assertTrue(true);
		}
	
	 else 
		{
		Assert.assertTrue(false);
		System.out.println("Bios Confugration Fail");
		}

	tabMISC.click();
	
	 if(btnapplyMISC.isDisplayed()==false)
		{
		Assert.assertTrue(true);
		}
	
	 else 
		{
		Assert.assertTrue(false);
		System.out.println("Bios Confugration Fail");
		}

	tabblastsetting.click();
	
	 if(btnapplyblastsetting.isDisplayed()==false)
		{
		Assert.assertTrue(true);
		}
	
	 else 
		{
		Assert.assertTrue(false);
		System.out.println("Bios Confugration Fail");
		}

	 clickImprivataglobal.click();
	 
	 if(btnapplyImpriviaglobal.isDisplayed()==false)
		{
		Assert.assertTrue(true);
		}
	
	 else 
		{
		Assert.assertTrue(false);
		System.out.println("Bios Confugration Fail");
		}

	 clickgenericsetting.click();
	 
	 if(btnapplyAWS.isDisplayed()==false)
		{
		Assert.assertTrue(true);
		}
	
	 else 
		{
		Assert.assertTrue(false);
		System.out.println("Bios Confugration Fail");
		}

	 tabbrowser.click();
	 
	 
	 if(btnapplybrowser.isDisplayed()==false)
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
	
	
}
