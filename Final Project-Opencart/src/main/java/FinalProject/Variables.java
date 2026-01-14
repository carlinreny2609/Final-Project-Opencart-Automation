package FinalProject;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;




public class Variables {

	public WebDriver driver = new EdgeDriver();  
	
	
	
	String commonScreenshotpath = "D:\\SLA\\Eclipse\\Selenium\\FinalProject-Screenshot\\";	
	
	String Screenshotpathaddproduct = "D:\\SLA\\Eclipse\\Selenium\\FinalProject-Screenshot\\Addproductsuccessful.jpeg";
	
	String Screenshotpathuserreg = "D:\\SLA\\Eclipse\\Selenium\\FinalProject-Screenshot\\Userregistrationsuccessful.jpeg";
	
	String Screenshotpathloginsuccess = "D:\\SLA\\Eclipse\\Selenium\\FinalProject-Screenshot\\Loginsuccessful.jpeg";
	
	String Screenshotpathorderhistory = "D:\\SLA\\Eclipse\\Selenium\\FinalProject-Screenshot\\OrderHistorysuccessful.jpeg";
	
	String Screenshotpathsearch = "D:\\SLA\\Eclipse\\Selenium\\FinalProject-Screenshot\\Search_successful.jpeg";
	
	String Screenshotpathcompareprod = "D:\\SLA\\Eclipse\\Selenium\\FinalProject-Screenshot\\compareproductsuccessful.jpeg";
	
	String Screenshotpathwishlist = "D:\\SLA\\Eclipse\\Selenium\\FinalProject-Screenshot\\Wishlistproductsuccessful.jpeg";
	
	String My_Accountxpath = "//a[@title='My Account']";

	String Consentcheckbox = "//input[@name='agree']";

	String create_account_successxpath = "//input [@value=\"Continue\"]";

	// addproduct

	String loginbuttonxpath = "//input[@value ='Login']";

	String Add_productxpath = "//button[@onclick=\"cart.add('33', '1');\"]";

	String view_added_products_xpath = "//span[@id='cart-total']";

	String paymentagreexpath = "//input[@name='agree']";

	// orderhistory

	String myaccountafterloginxpath = "//a[@title=\"My Account\"]";

	String vieworderhistoryxpath = "//a[@data-original-title='View']";

	String My_Accountafterorrderhistoryxpath = "//a[@title=\"My Account\"]";

	// productcomparison

	String compareproduct1xpath = "//button[@onclick=\"compare.add('42');\"]";

	String compareproduct2xpath = "//button[@onclick=\"compare.add('33');\"]";

	// searchproduct

	String searchfieldxpath = "//input[@name=\"search\"]";

	String view_added_productsxpath = "//span[@id='cart-total']";

	// wishlist

	String Loginxpath = "//input[@value ='Login']";

	String addproduct_wishlistxpath = "//button[@onclick=\"wishlist.add('33');\"]";

	String carttotal_wishlistxpath = "//button[@onclick=\"cart.add('33');\"]";

	String viewaddedproductsxpath = "//span[@id =\"cart-total\"]";


    public void Takescreenshot(String Classname) throws IOException {
	// TODO Auto-generated method stub
    	
    TakesScreenshot screenshot = (TakesScreenshot) driver;

	File temporarysource = screenshot.getScreenshotAs(OutputType.FILE);

	File destination = new File(commonScreenshotpath +Classname+".jpeg");

	FileUtils.copyFile(temporarysource, destination);
	
	
}



}



