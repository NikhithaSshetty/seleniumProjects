package p;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.edge.EdgeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new  ChromeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26signIn%3D1%26useRedirectOnSuccess%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0 ");
		driver.manage().window().maximize();
		driver.findElement(By.id("ap_email")).sendKeys("9353948398");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("nikhitha");
		driver.findElement(By.id("auth-signin-button")).click();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("samsung s22");
		driver.findElement(By.id("twotabsearchtextbox")).submit();
		driver.findElement(By.id("a-autoid-2")).click();
		driver.findElement(By.id("nav-cart")).click();
		//driver.findElement(By.className("hm-icon-label")).click();
		Thread.sleep(5000);
		 //WebElement signOut = driver.findElement(By.xpath("//span[text()='Sign Out']"));
	     //signOut.click();
	     driver.quit();
		//Thread.sleep(3000);
		//driver.close();	
	
		//driver.findElement(By.id("add-to-cart-button")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.id("attach-sidesheet-view-cart-button-announce")).click();
		//Thread.sleep(4000);
		//driver.findElement(By.id("nav-link-accountList")).click();
		//driver.findElement(By.linkText("driver.findElement(By.linkText")).click();
		//    Cart   
	
	
	}
	
	
}