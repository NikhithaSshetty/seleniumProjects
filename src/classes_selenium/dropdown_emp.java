package classes_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown_emp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();    //maximise the page
		driver.get("http://www.facebook.com");
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(3000);
		
		WebElement month=driver.findElement(By.xpath("//select[@name='birthday_month']"));
		
		Select se=new Select(month);
		Thread.sleep(3000);
		se.selectByVisibleText("Jun");
		Thread.sleep(3000);

	}

}
