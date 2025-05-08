package flex;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Insert_from_Excel {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		FileInputStream fis = new FileInputStream("D:\\Insert\\W362_OC.xlsx");

		@SuppressWarnings("resource")
		XSSFWorkbook wb = new XSSFWorkbook(fis);
        // Read Excel sheet
		XSSFSheet sheet = wb.getSheet("Fail_97");
		int rowCount = sheet.getPhysicalNumberOfRows()-1;// sheet.getLastRowNum() - sheet.getFirstRowNum();

		// Web Driver setup
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// Create Object
		Utility selUtil = new Utility();
		XSSFCell cell = null;
		
		// Login
		selUtil.login_Flex(wd, "http://www.bmc-scada.online/flex/login.aspx", "meflex", "meflex", "5476931802");
		// Mouse action
		Actions a = new Actions(wd);
		Thread.sleep(2000);

		// For read and write data from excel
		System.out.println("No of Record Found Into Excel :- " + rowCount);

		for (int i = 10; i <= rowCount; i++) 
		{
			try 
			{

				//Enter Batch No From
				WebElement BatchFrom = wd.findElement(By.id("ctl00_cphBody_txtBatchFrom"));
				BatchFrom.sendKeys(sheet.getRow(i).getCell(0).getRawValue());
				
				//Enter Batch No To
				WebElement BatchTo = wd.findElement(By.id("ctl00_cphBody_txtBatchTo"));
				//String aString=sheet.getRow(i).getCell(1).getRawValue();
				BatchTo.sendKeys(sheet.getRow(i).getCell(1).getRawValue());
				wd.findElement(By.id("ctl00_cphBody_btnSearch")).click();
				
				//Click On Batch No
				Thread.sleep(3000);
				wd.findElement(By.id("ctl00_cphBody_gvBatchList_ctl02_lnkBatchNo")).click();
				if (selUtil.isDisaplyed(By.id("ctl00_cphBody_drpCustomer"), wd, 15000) == true);
					
				//Enter Customer Name
				WebElement myEle_Cust = wd.findElement(By.id("ctl00_cphBody_drpCustomer"));
				//String abcString=sheet.getRow(i).getCell(2).getStringCellValue();
				Thread.sleep(2000);
					
				//selUtil.Dropdown(myEle_Cust, sheet.getRow(i).getCell(2).getStringCellValue());
				
				selUtil.Dropdown(myEle_Cust, sheet.getRow(i).getCell(2).getStringCellValue());
				Thread.sleep(3000);

				// Enter Site Name
				WebElement myEle_Site = wd.findElement(By.xpath("//select[@id='ctl00_cphBody_drpsite']"));
				selUtil.Dropdown(myEle_Site, sheet.getRow(i).getCell(3).getStringCellValue());
				Thread.sleep(3000);

				//Enter Production Qty
				wd.findElement(By.id("ctl00_cphBody_txtPrintProductionQty")).clear();
				if (selUtil.isInvisible(By.xpath("//img[@id='ctl00_cphBody_imgLoader']"), wd, 30000) == true);
				Thread.sleep(2000);
				wd.findElement(By.xpath("//button[contains(text(),'OK')]")).click();
				
				//Create Raw
				WebElement P_Qty = wd.findElement(By.id("ctl00_cphBody_txtPrintProductionQty"));
				P_Qty.sendKeys(sheet.getRow(i).getCell(4).getRawValue());
				a.click().sendKeys(Keys.ENTER).perform(); //if (selUtil.isDisaplyed(By.xpath("//button[contains(text(),'OK')]")
				if (selUtil.isDisaplyed(By.xpath("//div[@class='sweet-alert showSweetAlert visible']"), wd, 30000) == true);
				wd.findElement(By.xpath("//button[contains(text(),'OK')]")).click();

				//Enter Grade
				WebElement myEle_grade = wd.findElement(By.id("ctl00_cphBody_ddlReceipeCode"));
				Select dropdown_grade = new Select(myEle_grade);// For select Hardware Type
				dropdown_grade.selectByVisibleText(sheet.getRow(i).getCell(5).getStringCellValue());

				// if (selUtil.isDisaplyed(By.xpath("//button[contains(text(),'OK')]"), wd,
				if (selUtil.isDisaplyed(By.xpath("//div[@class='sweet-alert showSweetAlert visible']"), wd, 30000) == true);
				wd.findElement(By.xpath("//button[contains(text(),'OK')]")).click();

				//Click Submit Button
				wd.findElement(By.id("ctl00_cphBody_btn_submit")).click();
			//	if (selUtil.isDisaplyed(By.xpath("//p[contains(text(),'Batch created successfully.')]"), wd, 8000) == true);
					

				 cell = sheet.getRow(i).createCell(6);

				WebElement print_msg = wd.findElement(By.xpath("//p[contains(text(),'Batch created successfully.')]"));
				String text = print_msg.getText();
				 

				if (print_msg.isDisplayed()) {

					cell.setCellValue("PASS");

				} 
				/*else {
					cell.setCellValue("FAIL");
				}*/

				FileOutputStream outputStream = new FileOutputStream("D:\\Insert\\W362_OC_01.xlsx");
				wb.write(outputStream);
				
				System.out.println(sheet.getRow(i).getCell(0).getRawValue() + ":" + text);
				Thread.sleep(3000);
				wd.findElement(By.xpath("//button[contains(text(),'OK')]")).click();

				wd.findElement(By.id("ctl00_cphBody_btn_clear")).click();
				Thread.sleep(2000);
			} 
			catch (Exception e) 
			{
				cell = sheet.getRow(i).createCell(6);
				cell.setCellValue("FAIL");
				FileOutputStream outputStream = new FileOutputStream("D:\\Test_01.xlsx");
				wb.write(outputStream);
				//System.out.println(text);
				WebElement Batch= wd.findElement(By.xpath("//i[@class='md md-details']"));
				a.moveToElement(Batch).perform();
				Thread.sleep(4000);
				wd.findElement(By.linkText("Batch List")).click();
				continue;
			}
			
			

		}
		
       
		wd.close();
	}

}
