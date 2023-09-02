package com.demo.SeleniumDemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Utils {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub\  public static void CaptureScreen(WebDriver driver,String filename) throws IOException {
        // TODO Auto-generated method stub
        TakesScreenshot ts=(TakesScreenshot)driver;
          File file=ts.getScreenshotAs(OutputType.FILE);
          FileUtils.copyFile(file, new File("./screenshots"+filename+".png"));

    }

 



	}


