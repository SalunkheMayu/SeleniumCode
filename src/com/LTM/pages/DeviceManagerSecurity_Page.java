package com.LTM.pages;


import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import com.PageFactory.utility;

public class DeviceManagerSecurity_Page extends utility
{
	public WebDriver wd;
    
	public DeviceManagerSecurity_Page(WebDriver wd) 
    {
 	   this.wd = wd;
 	  wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
 	   PageFactory.initElements(wd, this);
    }
    
    @FindBy(xpath = "//*[contains(text(), 'DM_GRP')]//preceding-sibling::span[@class='rtPlus']")
   	WebElement clickGrp;

   	@FindBy(xpath = "(//*[contains(text(), '192.168.1.151')])[2]")
   	WebElement clickNode;

   	@FindBy(xpath = "(//*[contains(text(), '192.168.1.158')])[1]")
   	WebElement clickNode198;

   	@FindBy(xpath = "//div[@id='btnExpandMenu']")
   	WebElement btnExpandMenu;
   	
   	// Security
   	
   	@FindBy (linkText = "Security")
    WebElement clicksecurity;
    
    @FindBy (linkText = "File System")
    WebElement clickfilesystem;
    
    //Write FIlter Setting
    
    @FindBy (linkText = "Write Filter Operations")
    WebElement clickwritefilter;
    
    @FindBy (xpath = "//label[@id='WinWriteFilterlblMenuWrtFlterSett']")
    WebElement tabwritefilterset;
    
    @FindBy (xpath = "//select[@id='WinWriteFilterddlWF']")
    WebElement ddwritefilterset;
    
    @FindBy (xpath = "//input[@id='WinWriteFilterbtnFWFSaveNew']")
    WebElement btnapplyWritefilterset;
    
    @FindBy (xpath = "//label[@id='WinWriteFilterlblMsgWF']")
    WebElement lblapplyWritefilterset;
    
    @FindBy (xpath = "//label[@id='WinWriteFilterlblMenuFBWFCnfgrtn']")
    WebElement tabwritefilterexclist;
    
    @FindBy (xpath = "//select[@id='WinWriteFilterddlWriteFilterSelection']")
    WebElement ddwritefilter;
    
    @FindBy (xpath = "//input[@id='WinWriteFiltertxtCombobox']")
    WebElement txtfilefolderpath;
    
    @FindBy (xpath = "//input[@id='WinWriteFilterbtnadd']")
    WebElement btnaddfolderpath;
    
    @FindBy (xpath = "//input[@id='WinWriteFilterbtnFWFSaveNew']")
    WebElement btnapplywritefilterexclist;
    
    @FindBy (xpath = "//label[@id='WinWriteFilterlblFBWFMsg']")
    WebElement lblapplywritefilterexclist;
    
    @FindBy (xpath = "//label[@id='WinWriteFilterlblMenuFBWFCacheSize']")
    WebElement tabcachesize;
    
    @FindBy (xpath = "//input[@id='WinWriteFiltertxtcatchsize']")
    WebElement txtmaxcachesize;
    
    @FindBy (xpath = "//input[@id='WinWriteFilterbtnFWFSaveNew']")
    WebElement btnapplycachesize;
    
    @FindBy (xpath = "//label[@id='WinWriteFilterlblMsgWF']")
    WebElement lblapplycachesize;
    
    
    @FindBy (xpath = "//label[@id='WinWriteFilterlblMenuCmmtCchFle']")
    WebElement tabComitcachefile;
    
    @FindBy (xpath = "//input[@id='WinWriteFilterbtnSyncNew']")
    WebElement btnsysnComitcachefile;
    
    @FindBy (xpath = "//input[@id='WinWriteFilterbtnFWFSaveNew']")
    WebElement btnapplynComitcachefile;
    
    @FindBy (xpath = "//label[@id='WinWriteFilterlblFBWFMsg']")
    WebElement lblsysnComitcachefile;
    
    @FindBy (xpath = "//label[@id='WinWriteFilterlblMenuOverlaySettings']")
    WebElement taboverlaysetiing;
    
    @FindBy (xpath = "//input[@id='WinOverlaySettingbtnFWFSave']")
    WebElement btnapplyoverlayset;
    
    @FindBy (xpath = "//label[@id='WinWriteFilterlblMsgWF']")
    WebElement lblapplyoverlayset;
    
    // Network
    
    @FindBy (linkText = "Network")
    WebElement clicknetwork;
    
    @FindBy (linkText = "Firewall")
    WebElement clickfirewall;
    
    @FindBy (xpath = "//label[@id='XPFirewall_lblMenuAddPort']")
    WebElement tabaddport;
    
    @FindBy (xpath = "//input[@id='XPFirewall_txtName']")
    WebElement txtnameaddport;
    
    @FindBy (xpath = "//input[@id='XPFirewall_txtFirewallPortNo']")
    WebElement txtportnoaddport;
    
    @FindBy (xpath = "//input[@id='XPFirewall_rbtnTCP']")
    WebElement rdTCP;
    
    @FindBy (xpath = "//input[@id='XPFirewall_rbtnUDP']")
    WebElement tdUDP;
    
    @FindBy (xpath = "//input[@id='XPFirewall_btnSavePortXP']")
    WebElement btnapplyaddport;
    
    @FindBy (xpath = "//label[@id='XPFirewall_lblPortMsg']")
    WebElement lblapplyaddport;
    
    @FindBy (xpath = "//input[@id='XPFirewall_btnBack']")
    WebElement btnreturnaddport;
    
    @FindBy (xpath = "//label[@id='XPFirewall_lblMenuAddProgram']")
    WebElement tabaddprogram;
    
    @FindBy (xpath = "//input[@id='XPFirewall_txtProgramName']")
    WebElement txtnameaddprogram;
    
    @FindBy (xpath = "//input[@id='XPFirewall_txtProgramPath']")
    WebElement txtpathaddprogram;
    
    @FindBy (xpath = "//input[@id='XPFirewall_btnSaveProgram']")
    WebElement btnapplyaddprogram;
    
    @FindBy (xpath = "//label[@id='XPFirewall_lblMsgProgram']")
    WebElement lblapplyaddprogram;
    
    @FindBy (xpath = "//input[@id='XPFirewall_btnProgramBack']")
    WebElement btnretuenaddprogram;
    
    // Proxy Setting
    @FindBy (linkText = "Proxy Settings")
    WebElement clickproxysetting;
    
    @FindBy (xpath = "//input[@id='WinProxySettingsbtnApplyIESettings']")
    WebElement btnapplyproxysetting;
    
    @FindBy (xpath = "//label[@id='WinProxySettingslblMsgPS']")
    WebElement lblapplyproxysetting;
    
    @FindBy (xpath = "(//label[@title='Software Restriction'])[3]")
    WebElement clicksoftrestriction;
    
    @FindBy (xpath = "//label[@for='XPRestrictionchkIntstall']//span[@class='onoffswitch-switch']")
    WebElement chkenabledisable;
    
    @FindBy (xpath = "//input[@id='XPRestrictionSoftwareRestrictionXP_btnSave']")
    WebElement btnapplyinstalluninstall;
    
    @FindBy (xpath = "//a[@id='XPRestrictionlibtnInstallationUninstallation']")
    WebElement tabinstalluninstall;
    
    @FindBy (xpath = "//a[@id='XPRestrictionlibtnApplicationRestriction']")
    WebElement tabapprestriction;
    
    @FindBy (xpath = "//a[@id='XPRestrictionlibtnBrowserRestriction']")
    WebElement tabbrowserrestriction;
    
    @FindBy (xpath = "//select[@id='XPRestrictionddlsoftwareRestictionAllowOrDeny']")
    WebElement ddsoftwarerestriction;
    
    @FindBy (xpath = "//input[@id='XPRestrictionSoftwareRestrictionXP_btnSave']")
    WebElement btnapplysoftrestriction;
    
    @FindBy (xpath = "//label[@id='XPRestrictionlblMsg']")
    WebElement lblapplysoftrestriction;
    
    @FindBy (xpath = "//select[@id='XPRestrictionblacklistBrowser_ddlBrowserName']")
    WebElement ddBrowsername;
    
    @FindBy (xpath = "//select[@id='XPRestrictionblacklistBrowser_RestrictionType']")
    WebElement ddrestrictiontype;
    
    @FindBy (xpath = "//input[@id='XPRestrictionSoftwareRestrictionXP_btnSave']")
    WebElement btnapplybrowserrestriction;
    
    @FindBy (xpath = "//label[@id='XPRestrictionlblMsg']")
    WebElement lblapplybrowserrestriction;
    
    @FindBy (xpath = "(//label[@title='System'])[2]")
    WebElement clicksystem;
    
    @FindBy (xpath = "(//label[@title='Deploy Certificate'])[2]")
    WebElement clickdeplycertificate;
    
    @FindBy (xpath = "//select[@id='WinInstallCertificateddlBrowseUpload']")
    WebElement ddsource;
    
    @FindBy (xpath = "//select[@id='WinInstallCertificateddlConnName']")
    WebElement ddconectionname;
    
    @FindBy (xpath = "//select[@id='WinInstallCertificateddlFile']")
    WebElement ddfilename;
    
    @FindBy (xpath = "//select[@id='WinInstallCertificateddlPositions']")
    WebElement ddcertificatetype;
    
    @FindBy (xpath = "//input[@id='WinInstallCertificatefileUpload']")
    WebElement clickupload;
    
    @FindBy (xpath = "//select[@id='WinInstallCertificateddlStoreName']")
    WebElement ddselectstorename;
    
    @FindBy (xpath = "//input[@id='WinInstallCertificatetxtCertTypePassword']")
    WebElement txtpasswordcertificatElement;
    
    @FindBy (xpath = "//input[@id='WinInstallCertificatebtnApply_DeployCertificate_XP']")
    WebElement btnapplydeplycertificate;
    
    @FindBy (xpath = "//label[@id='WinInstallCertificatelblMessage']")
    WebElement lblapplydeplycertificate;
    
    @FindBy (xpath = "(//label[@title='Port Settings'])[2]")
    WebElement clickpostsetting;
    
    @FindBy (xpath = "//input[@id='WinSecuritySettingscbxEnableFirewall']")
    WebElement chkebabledisablefirewall;
    
    @FindBy (xpath = "//input[@id='WinSecuritySettingscbxEnableParallelPort']")
    WebElement chkebabledisableparallerport;
    
    @FindBy (xpath = "//input[@id='WinSecuritySettingscbxEnableSerialPort']")
    WebElement chkebabledisableserialport;
    
    @FindBy (xpath = "//input[@id='WinSecuritySettingscbxUSBPort']")
    WebElement chkebabledisableUSBPort;
    
    @FindBy (xpath = "//input[@id='WinSecuritySettingscbxUSBMassStorage']")
    WebElement chkebabledisableUSBMASSStorage;
    
    /*@FindBy (xpath = "")
    WebElement ;
    
    @FindBy (xpath = "")
    WebElement ;
    
    */
    
    @FindBy (xpath = "//input[@id='WinSecuritySettingsbtnSaveSecuritySetting_JQ']")
    WebElement btnapplyposrtsetting;
    
    @FindBy (xpath = "//label[@id='WinSecuritySettingslblMsgs']")
    WebElement lblapplyposrtsetting;
    
    //Connection Management
    
    @FindBy (linkText = "Connection Management")
    WebElement clickconnmgmt;
    
    @FindBy (linkText = "Connections")
    WebElement clickconnection;
    
    @FindBy (xpath = "//input[@id='WinConbtnNewConnection']")
    WebElement btnaddnewconn;
    
    @FindBy (xpath = "//select[@id='WinConddlConnectionType']")
    WebElement ddconntype;
    
    @FindBy (xpath = "//input[@id='WinContxtConnectionName']")
    WebElement txtconnname;
    
    @FindBy (xpath = "//input[@id='WinConbtnNextCitrixConn']")
    WebElement btnnext;
    
    @FindBy (xpath = "//select[@id='WinConddlType']")
    WebElement ddcontype;
    
    @FindBy (xpath = "//input[@id='WinContxtStore']")
    WebElement txtstorename;
    
    @FindBy (xpath = "//input[@id='WinContxtConfigURL']")
    WebElement txtconfigURL;
    
    @FindBy (xpath = "//input[@id='WinContxtDesc']")
    WebElement txtdesc;
    
    @FindBy (xpath = "//input[@id='WinConbtnSaveCitrix1']")
    WebElement btnapplyconn;

    @FindBy (xpath = "//label[@id='WinConlblMsg_CitrixConn']")
    WebElement lblapplyconn;

    @FindBy (xpath = "//input[@id='WinConbtnCancelCitrix']")
    WebElement btncloseconn;

    @FindBy (xpath = "//input[@id='WinConbtnRefresh']")
    WebElement btnrefreshcon;

    @FindBy (xpath = "(//label[@title='VMView Global Settings'])[3]")
    WebElement clickVMGlobalset;
    
    @FindBy (xpath = "//input[@id='WinVMViewbtnVmViewGlobalApply']")
    WebElement btnapplyVMGlobalset;

    @FindBy (xpath = "//label[@id='WinVMViewlblVmViewGlobalMsg']")
    WebElement lblapplyVMGlobalset;
    
    SoftAssert softassert=new SoftAssert();
	utility sel= new utility();	
	
    
    
    
    public void Security() 
    {
    	Actions a= new Actions(wd);
    	
    	if(clicksecurity.isDisplayed()==false)	
    	  {
    		  clickGrp.click();
    		  clickNode.click();
    		  btnExpandMenu.click();
    		  
    	  }
    	clicksecurity.click();
    	clickfilesystem.click();
    	clickwritefilter.click();
    	
    	Select dropdown= new Select(ddwritefilterset);
    	dropdown.selectByVisibleText("Disable Write Filter");
    	
    	btnapplyWritefilterset.click();
    	
    	String retuen_Msg=lblapplyWritefilterset.getText();
    	softassert.assertEquals(retuen_Msg, "Write filter operation settings has been applied.");
    	
    	//Write Filter Excution List
    	
    	tabwritefilterexclist.click();
    	a.moveToElement(btnapplywritefilterexclist).release().build().perform();
    	btnapplywritefilterexclist.click();
    	
    	String retuen_Msg1=lblapplywritefilterexclist.getText();
    	softassert.assertEquals(retuen_Msg1, "Write filter operation information has been applied.");

    	//FBWF Cache size
    	a.moveToElement(tabcachesize).release().build().perform();
    	tabcachesize.click();
    	txtmaxcachesize.sendKeys("40");
    	btnapplycachesize.click();
    	
    	String retuen_Msg2=lblapplycachesize.getText();
    	softassert.assertEquals(retuen_Msg2, "Settings cannot be applied. FBWF is not Enabled on this device");
    	
    	/*//Commit Cache file
       a.moveToElement(tabComitcachefile).release().build().perform();
       tabComitcachefile.click();
       
       btnapplynComitcachefile.click();
       
       String retuen_Msg3=lblsysnComitcachefile.getText();
   	   softassert.assertEquals(retuen_Msg3, "Please select File");
    	*/
   	   //Overlay Setting 
    	a.moveToElement(taboverlaysetiing).release().build().perform();
   	   taboverlaysetiing.click();
   	   btnapplyoverlayset.click();
   	   
   	   String retuen_Msg4=lblapplyoverlayset.getText();
	   softassert.assertEquals(retuen_Msg4, "Write Filter Overlay Settings applied successfully");
	   
	   //Network
	   
	   clicknetwork.click();
	   clickfirewall.click();
	   tabaddport.click();
	   txtnameaddport.sendKeys("TCP24");
	   txtportnoaddport.sendKeys("2000");
	   btnapplyaddport.click();
	   
	   String retuen_Msg5=lblapplyaddport.getText();
	   softassert.assertEquals(retuen_Msg5, "Port information Settings applied successfully");
	   
	   //Add program  Add Program Settings applied successfully
	   
	   tabaddprogram.click();
	   txtnameaddprogram.sendKeys("IE");
	   txtpathaddprogram.sendKeys("C:\\Program Files\\Internet Explorer\\iexplore.exe");
	   btnapplyaddprogram.click();
	   
	   String retuen_Msg6=lblapplyaddprogram.getText();
	   softassert.assertEquals(retuen_Msg6, "Port information Settings applied successfully");
	   
	   //Proxy Setting
	   
	   clickproxysetting.click();
	   a.moveToElement(btnapplyproxysetting).release().build().perform();
	   btnapplyproxysetting.click();
	   
	   String retuen_Msg7=lblapplyproxysetting.getText();
	   softassert.assertEquals(retuen_Msg7, "Proxy Settings has been applied.");
	   
	   //Soft restriction 
	   
	   clicksoftrestriction.click();
	   chkenabledisable.click();
	   btnapplysoftrestriction.click();
	   
	   String retuen_Msg8=lblapplysoftrestriction.getText();
	   softassert.assertEquals(retuen_Msg8, "BlockInstallation Settings applied successfully");
	   
	   //App restriction 
 	   
	   tabapprestriction.click();
	   
	   Select dropdown1= new Select(ddsoftwarerestriction);
	   dropdown1.selectByIndex(0);
	   
	   a.moveToElement(btnapplysoftrestriction).release().build().perform();
	   
	   btnapplysoftrestriction.click();
	   
	   String retuen_Msg9=lblapplysoftrestriction.getText();
	   softassert.assertEquals(retuen_Msg9, "BlackList Settings applied successfully");
	   
	   // Browser Restriction
	   a.moveToElement(tabbrowserrestriction).release().build().perform();
	   tabbrowserrestriction.click();
	   
	   Select browser= new Select(ddBrowsername);
	   browser.selectByVisibleText("Google Chrome");
	   
	   Select res_type= new Select(ddrestrictiontype);
	   res_type.selectByVisibleText("Block all downloads");
	   
	   btnapplybrowserrestriction.click();
	  
	   String retuen_Msg10=lblapplybrowserrestriction.getText();
	   softassert.assertEquals(retuen_Msg10, "Browser Restrictions Settings applied successfully");
	   
	   //System
	   
	   clicksystem.click();
	   
	   //Deploy Certificate
	   clickdeplycertificate.click();
	   
	   Select source= new Select(ddsource);
	   source.selectByIndex(1);
	   
	   Select c_name= new Select(ddconectionname);
	   c_name.selectByIndex(1);
	   
	   Select f_name= new Select(ddfilename);
	   f_name.selectByIndex(1);
	   
	   //f_name.selectByVisibleText("Shradha-07.pfx"); //Shradha-07.pfx
	   
	   Select c_type= new Select(ddcertificatetype);
	   c_type.selectByVisibleText("PFX"); //Shradha-07.pfx
	  
	   
	   Select s_Name= new Select(ddselectstorename);
	   s_Name.selectByVisibleText("Trusted People");
	   
	   if(txtpasswordcertificatElement.isEnabled()==true)
	   {
		   txtpasswordcertificatElement.sendKeys("Shradha@123");
	   }
	   //
	   
	   btnapplydeplycertificate.click();
	   String retuen_Msg11=btnapplydeplycertificate.getText();
	   softassert.assertEquals(retuen_Msg11, "Deploy Certificate Settings applied successfully");

	   //Port 	Setting
	   clickpostsetting.click();
        
	   if(chkebabledisablefirewall.isSelected()==false)
	   {
		   chkebabledisablefirewall.click();
	   }

	   if(chkebabledisableparallerport.isSelected()==false)
	   {
		   chkebabledisableparallerport.click();
	   }
	   
	   if(chkebabledisableserialport.isSelected()==false)
	   {
		   chkebabledisableserialport.click();
	   }
	   	

	   if(chkebabledisableUSBPort.isSelected()==false)
	   {
		   chkebabledisableUSBPort.click();
	   }
    	

	   if(chkebabledisableUSBMASSStorage.isSelected()==false)
	   {
		   chkebabledisableUSBMASSStorage.click();
	   }
    	
	   btnapplyposrtsetting.click();
	   
	   String retuen_Msg12=lblapplyposrtsetting.getText();
	   softassert.assertEquals(retuen_Msg12, "Port Settings Settings applied successfully");
	   
	   //Conn Mgmt
	   
	   clickconnmgmt.click();
	   clickconnection.click();
	   
	   btnaddnewconn.click();
	   
	   Select Con_type= new Select(ddconntype);
	   Con_type.selectByVisibleText("Citrix Workspace App");
	   
	   txtconnname.sendKeys("Citrix"); 
	   
	   btnnext.click();
	   a.moveToElement(btnapplyconn).release().build().perform();
	   txtstorename.sendKeys("StoreNew");
	   txtconfigURL.sendKeys("https://xd718server.vdi.com");
	   txtdesc.sendKeys("");
	   
	   btnapplyconn.click(); //ASD Settings applied successfully
	    
	   String retuen_Msg13=btnapplyconn.getText();
	   if(retuen_Msg13.contains("Settings applied successfully")==true)
	   {
		   System.out.println("Connection Done Sucessfuly");
	   }
	   
	   //VMView GLobal Setting
	   
	   clickVMGlobalset.click();
	   btnapplyVMGlobalset.click();
       
	   String retuen_Msg14=lblapplyVMGlobalset.getText();
	   softassert.assertEquals(retuen_Msg14, "VmView Global Settings applied successfully");
      
	   softassert.assertAll();
	}
}
