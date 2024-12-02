package p;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestingNG {
	public String baseurl="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	public WebDriver driver;
	@BeforeTest
	public void setup() {
		System.out.println("before test executed");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get(baseurl);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	}
	
	@Test(priority=1)
	public void loginTest() {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
		
	}
	
	@Test(priority=2)
	public void addemp() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
		
		driver.findElement(By.xpath("//a[text()='Add Employee']")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("nikhitha");
		
		driver.findElement(By.xpath("//input[@placeholder='Middle Name']")).sendKeys("S");
		
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("SHETTY");
		
		Thread.sleep(2000);
		
		//click to save
		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
		
		
		//verify if employeee added succesfully or not
		String Message= driver.findElement(By.xpath("h6[normalize-space()='Personal Details']")).getText();
	}

	@Test(priority=3)
	public void logout() throws InterruptedException
	{
		driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
	    driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
	    //Thread.sleep(3000);
	}
}
