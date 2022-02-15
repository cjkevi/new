package org.neww;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JUnit {

	static WebDriver driver;
	@BeforeClass
	public static void beforeclass() {
	
	WebDriverManager.chromedriver().setup();
	
	driver=new ChromeDriver();
	driver.get("https://adactinhotelapp.com/index.php");
	driver.manage().window().maximize();
	
	
	
	}
	
	@AfterClass
	public static void afterClass() {
    driver.quit();
	}
	
	@Before
	public void beforeMethod() {
		long start = System.currentTimeMillis();
		System.out.println(start);
		
	}
	
	@After
	public void after() {
		long end = System.currentTimeMillis();
        System.out.println(end);
	}
	
     @Test
     public void test() {
    	 WebElement txtUsername = driver.findElement(By.id("username"));
    		txtUsername.sendKeys("8778485792");
    	    
	}
   //  @Test
     public void testMethod() {
    	 WebElement pswd = driver.findElement(By.id("password"));
    		pswd.sendKeys("kevin221095");}
    		
    		public void testMethod2() {
    	    	 WebElement pswd = driver.findElement(By.id("login"));
    	    		pswd.click();	
     }
    	    
     
     
	
}
