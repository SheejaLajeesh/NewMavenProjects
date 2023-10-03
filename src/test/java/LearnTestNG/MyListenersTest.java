package LearnTestNG;

import org.testng.ITestListener;
import org.testng.ITestResult;

import io.opentelemetry.context.Context;

public class MyListenersTest implements ITestListener{
	
	public void onTestStart(ITestResult result) {
		
       System.out.println("Testcase is======="+ 
    		   result.getMethod().getMethodName()+"Started");
    }
	public void onTestSuccess(ITestResult result) {
		
		 System.out.println("Testcase is======="+ 
	    		   result.getMethod().getMethodName()+"Passed");
		
	}
	public void onTestFailure(ITestResult result) {
		
		 System.out.println("Testcase is======="+ 
	    		   result.getMethod().getMethodName()+"Failed beacuse of" + 
	    		   result.getThrowable());
	}
	public void onTestSkipped(ITestResult result) {
			
		 System.out.println("Testcase is======="+ 
	    		   result.getMethod().getMethodName()+"Skipped because of"+
	    		   result.getThrowable());
		}
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		 System.out.println("Testcase is======="+ 
	    		   result.getMethod().getMethodName()+"Partially Passed");
		
	}
	public void onTestFailedWithTimeout(ITestResult result) {
		
		System.out.println("Testcase is======="+ 
	    		   result.getMethod().getMethodName()+"Time Out");
		
	}
	public void onStart(ITestResult result) {
		
		System.out.println("On start");
		
	}
	public void onFinish(ITestResult result) {
		
		System.out.println("Testcase is=======");
		
	}
	
	

}
