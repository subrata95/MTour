package org.commonlib;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
 
public class Retryanalyzer implements IRetryAnalyzer {
	 
	  int retryCount = 0;
	  int maxRetryCount = 2;
	  
	  @Override
	  public boolean retry(ITestResult result) {
	    if (retryCount < maxRetryCount) {
	      retryCount++;
	      return true;
	    }
	    return false;
	  }
	}