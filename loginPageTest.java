package E2EAutomationFramework;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.annotation.After;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import baseUtil.baseTest;
import junit.framework.Assert;
import pageObjects.createAccountPageObjects;
import pageObjects.homePageObjects;
import pageObjects.loginPageObjects;

public class loginPageTest extends baseTest {
	
	public static WebDriver driver;
	public static Logger log = LogManager.getLogger(loginPageTest.class.getName());

	// File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//FileUtils.copyFile(screenshotFile, new File("C:\\Users\\Amit\\Downloads\\loginissue.png"));
	
	@BeforeClass
	public void beforemethod() throws IOException
	{
		driver=initializeBrowser() ;
	}
	
	
	//(dataProvider="getdata")
	
	
	
//System.out.println(hompage.linktext().getText());

//Assert.assertEquals(hompage.linktext().getText(), "rediffMAILPRO");


//Assert.assertEquals("rediff.com", hompage.linktext().getText());
//hompage.enterid().sendKeys(uname);
//hompage.password().sendKeys(upswd);


//hompage.rediffmaillink().click();



//


//accnt.clickhome().click();

@Test
	public static void loginpage() throws IOException
	{
		//driver = initializeBrowser() ;
		driver.get(prop.getProperty("url2"));
		loginPageObjects logpage = new loginPageObjects(driver);
		
		//try {
		logpage.enterid().sendKeys(prop.getProperty("mailid"));
		logpage.password().sendKeys(prop.getProperty("password"));
		logpage.submit().click();
		
		log.info("login successfully");
		//driver.quit();
		//}
		//catch(Exception e)
		//{
//log.error("could not find fields to input data");
	//}
	}
	
	/*@DataProvider
	public Object[][] getdata()
	{
		Object[][] obj = new Object[2][2];
		obj[0][0] = "firstname";
		obj[0][1] = "firspassword";
		obj[1][0] = "secondname";
		obj[1][1] = "secondpassowrd";
		return obj;
		
		
	}*/


@AfterClass

public void aftertest()
{
	driver.quit();
	driver=null;
}
	
}

