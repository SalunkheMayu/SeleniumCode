package devOps;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Region {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		//ChromeOptions options = new ChromeOptions();
		//options.setAcceptInsecureCerts(true);
		ChromeDriver wd = new ChromeDriver();
		//new WebDriverWait(wd, Duration.ofSeconds(20));
		wd.manage().window().maximize();
		DevTools dev=wd.getDevTools();
		
		dev.createSession();
		
		    
		Map<String, Object>Coordinates= new HashMap<String, Object>();
		Coordinates.put("latitude", 62.349560);
		Coordinates.put("longitude", 30.677841);
		Coordinates.put("accuracy", 1);
		
		wd.executeCdpCommand("Emulation.setGeolocationOverride", Coordinates);
		
		wd.get("https://my-location.org/");
		//wd.get("https://google.com");
		
		//wd.findElement(By.name("q")).sendKeys("gmail",Keys.ENTER);
		//wd.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])[1]")).click();
		
		//String abc=	wd.findElement(By.cssSelector(".LC20lb MBeuO DKV0Md")).getText();
		
		//System.out.println(abc);
		
	
	}

		
}


