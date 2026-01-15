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

@Test(priority = 2)

public class Logintest extends Allvariables {

	public void Login() throws InterruptedException, IOException {

		WebDriver driver = new EdgeDriver();

		String path = "https://awesomeqa.com/ui/index.php?route=common/home";

		String Classname = "Logintest";

		driver.get(path);

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement My_Account = driver.findElement(By.xpath(My_Accountxpath));

		My_Account.click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement Loginfromdropdown = driver.findElement(By.linkText("Login"));

		Loginfromdropdown.click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement Email = driver.findElement(By.id("input-email"));

		Email.sendKeys("emailid62@email.com");

		WebElement Password = driver.findElement(By.id("input-password"));

		Password.sendKeys("Password@123");

		WebElement Login = driver.findElement(By.xpath(loginbuttonxpath));

		Login.click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		String Landingpage = driver.getCurrentUrl();

		String expectedUrl = "https://awesomeqa.com/ui/index.php?route=account/account";

		SoftAssert soft = new SoftAssert();

		soft.assertEquals(Landingpage, expectedUrl, "login not successful");

		Thread.sleep(5000);

		Takescreenshot(driver, Classname);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement My_Accountafterorrderhistory = driver.findElement(By.xpath(My_Accountxpath));

		My_Accountafterorrderhistory.click();

		WebElement logout = driver.findElement(By.linkText("Logout"));

		logout.click();

		driver.quit();

	}

}
