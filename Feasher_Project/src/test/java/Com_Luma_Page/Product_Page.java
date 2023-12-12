package Com_Luma_Page;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Product_Page {
	
//	WebDriver drive;
//	
//	public Product_Page(WebDriver driver)
//	{
//		driver = new ChromeDriver();
//	}
	
	@FindBy(css="#ui-id-5 > span:nth-child(2)")
	WebElement firstclick;
	
	@FindBy(css="#maincontent > div.columns > div.column.main > div.widget.block.block-static-block > div.blocks-promo > div.block-promo-wrapper.block-promo-2columns > a.block-promo.mens-t-shirts > span")
	WebElement secondlink;
	
	@FindBy(css="#maincontent > div.columns > div.column.main > div.products.wrapper.grid.products-grid > ol > li:nth-child(1) > div > a > span > span > img")
	WebElement thirdlink;
	
	@FindBy(xpath="//*[@id=\"option-label-size-143-item-169\"]")//*[@id=\"option-label-size-143-item-169\"]
	WebElement fourthlink;
	
	@FindBy(xpath="//*[@id=\\\"option-label-color-93-item-49\\\"]")
	WebElement fifthlink;
	
	@FindBy(css="#product-addtocart-button")
	WebElement sixthlink;
	
	@FindBy(css="body > div.page-wrapper > header > div.header.content > div.minicart-wrapper > a")
	WebElement seventhlink;
	
	@FindBy(css="#top-cart-btn-checkout")
	WebElement eighthlink;
	
	public void Luma_Product() throws InterruptedException
	{
		firstclick.click();
		secondlink.click();
		thirdlink.click();
		fourthlink.click();
		fifthlink.click();
		sixthlink.click();
		Thread.sleep(5000);
		seventhlink.click();
		eighthlink.click();
		Thread.sleep(6000);
	}
	
}
