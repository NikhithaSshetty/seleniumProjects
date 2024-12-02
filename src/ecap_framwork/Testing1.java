package ecap_framwork;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testing1 {
	
	@BeforeMethod										//works for every test case
	public void lanchbrowser() {
		System.out.println(" browser is launched");
	}
	
	@AfterMethod										
	public void closebrowser() {
		System.out.println(" browser is closed");
	}
	
	@Test										
	public void login() {
		System.out.println("login");
	}
	
	@Test										
	public void logout() {
		System.out.println("logout");
	}
}
