package com.LTM.pages;


import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import com.PageFactory.utility;

public class TemplateMangerConMGMT_Page extends utility
{
	public WebDriver wd;
	
    
	public TemplateMangerConMGMT_Page(WebDriver wd) 
	{
		this.wd = wd;
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		PageFactory.initElements(wd, this);
	}

	@FindBy (linkText = "Connection Management")
   	WebElement ClickconcMGMT;
   	
	@FindBy (linkText = "Connections")
   	WebElement Clickconn;
	
	@FindBy(linkText = "Citrix Workspace App")
	WebElement clickcitrixWorkspaceApp;
	
	@FindBy(linkText = "Custom Executable")
	WebElement clickCustomExecutable;
	
	@FindBy(linkText = "Browser")
	WebElement Clickbrowser;

	@FindBy(linkText = "RDP")
	WebElement ClickRDP;

	@FindBy(linkText = "Teradici")
	WebElement ClickTeradici;

	@FindBy(linkText = "VMWare View")
	WebElement ClickVMWareview;

	@FindBy(xpath = "//input[@id='WinContxtConName']")
	WebElement txtconnactionname_Citrix;
	
	@FindBy(xpath = "//select[@id='WinConddlType']")
	WebElement ddtype_Citrix;

	@FindBy(xpath = "//input[@id='WinContxtStore']")
	WebElement txtstorename_Citrix;
	
	@FindBy(xpath = "//input[@id='WinContxtConfigURL']")
	WebElement txtConfigurationURL_Citrix;
	
	@FindBy(xpath = "//input[@id='WinContxtDesc']")
	WebElement txtdesc_Citrix;
	
	@FindBy(xpath = "//input[@id='WinConbtnSaveCitrix1']")
	WebElement btnsave_CitrixworkspaceApp;
	
	@FindBy(xpath = "//input[@id='WinContxtConNameForCustExec']")
	WebElement txtconnactionname_CustomExe;
	
	@FindBy(xpath = "//input[@id='WinContxtPathForCustExec']")
	WebElement txtpath_CustomExe;
	
	@FindBy(xpath = "//input[@id='WinContxtArgumentsForCustExec']")
	WebElement txtarguments_CustomExe;
	
	@FindBy(xpath = "//input[@id='WinConbtnSaveCustom']")
	WebElement btnsave_CustomExe;
	
	@FindBy(xpath = "//input[@id='WinContxtConNameForIE']")
	WebElement txtconnactionname_Browser;
	
	@FindBy(xpath = "//input[@id='WinContxtConfigURLForIE']")
	WebElement txtConfigurationURL_Browser;
	
	@FindBy(xpath = "//input[@id='WinConbtnSaveIEBrowser']")
	WebElement btnsave_Browser;
	
	@FindBy(xpath = "//input[@id='WinContxtConnNameForRDP']")
	WebElement txtconnection_RDP;
	
	@FindBy(xpath = "//input[@id='WinContxtIPHostName']")
	WebElement txtIPHostName_RDP;
	
	@FindBy(xpath = "//input[@id='WinContxtUserName']")
	WebElement txtusername_RDP;
	
	@FindBy(xpath = "//input[@id='WinContxtDomain']")
	WebElement txtdomain_RDP;
	
	@FindBy(xpath = "//input[@id='WinConcbxAlwaysAskForCredential']")
	WebElement chkalwaysaskcredidential;
	
	@FindBy(xpath = "//input[@id='WinConbtnSaveRDP']")
	WebElement btnsave_RDP;
	
	@FindBy(xpath = "//input[@id='WinContxtConNameForTeradici']")
	WebElement txtconnectionname_Teradici;
	
	@FindBy(xpath = "//input[@id='WinContxtHostnameTD']")
	WebElement txthostname_Teradici;
	
	@FindBy(xpath = "//input[@id='WinContxtDomainTD']")
	WebElement txtdomain_Teradici;
	
	@FindBy(xpath = "//input[@id='WinContxtUsernameTD']")
	WebElement txtusername_Teradici;
	
	@FindBy(xpath = "//input[@id='WinContxtPasswordTD']")
	WebElement txtpassword_Teradici;
	
	@FindBy(xpath = "//input[@id='WinConbtnsaveTeradici']")
	WebElement btnsave_Teradici;
	
	@FindBy(xpath = "//input[@id='WinContxtConNameForVmware']")
	WebElement txtconnectioname_VMView;
	
	@FindBy(xpath = "//input[@id='WinContxtHostname']")
	WebElement txthostname_VMview;
	
	@FindBy(xpath = "//input[@id='WinContxtLogin']")
	WebElement txtlogin_VMview;
	
	@FindBy(xpath = "//input[@id='WinContxtPassword']")
	WebElement txtpassword_VMVIew;
	
	@FindBy(xpath = "//input[@id='WinContxtDoamin']")
	WebElement txtdomain_VMView;
	
	@FindBy(xpath = "//input[@id='WinContxtDesktopName']")
	WebElement txtapplicationname_VMView;
	
	@FindBy(xpath = "//input[@id='WinConchkDesktopForVmware']")
	WebElement ChkCreateshortcut_VmView;
	
	@FindBy(xpath = "//input[@id='WinConbtnSaveVMView']")
	WebElement btnsave_VMWareView;

	@FindBy(linkText = "VMView Global Settings")
	WebElement ClickVMViewglobalsetting;

    @FindBy(xpath = "//input[@id='WinVMViewchkUnauthenticatedAccessEnabled']")
    WebElement chkUnauthenticateacess;
    
    @FindBy(xpath = "//input[@id='WinVMViewchkAllowHighColorAccuracy']")
    WebElement chkallowhighcolor;
    
    @FindBy (xpath = "//select[@id='WinVMViewddlConfigureSSL']")
    WebElement ddconfigureSSL;

    @FindBy (xpath = "//input[@id='WinVMViewbtnVmViewGlobalApply']")
    WebElement btnsaveVMVIewGlobalsetting;
    
    
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
	
    
   //Remote Operation  

    
    @FindBy (linkText = "Remote Operation Tool")
    WebElement clickremoteoperationtool;

    @FindBy (linkText = "Send Message To Client")
    WebElement clicksendmsgtoclient;

    @FindBy (linkText = "Lock Computer")
    WebElement clicklockcompter;

    @FindBy (linkText = "Restart")
    WebElement clickrestart;

    @FindBy (linkText = "Synchronise Inventory")
    WebElement Clicksyncinventry;
    
    @FindBy (xpath = "//input[@id='ucRemoteTool_btn_ApplyRemoteOperation']")
    WebElement btnsavesyncinventry;

    @FindBy (xpath = "//textarea[@id='ucRemoteTool_txtMsg']")
    WebElement txtmessage;
    
    @FindBy (xpath = "//input[@id='ucRemoteTool_btn_ApplyRemoteOperation']")
    WebElement btnsavesendmsg;

    @FindBy (xpath = "//input[@id='ucRemoteTool_btn_ApplyRemoteOperation']")
    WebElement btnsaveLockcompter;
    
    @FindBy (xpath = "(//img[@class='linkimg'])[1]")
    WebElement btnclickdepenadancy;
    
    @FindBy (xpath = "//input[@id='ContentPlaceHolder1_btnSaveChangesTemp']")
    WebElement btnsavechanges;
    
    @FindBy(xpath = "//label[@id='lbldeleteStatus']")
    WebElement lbldepedancytemplate;
    
    @FindBy(xpath = "//label[@id='lblNewTemplate_msg']")
    WebElement lbltemplatesavemsg;
    
    @FindBy(xpath = "//input[@id='ContentPlaceHolder1_btnTemplateClose']")
    WebElement btnclosetemplate;
    
    @FindBy(xpath = "//input[@id='myInput']")
    WebElement txtseartchbar;
    
    @FindBy(xpath = "//div[@class='media-body']//*[contains(text(), 'Template_RemoteOperation')]")
    //@FindBy(xpath = "(//a[@title='View'])[414]")
    WebElement btnviewtemplate;
    
    @FindBy (xpath = "//input[@id='ucRemoteTool_btn_ApplyRemoteOperation']")
    WebElement btnsaverestart;
    
    @FindBy (xpath = "//a[@id='ImageButtonTask']") 
	WebElement tabtaskmanger;
	
	@FindBy (xpath = "//div[@id='btnExpandMenu']")
	WebElement Expandmenu;
	
	//@FindBy (css = "//div[@id='htmlmenuTaskManagerView']//li[@id='lblMenu_taskmanagementTask']//label[@title='Template Manager'][normalize-space()='Template Manager']")
	//WebElement clicktempmgr;
	
	@FindBy (css = "div[id='htmlmenuTaskManagerView'] li[id='lblMenu_taskmanagementTask'] label[title='Template Manager']")
	WebElement clicktempmgr;
   
    
    
    public void Create_Template_ConnectionMGMT(String Temp_Name) 
    {
    	if(Temp_Name!="Template_RHS")
    	{
    	taballtemp.click();
    	if(utility.isClicked(btnaddtemp)==true)
		//btnaddtemp.click();
		txttemplatename.sendKeys("Template_ConnectionMGMT");
		
		Select os_type=new Select(ddostype);
		os_type.selectByVisibleText("Windows");
		
		Select Sch_type=new Select(ddschtype);
		Sch_type.selectByIndex(0);
		
		Select Dis_type=new Select(dddispalytime);
		Dis_type.selectByIndex(0);
		
		btnsave.click();
		taballtemp.click();
    	}
		ClickconcMGMT.click();
		Clickconn.click();
		
	// Citrix Workspace App
		
		clickcitrixWorkspaceApp.click();
		txtconnactionname_Citrix.sendKeys("Citrix_01");
		
		Select Drop= new Select(ddtype_Citrix);
		Drop.selectByIndex(0);
		
		txtstorename_Citrix.sendKeys("StoreNew");
		txtConfigurationURL_Citrix.sendKeys("https://xd718server.vdi.com");
		txtdesc_Citrix.sendKeys("");
		
		btnsave_CitrixworkspaceApp.click();
		
	// Custom Executable 
		
		clickCustomExecutable.click();
		txtconnactionname_CustomExe.sendKeys("Custom_01");
		txtpath_CustomExe.sendKeys("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
		txtarguments_CustomExe.sendKeys("-incognito");
		btnsave_CustomExe.click();
	
	//Browser
		Clickbrowser.click();
		txtconnactionname_Browser.sendKeys("Browser_01");
		txtConfigurationURL_Browser.sendKeys("http://www.gmail.com");
		btnsave_Browser.click();
		
	//RDP
		ClickRDP.click();
		txtconnection_RDP.sendKeys("RDP_01");
		txtIPHostName_RDP.sendKeys("192.168.1.158");
		
		if(chkalwaysaskcredidential.isSelected()==true)
		{
			chkalwaysaskcredidential.click();
		}
		
		btnsave_RDP.click();
		
	//TeraDici
		
		ClickTeradici.click();
		txtconnectionname_Teradici.sendKeys("Teradici_01");
		txthostname_Teradici.sendKeys("teraagent.vdi.com");
		txtdomain_Teradici.sendKeys("vdi");
		txtusername_Teradici.sendKeys("Administrator");
		txtpassword_Teradici.sendKeys("Verixo#123");
		btnsave_Teradici.click();
		
	//VMView
		ClickVMWareview.click();
		txtconnectioname_VMView.sendKeys("VMView_01");
		txthostname_VMview.sendKeys("https://vmwareserver8.vdi.com");
		txtlogin_VMview.sendKeys("Administrator");
		txtpassword_VMVIew.sendKeys("Verixo#123");
		txtdomain_VMView.sendKeys("vdi");
		txtapplicationname_VMView.sendKeys("2012 WordPad");
		ChkCreateshortcut_VmView.click();
		btnsave_VMWareView.click();
		
	//VM View Global Setting
		
		ClickVMViewglobalsetting.click();
		chkUnauthenticateacess.click();
		chkallowhighcolor.click();
		btnsaveVMVIewGlobalsetting.click();
		
		
		
    	
	}
    
    public void Create_Template_RemoteOperation(String p ,String Temp_Name ) 
    {
    	/*if(utility.isVisible(taballtemp, wd, 5)==false)
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
		txttemplatename.sendKeys("Template_RemoteOperation");
		
		Select os_type=new Select(ddostype);
		os_type.selectByVisibleText("Windows");
		
		Select Sch_type=new Select(ddschtype);
		Sch_type.selectByIndex(0);
		
		Select Dis_type=new Select(dddispalytime);
		Dis_type.selectByIndex(0);
		
		btnsave.click();
    	}
    	
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
		Actions a= new Actions(wd);
		a.moveToElement(clickremoteoperationtool).release().build().perform();
		clickremoteoperationtool.click();
		a.moveToElement(Clicksyncinventry).release().build().perform();
		clicksendmsgtoclient.click();
		txtmessage.sendKeys("Test");
    	btnsavesendmsg.click();
    	
    	Clicksyncinventry.click();
    	btnsavesyncinventry.click();
    	
    	clickrestart.click();
    	btnsaverestart.click();
    	
    	clicklockcompter.click();
    	btnsaveLockcompter.click();
    	
		//}
		
    	if(p=="1")
    	{
    		btnclickdepenadancy.click();
    		btnsavechanges.click();
    		String label=lbldepedancytemplate.getText();//Changes saved successfully
    		Assert.assertEquals(label, "Changes saved successfully");
    		System.out.println("Dependancy set sucessfully");
    		
    	}
    	else
    	{
		  	
		}
		}
    }
   }
