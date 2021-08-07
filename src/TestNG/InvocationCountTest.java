package TestNG;

import org.testng.annotations.Test;

public class InvocationCountTest {
	
//	@Test (invocationCount = 10)
//	public void invocationCount() {
//		int a = 10;
//		int b = 20;
//		int c = a+b;
//		System.out.println("sum = "+ c);
//	}
	
//	@Test(timeOut = 2)
//	public void infiniteLoopTest() {
//		int i = 1;
//		while (i==1) {
//			System.out.println(i);
//		}
//	}
	
	@Test (expectedExceptions = NumberFormatException.class)
	public void test1() {
		String x = "100A";
		Integer.parseInt(x);
		
	}
	
}
