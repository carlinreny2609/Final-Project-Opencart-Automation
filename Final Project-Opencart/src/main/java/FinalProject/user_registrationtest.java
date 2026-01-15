package FinalProject;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


@Test(priority = 1)
public class user_registrationtest extends Allvariables {

	

	public void user_registration() throws InterruptedException, IOException {
		
		WebDriver driver = new EdgeDriver() ;

		String path = "https://awesomeqa.com/ui/index.php?route=common/home";
		
		String Classname = "user_registrationtest";

		driver.get(path);

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement My_Account = driver.findElement(By.xpath(My_Accountxpath));

		My_Account.click();

		WebElement Registerfromdropdown = driver.findElement(By.linkText("Register"));

		Registerfromdropdown.click();

		WebElement first_name = driver.findElement(By.id("input-firstname"));

		first_name.sendKeys("Demo");

		WebElement Lastname = driver.findElement(By.id("input-lastname"));

		Lastname.sendKeys("User");

		WebElement email = driver.findElement(By.id("input-email"));

		double random = Math.random();

		random = random * 100;

		String truncated = String.format("%.2f", random);

		email.sendKeys("emailid" + truncated + "@email.com");

		WebElement Telephone = driver.findElement(By.id("input-telephone"));

		Telephone.sendKeys("18565745897");

		WebElement Password = driver.findElement(By.id("input-password"));

		Password.sendKeys("Password@123");

		WebElement Confirm_Password = driver.findElement(By.id("input-confirm"));

		Confirm_Password.sendKeys("Password@123");

		WebElement Consentcheckbox1 = driver.findElement(By.xpath(Consentcheckbox));

		Consentcheckbox1.click();

		Thread.sleep(3000);

		WebElement create_account_success = driver.findElement(By.xpath(create_account_successxpath));

		create_account_success.click();

		Thread.sleep(3000);

		String Expectedregistersuccess = "https://awesomeqa.com/ui/index.php?route=account/success";

		String Actualregistersuccess = driver.getCurrentUrl();
		
		SoftAssert soft = new SoftAssert();

		soft.assertEquals(Actualregistersuccess, Expectedregistersuccess, "User not registered successfully");

        Takescreenshot(driver, Classname);

		driver.quit();

	}

}
