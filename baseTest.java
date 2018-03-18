package baseUtil;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.io.IOException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class baseTest {
	
	public static WebDriver driver;
	public static Properties prop;
	
	

	
	@Test
	
	
	public static WebDriver initializeBrowser() throws IOException {
		
	
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Amit\\E2EProject\\src\\main\\java\\baseUtil\\DataProvider.properties");
		prop.load(fis);
		//DesiredCapabilities dc = new DesiredCapabilities();


	if(prop.getProperty("browser").contains("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "C://Users//Amit//Desktop//chromedriver.exe");
		driver = new ChromeDriver();
		
		
		//dc.setBrowserName("chrome");
		//dc.setPlatform(Platform.VISTA);
		//dc.setVersion("2.5");

		//WebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub/"),dc);
		//System.setProperty("webdriver.gecko.driver", "D://geckodriver.exe");
		//System.setProperty("webdriver.chrome.driver", "C://Users//Amit//Desktop//chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://rediff.com");
		//driver.close();

	}
	else if(prop.getProperty("browser").contains("firefox"))
	{
		System.setProperty("webdriver.gecko.driver", "D://geckodriver.exe");
		driver = new FirefoxDriver();
		
		//dc.setBrowserName("firefox");
		//dc.setPlatform(Platform.WINDOWS);
		//dc.setVersion("2.5");

		//WebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub/"),dc);
		//System.setProperty("webdriver.gecko.driver", "D://geckodriver.exe");
		//System.setProperty("webdriver.chrome.driver", "C://Users//Amit//Desktop//chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	
	}
	else
	{
		
		System.setProperty("webdriver.gecko.driver", "C://Users//Amit//Desktop//IEDriverServer.exe");
	driver = new InternetExplorerDriver();
	driver.manage().window().maximize();
		
	}
	
	return driver;
}
	public static void takescreenshot(String result) throws IOException
	{
		 File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile, new File("C:\\Users\\Amit\\"+result+"loginissue.png"));
	}
}

