package FinalProject;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


@Test(priority = 6)

public class Searchtest extends Variables {	
	
	public void search() throws InterruptedException, IOException {
		
		// WebDriver driver = new EdgeDriver();   
		
		String Classname = "SearchTest";

		String path = "https://awesomeqa.com/ui/index.php?route=common/home";	

		driver.get(path);		

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement Searchfield = driver.findElement(By.xpath(searchfieldxpath));

		Searchfield.sendKeys("Samsung SyncMaster 941BW", Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window,scrollBy(0,400)");

		String Searchproduct = "https://awesomeqa.com/ui/index.php?route=product/search&search=Samsung%20SyncMaster%20941BW";

		String SearchproductActual = driver.getCurrentUrl();

		Assert.assertEquals(SearchproductActual, Searchproduct, " Search product notsuccessful");

        Thread.sleep(5000);
		
		Takescreenshot(Classname);
		
		WebElement Add_product = driver.findElement(By.xpath(Add_productxpath));

		Add_product.click();

		System.out.println("Product successfully added to cart");

		Thread.sleep(3000);

		WebElement View_added_products = driver.findElement(By.xpath(view_added_productsxpath));

		View_added_products.click();

		Thread.sleep(3000);

		WebElement checkout = driver.findElement(By.linkText("Checkout"));

		checkout.click();

		Thread.sleep(3000);

		WebElement Email = driver.findElement(By.id("input-email"));

		Email.sendKeys("emailid62@email.com");

		WebElement Password = driver.findElement(By.id("input-password"));

		Password.sendKeys("Password@123");

		WebElement Login = driver.findElement(By.xpath(loginbuttonxpath));

		Login.click();

		Thread.sleep(3000);

		WebElement continuebutton = driver.findElement(By.id("button-payment-address"));

		continuebutton.click();

		Thread.sleep(2000);

		WebElement deliverydetailscontinue = driver.findElement(By.id("button-shipping-address"));

		deliverydetailscontinue.click();

		Thread.sleep(2000);

		WebElement Shippingmethod = driver.findElement(By.id("button-shipping-method"));

		Shippingmethod.click();

		Thread.sleep(2000);

		WebElement paymentagree = driver.findElement(By.xpath(paymentagreexpath));

		paymentagree.click();

		Thread.sleep(2000);

		WebElement paymentmethod = driver.findElement(By.id("button-payment-method"));

		paymentmethod.click();

		Thread.sleep(2000);

		WebElement confirmorder = driver.findElement(By.id("button-confirm"));

		confirmorder.click();

		Thread.sleep(2000);

		WebElement Ordersuccess = driver.findElement(By.linkText("Continue"));

		Ordersuccess.click();

		Thread.sleep(2000);

		System.out.println("order successfully placed");

		driver.quit();

	}

}
