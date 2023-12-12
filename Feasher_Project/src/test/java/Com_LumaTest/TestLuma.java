package Com_LumaTest;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Com_Luma_Page.Product_Page;
import Com_Test_Utility.TestUtility;

public class TestLuma {

	WebDriver driver; 
	
	@BeforeSuite
	public void SetUp()
	{
		System.out.println("Welcome to Luma");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Seleniunm\\exe\\chromedriver-win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@BeforeClass
	public void LaunchBrowser()
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://magento.softwaretestingboard.com/collections/yoga-new.html");
	}
	
	@BeforeTest
	public void WindowMaximize()
	{
//		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void GetCookies()
	{
		Set<Cookie> cook = driver.manage().getCookies();
		System.out.println("Cookies Are = "+cook);
//		driver.manage().deleteAllCookies();
	}
	
	
	@DataProvider
	public Iterator<Object[]> getData()
	{
		ArrayList<Object[]> data = TestUtility.getDatafromExcel();
		return data.iterator();
		
	}
	
//	@DataProvider
//	public Iterator<Object[]> getData1()
//	{
//		ArrayList<Object[]> data1 = TestUtility.getDatafromExcel();
//		return data1.iterator();
//		
//	}
	
	@Test(dataProvider = "getData")
	public void AccountCreation(String FirstName,String LastName,String Email, String Password,String ConformPassword)
	{
		driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[3]/a")).click();
		driver.findElement(By.cssSelector("#firstname")).sendKeys(FirstName);
		driver.findElement(By.cssSelector("#lastname")).sendKeys(LastName);
		driver.findElement(By.cssSelector("#email_address")).sendKeys(Email);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(Password);
		driver.findElement(By.cssSelector("#password-confirmation")).sendKeys(ConformPassword);
		driver.findElement(By.cssSelector("#form-validate > div > div.primary > button > span")).click();
	}
	
	@Test
	public void Product() throws InterruptedException
	{
		
		Product_Page pro = PageFactory.initElements(driver, Product_Page.class);
		pro.Luma_Product();
		
//		//1
//		driver.findElement(By.cssSelector("#ui-id-5 > span:nth-child(2)")).click();
//		
//		
//		//click on yellow link(2)
//		driver.findElement(By.cssSelector("#maincontent > div.columns > div.column.main > div.widget.block.block-static-block > div.blocks-promo > div.block-promo-wrapper.block-promo-2columns > a.block-promo.mens-t-shirts > span")).click();
////		
//		//click on T-shirt(3)
//		driver.findElement(By.cssSelector("#maincontent > div.columns > div.column.main > div.products.wrapper.grid.products-grid > ol > li:nth-child(1) > div > a > span > span > img")).click();
//		
//		
//		//click to select Size(4)
//		driver.findElement(By.xpath("//*[@id=\"option-label-size-143-item-169\"]")).click();
//		
//		//click on to select colour(5)
//		driver.findElement(By.xpath("//*[@id=\"option-label-color-93-item-49\"]")).click();
//		
//		//click on add to cart button(6)
//		driver.findElement(By.cssSelector("#product-addtocart-button")).click();
//		
//		Thread.sleep(5000);
//		
//		//click to cart(7)
//		driver.findElement(By.cssSelector("body > div.page-wrapper > header > div.header.content > div.minicart-wrapper > a")).click();
//		
//		//click on Proceed  to checkout(8)
//		driver.findElement(By.cssSelector("#top-cart-btn-checkout")).click();
//		
//		Thread.sleep(6000);
//		
//		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
////		js.executeScript("scrollby(0,300)");
	}
	
	@Test(priority = 1)
	public void CheckOut() throws InterruptedException
	{
//		//Enter Email
		driver.findElement(By.xpath("//*[@id=\"customer-email\"]")).sendKeys("sakship@gmail.com");
		
		Thread.sleep(4000);
		//Enter FirstName
		driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[1]/div[2]/form[2]/div/div[1]/div/input")).sendKeys("Sakshi");
		//Enter LastName
		driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[1]/div[2]/form[2]/div/div[2]/div/input")).sendKeys("Patil");
		//Company 
		driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[1]/div[2]/form[2]/div/div[3]/div/input")).sendKeys("CJC");
		//Street1
		driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[1]/div[2]/form[2]/div/fieldset/div/div[1]/div/input")).sendKeys("Karve Nagar");
		//Street2
		driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[1]/div[2]/form[2]/div/fieldset/div/div[2]/div/input")).sendKeys("Shahu Colony");
		//Street3
		driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[1]/div[2]/form[2]/div/fieldset/div/div[3]/div/input")).sendKeys("Deshmukh Abhiyasika");
		//City
		driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[1]/div[2]/form[2]/div/div[4]/div/input")).sendKeys("Pune");
		//Country
		driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[1]/div[2]/form[2]/div/div[8]/div/select")).sendKeys("India");
		Thread.sleep(5000);
		//State
		driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[1]/div[2]/form[2]/div/div[5]/div/select")).sendKeys("Maharashtra");
		//Zipcode
		driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[1]/div[2]/form[2]/div/div[7]/div/input")).sendKeys("411052");
		//Mobile Number
		driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[1]/div[2]/form[2]/div/div[9]/div/input")).sendKeys("1236547890");
		//Shipping Method
		driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[2]/div/div[3]/form/div[1]/table/tbody/tr[1]/td[1]/input")).click();
		//Next
		driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[2]/div/div[3]/form/div[3]/div/button/span")).click();
		
		System.out.println("Order Placed Successfully");
	}
	
	@Test(priority = 2)
	public void Placeorder()
	{
		driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div[2]/div[4]/ol/li[3]/div/form/fieldset/div[1]/div/div/div[2]/div[2]/div[2]/div/div[1]/input")).click();
	
		driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div[2]/div[4]/ol/li[3]/div/form/fieldset/div[1]/div/div/div[2]/div[2]/div[4]/div/button")).click();
	
		String tx = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div[2]/p[1]/span")).getText();
		System.out.println("Order Number = "+tx);
	}
	
	@AfterMethod
	public void Screenshot() throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\HP\\Desktop\\Seleniunm\\ScreenShot\\luma.png"));
	}
}
