package MavenPP.Framework_Project_2.regression.login;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import utilities.Common_Functions;

public class Login_Page extends Common_Functions {
	
	WebDriver driver;
	
	public void Login_Page(WebDriver driver){
		
		this.driver= driver;
	}
	
	public void Login_method() throws InterruptedException, IOException{
		
		driver.findElement(By.xpath(getlocval("username_field"))).sendKeys(getdataval("user_name"));
		driver.findElement(By.xpath(getlocval("password_field"))).sendKeys(getdataval("password"));
		driver.findElement(By.xpath(getlocval("submit_btn"))).click();
		
		//String verify_login= driver.findElement(By.xpath("//div[@class='heading']/h1[0]")).getText();
		String verify_login= driver.findElement(By.xpath(getlocval("verify_homepage"))).getText();
		Assert.assertEquals(verify_login,getdataval("hompage_verify"));
		System.out.println("case is also pass");
		
	}
	
	public void invalid_login_method() throws IOException{
		
		driver.findElement(By.xpath(getlocval("username_field"))).sendKeys(getdataval("user_name"));
		driver.findElement(By.xpath(getlocval("password_field"))).sendKeys(getdataval("wrong_password"));
		driver.findElement(By.xpath(getlocval("submit_btn"))).click();
		
		String error=driver.findElement(By.xpath("//div[@id='error' and @class='color-red']")).getText();
		Assert.assertEquals(error, getdataval("invalid_login_error"));
		
		System.out.println("case is done");
	}

}
