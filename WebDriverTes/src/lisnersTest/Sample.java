package lisnersTest;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Sample implements ITestListener{

	@Override
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult arg0) {
		System.out.println("Execution failed "+arg0);
		
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		System.out.println("Execution Skipped "+arg0);
		
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		System.out.println("Execution Started "+arg0);
		
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		System.out.println("Execution Success "+arg0);
		
	}

}
