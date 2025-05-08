package com.LTM.pages;

import java.io.FileInputStream;
import java.io.FileOutputStream;
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.PageFactory.utility;

public class Report_Audit_Log_Page extends utility
{
public WebDriver wd;
	
	public Report_Audit_Log_Page(WebDriver wd) 
	{
		this.wd = wd;
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		PageFactory.initElements(wd, this);
	}
	
	//FileInputStream fis = new FileInputStream("D:\\Insert\\W362_OC.xlsx");

	@FindBy(xpath = "//img[@id='siteHeaderLogo']")
	WebElement Label;
	
	
  @FindBy (xpath = "//li[@id='divViewReportsAuditLogs']")
  WebElement tabreportauditlog;
  
  @FindBy(xpath = "//div[@id='btnExpandMenu']")
  WebElement btnexpandmenu;
  
  
  //@FindBy(linkText = "Custom Config Report")
  @FindBy(xpath = "//a[@title='Custom Config Report']")
  WebElement clickcustomconfig;

  @FindBy(className = "AddCustomConfigReportDiv")
 // @FindBy(xpath = "//a[@id='A1']//following-sibling::a[@title='Add']")
  WebElement brnaddcustomreport;
  @FindBy(xpath = "//a[@id='A1']//following-sibling::a[@title='Add']")
  WebElement secondtimeclick;
  
 // wd.findElement(By.className("AddCustomConfigReportDiv")).click();

  @FindBy(id = "txtName")
  WebElement txtname;

  @FindBy(id = "txtDescription")
  WebElement txtdesc;

  @FindBy(className="multiselect-selected-text") 
  WebElement chkshare;
  
  @FindBy(xpath = "//label[@id='lblAddCustomConfigReports_Name']")
  WebElement lblName;

  @FindBy(id ="ddlCategory" )
  WebElement chkcategory;
  
  @FindBy(id="ddlOptionsValues")
  WebElement ddoptionAnalysisreport;
  
  @FindBy(id="ddlDCROptions")
  WebElement ddoptiondevicecountreport;
  
  @FindBy(id = "ddlPatchReportOptions")
  WebElement ddpathreportoption;
  
  @FindBy(id="ddlPatchReportCriteria")
  WebElement ddoptionpathreport;
  
  @FindBy(id="ddlSTRFilters")
  WebElement ddoptionsystemtracking;
  
  @FindBy(id="ddlSURFilters")
  WebElement ddoptionsystemusages;
  
  @FindBy(id="ddlSURFilters")
  WebElement ddfilter;
  
  @FindBy(xpath = "//input[@aria-controls='tblCustomConfigReports']")
  WebElement txtreport;
  
  @FindBy(xpath = "//tbody/tr[1]/td[8]/button[1]")
  WebElement btnrunreport;
  
  @FindBy (id="btnCustomConfigReports_Save")
  WebElement btnsavereport;
  
  @FindBy(id = "btnCustomConfigReports_Close")
  WebElement btncolsereport;
  
  @FindBy(id="lblMsg")
  WebElement returnmsg;
  
  @FindBy(id="ddlSystemProfileInfoType")
  WebElement ddsubcatsystemprofileinfo;
  
  @FindBy(id="ddlRemoteSubCat")
  WebElement ddsubcatsyremoteinstall;
  
  @FindBy(id = "ddlHardwareCategoryType")
  WebElement ddsubcatsyhardwaretype;
  
  @FindBy(xpath = "//select[@id='ddlApplicationUsageOptions']")
  WebElement appsusage;
  
  @FindBy(id="ddlRemoteSubCat")
  WebElement subcatremoteinstall;
  
  @FindBy(xpath = "(//span[@class='multiselect-selected-text'])[3]")
  WebElement column;
  
  @FindBy(xpath = "//input[@id='chkAutomail']")
  WebElement chkautomail;
  
  @FindBy (xpath = "//div[@id='divddlReportFormate']")
  WebElement ddreportformat;
  
  @FindBy(xpath = "//input[@value='XLS']")
  WebElement xls;
  
  @FindBy(xpath = "//input[@id='txtFromDate_temp']")
  WebElement datefrom;
  

  @FindBy(xpath = "//input[@id='txtToDate_temp']")
  WebElement dateto;
  
  @FindBy(xpath = "//select[@id='ddlDiscperiod_temp']")
  WebElement ddfrequency;
  
  @FindBy(xpath="//input[@id='txtRecipient0']")
  WebElement txtreceiptent;
  
  @FindBy(xpath = "(//button[@onclick='btnAddRecipient_Click();']//i[@class='fa fa-plus'])")
  WebElement addmialbutton;
  
  @FindBy(xpath = "//select[@class='ui-datepicker-year']")
  WebElement ddyear;
  
  @FindBy(linkText = "25")
  WebElement day;
  
  @FindBy(id = "lblCustomConfigReports_Category")
  WebElement lblCategory;
  
  
  public void customconfigreport() throws IOException, InterruptedException 
  {
	  //FileInputStream fis = new FileInputStream((System.getProperty("user.dir\\src\\TestVideos\\Custom_Config_Report.xlsx")));
	  
	  
	FileInputStream fis = new FileInputStream((System.getProperty("user.dir")+"\\TestVideos\\Custom_Config_Report.xlsx"));
	//XSSFSheet sheet=null;
	
	  @SuppressWarnings("resource")
	 XSSFWorkbook wb = new XSSFWorkbook(fis);
	  //XSSFWorkbook wb = new XSSFWorkbook(fis);
      // Read Excel sheet
		
	 XSSFSheet sheet = wb.getSheet("UEM");
	  
	 //XSSFSheet sheet = wb.getSheet("LUDM");
	  
	  
		int rowCount = sheet.getPhysicalNumberOfRows()-1;
	  
		XSSFCell cell = null;
	  
		System.out.println("No of Record Found Into Excel :- " + rowCount);
		
		
	  Actions a= new Actions(wd);
	  
	  tabreportauditlog.click();
	  utility.isVisible(btnexpandmenu, wd, 5);
	  btnexpandmenu.click();
	  utility.isVisible(clickcustomconfig, wd, 5);
	  clickcustomconfig.click();
	  Thread.sleep(6000);
	  wd.switchTo().frame("ContentPlaceHolder1_SelectedUC_iframeReportMgmt");
	  brnaddcustomreport.click();
	 
		
	  
	  for (int i=1;i<=rowCount;i++)
	  {
		
		  try 
		  {
		 
		//Click On Add Button
		  secondtimeclick.click();
		  
		  //Enter Report Name
		  txtname.sendKeys(sheet.getRow(i).getCell(0).getStringCellValue());
		 
		  //Enter Report Description
		  txtdesc.sendKeys(sheet.getRow(i).getCell(1).getStringCellValue());
		 
		  //Select All Option
		  a.moveToElement(chkshare).click().sendKeys(Keys.SPACE).perform();
		  
		  Thread.sleep(2000);
		  
		  lblName.click();
		  
		  Thread.sleep(2000);
		  //Select Category
		  utility.Dropdown1(chkcategory, sheet.getRow(i).getCell(2).getStringCellValue());
		  Thread.sleep(1000);
		  
		  //Sub category
		  String abc= sheet.getRow(i).getCell(0).getStringCellValue();
		  
		  if(abc.equalsIgnoreCase("Hardware Information") ||abc.equalsIgnoreCase("Remote Installation")||abc.equalsIgnoreCase("System Profile Info"))
		  {
			  if(abc.contains("Hardware"))
			  {
				  utility.Dropdown1(ddsubcatsyhardwaretype, sheet.getRow(i).getCell(3).getStringCellValue());
			  }
			  
			  else if(abc.contains("Remote"))
			  {
				 utility.Dropdown1(ddsubcatsyremoteinstall, sheet.getRow(i).getCell(3).getStringCellValue());
				}
			  
			  else if(abc.contains("System Profile Info"))
			  {
				 utility.Dropdown1(ddsubcatsystemprofileinfo, sheet.getRow(i).getCell(3).getStringCellValue());
			  }
			  
		  }  
		  
		  
		  //Select Column
		  if(column.isDisplayed()==true)
		  {
			  a.moveToElement(column).click().sendKeys(Keys.SPACE).perform();
			  Thread.sleep(5000);
			  lblName.click();
		  }
		  
		  if(abc.equalsIgnoreCase("System Profile Info")||abc.equalsIgnoreCase("Analysis Report")|| abc.equalsIgnoreCase("Application Usage Report")
			  ||abc.equalsIgnoreCase("Device Count Report")||abc.equalsIgnoreCase("Patch Report")
				||abc.equalsIgnoreCase("System Tracking Report")||abc.equalsIgnoreCase("System Usage Detail Report")||abc.equalsIgnoreCase("System Usage Report"))
				  
			  //if(abc.contains("Analysis Report")||abc.contains("Device Count")||abc.contains("Patch Report")
				//	  ||abc.contains("System Tracking Report")||abc.contains("Application Usage Report"))
			  {
				  
				  if(abc.contains("Application Usage Report"))
				  	{
					  utility.Dropdown1(appsusage, sheet.getRow(i).getCell(4).getStringCellValue());
					  utility.Dropdown1(ddoptionsystemusages, sheet.getRow(i).getCell(6).getStringCellValue());
				  	}
				  	
				  else if(abc.contains("Analysis Report"))
				  	{
				  		utility.Dropdown1(ddoptionAnalysisreport, sheet.getRow(i).getCell(5).getStringCellValue());
				  	}
				  
				  	else if(abc.contains("Device Count"))
				  	{
					  utility.Dropdown1(ddoptiondevicecountreport, sheet.getRow(i).getCell(5).getStringCellValue());
					}
				  
				  	else if(abc.contains("Patch Report"))
					{
				  		utility.Dropdown1(ddpathreportoption, sheet.getRow(i).getCell(5).getStringCellValue());
				  		utility.Dropdown1(ddoptionpathreport, sheet.getRow(i).getCell(6).getStringCellValue());
					}
				  	
				  	else if(abc.contains("System Tracking Report"))
					{
				  		utility.Dropdown1(ddoptionsystemtracking, sheet.getRow(i).getCell(6).getStringCellValue());
					}
				  	
				  	else if(abc.contains("System Usage Detail Report")||(abc.contains("System Usage Report")))
					{
				  		utility.Dropdown1(ddoptionsystemusages, sheet.getRow(i).getCell(6).getStringCellValue());
					}
				
					else if(abc.contains("System Tracking Report"))
					{
				  		utility.Dropdown1(ddoptionsystemtracking, sheet.getRow(i).getCell(5).getStringCellValue());
					}
				
				  	
					else if(abc.contains("System Tracking Report")||abc.contains("System Usage Detail Report")||abc.contains("System Usage Report"))
					  {
						 utility.Dropdown1(ddfilter, sheet.getRow(i).getCell(6).getStringCellValue());
					  }
				  
				  
			  	}
		
		  
		//Add Auto Mail ID	  
		 if( utility.isClicked(chkautomail)==true);
		 {
			 
			  ddreportformat.click();
			  xls.click();
			  	
			 
			  dateto.click();
			  Select year=new Select(ddyear);
			  year.selectByVisibleText("2024");
			 
			  day.click();
			  Select frequency=new Select(ddfrequency);
			  frequency.selectByIndex(2);
			  
			  txtreceiptent.sendKeys("ketan.bhagat@sundynetch.com");
			  
			  //For add Extra mail ID
			  
			 // addmialbutton.click();
			  //Thread.sleep(4000);
			  
			 
		 }
		
		// chkautomail.click();
		  
		// Select Format of Report
		  //Save Report
		  a.moveToElement(btnsavereport).release().build().perform();
		  btnsavereport.click();
		  Thread.sleep(3000);
		  
		  //Print Message
		  utility.print(returnmsg, sheet.getRow(i).getCell(0).getStringCellValue(),i);
		  String text = returnmsg.getText();
		  //System.out.println(text);
		  //Thread.sleep(3000);
		  
		  //Close Report
		  a.moveToElement(btncolsereport).release().build().perform();
		  btncolsereport.click();
		  Thread.sleep(2000);
		 
		  //Run Report
		  txtreport.clear();
		  txtreport.sendKeys(sheet.getRow(i).getCell(0).getStringCellValue());
		  btnrunreport.click();
		  Thread.sleep(4000);
		  
		  
		  //If alert Occured
		  
		  
		 try {
			 WebDriverWait wt = new WebDriverWait(wd, Duration.ofSeconds(2));
			 Alert alert=wt.until(ExpectedConditions.alertIsPresent());
			 System.out.println("Alert Text: " + alert.getText());
			 alert.accept();
			 
			 
		 }
		 catch (Exception e) 
		 {
		
		 }
		  
		  
		  
		  //Take Screent Shot
		  utility.TakeScreenshot(sheet.getRow(i).getCell(0).getStringCellValue(),wd);
		  
		  	cell = sheet.getRow(i).createCell(7);
		  	
			if (text.contains("Config report saved successfully")) 
			{
				cell.setCellValue(text);
			} 
			else 
			{
				cell.setCellValue(text);
			}
		  	 
			FileOutputStream outputStream = new FileOutputStream((System.getProperty("user.dir")+"\\TestVideos\\Custom_Config_Report_01.xlsx"));
			wb.write(outputStream);
		  
		  	
		}
	  
		  catch (Exception e) 
		 	{
			  	btnsavereport.click();
			  	cell.setCellValue("FAIL");
				FileOutputStream outputStream = new FileOutputStream((System.getProperty("user.dir")+"\\TestVideos\\Custom_Config_Report_01.xlsx"));
				wb.write(outputStream);
				secondtimeclick.click();
				continue;
			}
		  
	 } 
	 
	 
		
  }

  
 
}


  
