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


@Test(priority = 3)

public class Addproducttest extends Variables {

	
	
	public void Addproduct() throws InterruptedException, IOException {
		
		// WebDriver driver = new EdgeDriver();   

	    String path = "https://awesomeqa.com/ui/index.php?route=common/home";
	    
	    String Classname = "Addproducttest";
	    
	  	driver.get(path);

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement My_Account = driver.findElement(By.xpath(My_Accountxpath));

		My_Account.click();

		WebElement Loginfromdropdown = driver.findElement(By.linkText("Login"));

		Loginfromdropdown.click();

		WebElement Email = driver.findElement(By.id("input-email"));

		Email.sendKeys("emailidi09@email.com");

		WebElement Password = driver.findElement(By.id("input-password"));

		Password.sendKeys("Password@123");

		WebElement Login = driver.findElement(By.xpath(loginbuttonxpath));

		Login.click();

		Thread.sleep(3000);

		WebElement Components = driver.findElement(By.linkText("Components"));

		Components.click();

		WebElement Monitors = driver.findElement(By.linkText("Monitors (2)"));

		Monitors.click();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window,scrollBy(0,500)");

		WebElement Add_product = driver.findElement(By.xpath(Add_productxpath));

		Add_product.click();

		Thread.sleep(3000);

		JavascriptExecutor js1 = (JavascriptExecutor) driver;

		js1.executeScript("window,scrollBy(0,-500)");

      	Takescreenshot(Classname);
		
		WebElement View_added_products = driver.findElement(By.xpath(view_added_products_xpath));

		View_added_products.click();

		WebElement Checkout = driver
				.findElement(By.xpath("//a[@href =\"https://awesomeqa.com/ui/index.php?route=checkout/checkout\"]"));

		Checkout.click();

		Thread.sleep(2000);

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

		WebElement paymentmethod = driver.findElement(By.id("button-payment-method"));

		paymentmethod.click();

		WebElement confirmorder = driver.findElement(By.id("button-confirm"));

		confirmorder.click();

		Thread.sleep(2000);

		String Success = "https://awesomeqa.com/ui/index.php?route=checkout/success";

		String successactualurl = driver.getCurrentUrl();

		System.out.println(successactualurl);

		Assert.assertEquals(successactualurl, Success, "Order place unsuccessful");

		WebElement Ordersuccess = driver.findElement(By.linkText("Continue"));

		Ordersuccess.click();

		System.out.println("order successfully placed");

		driver.quit();

	}

}
