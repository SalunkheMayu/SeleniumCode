package com.LTM.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.PageFactory.utility;

public class Apply_Template_Page extends utility
{
	public WebDriver wd;
	
	public Apply_Template_Page(WebDriver wd) 
	{
		this.wd = wd;
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		PageFactory.initElements(wd, this);
	}
	
	 	@FindBy(xpath = "//*[contains(text(), 'DM_GRP')]//preceding-sibling::span[@class='rtPlus']")
	   	WebElement clickGrp_Expand;
	 	
	 	@FindBy(xpath = "//*[contains(text(), 'DM_GRP')]")
	   	WebElement clickGrp;

	   	@FindBy(xpath = "(//*[contains(text(), '192.168.1.127')])[2]")
	   	WebElement clickNode;
	   	
	   	@FindBy (linkText = "Apply Template")
	   	WebElement clickapplytemplate;
	   	
	   	
	   	@FindBy(xpath = "//input[@aria-controls='tblDeviceMgr_Template']")
	   	WebElement searchbarapplytemplate;
	   	
	   	
	   	@FindBy(xpath = "(//input[@type='checkbox'][@class='chkItemTempall'])[1]")
	   	WebElement chkselecttemplate;
	   	
	   	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_btnApplySettingsNext']")
	   	WebElement btnnext;
	   	
	   	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_btnApplySettings']")
	   	WebElement btnapplytemp;
	   	
	   	@FindBy(xpath = "//label[@id='lblMsgJQ']")//Request for settings update has been processed
	   	WebElement lblapplytemp;
	   	
	   	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_btnCloseDown']")
	   	WebElement btnclose;
	   	
	   	@FindBy(xpath = "//a[@id='ibtntHome']")
	   	WebElement btnhome;
	   	
	   	@FindBy(xpath = "//div[@id='btnExpandMenu']")
	   	WebElement btnexpandmenu;
	   	
	   	//Device List view
	   	
	   	@FindBy(xpath = "//input[@placeholder='Search...']")
	   	WebElement txtsertchbar;
	   	
	   	@FindBy(xpath = "//div[@class='checkbox']")
	   	WebElement chkselectdevice;
	   	
	   	@FindBy(xpath = "//td[@class='sorting_1']")
	   	WebElement clickdevice;
	   	
	   	@FindBy(xpath = "//label[@id='ContentPlaceHolder1_lblApplyTemplate']")
	   	WebElement clickapplytemplate_Devicelistview;
	   	
	   	@FindBy(xpath = "(//input[@placeholder='Search...'])[2]")
	   //	@FindBy(xpath = "//div[@id='tblDeviceMgr_Template_filter']")
	   	WebElement sertchbartemp;
	   	
	   	@FindBy(css = "div[class='dataTables_scrollHeadInner'] th[class='sorting_disabled'] input[type='checkbox']")
	   	WebElement chktemp;
	   	
	   	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_btnApplySettingsNext']")
	   	WebElement btnnext_Device_Listview;
	   	
	   	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_btnApplySettings']")
	   	WebElement btnapplytemp_Device_Listview;
	   	
	   	@FindBy (xpath = "//label[@id='lblMsgJQ']")
	   	WebElement lblapplytemp_Device_Listview; //Request for settings update has been processed
	   	
	   	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_btnCloseDown']")
	   	WebElement btnclose_Device_Listview;
	   	
	   	
	   	
	   	public void Apply_Template_Node() 
	   	{
	   		btnhome.click();
	   		utility.isInvisible(btnexpandmenu, wd, 10);
	   		
	   		clickGrp_Expand.click();
	   		//clickNode.click();
	   		
	   		Actions a=new Actions(wd);
	   		a.moveToElement(clickNode);
		  	a.contextClick().release().build().perform();
		  	
		  	clickapplytemplate.click();
		  	
		  	searchbarapplytemplate.sendKeys("Send_Msg");
		  	chkselecttemplate.click();
		  	
		  	btnnext.click();
		  	btnapplytemp.click();
		  	
		  	utility.isVisible(btnapplytemp, wd, 3);
		  	
		  	String Return_MSG=lblapplytemp.getText();
		  	btnclose.click();
			Assert.assertEquals(Return_MSG, "Request for settings update has been processed");
			
			System.out.println("Template Applied From node Sucess");
		  	
		}
	   	
	   	
	 	public void Apply_Template_grp() 
	   	{
	   		//clickGrp_Expand.click();
	   		//clickNode.click();
	   		
	   		Actions a=new Actions(wd);
	   		a.moveToElement(clickGrp);
		  	a.contextClick().release().build().perform();
		  	
		  	clickapplytemplate.click();
		  	
		  	utility.isVisible(searchbarapplytemplate, wd, 4);
		  	
		  	searchbarapplytemplate.sendKeys("Send_Msg");
		  	chkselecttemplate.click();
		  	
		  	btnnext.click();
		  	btnapplytemp.click();
		  	
		  	utility.isVisible(lblapplytemp, wd, 4);
		  	
		  	String Return_MSG=lblapplytemp.getText();
		  	
		  	btnclose.click();
		  	
			Assert.assertEquals(Return_MSG, "Request for settings update has been processed");
			
			System.out.println("Template applied to Group Sucess");
			
		  	
		}
	   	
	 	public void Apply_Template_Device_List_View(String IP,String Temp_Name)
	 	{
	 		txtsertchbar.sendKeys(IP);
	 		chkselectdevice.click();
	 		Actions a=new Actions(wd);
	   		a.moveToElement(clickdevice);
	   		
		  	a.contextClick().release().build().perform();
		  	clickapplytemplate_Devicelistview.click();
		  	
		  	sertchbartemp.sendKeys(Temp_Name);
		  	chktemp.click();
		  	btnnext_Device_Listview.click();
		  	
		  	btnapplytemp_Device_Listview.click();
		  	
		  	//lblapplytemp_Device_Listview.getText();
		  	
		  	utility.isVisible(lblapplytemp_Device_Listview, wd, 4);
		  	
		  	String Return_MSG=lblapplytemp_Device_Listview.getText();
		  	
		  	btnclose_Device_Listview.click();
		  	
			Assert.assertEquals(Return_MSG, "Request for settings update has been processed");
			
			System.out.println("Template applied to from device list view Sucess");
		  	
	 		
	 		
	 	}
	   	
}
