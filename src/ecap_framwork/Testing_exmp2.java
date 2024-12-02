package ecap_framwork;

import org.testng.annotations.Test;

public class Testing_exmp2 {

	
	//@Test(priority=3)   //test case 1                  //same test case with same priority executed alphanumerically.
	//@Test(priority=-1)										 //-1 priority executes first
	//@Test			                                        //if no priority then consider as 0 -->-1,0,1,2,,3....
	
	@Test(invocationCount=0)							//to skip the test case  OR   enabled=False
	public void testcase() {						 
		System.out.println("test case 1");
		}

	@Test(priority=-1)   //text case 2     
	public void testcase2() {
		System.out.println("test case 2");
	}
	
	//@Test(priority=2) //text case 3
	@Test                                          
	public void testcase3() {
		System.out.println("test case 3");
	}
	
	@Test(priority=3)       //text case 4
	public void testcase4() {
		System.out.println("test case 4");
	}
}
