package locate_ele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locate_element {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new  ChromeDriver();	//webdriver=interface
												//chromedriver = interface
		
		driver.manage().window().maximize();   //maximise the page
		driver.get("http://www.facebook.com");
		 
		
		Thread.sleep(3000);             //3s
		driver.findElement(By.id("email")).sendKeys("nikkishetty@121.com");
		Thread.sleep(3000);
		driver.findElement(By.name("pass")).sendKeys("nikhi@121");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(3000);
		driver.close();

	}

}
