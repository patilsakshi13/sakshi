import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Create Account {
	
	Webdriver driver;
	
	@BeforeSuite
public void beforeSuite() {
		System.out.println("Welcome to Luma");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Seleniunm\\116\\chromedriver-win32\\chromedriver.exe");
	driver = new ChromeDriver();
	  }
	
@BeforeClass
	  public void beforeClass() {
		driver.get("https://magento.softwaretestingboard.com/collections/yoga-new.html");
	  }
	 @BeforeTest
	  public void beforeTest() {
		 driver.
	  }
	
  @BeforeMethod
  public void beforeMethod() {
  }
  @Test
  public void Account Creation() {
	  driver.
  }
  @AfterMethod
  public void afterMethod() {
  }

  

  @AfterClass
  public void afterClass() {
  }

 

  @AfterTest
  public void afterTest() {
  }

  

  @AfterSuite
  public void afterSuite() {
  }

}
