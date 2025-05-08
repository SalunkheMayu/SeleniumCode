package com.LTM.pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

//import java.io.File;
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;



//import org.testng.Assert;

import com.PageFactory.utility;

public class ConfigurationSetup_Page {

	public WebDriver wd;
	private final String xlsPath = "D:\\Device Manager\\REPO_Details-update.xlsx";   //C:\\Users\\Administrator\\Desktop\\Agent Setup\\REPO_Details-update_OC.xlsx

	// private final String xlsPath="C:\\Users\\Administrator\\Desktop\\String\\MUI
	// new languages\\Greek.xlsx";

	utility selUtility = new utility();

	public ConfigurationSetup_Page(WebDriver wd) 
	{
		this.wd = wd;
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		PageFactory.initElements(wd, this);
	}
	
	@FindBy(xpath = "(//a[@id='ibtntHome'])[1]")       //i[@class='icon-home dsico-Simple']
	public WebElement homeIcon;

	@FindBy(xpath = "//div[@id='btnExpandMenu']")  //Done
	WebElement btnExpandMenu;

	@FindBy(xpath = "(//a[@id='btSPAdmin'])[1]")  // (//a[@id='btSPAdmin'])[1]    //a[@id='btSPAdmin']
	WebElement btSPAdmin;

	@FindBy(xpath = "//a[@id='A12']")        //Not Found 
	WebElement connTab;

	@FindBy(xpath = "(//li[@id='lblMenu_Repository'])[2]")   //Done
	WebElement lblMenu_Repository;

	@FindBy(xpath = "//label[@id='ContentPlaceHolder1_lblRepositroyConnection']")     //input[@id='ContentPlaceHolder1_newConnection']
	WebElement btnNewConn;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_txtConnection']")    //Done
	WebElement txtConnName;

	@FindBy(xpath = "//select[@id='ContentPlaceHolder1_ddlProtocolType']")   //Done
	WebElement ddlProtocolType;

	@FindBy(xpath = "//select[@id='ContentPlaceHolder1_ddlRepository']") //d
	WebElement ddlRepository;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_txtIPServer']")
	WebElement txtipserver;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_txtAgentIP']")
	WebElement txtAgentIp;

	@FindBy(xpath = "//select[@id='ContentPlaceHolder1_ddlFTPType']") //d
	WebElement ddlFtpType;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_txtPortConnection']")
	WebElement txtPortConnection;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_FolderPath']")
	WebElement txtFolderPath;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_UserName']")
	WebElement txtUserName;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_passwordtxt']") //d
	WebElement txtpwd;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_txtCertificateName']")   // Not
	WebElement txtCertificateName;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_txtDomain']")
	WebElement txtDomain;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_Defaultchk']")
	WebElement chkDefaultRepo;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_chkgloballink']")
	WebElement chkgloballink;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_btnVldtCnnctn']")
	WebElement btnValidate;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_SaveConnection']")
	WebElement btnSave;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_btnCloseRp']")
	WebElement btnClose;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_btnrefesh']")
	WebElement btnRefresh;

	@FindBy(xpath = "//input[@aria-controls='LoadRepositorytable']")
	WebElement Searchbar;

	@FindBy(xpath = "//a[@class='fa fa-refresh']")    //ch
	WebElement clicksyncrepo;

	@FindBy(xpath = "//div[@id='divSyncConnnectionFiles']//label")
	WebElement lblreturnmsg;

	@FindBy(xpath = "//span[@id='ContentPlaceHolder1_lblErrorMsgForAddConnection']")
	WebElement labvalidatecon;

	@FindBy(xpath = "//div[@class='col-md-12 loading']")
	WebElement Loader;

	

	// Power option
	@FindBy(xpath = "//select[@id='XPPowerOption_ddlPowerplan']")
	WebElement ddpowerplan;

	@FindBy(xpath = "//select[@id='XPPowerOption_ddlDisplay']")
	WebElement dddisplay;

	@FindBy(xpath = "//select[@id='XPPowerOption_ddlSleep']")
	WebElement ddsleep;

	@FindBy(xpath = "//input[@id='XPPowerOption_btnAdvanceSettingsNew']")
	WebElement btnadvanceset;

	@FindBy(xpath = "//select[@id='ddlTurnoffharddiskafter']")
	WebElement ddturnofhddafter;

	@FindBy(xpath = "//select[@id='ddlSleepafter']")
	WebElement ddsleepafter;

	@FindBy(xpath = "//select[@id='ddlTurnoffdisplayafter']")
	WebElement ddturndisplayafter;

	@FindBy(xpath = "//select[@id='ddlSystemstandby']")
	WebElement ddsysstandby;

	@FindBy(xpath = "//select[@id='ddlPowerbuttonaction']")
	WebElement ddpowerbtnaction;

	@FindBy(xpath = "//select[@id='ddlSleepbuttonaction']")
	WebElement ddsleepbtnaction;

	@FindBy(xpath = "//input[@id='XPPowerOption_btnSave']")
	WebElement btnsave;

	@FindBy(xpath = "//input[@id='XPPowerOption_btnClose']")
	WebElement btnclose;

	@FindBy(xpath = "//input[@id='XPPowerOption_btnPowerOptionSave']")
	WebElement btnapplypower;

	// printer
	@FindBy(xpath = "//input[@id='XPPrinter_btnNewPrinter']")
	WebElement btnadd;

	@FindBy(xpath = "//select[@id='XPPrinter_ddlPrinterType']")
	WebElement ddporttype;

	@FindBy(xpath = "//input[@id='XPPrinter_txtLocalPrinterName']")
	WebElement txtprintername;

	@FindBy(xpath = "//select[@id='XPPrinter_ddlManufacturer']")
	WebElement ddmanufacture;

	@FindBy(xpath = "//select[@id='XPPrinter_ddlPrinterDriverLists']")
	WebElement ddprinterdevicelist;

	@FindBy(xpath = "//select[@id='XPPrinter_ddlPortlist']")
	WebElement ddport;

	@FindBy(xpath = "//input[@id='XPPrinter_rbtnShared']")
	WebElement rdshared;

	@FindBy(xpath = "//input[@id='XPPrinter_rbtnNotShared']")
	WebElement rdnotshared;

	@FindBy(xpath = "//input[@id='XPPrinter_btnXPPrinter']")
	WebElement btnprintersetapply;

	@FindBy(xpath = "//input[@id='XPPrinter_btnCloseXPPrinter']")
	WebElement btncloseprinter;

	@FindBy(xpath = "//input[@id='XPPrinter_txtIPAddress']")
	WebElement textip;

	@FindBy(xpath = "//input[@id='XPPrinter_txtNwUserName']")
	WebElement txtusername;

	@FindBy(xpath = "//input[@id='XPPrinter_txtNwPassword']")
	WebElement txtpassword;

	// Mailer Engine
	@FindBy(xpath = "(//label[@title='Mailer Engine Configuration'])[2]")
	WebElement tabmailerEngine;

	@FindBy(xpath = "//label[@id='ContentPlaceHolder1_lblmenuSMTPServerConfiguration']")
	WebElement tabSmtpServerConfig;

	@FindBy(xpath = "//input[@id='txtSmtpServerAddress']")
	WebElement txtSmtpServer;

	@FindBy(xpath = "//input[@id='txtAccName']")
	WebElement txtSmtpAccountName;

	@FindBy(xpath = "//input[@id='txtPassword']")
	WebElement txtSmtpPassword;

	@FindBy(xpath = "//input[@id='chkPort']")
	WebElement rdSmtpenableSSL;

	@FindBy(xpath = "//input[@id='txtSenderAddress']")
	WebElement txtSmtpDisplayName;

	@FindBy(xpath = "//input[@id='txtPort']")
	WebElement txtSmtpPortNo;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_btnSaveSMPT']")
	WebElement btnSmtpSave;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_btnTestSMPT']")
	WebElement btnSmtpTestConnection;

	@FindBy(xpath = "//label[@id='ContentPlaceHolder1_lblSaveSMPT']")
	WebElement lblSmtpcontest;

	@FindBy(xpath = "//div[@class='col-md-12 loading']")
	WebElement Loader1;

	@FindBy(xpath = "//li[@id='divConfigurationSetup']")
	WebElement tabconfig;

	public void mailerEngine() throws InterruptedException 
	
	{
		tabconfig.click();
		btSPAdmin.click();
		btnExpandMenu.click();
		tabmailerEngine.click();
		tabSmtpServerConfig.click();
		txtSmtpServer.clear();
		txtSmtpServer.sendKeys("mail.vxlsoftware.com");
		txtSmtpDisplayName.clear();
		txtSmtpDisplayName.sendKeys("Support_Admin");
		txtSmtpAccountName.clear();
		txtSmtpAccountName.sendKeys("support@vxlsoftware.com");
		txtSmtpPortNo.clear();
		txtSmtpPortNo.sendKeys("25");

		txtSmtpPassword.sendKeys("VXl#124");

		//rdSmtpenableSSL.click();
		btnSmtpTestConnection.click();
		utility.isInvisible(Loader1, wd, 10);

		String Return_MSG = lblSmtpcontest.getText();

		if (Return_MSG.contains("Test Connection Failed.")) 
		{
			rdSmtpenableSSL.click();
			btnSmtpTestConnection.click();
		}

		String Return_MSG1 = lblSmtpcontest.getText();
		utility.isInvisible(Loader1, wd, 10);
		if (Return_MSG1.contains("Test connection successfully")) 
		{
			btnSmtpSave.click();

		}

		else 
		{
			System.out.println(Return_MSG);
		}
		Thread.sleep(3000);
		String Return_MSG2 = lblSmtpcontest.getText();
		Assert.assertEquals(Return_MSG2, "Settings saved successfully.");

	}

	public void openRepo() throws IOException  
	{
		
	//	 if(lblMenu_Repository.isDisplayed()==true) 
		 { 	
			 
		 }
	//	 else 
		 {
			tabconfig.click();
			btnExpandMenu.click();}
	//				
		 
		 
		lblMenu_Repository.click();
		connTab.click();
		btnExpandMenu.click();
		File xlsFile = new File(xlsPath);
		FileInputStream inputStream = new FileInputStream(xlsFile);
		@SuppressWarnings("resource")
		XSSFWorkbook wb = new XSSFWorkbook(inputStream);

		XSSFSheet sheet = wb.getSheet("CreateRepo");

		int totalNoOfRows, totalNoOfCells;

		totalNoOfRows = sheet.getLastRowNum() - sheet.getFirstRowNum();
		totalNoOfCells = sheet.getRow(0).getPhysicalNumberOfCells();

		System.out.println("Rows" + totalNoOfRows + " and " + "Column" + totalNoOfCells);

		for (int i = 1; i <= totalNoOfRows; i++)

		{

			// Open new form

			btnNewConn.click();

			// Enter details for repo.

			String protocolType, repotypedata, ftpSsl;

			txtConnName.sendKeys(sheet.getRow(i).getCell(0).getStringCellValue());
			Select protoType = new Select(ddlProtocolType);
			protocolType = sheet.getRow(i).getCell(1).getStringCellValue();
			protoType.selectByValue(protocolType);

			Select repoType = new Select(ddlRepository);
			repotypedata = sheet.getRow(i).getCell(2).getStringCellValue();
			repoType.selectByValue(repotypedata);
			txtipserver.sendKeys(sheet.getRow(i).getCell(3).getStringCellValue());
			txtAgentIp.sendKeys(sheet.getRow(i).getCell(4).getStringCellValue());

			if (ddlFtpType.isEnabled() == true)

			{

				Select ftpsslddl = new Select(ddlFtpType);
				ftpSsl = sheet.getRow(i).getCell(5).getStringCellValue();
				ftpsslddl.selectByValue(ftpSsl);
			}

			txtFolderPath.sendKeys(sheet.getRow(i).getCell(7).getStringCellValue());
			txtUserName.sendKeys(sheet.getRow(i).getCell(8).getStringCellValue());
			txtpwd.sendKeys(sheet.getRow(i).getCell(9).getStringCellValue());

			txtDomain.sendKeys(sheet.getRow(i).getCell(10).getStringCellValue());

			btnSave.click();
			btnValidate.click();
			String msg = labvalidatecon.getText();

			if (msg.contains("Connection failed.") || msg.contains("Invalid")) 
			{
				System.out.println(sheet.getRow(i).getCell(0).getStringCellValue() + ":-" + msg);
			}

			else 
			{
				System.out.println(sheet.getRow(i).getCell(0).getStringCellValue() + ":-" + msg);
			}
			btnClose.click();
		}

	}

	public void syncRepo() throws IOException 
	{
		connTab.click();
		File xlsFile = new File(xlsPath);
		FileInputStream inputStream = new FileInputStream(xlsFile);
		@SuppressWarnings("resource")
		XSSFWorkbook wb = new XSSFWorkbook(inputStream);
		XSSFSheet sheet = wb.getSheet("CreateRepo");

		int totalNoOfRows, totalNoOfCells;

		totalNoOfRows = sheet.getLastRowNum() - sheet.getFirstRowNum();
		totalNoOfCells = sheet.getRow(0).getPhysicalNumberOfCells();

		System.out.println("Rows" + totalNoOfRows + " and " + "Column" + totalNoOfCells);

		for (int i = 1; i <= totalNoOfRows; i++) 
		{

			Searchbar.sendKeys(sheet.getRow(i).getCell(0).getStringCellValue());
			
			clicksyncrepo.click();
			if (utility.isInvisible(Loader, wd, 30) == true)
				;

			String Msg = lblreturnmsg.getText();

			if (Msg.contains("successfully")) 
			{
				System.out.println(sheet.getRow(i).getCell(0).getStringCellValue() + ":-" + Msg);
			} else 
			{
				System.out.println(sheet.getRow(i).getCell(0).getStringCellValue() + ":-" + Msg);
			}
			Searchbar.clear();

		}
	}
}
