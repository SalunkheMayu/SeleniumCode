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

	public class TemplateMangerAdministration_Page extends utility 
	{
		public WebDriver wd;
		
	       
		public TemplateMangerAdministration_Page(WebDriver wd) 
	       {
	    	   this.wd = wd;
	    	   wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    	   PageFactory.initElements(wd, this);
	       }


	       
	    @FindBy(xpath = "//*[contains(text(), 'DM_GRP')]//preceding-sibling::span[@class='rtPlus']")
	   	WebElement clickGrp;

	   	@FindBy(xpath = "(//*[contains(text(), '192.168.1.151')])[1]")
	   	WebElement clickNode;

	   	@FindBy(xpath = "(//*[contains(text(), '192.168.1.158')])[1]")
	   	WebElement clickNode198;

	   	@FindBy(xpath = "//div[@id='btnExpandMenu']")
	   	WebElement btnExpandMenu;
	   
	    @FindBy (linkText = "Administration")
	    WebElement Clickadministration;

	    // Application Command
	    @FindBy (linkText = "Application Command")
	    WebElement Clickapplicationcommand;
	    
	    @FindBy (xpath = "//label[@id='WinAPPCMDlblapplication']")
	    WebElement tabApplication;
	    
	    @FindBy (xpath = "//input[@id='WinAPPCMDtxtAppsPath']")
	    WebElement txtapplicationpath;
	    
	    @FindBy (xpath = "//input[@id='WinAPPCMDtxtParameters']")
	    WebElement txtparameter;
	    
	    @FindBy (xpath = "//input[@id='WinAPPCMDchbxWarnUser']")
	    WebElement chkalertuser;
	    
	    @FindBy (xpath = "//input[@id='WinAPPCMDbtnApplyRDP']")
	    WebElement btnapplyapplication;
	    
	    @FindBy (xpath = "//label[@id='WinAPPCMDlblMsg']")
	    WebElement lblapplyapplication; //Launch Application Settings applied successfully
	    
	    @FindBy (xpath = "//label[@id='WinAPPCMDlblcommand']")
	    WebElement tabCommand;
	    
	    @FindBy (xpath = "//input[@id='WinAPPCMDtxtCommand']")
	    WebElement txtcommand;
	    
	    @FindBy (xpath = "//select[@id='WinAPPCMDddlTimeOut']")
	    WebElement ddtimeout;
	    
	    @FindBy (xpath = "//input[@id='WinAPPCMDbtnApplyRDP']")
	    WebElement btnapplyCommand;
	    
	    @FindBy (xpath = "//label[@id='WinAPPCMDlblMsg']")
	    WebElement lblapplyCommand;//Launch Command Settings applied successfully
	   
	    //Env Variable
	    
	    @FindBy (linkText = "Environment Variable")
	    WebElement clickEnvironmentVariable;
	    
	    @FindBy (xpath = "//input[@id='XPEnvironmentVari_btnNew']")
	    WebElement btnnewEnvVariable;
	    
	    @FindBy (xpath = "//input[@id='XPEnvironmentVari_TxtVariableName']")
	    WebElement txtVariablename;
	    
	    @FindBy (xpath = "//input[@id='XPEnvironmentVari_txtValue']")
	    WebElement txtvalue;
	    
	    @FindBy (xpath = "//input[@id='XPEnvironmentVari_btnEnvVarApplye']")
	    WebElement btnapplyEnvVariable;
	    
	    @FindBy (xpath = "//label[@id='XPEnvironmentVari_lblMsg']")
	    WebElement lblapplyEnvVariable;
	    
	    @FindBy (xpath = "//input[@id='XPEnvironmentVari_btnClose']")
	    WebElement btnclosEncvariable;
	    
	    
	    @FindBy (xpath = "//input[@id='XPEnvironmentVari_btnDeleteEnv']")
	    WebElement btndeleteEncvariable;
	    
	    //Performance MGMT
	    
	    @FindBy (linkText = "Performance Management")
	    WebElement clickperformancemgmt;
	    
	    //History Cleaner
	    
	    @FindBy (linkText = "History Cleaner")
	    WebElement clickHistoryCleaner;
	    
	    @FindBy (xpath = "//label[@id='XPWebBrowser_lblMenuWbBrwsr']")
	    WebElement tabWebbrowser;
	    
	    @FindBy (xpath = "//select[@id='XPWebBrowser_ddlBrowserInstalled']")
	    WebElement ddBrowserInstall;
	    
	    @FindBy (xpath = "//input[@id='XPWebBrowser_cbxWebBrowserHistory']")
	    WebElement chkHistory;
	    
	    @FindBy (xpath = "//input[@id='XPWebBrowser_cbxWebBrowserTemp']")
	    WebElement chkTempfile;
	    
	    @FindBy (xpath = "//input[@id='XPWebBrowser_btnSavebrowser']")
	    WebElement btnapplyWebBrowser;
	    
	    @FindBy (xpath = "//input[@id='XPWebBrowser_cbxWebBrowserHistory']")
	    WebElement chkhistory;
	    
	    @FindBy (xpath = "//input[@id='XPWebBrowser_cbxWebBrowserTemp']")
	    WebElement chktempfile;
	    
	    @FindBy (xpath = "//label[@id='XPWebBrowser_lblMSg_Success']")
	    WebElement lblapplyWebBrowser;
	    
	    @FindBy (xpath = "//label[@id='XPWebBrowser_lblMenuWndwsClnr']")
	    WebElement tabwindowsCleaner;
	    
	    @FindBy (xpath = "//input[@id='XPWindowsCleaner_cbxClearDocument']")
	    WebElement chkrecentdochistory;
	    
	    @FindBy (xpath = "//input[@id='XPWindowsCleaner_cbxEmptyClipboard']")
	    WebElement chkemptyclipboard;
	    
	    @FindBy (xpath = "//input[@id='XPWindowsCleaner_cbxEmptyRecycleBin']")
	    WebElement chkemptyrecyclebin;
	    
	    @FindBy (xpath = "//input[@id='XPWindowsCleaner_cbxDeleteWindowsTempFiles']")
	    WebElement chkdeletewindowstempfile;
	    
	    @FindBy (xpath = "//input[@id='XPWindowsCleaner_btnApplyCleaner1']")
	    WebElement btnapplywindowscleaner;
	    
	    @FindBy (xpath = "//label[@id='XPWindowsCleaner_lblMsg_winCle']")
	    WebElement lblapplywindowscleaner;
	    
	    //Registry Backup Restore
	    
	    @FindBy (linkText = "Registry Backup Restore")
	    WebElement ClickRegistryBackupRestore;
	    
	    @FindBy(xpath = "//input[@id='XPRegistoryBackUpObt_regtxt_1']")
	    WebElement txtregistrybackup;
	    
	    @FindBy (xpath = "//label[@id='XPRegistrybackup_lblviewregistrybackup']")
	    WebElement tabObtainregistory;
	    
	    @FindBy (xpath = "//select[@id='XPRegistoryBackUpObt_ddlreg_1']")
	    WebElement ddregistorykey;
	    
	    @FindBy (xpath = "//input[@id='XPRegistoryBackUpObt_Btnapplobtainreg']")
	    WebElement btnapplyObtainregistory;
	    
	    @FindBy (xpath = "//label[@id='XPRegistoryBackUpObt_lblMessagePlayLogs']")
	    WebElement lblapplyObtainregistory;
	    
	    @FindBy (xpath = "//label[@id='XPRegistrybackup_lbladdregistrybackup']")
	    WebElement tabregistoryBackup;
	    
	    @FindBy (xpath = "//input[@id='btnaddregistryXP']")
	    WebElement btnaddregistorybackup;
	    
	    @FindBy (xpath = "//input[@id='XPRegistrybackup_txtBackupPath']")
	    WebElement txtbackuppath;
	    
	    @FindBy (xpath = "//input[@id='XPRegistrybackup_txtBackupname']")
	    WebElement txtbackupname;
	    
	    @FindBy (xpath = "//input[@id='XPRegistrybackup_btnRegBackup_Windows']")
	    WebElement btnapplyaddregistorybackup;
	    
	    @FindBy (xpath = "//label[@id='XPRegistrybackup_lblMsgsBackup']")
	    WebElement lblapplyaddregistorybackup;
	    
	    @FindBy (xpath = " //input[@id='XPRegistrybackup_btnregcloseXP']")
	    WebElement btncloseapplyaddregistorybackup;
	    
	    @FindBy (xpath = " //input[@id='XPRegistrybackup_btnRefresh']")
	    WebElement btnrefreshbackupregistory;
	   
	    @FindBy (xpath = "(//input[@class=\"'+classes.sFilterInput+'\"])[4]")
	    WebElement txtserchbar;
	    
	    
	    @FindBy (xpath = "( //input[@class='chkItem'])[1]")
	    WebElement chkselectviewregistory;
	    
	    @FindBy (xpath = " //input[@id='XPRegistrybackup_btnRestoreBackup']")
	    WebElement btnrestorehbackupregistory;
	    
	    @FindBy (xpath = "//input[@id='XPRegistrybackup_btnRestoreApply']")
	    WebElement btnapplyregistorybackup;
	    
	    @FindBy (xpath = "//label[@id='XPRegistrybackup_lblMsgRestore']")
	    WebElement lblapplyregistorybackup;
	    
	    
	    // Startup Application List
	    
	    @FindBy (linkText = "Startup Application List")
	    WebElement ClickStartupapplicationlist;
	    
	    @FindBy (xpath = "(//input[@class='chkItem'])[2]")
	    WebElement chkfistelement;
	    
	    @FindBy (xpath = "//input[@id='XPStartUpApp_btnViewSave']")
	    WebElement btnsaveviewappslist;
	    
	    @FindBy (xpath = "//input[@id='XPStartUpApp_btnApply']")
	    WebElement btnapplyviewapplicationlist;
	    
	    @FindBy (xpath = "//label[@id='XPStartUpApp_lblViewMsg']")
	    WebElement lblapplyviewapplicationlist; //Settings applied successfully
	    
	    @FindBy (xpath = "//label[@id='XPStartUpApp_lbladdapplicationlist']")
	    WebElement tabaddapplicationlist;
	    
	    @FindBy (xpath = "//input[@id='XPStartUpApp_txtApplicationPath']")
	    WebElement txtapplicationpathaddapplication;
	    
	    @FindBy (xpath = "//input[@id='XPStartUpApp_txtApplicationName']")
	    WebElement txtapplicationnameaddapplication;
	    
	    @FindBy (xpath = "//input[@id='XPStartUpApp_btnAddAppSave']")
	    WebElement btnapplyaddapplicationlist;
	    
	    @FindBy (xpath = "//label[@id='XPStartUpApp_lblMsg']")
	    WebElement lblapplyaddapplicationlist;
	    
	    //Task Schedular
	    @FindBy (xpath = "(//label[@title='Task Scheduler'])[2]")
	    WebElement clickTaskshedular;
	    
	    @FindBy (xpath = "//input[@id='XPTaskScheduler_Checkbox1']")
	    WebElement chckselecttask;
	    
	    @FindBy (xpath = "//input[@id='XPTaskScheduler_btnRefresh']")
	    WebElement btnrefreshtaskshedular;
	    
	    @FindBy (xpath = "//input[@id='XPTaskScheduler_btnDeleteXPTaskSch']")
	    WebElement btndeletetaskshedular;
	    
	    @FindBy(xpath = "//input[@id='btnOkDeviceConformation']")
	    WebElement btnokconfirm;
	    
	    @FindBy(xpath = "//input[@id='XPTaskScheduler_btnApplyTaskSch']")
	    WebElement btnapplytaskshedular;
	    
	    @FindBy (xpath = "//label[@id='XPTaskScheduler_lblMessage']")
	    WebElement lbldeletetaskshedular;
	    
	    
	    
	    // Remote Setting
	    
	    @FindBy (linkText = "Remote Agent")
	    WebElement clickremoteagent;
	     
	    // Advance Setting
	    
	    @FindBy (linkText = "Advanced Settings")
	    WebElement clickadvancsetting;
	    
	    @FindBy (xpath = "(//label[@class='onoffswitch-label'])[9]")
	    WebElement chkenabledisablelocation;
	    
	    @FindBy (xpath = "//a[@id='WinAdvSettliclsRemoteAgent']")
	    WebElement tabremoteagent;
	    
	    @FindBy (xpath = "//input[@id='WinAdvSettbtnSave']")
	    WebElement btnapplyremotesetting;
	    
	    @FindBy(xpath = "//label[@id='WinAdvSettlblMessage']")
	    WebElement lblapplyremotesetting;
	    
	    //DHCP
	    
	    @FindBy (xpath = "//a[@id='WinAdvSettlicDHCP']")
	    WebElement tabDHCP;
	    
	    @FindBy (xpath = "//input[@id='WinAdvSetttxtServer']")
	    WebElement txtserverDHCP;
	    
	    @FindBy (xpath = "//input[@id='WinAdvSetttxtIntervalD']")
	    WebElement txtInternal;
	    
	    @FindBy (xpath = "//input[@id='WinAdvSettbtnDHCPApply']")
	    WebElement btnapplyDHCP;
	    
	    @FindBy (xpath = "//span[@id='WinAdvSettlblMessageDHCP']")
	    WebElement lblapplyDHCP;
	    
	    //Change VNC Password
	    
	    @FindBy (linkText = "Change VNC Password")
	    WebElement clickchangevncpass;

	    @FindBy (xpath = "//input[@id='WinVNCpw_txtDefaultVNC_Password']")
	    WebElement txtvncpass;
	    
	    @FindBy (xpath = "//input[@id='WinVNCpw_btnVNC_Apply']")
	    WebElement btnapplyvncpass;
	    
	    @FindBy (xpath = "//label[@id='WinVNCpw_lblMsgs']")
	    WebElement lblapplyvncpass;
	   
	    //General Setting
	    
	    @FindBy (linkText = "General Settings")
	    WebElement clickgeneralsetting;
	    
	    @FindBy (xpath = "//input[@id='WinGenSetting_txtIPAddress']")
	    WebElement txtserverIP;
	    
	    @FindBy (xpath = "//input[@id='WinGenSetting_txtRMAgentPortNO']")
	    WebElement txtportno;
	    
	    @FindBy (xpath = "//input[@id='WinGenSetting_txtPollingInterval']")
	    WebElement txtHeartbeatint;
	    
	    @FindBy (xpath = "//input[@id='WinGenSetting_btnApplyGS']")
	    WebElement btnapplygeneraleset;
	    
	    @FindBy (xpath = "//label[@id='WinGenSetting_lblMessage']")
	    WebElement lblapplygeneraleset;
	   
	    //Service MGMT
	    
	    @FindBy (linkText = "Service Management")
	    WebElement Clickservicemgmt;
	    
	    @FindBy (linkText = "Services")
	    WebElement Clickservices;
	    
	    @FindBy (xpath = "(//input[@class='chkItemServices'])[1]")
	    WebElement Chkactiveservice;
	    
	    @FindBy (xpath = "//input[@id='XPService_btnView']")
	    WebElement btnviewservices;
	    
	    @FindBy (xpath = "//input[@id='XPService_btnStartSysView']")
	    WebElement btnstartservicess;
	    
	    @FindBy (xpath = "//input[@id='XPService_btnRestartSysView']")
	    WebElement btnrestartservices;
	    
	    @FindBy (xpath = "//input[@id='XPService_btnStopSysView']")
	    WebElement btnstopservices;
	    
	    @FindBy (xpath = "//label[@id='XPService_lblMessageService']")
	    WebElement lblapplyservices;
	    
	    //USB Device Manager
	    
	    @FindBy (linkText = "USB Device Manager")
	    WebElement clickUSBDevicemanager;
	    
	    @FindBy(xpath = "//input[@id='XPUSBchkOnOffStatus']")
	    WebElement chkUSBDeviceControlStatus;
	    
	    @FindBy(xpath = "//label[@id='XPUSBlblchk_AudioDevices']//span[@class='onoffswitch-switch']")
	    WebElement chkaudiodevice;
	    
	    @FindBy(xpath = "//label[@id='XPUSBlblchk_ImageDevices']")
	    WebElement chkImagedevice;
	    
	    @FindBy(xpath = "//label[@id='XPUSBlblchk_VideoDevices']")
	    WebElement chkvideodevice;
	    
	    @FindBy(xpath = "//label[@id='XPUSBlblchk_HumanInterfaceDevices']")
	    WebElement chkhumaninterface;
	    
	    
	    @FindBy (xpath = "//input[@id='XPUSBbtnSave']")
	    WebElement btnapplyUSBDevicemanager;
	    
	    @FindBy (xpath = "//label[@id='XPUSBlblMessage']")
	    WebElement lblapplyUSBDevicemanager; //USB Device Manager Settings applied successfully
	    
	    //User Management
	    
	    @FindBy (linkText = "User Management")
	    WebElement ClickUsermgmt;
	    
	    @FindBy (xpath = "//input[@id='XPUserManagement_btnNewUser']")
	    WebElement btnnewuser;
	    
	    @FindBy (xpath = "//input[@id='XPUserManagement_btnRefresh']")
	    WebElement btnrefreshuser;
	    
	    @FindBy (xpath = "//input[@id='XPUserManagement_txtUserName']")
	    WebElement txtusername;
	    
	    @FindBy (xpath = "//input[@id='XPUserManagement_txtPassword']")
	    WebElement txtpassword;
	    
	    @FindBy (xpath = "//input[@id='XPUserManagement_txtConfirmpassword']")
	    WebElement txtConfirmpassword;
	    
	    @FindBy (xpath = "//input[@id='XPUserManagement_txtFullName']")
	    WebElement txtFullname;
	    
	    @FindBy (xpath = "//input[@id='XPUserManagement_txtDescription']")
	    WebElement txtdescription;
	    
	    @FindBy (xpath = "//select[@id='XPUserManagement_ddlMemberOf']")
	    WebElement ddmemberof;
	    
	    @FindBy (xpath = "//input[@id='XPUserManagement_btnAdd']")
	    WebElement btnapplyuserMGMT;
	    
	    @FindBy(xpath = "//a[@id='XPUserManagement_lnkUserRsetetPass']")
	    WebElement tabresetuser;
	    
	    @FindBy(xpath = "//input[@id='XPUserManagement_txtUserName']")
	    WebElement txtusername_Resetuser;
	    
	    @FindBy(xpath = "//input[@id='XPUserManagement_txtPassword']")
	    WebElement txtpassword_Resetuser;
	    
	    @FindBy(xpath = "//input[@id='XPUserManagement_txtConfirmpassword']")
	    WebElement txtconformpass_Resetuser;
	    
	    @FindBy(xpath = "//input[@id='XPUserManagement_btnEditSave']")
	    WebElement btnsaveresetpassword;
	    
	    @FindBy (xpath = "//label[@id='XPUserManagement_lblMessageUserMgmt']")
	    WebElement lblapplyuserMGMT;
	    
	    SoftAssert softassert=new SoftAssert();
		utility sel= new utility();	
	    
	    /*@FindBy (xpath = "")
	    WebElement ;
	    
	    @FindBy (xpath = "")
	    WebElement ;
	    
	    @FindBy (xpath = "")
	    WebElement ;
	    
	    */
	    
		@FindBy (xpath = "//span[@id='spnalltemplate']")
		WebElement taballtemp;
		
		@FindBy (xpath = "//i[@class='fa fa-plus font-white']")
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
		
		
		
		
	    public void applicationcommand(String Temp_Name) 
	    {
	    	
	    	if(Temp_Name!="Template_RHS")
	    	{
	    	taballtemp.click();
	    	if(utility.isClicked(btnaddtemp)==true)
			//btnaddtemp.click();
			txttemplatename.sendKeys("Template_Administration");
			
			Select os_type=new Select(ddostype);
			os_type.selectByVisibleText("Windows");
			
			Select Sch_type=new Select(ddschtype);
			Sch_type.selectByIndex(0);
			
			Select Dis_type=new Select(dddispalytime);
			Dis_type.selectByIndex(0);
			
			btnsave.click();
			taballtemp.click();
	    	
	    }
	    	
	    	Actions a= new Actions(wd);
	    	
	    	Clickadministration.click();
	    	Clickapplicationcommand.click();
	    	txtapplicationpath.sendKeys("C:\\Windows\\System32\\calc.exe");
	    	chkalertuser.click();
	    	a.moveToElement(btnapplyapplication).release().build().perform();
	    	btnapplyapplication.click();
	       
	    	//String return_Msg=lblapplyapplication.getText();
	        //softassert.assertEquals(return_Msg, "Launch Application Settings applied successfully");
	    	
	        //Command
	        a.moveToElement(tabCommand).release().build().perform();
	    	tabCommand.click();
	        txtcommand.sendKeys("ping 192.168.1.17");
	        
	        a.moveToElement(btnapplyCommand).release().build().perform();
	        Select dropdown=new Select(ddtimeout);
	        dropdown.selectByIndex(3);
	        
	        btnapplyCommand.click();
	        //String return_Msg1=lblapplyCommand.getText();
	        //softassert.assertEquals(return_Msg1, "Launch Command Settings applied successfully");
	        
	        // Env Variable
	        clickEnvironmentVariable.click();
	       
	        txtVariablename.sendKeys("CMD_Auto");
	        txtvalue.sendKeys("C:\\Windows\\System32\\cmd.exe");
	        btnapplyEnvVariable.click();
	        
	        //String return_Msg2=lblapplyEnvVariable.getText();
	        //if(return_Msg2.contains("Variable name exist already"))
	        //{
	        	//System.out.println("This Connection all ready present ");
	        //}
	        //else 
	        //{
	        	//softassert.assertEquals(return_Msg2, "Environment Variable Settings applied successfully");
	            	
			//}
	        
	        //softassert.assertAll(); 
		
	    
	    
			clickperformancemgmt.click();

			// History Cleaner
			clickHistoryCleaner.click();

			Select dropdown_02 = new Select(ddBrowserInstall);
			dropdown_02.selectByIndex(0);

			if(chkhistory.isSelected())
			{
				
			}
			else 
			{
			chkhistory.click();
			}
			
			
			if(chktempfile.isSelected())
			{
				
			}
			else 
			{
				chktempfile.click();
			}
			
			
			//chktempfile.click();
			
			btnapplyWebBrowser.click();
			//String return_Msg=lblapplyWebBrowser.getText();
	        //softassert.assertEquals(return_Msg, "Web Browser information Settings applied successfully");

			tabwindowsCleaner.click();
			chkemptyclipboard.click();
			chkdeletewindowstempfile.click();
			chkemptyrecyclebin.click();
			chkrecentdochistory.click();
			btnapplywindowscleaner.click();
			
			//String return_Msg1=lblapplywindowscleaner.getText();
	        //softassert.assertEquals(return_Msg1, "Windows Cleaner information Settings applied successfully");

			//Registory Backup
			
			 ClickRegistryBackupRestore.click();
			 txtregistrybackup.sendKeys("SOFTWARE\\WOW6432Node\\RemoteApps\\RemoteSettings");
			 btnapplyObtainregistory.click();
			 tabregistoryBackup.click();
			 
			 // btnaddregistorybackup.click();
			 
			 txtbackuppath.sendKeys("C:\\");
			 txtbackupname.sendKeys("Backup");
			 btnapplyaddregistorybackup.click(); //Obtain Registry Settings applied successfully
			
			 //String return_Msg2=lblapplyaddregistorybackup.getText();
		     //softassert.assertEquals(return_Msg2, "Backup Registry Settings applied successfully");
			
			 
			 // chkselectviewregistory.click();
			 //btnrestorehbackupregistory.click();
			 // btnapplyregistorybackup.click();
			 
			 //String return_Msg3=lblapplyregistorybackup.getText();
		     //softassert.assertEquals(return_Msg3, "Restore Registry Settings applied successfully");
			
			 //Startup Apps List
			 
			 ClickStartupapplicationlist.click();
			 
			 //chkfistelement.click();//input[@id='XPRegistoryBackUpObt_regtxt_1']
			 //btnsaveviewappslist.click();
			 //btnapplyviewapplicationlist.click();
			 
			 //String return_Msg4=lblapplyviewapplicationlist.getText();
		     //softassert.assertEquals(return_Msg4, "Settings applied successfully");
			 
			 //tabaddapplicationlist.click();
			 
			 txtapplicationpathaddapplication.sendKeys("C:\\Windows\\System32\\calc.exe");
			 txtapplicationnameaddapplication.sendKeys("Calc_New");
			 btnapplyaddapplicationlist.click();
			 
			 //String return_Msg5=lblapplyaddapplicationlist.getText();
			 
			 //if(return_Msg5.contains("Start-up list information is scheduled to update"))
			 // {
			 //softassert.assertTrue(true);
			 //}
			 //softassert.assertEquals(return_Msg5, "Environment Variable Settings applied successfully");
			
			 
			 //Task shedular
			 
			 clickTaskshedular.click();
			 btnrefreshtaskshedular.click();
			 chckselecttask.click();
			 btndeletetaskshedular.click();
			 
			 btnokconfirm.click();
			 btnapplytaskshedular.click();
			 
			 //if(btndeletetaskshedular.isEnabled())
			 //{
				// btndeletetaskshedular.click();
				 //String return_Msg6=lbldeletetaskshedular.getText();
				 //softassert.assertEquals(return_Msg6, "Task Scheduler Settings applied successfully");
			 //}
			 //String return_Msg4=lblrefreshtaskshedular.getText();
		     //softassert.assertAll();
	    
	    
	 
			//Actions a=new Actions(wd);
	    	
	    	//Remote Agent
			 
	    	clickremoteagent.click();
			clickadvancsetting.click();
			chkenabledisablelocation.click();
			a.moveToElement(btnapplyremotesetting).release().build().perform();
			btnapplyremotesetting.click();
			
			/*
			
			//a.moveToElement(clickremoteagent);
			
			//String return_Msg=lblapplyremotesetting.getText();
			//if(return_Msg.contains("Settings applied previously are in-process"))
			//{
			//	softassert.assertTrue(true);
			//}
			//else 
			//{
				//softassert.assertEquals(return_Msg, "Remote Settings has been applied.");	
			//}
		    
			//a.moveToElement(tabDHCP).release().build().perform();
			//tabDHCP.click();
			//btnapplyDHCP.click();
			
			//String return_Msg1=lblapplyDHCP.getText();
		   // softassert.assertEquals(return_Msg1, "DHCP Settings has been applied.");
			
			*/
			
			// VNC Password
			
			clickchangevncpass.click();
			txtvncpass.sendKeys("000000");
			btnapplyvncpass.click();//Request for settings update has been processed
			
			//String return_Msg2=lblapplyvncpass.getText();
		    //softassert.assertEquals(return_Msg2, "Request for settings update has been processed");
			
			//General Setting
			
			clickgeneralsetting.click();
			txtserverIP.clear();
			txtserverIP.sendKeys("192.168.2.131");
			txtportno.clear();
			txtportno.sendKeys("443");
			txtHeartbeatint.clear();
			txtHeartbeatint.sendKeys("30");
			btnapplygeneraleset.click();
			
			//utility.isVisible(lblapplygeneraleset, wd, 1000);
			
			//String return_Msg3=lblapplygeneraleset.getText();
			// softassert.assertEquals(return_Msg3, "General Settings has been applied.");
			
			
			//Service MGMT
			Clickservicemgmt.click();
			Clickservices.click();
			Chkactiveservice.click();
			
			btnstartservicess.click();
			
			//String return_Msg4=lblapplyservices.getText(); //ActiveX Installer (AxInstSV) is scheduled
			// if(return_Msg4.contains("ActiveX Installer (AxInstSV) is scheduled"))
		    //{
			//softassert.assertTrue(true);
		    //}
			
			
			//User MGMT
		    
			ClickUsermgmt.click();
			//btnnewuser.click();
			a.moveToElement(txtdescription).release().build().perform();
			txtusername.sendKeys("Admin");
			txtpassword.sendKeys("1");
			txtConfirmpassword.sendKeys("1");
			txtFullname.sendKeys("Admin");
			txtdescription.sendKeys("Admin");
			
			a.moveToElement(btnapplyuserMGMT).release().build().perform();
			
			Select Dropdown=new Select(ddmemberof);
			Dropdown.selectByVisibleText("Administrator");
			
			btnapplyuserMGMT.click(); 
			
			//Request for settings update has been processed
			
			utility.isVisible(lblapplyuserMGMT, wd, 1000);
			
			//String return_Msg5=lblapplyuserMGMT.getText();
			// softassert.assertEquals(return_Msg5, "Settings applied successfully");
			
			tabresetuser.click();
			txtusername_Resetuser.sendKeys("Admin");
			txtpassword_Resetuser.sendKeys("000000");
			txtconformpass_Resetuser.sendKeys("000000");	
			btnsaveresetpassword.click();
			
			//USB Device Manager
			
			clickUSBDevicemanager.click();
			chkUSBDeviceControlStatus.click();
			chkaudiodevice.click();
			chkImagedevice.click();
			chkvideodevice.click();
			chkhumaninterface.click();
			
			btnapplyUSBDevicemanager.click(); 
			
			//USB Device Manager Settings applied successfully
			
			utility.isVisible(lblapplyUSBDevicemanager, wd, 1000);
			
			//String return_Msg6=lblapplyUSBDevicemanager.getText();
		    //softassert.assertEquals(return_Msg6, "USB Device Manager Settings applied successfully");
		    //softassert.assertAll();
			
		}
	    
	}
	
	
	

