package LearnTestNG;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.ITestNGMethod;
import org.testng.xml.XmlSuite;

public class Ireporter_Extends implements IReporter {
	
	public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
		
		for(ISuite suite : suites) {
			System.out.println("Suit Name = " + suite.getName());
			
			Map<String, ISuiteResult> results =suite.getResults();
			
			for(ISuiteResult sr : results.values()) {
				ITestContext tc=sr.getTestContext();
				
				System.out.println("The testname is" + 
							tc.getName()+ ""+ 
						    "The Test Start Date is "+ ""+ tc.getStartDate() +
						    "The Test Start Date is "+ ""+ tc.getEndDate() + 
						    "The Test Start Date is "+ ""+ tc.getOutputDirectory());
				
				Collection<ITestNGMethod> failedMethods =
						tc.getFailedTests().getAllMethods();
				
				System.out.println("The Total failed Methods Count" +  
				failedMethods.size());
				System.out.println("The Total failed Methods are - " );
				
				for(ITestNGMethod tm: failedMethods) {
					System.out.println(tm.getMethodName()+
							""+tm.getDescription());
				}
				
				System.out.println("The Total Passed test count - "+ 
						tc.getPassedTests().getAllResults().size() );
				
				System.out.println("The Total Passed test count - "+ 
						tc.getSkippedTests().getAllResults().size() );
				
			}
		}
		System.out.println("Output HTML report path - " + outputDirectory);
	}




}
