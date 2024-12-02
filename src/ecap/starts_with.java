package ecap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class starts_with {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();    //maximise the page
		driver.get("http://www.facebook.com");
		Thread.sleep(3000);
		
		//using starts-with
		driver.findElement(By.xpath("//button[starts-with(@id,'u_0_5_')]")).click();
		Thread.sleep(3000);

	}

}
