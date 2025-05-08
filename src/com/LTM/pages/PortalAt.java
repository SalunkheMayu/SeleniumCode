package com.LTM.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PortalAt {

	public static void main(String[] args) 
	{
		
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options= new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		WebDriver wd = new ChromeDriver(options);
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
		wd.get("http://192.168.1.97:81/Account/Login.aspx");
		Actions a=new Actions(wd);
		WebElement ddname=wd.findElement(By.xpath("//select[@id='ddUser']"));
		
		Select dduser=new Select (ddname);
		dduser.deselectByVisibleText("RAJENDRA TUKARAM MANE");
		wd.findElement(By.id("txtPassword")).sendKeys("Rmane@565");
		wd.findElement(By.id("btnSignIn")).click();
		
		WebElement details=wd.findElement(By.xpath("//a[@id='A4']"));
		a.moveToElement(details).build().perform();
		
		wd.findElement(By.xpath("//a[@id='A13']")).click();
		
		wd.findElement(By.xpath("//input[@id='MainContent_txtProjName']")).sendKeys("LTM");
		wd.findElement(By.xpath("//input[@id='MainContent_DtRevDate_txt']")).sendKeys("LTM");
		
		
		
	}

}
