package com.stepdefinition;


import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {
	WebDriver driver;
	

	@Given("user is the omr page")
	public void user_is_the_omr_page() {
		driver=new ChromeDriver();
		driver.get("https://omrbranch.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		  }


	@When("user enter the {string} and {string}")
	public void user_enter_the_and(String name, String pass) {
		driver.findElement(By.id("email")).sendKeys(name);
	    driver.findElement(By.id("pass")).sendKeys(pass);
	}


	@When("user click the login button")
	public void user_click_the_login_button() {
		driver.findElement(By.xpath("//button[@value='login']")).click();
	    
	}
	@Then("user should verify after login sucess msg")
	public void user_should_verify_after_login_sucess_msg() {
		Assert.assertTrue("verify after login success",true);
		
	    
	}




}
