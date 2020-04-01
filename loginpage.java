package com.pom.qa.pages;

import org.eclipse.jetty.util.annotation.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.pom.qa.base.TestBase;
import com.pom.qa.config.*;
public class loginpage extends TestBase{

	//Page Factory - OR:
	static WebDriver d;
	WebElement username=d.findElement(By.id("Email"));
	WebElement password=d.findElement(By.id("Password"));
	WebElement loginuser= d.findElement(By.xpath("//input[@type='submit'and @value='Log in']"));
	public void login(String user,String pass){
		username.sendKeys(user);
		password.sendKeys(pass);
		loginuser.click();
}
}
