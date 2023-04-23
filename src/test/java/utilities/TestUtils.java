package utilities;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import comman.BaseTest;

public class TestUtils extends BaseTest{
	public void getscreenShot()  throws IOException  {
		   Date currentdate = new Date();
		   String namescrenshot=currentdate.toString().replace(" ", "_").replace(":","");
		   File src =((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		   FileUtils.copyFile(src, new File(".//screenshot//"+namescrenshot+".png"));
	}

}
