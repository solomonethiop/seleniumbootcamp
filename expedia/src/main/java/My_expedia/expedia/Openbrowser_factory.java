package My_expedia.expedia;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Openbrowser_factory {
	public static WebDriver driver;
	
public Openbrowser_factory(){
		
	}

	public static WebDriver getDriver(String browser, String url){
		if(driver== null) {
			
			ChromeOptions options = new ChromeOptions();
			options.addArguments("..disable-notifications");
			options.setPageLoadStrategy(PageLoadStrategy.NONE);
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\solom\\eclipse-workspace\\selenium_dem\\Driver\\chromedriver.exe");
			driver = new  ChromeDriver(options);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
			
		}
		return driver;
		
	}
	public static WebDriver getDriver1(String browsers, String url){
	if(driver==null) {
		if(browsers.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\solom\\Downloads\\geckodriver-v0.24.0-win64 (2)\\geckodriver.exe");
			driver= new FirefoxDriver();
			
		}else if(browsers.equalsIgnoreCase("chrome")) {
			System.out.println("in chrome");
			System.setProperty("webdriver.chrome.driver" , "C:\\Users\\solom\\eclipse-workspace\\selenium_dem\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			
			
		}else if (browsers.equalsIgnoreCase("IE")) {
			
			System.setProperty("webdriver.ie.driver" , "C:\\Users\\solom\\eclipse-workspace\\selenium_dem\\Driver\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		
			
			
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
		
		driver.get(url);
		
	}
	return driver;
		
		
	}
	   
	}

	
	


