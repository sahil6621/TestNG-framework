package drivers;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import utilities.Common_Functions;

public class Driver_Class {
	
	public WebDriver driver;
	
	public void initialization() throws IOException{
		
		selectbrowser(Common_Functions.getdataval("browser"));
		driver.get(Common_Functions.getdataval("base_url"));
	}
	
	public void selectbrowser(String browsername){
		switch(browsername){
		case "chrome":
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "/Drivers/chromedriver.exe");
			driver=new ChromeDriver();
			break;
		case "firefox":
		case "IE":
		}
	}
	
	public void close_browser(){
		driver.close();
	}

}
