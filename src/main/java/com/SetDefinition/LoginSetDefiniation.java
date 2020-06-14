package com.SetDefinition;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSetDefiniation {
	
	WebDriver driver;
	
	@Given("^user is already on Login Page$")
	public void user_is_already_on_Login_Page() throws Throwable {
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+File.separator
			+"Browsers"+File.separator+"chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://practice.automationtesting.in/my-account/");
	
		
	}

	@When("^title of login page$")
	public void title_of_login_page() throws Throwable {
		
		String actualtitle=driver.getTitle();
		//System.out.println(actualtitle);
		String exptitle="My Account – Automation Practice Site";
		if(actualtitle.equalsIgnoreCase(exptitle))
		{
			System.out.println("title is matched");
		}
		else
		{
			System.out.println("title is not matched");
		}
	  
	}

	@Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String username, String password) throws Throwable {
	    driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
		
		Thread.sleep(4000);
	   driver.findElement(By.xpath("//input[@name='login']")).click();
	}

	@Then("^user is on home page$")
	public void user_is_on_home_page() throws Throwable {
	    
		String actualstring=driver.findElement(By.xpath("//a[text()='Sign out']")).getText();
		//System.out.println(actualstring);
		String expString="Sign out";
		if(actualstring.equalsIgnoreCase(expString))
		{
			System.out.println("Login Successfully");
		}
		else
		{
			System.out.println("login is failed");
		}
		
	}

	@Then("^Close the browser$")
	public void close_the_browser() throws Throwable {
		driver.close();
	   
	}



}
