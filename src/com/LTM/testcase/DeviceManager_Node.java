package com.LTM.testcase;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.collections4.map.HashedMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;
import com.LTM.pages.ConfigurationSetup_Page;
import com.LTM.pages.DeviceManagerAdministrator_Page;
import com.LTM.pages.DeviceManagerConnectionMGMT_Page;
import com.LTM.pages.DeviceManagerSecurity_Page;
import com.LTM.pages.DeviceManagerSystemseting_Page;
import com.LTM.pages.DeviceManagerUsersetting_Page;
import com.LTM.pages.Login_Page;
import com.LTM.pages.UserManagement_Page;
import com.PageFactory.utility;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;

public class DeviceManager_Node<ATUTestRecorder> {

	utility selUtility=new utility();
	WebDriver wd= utility.startBrowser("chrome", "https://192.168.3.13");
	
	//Create Object
	
	DeviceManagerSystemseting_Page dm=new DeviceManagerSystemseting_Page(wd);
	UserManagement_Page user= new UserManagement_Page(wd);
	DeviceManagerUsersetting_Page ds= new DeviceManagerUsersetting_Page(wd);
	ConfigurationSetup_Page con= new ConfigurationSetup_Page(wd);
	DeviceManagerAdministrator_Page da= new DeviceManagerAdministrator_Page(wd);
	DeviceManagerSecurity_Page dms=new DeviceManagerSecurity_Page(wd);
	DeviceManagerConnectionMGMT_Page dc= new DeviceManagerConnectionMGMT_Page(wd);
	Assertion softAssert = new SoftAssert();
	Login_Page abc = new Login_Page(wd);
	
	
	String className = this.getClass().getSimpleName();
	String timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
	ATUTestRecorder recorder;
	
	//private final String xlsPath= "C:\\Users\\Administrator\\Desktop\\Agent Setup\\LTMData.xlsx";
	
	/* Create an instance of Soft Assert */
	
	
	@DataProvider
	public Object [][]getdata() 
	{
		//Login Page
		HashedMap<String, String> map= new HashedMap<String, String>();
		map.put("User", "admin");
		map.put("Pass", "admin");
		
		//Domain Name
		map.put("dmUser", "asit");
		map.put("dmPass", "asit#123");
		
		//Computer Name
		map.put("grp", "WORKGROUP");
		map.put("cmUser", "administrator");
		map.put("cmPass", "000000");
		
		//Printer Setting
		map.put("Pindex", "IP Port"); // 0 For local,1 for IP, 2 for Network
		map.put("Pname", "test");
		
		return new Object[][] {{map}};
	}
	
	@Test (priority=0, dataProvider="getdata")
	public void login(HashedMap<String , String> input)
	{
	//	recorder = new ATUTestRecorder("D:\\Recorder\\", "" +className+ "" + timestamp +"", false);
	//	recorder.start();
		
		
		abc.login_details(input.get("User"),input.get("Pass"));
		if (utility.isDisaplyed(By.id("ibtntHome"), wd, 6000) == true);
	}
	
	@Test (priority=1)
	public void checkUrl() 
	{
	  utility.checkUrl(wd);	
	}
	
	
	@Test (priority=2)
	public void addgrp() 
	{
		dm.addgrp();
	}
	
	@Test (priority=3)
	public void movedevice() 
	{
		dm.movedevice();
	}
	@Test (priority=4)
	public void syncdevice() 
	{
	 dm.syncdevice();	
	}
	
	@Test(priority=5)
	public void x802security() 
	{
		dm.x802security();
	}
	
	
	@Test(priority=6,dataProvider="getdata")
	public void deviceMangeerComputer(HashedMap<String , String> input)
	{
	   dm.setComputerName(input.get("dmUser"),input.get("dmPass"));
	 }
	
	
	@Test(priority=7,dataProvider="getdata")
	public void deviceMangeerDomian(HashedMap<String , String> input)
	{
		dm.setDomainName(input.get("grp"),input.get("cmUser"),input.get("cmUser"));
	}
	
	@Test (priority=8)
	public void ethernetsetup() 
	{
	 dm.ethernetsetup();
	}
	
	@Test(priority=9)
	public void periferal() 
	{
	  dm.periferal("Disabled");	//Synchronise Inventory settings has been applied.
	}

	@Test(priority=10)
	public void powerMgmt() 
	{
	 dm.powerMgmt();	
	}
   
	@Test(priority = 11,dataProvider="getdata")
	public void printer(HashedMap<String , String> input)
	{
		dm.printer(input.get("Pindex"),input.get("Pname"));
	}
	
	@Test(priority = 12)
	public void timelanguage()
	{
		dm.timelanguage();
	}
	
	@Test(priority = 13)
	public void regionandlocation() 
	{
		dm.regionandlocation();	
	}
	
	
	@Test (priority=14)
	public void usersetting() 
	{
		ds.usersetting();
	}
	

	@Test (priority=15)
	public void applicationcommand()
	{
	  da.applicationcommand();	
	}
	
	@Test (priority=16)
	public void performancemgmt()
	{
	  da.performancemgmt();	
	}
	
	@Test (priority=17)
	public void remoteagent()
	{
	  da.remoteagent();	
	}
	
	@Test (priority=18)
     public void security()
     {
	   dms.Security();
	 }
	
	
	@Test (priority=19)
	public void Con_Citix() 
	{
       dc.Con_Citix();		
	}
	
	@Test (priority=20)
	public void Con_CustomExeCon() 
	{
       dc.Con_CustomExeCon();		
	}
	
	@Test (priority=21)
	public void Con_RDP() 
	{
       dc.Con_RDP();		
	}
	
	@Test (priority=22)
	public void Con_Teradici() 
	{
       dc.Con_Teradici();		
	}
	
	@Test (priority=23)
	public void Con_VMWare() 
	{
       dc.Con_VMWare();		
	}
	
	@Test (priority=24)
	public void VMViewGlobal() 
	{
	 dc.VMViewGlobal();	
	}
	
	@Test (priority=25)
	public void SoftwareDeploment() 
	{
	 dc.SoftwareDeploment("C:\\Logs\\", "C:\\Logs\\", "C:\\Logs\\rescuepe.log", "C:\\Logs\\","C:\\Logs\\");	
	}
	
	@Test (dependsOnMethods = "login",priority=26)
	public void quit() throws ATUTestRecorderException
	{
		wd.quit();
	//	recorder.stop();
	}
	
}	/*
	

	
	
/* {
		test=extent.createTest("Invalid User login").assignAuthor("Mateen").assignCategory("Functional Test Case").assignDevice("Windows");
		FusionLoginPage login=new FusionLoginPage(wd);
		ConfigurationSetupPage configPage=new ConfigurationSetupPage(wd);
		login.LoginButton("admin","admin");
	//	Assert.assertEquals(login.errorMesssageDisplay(), false);
		
		
		configPage.openRepo();
		
		
	//	driver.close();
		
	}*/

	//@Test (priority=2)

	/*public void verifyValidUserLogin()

	{	
		//DeviceManagerPage dmPage=new DeviceManagerPage(driver);

		//test=extent.createTest("Valid User login").assignAuthor("Vinayak").assignCategory("Functional Test Case").assignDevice("Windows");
		//FusionLoginPage login=new FusionLoginPage(driver);
		
		
		
		try {

			File xlsFile=new File(xlsPath);
			FileInputStream inputStream=new FileInputStream(xlsFile);
			@SuppressWarnings("resource")
			XSSFWorkbook wb=new XSSFWorkbook(inputStream);
			XSSFSheet sheet=wb.getSheet("logindetails");

			@SuppressWarnings("unused")
			int totalNoOfRows,totalNoOfCells;

			totalNoOfRows=sheet.getLastRowNum()-sheet.getFirstRowNum();
			totalNoOfCells=sheet.getRow(0).getPhysicalNumberOfCells();;
		

			for (int i=0;i<=totalNoOfRows;i++)
			{			
					
					String userName=sheet.getRow(i).getCell(0).getStringCellValue();
					String pwd=sheet.getRow(i).getCell(1).getStringCellValue();
					
					System.out.println(userName+ " and " + pwd);
					abc.login_details(userName,pwd);
					if (selUtility.isDisaplyed(By.id("ibtntHome"), wd, 6000) == true);
					
					
			}
			
		}
		
	 catch (Exception e) 
	{
		System.out.println(e.getMessage());
	}

		
		
		
}	
	@Test (priority=3)	
	public void openrepo()
	{
	  con.openRepo();
	}
	@Test (priority=4)
	public void syncRepo() throws IOException
	{
		con.syncRepo();
	}
	
 @Test (priority=5)
	public void quit()
	{
		wd.quit();
	}*/
 
 
	/*login.LoginButton(userName,pwd);
					
					if (login.errorMesssageDisplay()==true)
					{
						
						
						System.out.println(userName+" and " + pwd +"Incorrect.");
						
						
					}else
						
					{
					
						dmPage.verifySuccessLoggin();
						System.out.printl
						n(userName+" and " + pwd +"correct.");
					}
					
					//create a new cell in the row at index 6
					//XSSFCell cell = sheet.getRow(i).createCell(6);
					
					//Boolean result=login.LoginButton(userName, pwd).verifySuccessLoggin();
					
					//check if confirmation message is displayed
//					if (result==true){
//						// if the message is displayed , write PASS in the excel sheet
//						cell.setCellValue("PASS");
//
//					} else {
//						//if the message is not displayed , write FAIL in the excel sheet
//						cell.setCellValue("FAIL");
//					}
//
//					// Write the data back in the Excel file
//					FileOutputStream outputStream = new FileOutputStream(xlsPath);
//					wb.write(outputStream);


			}*/

		
		//}	
		
	//	selUtil.readWriteXls();
//		System.out.println("Assert DM logo visible Passed!");
//		
//		checking form load 
//		FormLoadCheckPage frmLoad=new FormLoadCheckPage(driver);
//		frmLoad.checkUrlStatus();
//		
//		
//		//logout process
		/*HeaderPage headerPage=new HeaderPage(driver);
		headerPage.logoutSuccess();
		System.out.println("Assert  logout module test case Passed!");*/	
	
	
	
	
	/* @Test(enabled=false,description="veriftLogoutMoudle")

	public void veriftLogoutMoudle()
	{
		test=extent.createTest("Verify Logout Module").assignAuthor("Vinayak").assignCategory("Functional Test Case").assignDevice("Windows");
		
		HeaderPage headerPage=new HeaderPage(driver);
		headerPage.logoutSuccess();
		System.out.println("Assert  logout module test case Passed!");	
	}*/
	
	
//}





