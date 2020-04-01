package com.pom.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	static WebDriver d;
	static Properties prop;


	public TestBase(){
		try{
			prop = new Properties();
			FileInputStream ip = new FileInputStream(
					System.getProperty("/Users/DINESH/Desktop/selenium_projects/POMConcept/src/main/java/com/pom"
							+ "/qa/config/config.properties"));
			prop.load(ip);
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}

	}


	public static void initialization(){
		String browsername= prop.getProperty("browser");
		if(browsername.equals("chrome")){
			System.setProperty("webdriver.chrome.driver","H:\\Selenium projects\\chromedriver\\chromedriver.exe");
			d= new ChromeDriver();
		}

		/*d.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
			d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);*/
		d.get(prop.getProperty("url"));
		d.manage().window().maximize();
		WebElement login=d.findElement(By.xpath("//a[@class='ico-login']"));
		login.click();
	}
}