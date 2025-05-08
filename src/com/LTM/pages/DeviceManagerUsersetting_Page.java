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

public class DeviceManagerUsersetting_Page 
{
	public WebDriver wd;
	
	public DeviceManagerUsersetting_Page(WebDriver wd)
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

	@FindBy(xpath = "(//*[contains(text(), '192.168.1.158')])[1]")
	WebElement clickNode198;

	@FindBy(xpath = "//div[@id='btnExpandMenu']")
	WebElement btnExpandMenu;

	@FindBy (linkText = "User Settings")
	WebElement clickuserseting;
	
	@FindBy (linkText = "User Interface")
	WebElement clickuserinterface;
	
	// Screen saver Setting
	
	@FindBy (linkText = "Screen Saver Settings")
	WebElement clickscreensvaerset;
	
	@FindBy (xpath = "//select[@id='WinScreenSaverddlScreenSaverBrowseUpload']")
	WebElement ddsourcescreensaver;
	
	@FindBy (xpath = "//select[@id='WinScreenSaverddlScreenSaverConnName']")
	WebElement ddconnectionnamescreensaver;
	
	@FindBy (xpath = "//select[@id='WinScreenSaverddlScreenSaverConnName']")
	WebElement ddconnectiontype;
	
	@FindBy (xpath = "//select[@id='WinScreenSaverddlScreenSaverFile']")
	WebElement ddnewscreensaver;
	
	@FindBy (xpath = "//input[@id='WinScreenSaverbtnScreenSaverApply']")
	WebElement btnapplyscreensaver;
	
	@FindBy (xpath = "//label[@id='WinScreenSaverlblSSStatusMsg']")
	WebElement lblapplyscreensaver;
	
	
	//Taskbar Properties
	
	@FindBy (linkText = "Taskbar Properties")
	WebElement clicktaskbarproperties;
	
	@FindBy (xpath = "//input[@id='XPTaskbarbtn_XP_TaskbarPropertieSave']")
	WebElement btnapplytaskbarproperties;
	
	@FindBy (xpath = "//label[@id='XPTaskbarlblTaskbarMsg']")
	WebElement lblapplytaskbarproperties;
	
	//User Interface Setting
	@FindBy (linkText = "User Interface Settings")
	WebElement clickuserinterfacesetting;
	
	
	@FindBy (xpath="//label[@id='XPUserInterface_lblAutoLogon']")
	WebElement tabautologon;
	
	@FindBy (xpath = "//select[@id='XPUserInterfaceddlUserListName']")
	WebElement ddusername;
	
	@FindBy (xpath = "//input[@id='XPUserInterfacetxtPassword']")
	WebElement txtpassword;
	
	@FindBy (xpath = "//input[@id='XPUserInterfacecbxAutoLogon']")
	WebElement chkautologon;
	
	@FindBy (xpath = "//input[@id='XPUserInterfacebtnSaveUserinterfaceSettings']")
	WebElement btnapplyautologon;
	
	@FindBy (xpath = "//label[@id='XPUserInterfacelblUserInterfaceMsg']")
	WebElement lblapplyautologon;
	
	//WCL Interface Setting
	
	@FindBy (xpath = "//label[@id='XPUserInterface_lblUserInterfaceSett']")
	WebElement tabWCLInterfaceSett;
	
	@FindBy (xpath = "//input[@id='rdbRunAsShell']")
	WebElement rdrunasshell;
	
	@FindBy (xpath = "//input[@id='rdbRunAsStandardDesktop']")
	WebElement rdrunstddesktop;

	@FindBy (xpath = "//input[@id='chkAutostartOnBoot']")
	WebElement chkautostart;
	
	@FindBy (xpath="//input[@id='btnUserInterfaceSettApply']")
    WebElement btnapplyWCLSetting;
	
	@FindBy (xpath = "//label[@id='lblUserInterfaceShowResults']")
	WebElement lblapplyWCLSetting;
	
	//Wallpaper Setting
	
	@FindBy (linkText = "Wallpaper Settings")
	WebElement clickwallpaperset;
	
	@FindBy (xpath = "//select[@id='XPWallpaperddlBrowseUpload']")
	WebElement ddsourcewallpaper;
	
	@FindBy (xpath = "//select[@id='XPWallpaperddlConnName']")
	WebElement ddconnectionnamewallpaper;
	
    @FindBy(xpath = "//select[@id='XPWallpaperddlFile']")
    WebElement ddfilename;
	
    @FindBy (xpath = "//select[@id='XPWallpaperddlPositions']")
    WebElement ddpictureposition;
    
    @FindBy (xpath = "//input[@id='XPWallpaperbtnSaveWallpaper']")
    WebElement btnapplywallpapersetting;
    
    @FindBy (xpath="//label[@id='XPWallpaperlblErrMsg']")
    WebElement lblapplywallpapersetting;
    
   
    public void usersetting() 
    {
	  if(clickuserseting.isDisplayed()==false)	
	  {
		  clickGrp.click();
		  clickNode.click();
		  btnExpandMenu.click();
		  
	  }
	  clickuserseting.click();
	  clickuserinterface.click();
	  
	  // Screen Saver Setting
	  
	  clickscreensvaerset.click();
	  
	  Select dropdown= new Select(ddsourcescreensaver);
	  dropdown.selectByIndex(2);
	  
	  Select dropdown_C= new Select(ddconnectionnamescreensaver);
	  dropdown_C.selectByIndex(1);
	  
	  Select dropdown1= new Select(ddnewscreensaver);
	  dropdown1.selectByIndex(2);
	  
	  btnapplyscreensaver.click();
	  
	  String Return_Msg=lblapplyscreensaver.getText();
	  softassert.assertEquals(Return_Msg, "Screen saver settings has been applied.");
	  
    //Taskbar Properties
	  
	  clicktaskbarproperties.click();
	  btnapplytaskbarproperties.click();
   
	  String Return_Msg1=lblapplytaskbarproperties.getText();
	  softassert.assertEquals(Return_Msg1, "Taskbar Properties Settings applied successfully");
	  
	  // User Interface Setting
	  
	  clickuserinterfacesetting.click();
	  
	  Select dropdown2=new Select(ddusername);
	  dropdown2.selectByVisibleText("Administrator");
	  if(chkautologon.isSelected()==true)
	  {
		  txtpassword.sendKeys("000000");
		  
	  }
	  else 
	  {
		  chkautologon.click();
		  txtpassword.sendKeys("000000");
	  }
	  
	  btnapplyautologon.click();
	  
	  String Return_Msg2=lblapplyautologon.getText();
	  softassert.assertEquals(Return_Msg2, "Auto logon Settings applied successfully");
	  
	  //WCL Interface setting
	  
	  tabWCLInterfaceSett.click();
	  if(rdrunstddesktop.isSelected()==true)
	    {
		  chkautostart.click();
            		  
	    }
	  else
	  {
		  rdrunstddesktop.click();
		  chkautostart.click();
	  }
	  Actions a=new Actions(wd);
	  a.moveToElement(btnapplyWCLSetting).release().build().perform();
	       btnapplyWCLSetting.click();
	  
	       String Return_Msg3=lblapplyWCLSetting.getText();
	 	  softassert.assertEquals(Return_Msg3, "WCL interface Settings applied successfully");    
	       
	       
    
    
	//Wallpaper setting
    
	 	  clickwallpaperset.click();
	 	  
	 	 Select drop_w=new Select(ddsourcewallpaper);
	 	 drop_w.selectByVisibleText("Repository");
	 	 
	 	 Select drop_ctype=new Select(ddconnectionnamewallpaper);
	 	 drop_ctype.selectByIndex(1);
	 	
	 	 Select drop_file=new Select(ddfilename);
	 	 drop_file.selectByIndex(2);
	 	 
	 	 Select drop_pos=new Select(ddpictureposition);
	 	 drop_pos.selectByIndex(0);
	 	 
	 	 btnapplywallpapersetting.click();
	 	 
	 	 utility.isVisible(lblapplywallpapersetting, wd, 2000);
	 	 
	 	  String Return_Msg4=lblapplywallpapersetting.getText();
	 	  softassert.assertEquals(Return_Msg4, "Wallpaper Settings applied successfully");    
	 	  softassert.assertAll();
	 	 
    }
    
    
    
}
