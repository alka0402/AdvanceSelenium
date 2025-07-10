package Generic_Utilies;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyserimp implements IRetryAnalyzer{

	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		int count=0;
		int retrycount=3;
		if (count<retrycount) {
			count++;
			return true;
		}
		
	
	
	return false;
}}
