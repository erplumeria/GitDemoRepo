package E2EAutomationFramework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.annotation.After;
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

public class createAccountPageTest extends baseTest {
	
	public static WebDriver driver;
	public static Logger log = LogManager.getLogger(createAccountPageTest.class.getName());
	
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
@Test
	public static void createaccountpage() throws IOException, InterruptedException
	{
	
	//driver = initializeBrowser() ;
		
		driver.get(prop.getProperty("url1"));
		createAccountPageObjects accnt = new createAccountPageObjects(driver);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Assert.assertTrue(accnt.inputname().isDisplayed());
		log.debug("name is given text");
		accnt.inputname().sendKeys(prop.getProperty("full_name"));
		
		Thread.sleep(2000);
		//driver.quit();
	}
@AfterClass

public void aftertest()
{
	driver.quit();
	driver=null;
}
	
}

