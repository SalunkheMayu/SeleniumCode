package com.LTM.pages;


import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.PageFactory.utility;

public class Discovery_Page extends utility
{


	public WebDriver wd;
    
	public Discovery_Page(WebDriver wd) 
    {
 	   this.wd = wd;
 	   wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
 	   PageFactory.initElements(wd, this);
    }
    
    @FindBy(xpath = "//a[@id='ibtntHome']")
    WebElement btnhome;
    
    @FindBy(xpath = "//li[@id='divViewDiscovery']")
    WebElement btndiscovery;
    
    @FindBy(xpath = "//label[@id='ContentPlaceHolder1_lblMenuRegister']")
    WebElement tabregister;
    
    @FindBy(xpath = "//input[@aria-controls='tblDiscover']")
    WebElement searchbar;
    
    
    
    
    
}
