package FinalProject;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


@Test(priority = 5)
public class Wishlisttest extends Allvariables {

	

	public void Wishlist() throws InterruptedException, IOException {	
		
		WebDriver driver = new EdgeDriver() ;
		
		String Classname ="Wishlisttest";

		String path = "https://awesomeqa.com/ui/index.php?route=common/home";

		driver.get(path);

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement My_Account = driver.findElement(By.xpath(My_Accountxpath));

		My_Account.click();

		WebElement Loginfromdropdown = driver.findElement(By.linkText("Login"));

		Loginfromdropdown.click();

		WebElement Email = driver.findElement(By.id("input-email"));

		Email.sendKeys("emailid62@email.com");

		WebElement Password = driver.findElement(By.id("input-password"));

		Password.sendKeys("Password@123");

		WebElement Login = driver.findElement(By.xpath(loginbuttonxpath));

		Login.click();

		System.out.println(" Logged in successfully");

		Thread.sleep(3000);

		WebElement Components = driver.findElement(By.linkText("Components"));

		Components.click();

		WebElement Monitors = driver.findElement(By.linkText("Monitors (2)"));

		Monitors.click();

		JavascriptExecutor js1 = (JavascriptExecutor) driver;

		js1.executeScript("window,scrollBy(0,500)");

		Thread.sleep(3000);

		WebElement addproduct_wishlist = driver.findElement(By.xpath(addproduct_wishlistxpath));

		addproduct_wishlist.click();

		Thread.sleep(3000);

		 Takescreenshot(driver, Classname);		

		WebElement Totalwishlist = driver.findElement(By.id("wishlist-total"));

		Totalwishlist.click();

		Thread.sleep(3000);

		Thread.sleep(2000);

		String wishlist = "https://awesomeqa.com/ui/index.php?route=account/wishlist";

		String wishlistActual = driver.getCurrentUrl();
		
		SoftAssert soft = new SoftAssert();

		soft.assertEquals(wishlistActual, wishlist, "Wishlistnotsuccessful");

		WebElement carttotal_wishlist = driver.findElement(By.xpath(carttotal_wishlistxpath));

		carttotal_wishlist.click();

		Thread.sleep(3000);

		WebElement View_added_products = driver.findElement(By.xpath(viewaddedproductsxpath));

		View_added_products.click();

		Thread.sleep(3000);

		WebElement checkout = driver.findElement(By.linkText("Checkout"));

		checkout.click();

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
