package classes_selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert_class {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();   //maximise the page
		//driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(3000);
		//sign in -->inspect-->name-->proceed
		
		/*driver.findElement(By.name("proceed")).click();
		Thread.sleep(3000);
		Alert al=driver.switchTo().alert();
		al.accept();
		
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(3000);
		Alert alr=driver.switchTo().alert();
		alr.dismiss();*/
		
		//click here
		driver.findElement(By.id("promtButton")).click();
		Thread.sleep(3000);
		Alert alrt=driver.switchTo().alert();
		alrt.sendKeys("niki");
		Thread.sleep(3000);
		alrt.accept();
	}

}
