package comman;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import utilities.TestUtils;

public class Listners extends TestUtils implements ITestListener {
	public void onTestStart(ITestResult result) {
	System.out.println(" test case is starting");
	}
	
	public void onTestSucess(ITestResult result) {
	System.out.println(" test case is starting");
		
		
	}
	public void onTestFailure(ITestResult result) {
		System.out.println(" test case is starting");
		try {
			getscreenShot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		}
}
