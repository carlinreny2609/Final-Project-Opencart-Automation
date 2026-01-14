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


@Test(priority = 4)
public class order_history extends Variables {

	
	
	public void Order_History() throws InterruptedException, IOException {
		
		 //WebDriver driver = new EdgeDriver();   

	    String path = "https://awesomeqa.com/ui/index.php?route=common/home";
	    
	    String Classname = "order_history";

		driver.get(path);

		

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement My_Account = driver.findElement(By.xpath(My_Accountxpath));

		My_Account.click();

		WebElement Loginfromdropdown = driver.findElement(By.linkText("Login"));

		Loginfromdropdown.click();

		WebElement Email = driver.findElement(By.id("input-email"));

		Email.sendKeys("emailid62@email.com");

		WebElement Password = driver.findElement(By.id("input-password"));

		Password.sendKeys("Password@123");

		WebElement Login = driver.findElement(By.xpath("//input[@value ='Login']"));

		Login.click();

		Thread.sleep(3000);

		WebElement My_Accountafterlogin = driver.findElement(By.xpath(myaccountafterloginxpath));

		My_Accountafterlogin.click();

		WebElement orderhistory = driver.findElement(By.linkText("Order History"));

		orderhistory.click();

		Thread.sleep(3000);

		String orderhistoryExpected = "https://awesomeqa.com/ui/index.php?route=account/order";

		String OrderhistoryActual = driver.getCurrentUrl();

		Assert.assertEquals(OrderhistoryActual, orderhistoryExpected);

		

        Thread.sleep(5000);
		
		Takescreenshot(Classname);
		
		 Thread.sleep(5000);

		WebElement vieworderhistory = driver.findElement(By.xpath(vieworderhistoryxpath));

		vieworderhistory.click();

		Thread.sleep(3000);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window,scrollBy(0,500)");

		Thread.sleep(3000);

		WebElement Afterviewcontinue = driver.findElement(By.linkText("Continue"));

		Afterviewcontinue.click();

		Thread.sleep(3000);

		WebElement Afterviewcontinue2 = driver.findElement(By.linkText("Continue"));

		Afterviewcontinue2.click();

		WebElement My_Accountafterorrderhistory = driver.findElement(By.xpath(My_Accountafterorrderhistoryxpath));

		My_Accountafterorrderhistory.click();

		WebElement logout = driver.findElement(By.linkText("Logout"));

		logout.click();

		System.out.println("Account Logged out successfully");

		driver.quit();
	}

}
