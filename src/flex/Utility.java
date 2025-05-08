package flex;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility

{
	public boolean isDisaplyed(By Locator, WebDriver wd, long tm)
	{
		boolean isDisplayed = false;

		try {

			WebDriverWait wt = new WebDriverWait(wd, Duration.ofSeconds(tm));
			wt.until(ExpectedConditions.visibilityOfElementLocated(Locator));
			isDisplayed = true;
		} catch (Exception e)

		{

			e.printStackTrace();

		}

		return isDisplayed;

	}

	
	public boolean isDisaplyedW(WebElement cat, WebDriver wd, long tm)
	{
		boolean isDisplayed = false;

		try {

			WebDriverWait wt = new WebDriverWait(wd, Duration.ofSeconds(tm));
			wt.until(ExpectedConditions.visibilityOf(cat));
			isDisplayed = true;
		} catch (Exception e)

		{

			e.printStackTrace();

		}

		return isDisplayed;

	}
	
	
	
	
	
	
	
	public boolean isInvisible(By Locator, WebDriver wd, long tm)
	{
		boolean isDisplayed = false;

		try {

			WebDriverWait wt = new WebDriverWait(wd, Duration.ofSeconds(tm));
			wt.until(ExpectedConditions.invisibilityOfElementLocated(Locator));
			isDisplayed = true;
		} catch (Exception e)

		{

			e.printStackTrace();

		}

		return isDisplayed;

	}
	
	
	public void Dropdown(WebElement cat, String visible)
	{
		// WebElement myEleDp = wd.findElement(By.id(cat));
		Select dropdown = new Select(cat);// For select Hardware Type
		dropdown.selectByVisibleText(visible);

	}

	public void login_Flex(WebDriver wd, String url, String User, String Pass, String refcode) 
	{
		wd.manage().window().maximize();
		wd.get(url);
		wd.findElement(By.id("txtLoginId")).sendKeys(User);
		wd.findElement(By.id("txtPassword")).sendKeys(Pass);
		wd.findElement(By.id("txtRefCode")).sendKeys(refcode);
		wd.findElement(By.id("btnSubmit")).click();
		System.out.println("Login Done");

	}

	public void print(WebDriver wd, String id, String cat) 
	{
		WebElement print_msg = wd.findElement(By.id(id));
		String text = print_msg.getText();
		System.out.println(cat + " " + text);
	}

	public void login_BMC(WebDriver wd, String url, String User, String Pass) 
	{
		wd.manage().window().maximize();
		wd.get(url);
		wd.findElement(By.id("txtLoginId")).sendKeys(User);
		wd.findElement(By.id("txtPassword")).sendKeys(Pass);
		wd.findElement(By.id("btnSubmit")).click();
		System.out.println("Login Done");

	}
	
	 public static boolean isAlertPresent(WebDriver wd) {
	        try {
	            wd.switchTo().alert();
	            return true;
	        } catch (Exception e) {
	            return false;
	        }
	
	
}}
