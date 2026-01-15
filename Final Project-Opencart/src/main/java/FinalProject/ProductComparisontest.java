package FinalProject;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;




public class ProductComparisontest extends Allvariables{
	
	
	
	@Test(priority =7 )
	
	public void ProductComparison() throws InterruptedException, IOException {			
		
		
		WebDriver driver = new EdgeDriver() ;
		
		
	    String Classname = "ProductComparison";

		String path = "https://awesomeqa.com/ui/index.php?route=common/home";

		driver.get(path);

		WebElement Components = driver.findElement(By.linkText("Components"));

		Components.click();

		WebElement Monitors = driver.findElement(By.linkText("Monitors (2)"));

		Monitors.click();

		WebElement compare_product1 = driver.findElement(By.xpath(compareproduct1xpath));
		compare_product1.click();

		Thread.sleep(3000);

		WebElement compare_product2 = driver.findElement(By.xpath(compareproduct2xpath));

		compare_product2.click();

		Thread.sleep(3000);

		WebElement product_comparison = driver.findElement(By.linkText("product comparison"));

		product_comparison.click();

		Thread.sleep(3000);

		JavascriptExecutor js1 = (JavascriptExecutor) driver;

		js1.executeScript("window,scrollBy(0,500)");

		String Productcomparison = "https://awesomeqa.com/ui/index.php?route=product/compare";

		String Productcomparisonactual = driver.getCurrentUrl();

		SoftAssert soft = new SoftAssert();
		
		soft.assertEquals(Productcomparisonactual, Productcomparison, "Productcomparison notsuccessful");

		Thread.sleep(5000);
		
	    Takescreenshot( driver, Classname);

		Thread.sleep(5000);

		driver.quit();

	}

}
