package Jala_utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShort {
	

public String captureScreen(WebDriver driver ) {
    String path;
    try {
       
        File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
       
        path = "./Screenshots/" +driver.getClass().getSimpleName(); ;
        FileUtils.copyFile(source, new File(path));
    }
    catch(IOException e) {
        path = "Failed to capture screenshot: " + e.getMessage();
    }
    return path;
}}