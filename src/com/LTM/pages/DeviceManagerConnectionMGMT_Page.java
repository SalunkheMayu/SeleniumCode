package com.LTM.pages;


import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.PageFactory.utility;

public class DeviceManagerConnectionMGMT_Page extends utility
{
	public WebDriver wd;
    
	public DeviceManagerConnectionMGMT_Page(WebDriver wd) 
    {
 	   this.wd = wd;
 	   wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
 	   PageFactory.initElements(wd, this);
    }
    
    SoftAssert softassert=new SoftAssert();
	utility sel= new utility();	
    @FindBy(xpath = "//*[contains(text(), 'DM_GRP')]//preceding-sibling::span[@class='rtPlus']")
   	WebElement clickGrp;

   	@FindBy(xpath = "(//*[contains(text(), '192.168.1.151')])[2]")
   	WebElement clickNode;
   	
   	@FindBy(xpath = "//div[@id='btnExpandMenu']")
   	WebElement btnExpandMenu;
   	
   	@FindBy (linkText = "Connection Management")
   	WebElement ClickconcMGMT;
   	
	@FindBy (linkText = "Connections")
   	WebElement Clickconn;
	
	// Citrix
	
	@FindBy (xpath = "//input[@id='WinConbtnNewConnection']")
   	WebElement btnnewconn;
	
	@FindBy (xpath = "//select[@id='WinConddlConnectionType']")
   	WebElement ddcontype;
	
	@FindBy (xpath = "//input[@id='WinContxtConnectionName']")
   	WebElement txtconnname;
	
	@FindBy (xpath = "//input[@id='WinConbtnNextCitrixConn']")
   	WebElement btnnextconn;
	
	
	@FindBy (xpath = "//input[@id='WinContxtStore']")
   	WebElement txtstorename; //StoreNew
	
	@FindBy (xpath = "//input[@id='WinContxtConfigURL']")
   	WebElement txtconfugURL;
	
	@FindBy (xpath = "//input[@id='WinConbtnSaveCitrix1']")
   	WebElement btnapplycitrixconn;
	
	@FindBy (xpath = "//label[@id='WinConlblMsg_CitrixConn']")
   	WebElement lblapplycitrixconn;
	
	@FindBy (xpath = "//input[@id='WinConbtnCancelCitrix']")
   	WebElement btnclosecitrix;
	
	//Custom Excutble conn
	
	@FindBy (xpath = "//input[@id='WinContxtPathForCustExec']")
   	WebElement txtpath;
	
	@FindBy(xpath = "//input[@id='WinConChkShortDesktop']")
	WebElement chkcreatedesktopshortCustom;
	
	@FindBy(xpath = "//input[@id='WinContxtArgumentsForCustExec']")
	WebElement txtargument;
	
	
	@FindBy (xpath = "//input[@id='WinConbtnSaveCustom']")
   	WebElement btnapplyCUstomExe;
	
	@FindBy (xpath = "//label[@id='WinConlblMessageForCustExec']")
   	WebElement lblapplyCUstomExe;
	
	@FindBy (xpath = "//input[@id='WinConbtnCancelCustom']")
   	WebElement btncloseCUstomExe;
	
	
	//Browser
	
	@FindBy (xpath = "//select[@id='WinddlBrowserType']")
   	WebElement ddbrowsertype;
	
	@FindBy (xpath = "//input[@id='WinContxtConfigURLForIE']")
   	WebElement txtconfigURL;
	
	@FindBy(xpath = "//input[@id='WinConchkDesktop']")
	WebElement chkcreatedesktopshortBrowser;
	
	@FindBy (xpath = "//input[@id='WinConbtnSaveIEBrowser']")
   	WebElement btnapplybrowser;
	
	@FindBy (xpath = "//label[@id='WinConlblMessageForIE']")
   	WebElement lblapplybrowser;
	
	@FindBy (xpath = "//input[@id='WinConbtnCancelIEBrowser']")
   	WebElement btnclosebrowser;
	
	//RDP
	
	@FindBy (xpath = "//input[@id='WinContxtIPHostName']")
   	WebElement txtIHOST;
	
	@FindBy (xpath = "//input[@id='WinConcbxAlwaysAskForCredential']")
   	WebElement chkalwaysElementaskpassword;
   	
	@FindBy (xpath = "//input[@id='WinConbtnSaveRDP']")
   	WebElement btnapplyRDP;
	
	@FindBy (xpath = "//label[@id='WinConlblMsgForRDP']")
   	WebElement lblapplyRDP;
	
	@FindBy (xpath = "//input[@id='WinConbtnRDPCAncel']")
   	WebElement btnCloseRDP;
	
	//Tera Client
	
	@FindBy (xpath = "//input[@id='WinContxtHostnameTD']")
   	WebElement txtHostname;
	
	@FindBy (xpath = "//input[@id='WinContxtDomainTD']")
   	WebElement txtDomain;
	
	@FindBy (xpath = "//input[@id='WinContxtUsernameTD']")
   	WebElement txtusername;
	
	@FindBy (xpath = "//input[@id='WinContxtPasswordTD']")
   	WebElement txtpassword;
	
	@FindBy (xpath = "//input[@id='WinConcbxcreateshrtcutdsk']")
   	WebElement chkcreatedesktop;
	
	@FindBy (xpath = "//input[@id='WinConbtnsaveTeradici']")
   	WebElement btnapplyteraclient;
	
	@FindBy (xpath = "//label[@id='WinConlblMessageForTD']"	)
   	WebElement lblapplyteraclient;
	
	@FindBy (xpath = "//input[@id='WinConbtncancelTeradici']")
   	WebElement btncloseteraclient;
	
	//Vmware Connection - 
	
	@FindBy (xpath="//input[@id='WinContxtHostname']") // https://vmwareserver8.vdi.com
	WebElement txtConnectionVmwareHostname;

	@FindBy (xpath="//input[@id='WinContxtLogin']") // Administrator
	WebElement txtConnectionVmwareLogin;

	@FindBy (xpath="//input[@id='WinContxtPassword']") // Verixo#123
	WebElement txtConnectionVmwarePassword;

	@FindBy (xpath="//input[@id='WinContxtDoamin']") // vdi
	WebElement txtConnectionVmwareDomain;

	@FindBy (xpath="//select[@id='WinConddApplicationName']") // Application Name or Desktop Name
	WebElement ddConnectionVmwareType;

	@FindBy (xpath="//input[@id='WinContxtDesktopName']") // Application Name: 2012 Mozilla Firefox, 2012 Skype, 2012 WordPad, 2016Windows Media Player, 2016WordPad

	//Desktop Name: Desktop1, Desktop Server 2012, Windows2016
	WebElement txtConnectionVmwareDesktopName;

	@FindBy (xpath="//select[@id='WinConddReconnectBehaviour']") // Do not ask to reconnect and do not automatically reconnect
	WebElement ddConnectionVmwareReconnectBehavior;

	@FindBy (xpath="//select[@id='WinConddlVMWProperty']") // PCOIP protocol setting
	WebElement ddConnectionVmwareVmwProtocol;

	@FindBy (xpath="//input[@id='WinConchkDesktopForVmware']")
	WebElement chkConnectionVmwareCreateDeskShortcut;

	@FindBy (xpath="//input[@id='WinConbtnSaveVMView']")
	WebElement btnConnectionVmwareApply;

	@FindBy (xpath="//input[@id='WinConbtnCancelVMView']")
	WebElement btnConnectionVmwareClose;

	@FindBy (xpath="//label[@id='WinConlblMessageForVmware']") // ConnectionName Settings applied successfully
	WebElement lblConnectionVmware;
	
	//VMVIew Global Setting
	
	@FindBy (linkText = "VMView Global Settings")
   	WebElement clickVMViewGlobalSet;
	
	@FindBy (xpath = "//select[@id='WinVMViewddlConfigureSSL']")
   	WebElement ddConfugareSSL;
	
	@FindBy (xpath = "//select[@id='WinVMViewddlNetworkCondition']"	)
   	WebElement ddnetworkcondition;
	
	@FindBy (xpath = "//input[@id='WinVMViewbtnVmViewGlobalApply']")
   	WebElement btnapplyVMViewglobalset;
	
	@FindBy (xpath = "//label[@id='WinVMViewlblVmViewGlobalMsg']"	)
   	WebElement lblapplyVMViewglobalset; //
	
	//Software Deployment
	
	@FindBy (linkText = "Software Deployment")
   	WebElement Clicksoftdeplyment;
	
	@FindBy (linkText =  "File Transfer"	)
   	WebElement Clickfiletransfer;
	
	@FindBy (xpath = "//label[@id='WinFileTransferlnkbtnfile']")
   	WebElement tabfiletranfer;
	
	@FindBy (xpath = "//input[@id='WinFileTransfertxtTargetFolderPath']")
   	WebElement txttargetfolderpath_File;
	
	@FindBy (xpath = "//select[@id='winFileTransferSourcedrp']")
   	WebElement ddsourcefiletransfer;
	
	@FindBy (xpath = "//select[@id='winFileTransferSourceTypedrp']")
   	WebElement ddsourcetypetransfertype;
	
	@FindBy (xpath = "//select[@id='winFileTransferNamedrp']")
   	WebElement ddsourcefiletransfertype;
	
	@FindBy (xpath = "//select[@id='winFileTransferNamedrp']")
   	WebElement ddfinename;
	
	@FindBy (xpath = "//input[@id='WinFileTransferidRebootRequired']")
   	WebElement chkskip5step;

	
	@FindBy (xpath = "//input[@id='WinFileTransferbtnFTApplyJQ']")
   	WebElement btnapplyfiletransfer;

	
	@FindBy (xpath = "//label[@id='WinFileTransferlblMsg']")
   	WebElement lblapplyfiletransfer;

	@FindBy (xpath = "//label[@id='WinFileTransferlnkbtnfolder']")
   	WebElement tabfoldertransfer;

	@FindBy (xpath = "//input[@id='WinFileTransfertxtTargetFolderPath']")
   	WebElement txttargetfolderpath_Folder;
	
	@FindBy (xpath = "//select[@id='winFileTransferSourcedrp']")
   	WebElement ddsource_Folder;

	@FindBy (xpath = "//select[@id='winFileTransferSourceTypedrp']")
   	WebElement ddsourcetype_Folder;
	
	@FindBy (xpath = "//select[@id='winFileTransferNamedrp']")
   	WebElement ddsourceFilename_Folder;

	@FindBy (xpath = "//input[@id='WinFileTransferbtnFTApplyJQ']")
   	WebElement btnapplyfoldertransfer;
	
	
	@FindBy (xpath = "//input[@id='WinFileTransferchkBatchExecution']")
   	WebElement chkbatchExecution;

	@FindBy (xpath = "//label[@id='WinFileTransferlblMsg']")
   	WebElement lblapplyfoldertransfer;
	
	//Import File
	
	@FindBy (linkText = "Import File")
   	WebElement clickimportfile;

	@FindBy (xpath = "//select[@id='WindowsImportFileddlSourceType']")
   	WebElement ddSourcetype_importfile;
	
	@FindBy (xpath = "//select[@id='WindowsImportFileddlSource']")
   	WebElement ddsource_importfile; //

	@FindBy (xpath = "//input[@id='WindowsImportFilePathTxt']")
   	WebElement txtfilepath;
	
	@FindBy (xpath = "//input[@id='btnApplyWindowsImportFile']")
   	WebElement btnapplyimportfile;
	
	@FindBy (xpath = "//label[@id='WindowsImportFile_lblMsg']")
   	WebElement lblapplyimportfile;
	
	@FindBy (xpath = "//label[@id='WindowsImportFile_lilblImportFolder']")
   	WebElement tabimportfolder;
	
	@FindBy (xpath = "//select[@id='WindowsImportFileddlSourceType']")
   	WebElement ddsourcetype_Importfolder;
	
	@FindBy (xpath = "//select[@id='WindowsImportFileddlSource']")
   	WebElement ddsource_Importfolder;
	
	@FindBy (xpath = "//input[@id='txtWindowsImportFolderPath']")
   	WebElement txtfolderpath_Importfolder;
	
	@FindBy (xpath = "//input[@id='btnApplyWindowsImportFile']")
   	WebElement btnapplyimportfolder;
	
	@FindBy (xpath = "//label[@id='WindowsImportFile_lblMsg']")
   	WebElement lblapplyimportfolder;
	
	@FindBy (xpath = "//label[@id='WindowsImportFile_lilblFolderSync']")
   	WebElement tabfoldersync;
	
	@FindBy (xpath = "//input[@id='WindowsImportFile_txtFolderSyncPath']")
   	WebElement txtfoldersysncpath;
	
	@FindBy (xpath = "//input[@id='WindowsImportFile_ADDFolderSyncPath']")
   	WebElement btnaddfoldersysncpath;
	
	@FindBy (xpath = "//input[@id='WindowsImportFile_btnFolderSyncApply']")
   	WebElement btnapplyfoldersysnc;
	
	@FindBy (xpath = "//label[@id='WindowsImportFilelblMessage']")
   	WebElement lblapplyfoldersysnc;//Root Folder Structure Settings applied successfully
	
	//Software and Path Install
	
	@FindBy (linkText = "Software & Patch Install/Uninstall")
   	WebElement clicksoftwareandpathinstall;
	
	@FindBy (xpath = "//input[@aria-controls='XPSoftwareUpgrade_tblHeaderInstalledSoft']")
   	WebElement txtseachbar;
	
	@FindBy (xpath = "//input[@id='XPSoftwareUpgrade_btnInstallDelete']")
   	WebElement btnUninstallsoftware;
	
	
	
	@FindBy (xpath = "//input[@id='XPSoftwareUpgrade_btnNewInstall']")
   	WebElement btnNewInstallsoftware;
	
	@FindBy (xpath = "//select[@id='XPSoftwareUpgrade_ddlSourceType']")
   	WebElement ddSourcetype_SoftwareInstall;
	
	@FindBy (xpath = "//select[@id='XPSoftwareUpgrade_ddlSource']")
   	WebElement ddSource_SoftwareInstall;
	
	@FindBy (xpath = "//select[@id='XPSoftwareUpgrade_ddlFile']")
   	WebElement ddFile_SoftwareInstall;
	
	@FindBy (xpath = "//input[@id='btnVldtCnnctnsoftwarePatechXP']")
   	WebElement btnValidateconn; //Connection validated successfully.
	
	@FindBy (xpath = "//label[@id='lblErrorMsgForAddConnection']")
   	WebElement lblValidateconn;
	
	@FindBy (xpath = "//input[@id='XPSoftwareUpgrade_txtParameter']")
   	WebElement txtparameter;
	
	@FindBy (xpath = "//input[@id='XPSoftwareUpgrade_btnInstall']")
   	WebElement btnapplySoftwareInstall;
	
	@FindBy (xpath = "//label[@id='XPSoftwareUpgrade_lblMsgs']")
   	WebElement lblapplySoftwareInstall; // It contain 'is scheduled to add'
	
	@FindBy (xpath = "//input[@id='XPSoftwareUpgrade_btnCancels']")
	WebElement btncloseSoftInstall;

	public void Con_Citix() 
	{
		Actions a= new Actions(wd); 
		if(ClickconcMGMT.isDisplayed())
		{
			
		}
		else
		{
		  clickGrp.click();
		  clickNode.click();
		  btnExpandMenu.click();		  
		}
	  ClickconcMGMT.click();
	  Clickconn.click();
	  btnnewconn.click();
	  
	  Select dropdown=new Select(ddcontype);
	  dropdown.selectByIndex(1);
	  
	  txtconnname.sendKeys("Citrix");
	  
	  btnnextconn.click();
	  
	  a.moveToElement(btnapplycitrixconn).release().build().perform();
	  
	  txtstorename.sendKeys("Citrix");
	  txtconfugURL.sendKeys("https://xd718server.vdi.com");
	  
	  btnapplycitrixconn.click();
	  
	  String Return_Msg=lblapplycitrixconn.getText(); //Citrix Settings applied successfully
	  softassert.assertEquals(Return_Msg, "Launch Command Settings applied successfully");
	  btnclosecitrix.click();
	}
	
	public void Con_CustomExeCon()
	{
		btnnewconn.click();
		Actions a=new Actions(wd);
		Select dropdown=new Select(ddcontype);
		dropdown.selectByIndex(2);
		  
		txtconnname.sendKeys("CustomExeCon");
		
		btnnextconn.click();
		  
		txtpath.sendKeys("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
		chkcreatedesktopshortCustom.click();
		txtargument.sendKeys("incognito");
		a.moveToElement(btnapplyCUstomExe).release().build().perform();
		btnapplyCUstomExe.click();

		String Return_Msg = lblapplyCUstomExe.getText(); // Citrix Settings applied successfully
		softassert.assertEquals(Return_Msg, "CustomExeCon Settings applied successfully");
		btncloseCUstomExe.click();
	}

	/*public void Con_Browser()

	{
		btnnewconn.click();

		Select dropdown = new Select(ddcontype);
		dropdown.selectByIndex(3);
		txtconnname.sendKeys("Browser");
		
		btnnextconn.click();
		
		txtconfigURL.sendKeys("http://www.google.com");
        
		chkcreatedesktopshortBrowser.click();
        
		btnapplybrowser.click();
		
		String Return_Msg = lblapplybrowser.getText(); // Citrix Settings applied successfully
		softassert.assertEquals(Return_Msg, "Custom Settings applied successfully");
		btnclosebrowser.click();
		
	}
*/
	
	public void Con_RDP()
	{
		Actions a= new Actions(wd);		
		btnnewconn.click();

		Select dropdown = new Select(ddcontype);
		dropdown.selectByIndex(4);
		txtconnname.sendKeys("RDP_New");
		
		btnnextconn.click();
		a.moveToElement(btnapplyRDP).release().build().perform();
		
		txtIHOST.sendKeys("192.168.1.151");
		btnapplyRDP.click();
		
		String Return_Msg = lblapplyRDP.getText(); // Citrix Settings applied successfully
		softassert.assertEquals(Return_Msg, "RDP_New Settings applied successfully");
		btnCloseRDP.click();
		
	}
   
	public void Con_Teradici()
	{
		Actions a= new Actions(wd);		
		btnnewconn.click();

		Select dropdown = new Select(ddcontype);
		dropdown.selectByIndex(5);
		txtconnname.sendKeys("Teradici");
		
		btnnextconn.click();
		
		a.moveToElement(btnapplyteraclient).release().build().perform();
		
		txtHostname.sendKeys("teraagent.vdi.com");
		txtDomain.sendKeys("vdi");
		txtusername.sendKeys("Administrator");
		txtpassword.sendKeys("Verixo#123");
		chkcreatedesktop.click();
		btnapplyteraclient.click();
		
		String Return_Msg =lblapplyteraclient.getText(); // Citrix Settings applied successfully
		softassert.assertEquals(Return_Msg, "Teradici Settings applied successfully");
		
		btncloseteraclient.click();
	}
	
	public void Con_VMWare()
	{
		Actions a= new Actions(wd);		
		btnnewconn.click();

		Select dropdown = new Select(ddcontype);
		dropdown.selectByIndex(6);
		txtconnname.sendKeys("VMWare");
		
		btnnextconn.click();
        
		txtConnectionVmwareHostname.sendKeys("https://vmwareserver8.vdi.com");
		txtConnectionVmwareLogin.sendKeys("Administrator");
		txtConnectionVmwarePassword.sendKeys("Verixo#123");
		
		a.moveToElement(chkConnectionVmwareCreateDeskShortcut).release().build().perform();
		
		txtConnectionVmwareDomain.sendKeys("vdi");
		
		Select dropdown1=new Select(ddConnectionVmwareType);
		dropdown1.selectByIndex(1);
		
		txtConnectionVmwareDesktopName.sendKeys("Windows2016");
		
		a.moveToElement(btnConnectionVmwareApply).release().build().perform();
		
		chkConnectionVmwareCreateDeskShortcut.click();
		
		btnConnectionVmwareApply.click();
		
		String Return_Msg =lblConnectionVmware.getText(); // Citrix Settings applied successfully
		softassert.assertEquals(Return_Msg, "VMWare Settings applied successfully");
		
	//	a.moveToElement(btnConnectionVmwareClose).release().build().perform();
		btnConnectionVmwareClose.click();
	//	btnConnectionVmwareClose		
		
	}
	
   public void VMViewGlobal() 
   {
	   
		if (clickVMViewGlobalSet.isDisplayed()) 
		{
          
		} else 
		{
         clickGrp.click();
         clickNode.click();
         btnExpandMenu.click();
         ClickconcMGMT.click();
		}
	clickVMViewGlobalSet.click();
    
	Select dropdown = new Select(ddConfugareSSL);
	dropdown.selectByIndex(1);
	
	Select dropdown1 = new Select(ddnetworkcondition);
	dropdown1.selectByIndex(0);
	
	btnapplyVMViewglobalset.click();
	
	String return_msg=lblapplyVMViewglobalset.getText();
    Assert.assertEquals(return_msg, "VmView Global Settings applied successfully");
    
   }

   public void SoftwareDeploment(String F_Path,String Fo_Path,String Filep_Import, String Folder_Import,String Sync_Path)
   {
	  // if (Clicksoftdeplyment.isDisplayed()) 
		//{
         
		//} else 
		//{
        //clickGrp.click();
        //clickNode.click();
        //btnExpandMenu.click();
        //ClickconcMGMT.click();
		//} 
	   Clicksoftdeplyment.click();
	   
	   //File Transfer
	   Clickfiletransfer.click();
	   txttargetfolderpath_File.sendKeys(F_Path);
	   
	   Select dropdown = new Select(ddsourcefiletransfer);
		dropdown.selectByIndex(1);
		
		Select dropdown1 = new Select(ddsourcetypetransfertype);
		dropdown1.selectByIndex(1);
	   
		Select dropdown2 = new Select(ddsourcefiletransfertype);
		dropdown2.selectByIndex(1);
		
		btnapplyfiletransfer.click();
		
		String return_msg=lblapplyfiletransfer.getText();
		
		if(return_msg.contains("Settings applied successfully"))
		{
		softassert.assertTrue(true);
		}
		// Folder Tranfer
		tabfoldertransfer.click();
		txttargetfolderpath_Folder.sendKeys(Fo_Path);
		
		Select dropdown3 = new Select(ddsource_Folder);
		dropdown3.selectByIndex(1);
		
		Select dropdown4 = new Select(ddsourcetype_Folder);
		dropdown4.selectByIndex(1);
		
		Select dropdown5 = new Select(ddsourceFilename_Folder);
		dropdown5.selectByIndex(1);
		
		chkbatchExecution.click();
		
		btnapplyfoldertransfer.click();
		
		String return_msg1=lblapplyfoldertransfer.getText();
		
		if(return_msg1.contains("Settings applied successfully"))
		{
		softassert.assertTrue(true);
		}
		//Import File
		
		clickimportfile.click();
		
		Select dropdown6 = new Select(ddSourcetype_importfile);
		dropdown6.selectByIndex(0);
        
		Select dropdown7 = new Select(ddsource_importfile);
		dropdown7.selectByIndex(1);
		
		txtfilepath.sendKeys(Filep_Import);
	     
		btnapplyimportfile.click();
		
		String return_msg2=lblapplyimportfile.getText();
		softassert.assertEquals(return_msg2, "Import File has been applied.");
		
		//import Folder
		
		tabimportfolder.click();
		
		Select dropdown8 = new Select(ddsourcetype_Importfolder);
		dropdown8.selectByIndex(0);

		Select dropdown9 = new Select(ddsource_Importfolder);
		dropdown9.selectByIndex(1);
		
		txtfolderpath_Importfolder.sendKeys(Folder_Import);		
		
		btnapplyimportfolder.click();
		
		String return_msg3=lblapplyimportfolder.getText();
		softassert.assertEquals(return_msg3, "Import Folder has been applied.");
		
		//Folder sysnc
		
		tabfoldersync.click();
		txtfoldersysncpath.sendKeys(Sync_Path);
		btnaddfoldersysncpath.click();
		
		btnapplyfoldersysnc.click();
		
		String return_msg4=lblapplyfoldersysnc.getText();
		softassert.assertEquals(return_msg4, "Root Folder Structure Settings applied successfully");
		
		//Software and path Install
		
		clicksoftwareandpathinstall.click();
		
		btnNewInstallsoftware.click();
		
		Select dropdown10 = new Select(ddSourcetype_SoftwareInstall);
		dropdown10.selectByIndex(0);
		
		Select dropdown11 = new Select(ddSource_SoftwareInstall);
		dropdown11.selectByIndex(1);
		
		Select dropdown12 = new Select(ddFile_SoftwareInstall);
		dropdown12.selectByIndex(1);
		
		btnValidateconn.click();
		
		utility.isVisible(lblValidateconn, wd, 10);
		
		String return_msg5=lblValidateconn.getText();
		
		if(return_msg5.contains("Connection validated successfully"))
		{
			txtparameter.clear();
			txtparameter.sendKeys("/quiet");
			btnapplySoftwareInstall.click();
			
			String return_msg6=lblapplySoftwareInstall.getText();
			if(return_msg6.contains("is scheduled to add"))
			{
			softassert.assertTrue(true);
			}
		}
		
		else 
		{
		  System.out.println("New Install Task Gets Fail");
		  
		}
		btncloseSoftInstall.click();
		softassert.assertAll();
   }

}
