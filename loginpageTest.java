package com.pom.qa.tests;
import com.pom.qa.pages.*;
import com.pom.qa.base.*;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;


public class loginpageTest extends TestBase{

	static WebDriver d;
	static Properties prop;
	@BeforeTest
	static void check(){
		TestBase.initialization();
	}
	@Test
	public void check1(){
		loginpage we= new loginpage();
		we.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	@AfterTest
	public void check2(){
		d.close();
	}
}

