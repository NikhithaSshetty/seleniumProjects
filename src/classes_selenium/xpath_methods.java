package classes_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_methods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();    //maximise the page
		driver.get("http://www.facebook.com");
		Thread.sleep(2000);
		
		//x-path using starts-with method
		//driver.findElement(By.xpath("//button[starts-with[@id,'u_0_5_')]")).click();
		
		//x-path using contains method
		//driver.findElement(By.xpath("//input[contains(@name,'email')]")).click();
		
		//x-path using contains method with text() function
		//driver.findElement(By.xpath("//a[contains(text(),'Forgotten password?')]")).click();
		
		//x-path using and
		//driver.findElement(By.xpath("//input[@id='email' and @name='email']")).sendKeys("ashh@gmail.com");
		
		//x-path using or
		driver.findElement(By.xpath("//input[@id='email' or @name='Email']")).sendKeys("ashh@gmail.com");
		
	}

}





















