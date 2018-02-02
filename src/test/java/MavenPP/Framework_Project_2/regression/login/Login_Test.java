package MavenPP.Framework_Project_2.regression.login;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import drivers.Driver_Class;

public class Login_Test extends Driver_Class {
	
	Login_Page log= new Login_Page();
	
	@BeforeTest
	
	public void setup() throws IOException{
		
		initialization();
		log.Login_Page(driver);
		
	}
	@Test(priority=1)
	public void login() throws InterruptedException, IOException{
		
		log.Login_method();
	}
	
	@Test(priority=0)
	public void invalid_login() throws IOException{
		
		log.invalid_login_method();
	}
	
	@AfterTest
	public void exit_browser() throws InterruptedException{
		
		Thread.sleep(5000);
		close_browser();
	}

}
