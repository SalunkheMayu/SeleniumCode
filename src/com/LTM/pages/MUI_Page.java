package com.LTM.pages;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.PageFactory.utility;

public class MUI_Page extends utility {

	public WebDriver wd;

	@FindBy(xpath = "//a[@id='btSPAdmin']")
	WebElement tabconfig;

	@FindBy(xpath = "//div[@id='btnExpandMenu']")
	WebElement btnExpandMenu;

	@FindBy(xpath = "//div[@id='btnExpandMenu']")
	WebElement btnExpand;

	@FindBy(xpath = "(//label[@title='General Configuration'])[2]")
	WebElement Clickgenralconfig;

	@FindBy(xpath = "//span[@id='ContentPlaceHolder1_Label5']")
	WebElement tablocalization;

	@FindBy(xpath = "//span[@id='ContentPlaceHolder1_lblMultilanguageTool']")
	WebElement ClickMUI;

	@FindBy(xpath = "//select[@id='ContentPlaceHolder1_ddlLocale']")
	WebElement ddLocal;

	@FindBy(xpath = "//select[@id='ContentPlaceHolder1_ddlmultilanguageType']")
	WebElement ddtype;

	@FindBy(xpath = "//input[@aria-controls='tblmultilanguageTool']")
	WebElement searchbar;

	@FindBy(xpath = "//div[@class='col-md-12 loading']")
	WebElement loader;

	// private final String xlsPath="C:\\Users\\Administrator\\Desktop\\String\\MUI
	// new languages\\Greek.xlsx";

	//private final String xlsPath = "C:\\Users\\Administrator\\Desktop\\String\\MUI new languages\\Italian_Rajendra.xlsx";
	
	//private final String xlsPath = "C:\\Users\\Administrator\\Desktop\\String\\MUI new languages\\Amol\\Turkish_Rajendra.xlsx";
	
	private final String xlsPath = "C:\\Users\\Administrator\\Desktop\\String\\MUI new languages\\Nikita\\Greek.xlsx";
	
	//Nikita\\Turkish_Nikita_First_100_01.xlsx

	@FindBy(xpath = "(//input[@class='Comp_description'])[1]")
	WebElement verify_First;

	@FindBy(xpath = "(//input[@class='Comp_description'])[2]")
	WebElement verify_Second;

	@FindBy(xpath = "(//input[@class='Comp_description'])[3]")
	WebElement verify_Third;

	@FindBy(xpath = "(//input[@class='clickabledEdit edit btn blue-hoki'])[1]")
	WebElement btnedit_First;

	@FindBy(xpath = "(//input[@class='clickabledEdit edit btn blue-hoki'])[2]")
	WebElement btnedit_Second;

	@FindBy(xpath = "(//input[@class='clickabledEdit edit btn blue-hoki'])[3]")
	WebElement btnedit_Third;

	@FindBy(xpath = "(//input[@class='clickabledSave edit btn blue-hoki'])[1]")
	WebElement btnsave_First;

	@FindBy(xpath = "(//input[@class='clickabledSave edit btn blue-hoki'])[2]")
	WebElement btnsave_Second;

	@FindBy(xpath = "(//input[@class='clickabledSave edit btn blue-hoki'])[3]")
	WebElement btnsave_Third;

	@FindBy(xpath = "//span[@id='ContentPlaceHolder1_lblmultilanguageerrormsg']")
	WebElement lblsave;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_btnLocaleRefresh']")
	WebElement btnrefresh;

	@FindBy(xpath = "//*[contains(text(), 'No matching records found')]")
	WebElement norecoedfound;

	
	public MUI_Page(WebDriver wd) {
		this.wd = wd;
		// PageFactory.initElements(wd, this);
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		PageFactory.initElements(wd, this);
	}

	public void greek() throws IOException 
	{

		// XSSFCell cell = null;

		File xlsFile = new File(xlsPath);
		FileInputStream inputStream = new FileInputStream(xlsFile);
		@SuppressWarnings("resource")
		XSSFWorkbook wb = new XSSFWorkbook(inputStream);

		XSSFSheet sheet = wb.getSheet("Google Translation");
		int totalNoOfRows; //totalNoOfCells;

		//totalNoOfCells = sheet.getPhysicalNumberOfRows();
		totalNoOfRows = sheet.getPhysicalNumberOfRows();
		
		//System.out.println("Rows" + totalNoOfRows + " and " + "Column" + totalNoOfCells);

		tabconfig.click();
		btnExpandMenu.click();
		Clickgenralconfig.click();
		tablocalization.click();
		ClickMUI.click();

		Select Drop_lan = new Select(ddLocal);
		Drop_lan.selectByVisibleText("Greek");
		//Drop_lan.selectByVisibleText("Italian");
		//Turkish
		//Drop_lan.selectByVisibleText("Turkish");
		//wd.switchTo().alert().accept();

		Select Drop_type = new Select(ddtype);
		Drop_type.selectByVisibleText("Application");

		utility.isVisible(searchbar, wd, 30);

		// searchbar.clear();

		for (int i = 1; i < totalNoOfRows+1; i++) 
		{
			searchbar.sendKeys(sheet.getRow(i).getCell(0).getStringCellValue());
			System.out.println(sheet.getRow(i).getCell(0).getStringCellValue()+"  And "+sheet.getRow(i).getCell(1).getStringCellValue());

			String MUICell = sheet.getRow(i).getCell(0).getStringCellValue();
			
			if(utility.isClickable(norecoedfound, wd, 1) == false)
        
		{
			if (utility.isClickable(btnedit_First, wd, 1) == true) 
			{

				btnedit_First.click();

				@SuppressWarnings("deprecation")
				String ABC_First = verify_First.getAttribute("Value");

				if (ABC_First.equals(MUICell))

				{
					verify_First.clear();
					verify_First.sendKeys(sheet.getRow(i).getCell(1).getStringCellValue());
					btnsave_First.click();
				}

			}

			String str = lblsave.getText();

			if (str.contains("Record Updated Successfully.") == false) 
			{
				if (utility.isClickable(btnedit_Second, wd, 1) == true) 
				{
					btnedit_Second.click();
					String ABC_Second = verify_Second.getDomAttribute("Value");

					if (ABC_Second.equals(MUICell))

					{
						verify_Second.clear();
						verify_Second.sendKeys(sheet.getRow(i).getCell(1).getStringCellValue());
						btnsave_Second.click();
					}
				}

			}

			String str1 = lblsave.getText();

			if ((str.contains("Record Updated Successfully.") == false)
					&& (str1.contains("Record Updated Successfully.") == false))
			// if(str.equals(str1)==false)
			{

				if (utility.isClickable(btnedit_Third, wd, 1) == true) {

					btnedit_Third.click();
					String ABC_Third = verify_Third.getDomAttribute("Value");

					if (ABC_Third.equals(MUICell))

					{
						verify_Third.clear();
						verify_Third.sendKeys(sheet.getRow(i).getCell(1).getStringCellValue());
						btnsave_Third.click();
					}
				}
			
			}
		}
			// Write Data Into Excel

			//File file = new File("C:\\Users\\Administrator\\Desktop\\String\\MUI new languages\\Italian_Rajendra_01.xlsx");//Amol_Last__Greek_100_01
			//File file = new File("C:\\Users\\Administrator\\Desktop\\String\\MUI new languages\\Amol\\Turkish_Rajendra_01.xlsx");
			File file = new File("C:\\Users\\Administrator\\Desktop\\String\\MUI new languages\\Nikita\\Greek_01.xlsx");
			sheet.createRow(0).createCell(2).setCellValue("Remark");//Turkish_Nikita_First_100_01
			

			String str2 = lblsave.getText();
			if ((str2.contains("Record Updated Successfully."))&& (utility.isClickable(norecoedfound, wd, 1) == false)) 
			//if (str2.contains("Record Updated Successfully."))
			{
				sheet.getRow(i).createCell(2).setCellValue("Done");
			}

			else {
				sheet.getRow(i).createCell(2).setCellValue("No Found");
			}
			FileOutputStream fos = new FileOutputStream(file);
			wb.write(fos);
			searchbar.clear();
		}
		wd.close();
	}

}
