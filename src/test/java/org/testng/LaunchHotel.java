package org.testng;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchHotel {
	WebDriver driver;
	@BeforeClass
    private void beforeClass() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
			
	}
	
	@BeforeMethod
	private void beforeMethod() {
		Date date = new Date();
		System.out.println(date);
		
	}
	
	@Parameters ({"username","password"})
	@Test
	private void tc01(String s,String s1) {
		WebElement txtUserName = driver.findElement(By.id("username"));
		txtUserName.sendKeys(s);
		
		WebElement txtPassWord = driver.findElement(By.id("password"));
		txtPassWord.sendKeys(s1);
		
		WebElement btnLogin = driver.findElement(By.name("login"));
		btnLogin.click();
		System.out.println(s);
		System.out.println(s1);
		
	}
	
	@Parameters ({"location","hotels","roomtype","roomnos","adultroom"})
	@Test
	private void tc02(int lo,int ho,int room1,int romtype,int adltrom) {
    WebElement loc = driver.findElement(By.id("location"));
    Select select =  new Select(loc);
    select.selectByIndex(lo);
    
    WebElement hotl = driver.findElement(By.id("hotels"));
    Select select1 = new Select(hotl);
    select1.selectByIndex(ho);
    
    WebElement room = driver.findElement(By.id("room_type"));
    Select select2 = new Select(room);
    select2.selectByIndex(room1);
    

    WebElement roomno = driver.findElement(By.id("room_nos"));
    Select select3 = new Select(roomno);
    select3.selectByIndex(romtype);
    
    WebElement adlt = driver.findElement(By.id("adult_room"));
    Select select4 = new Select(adlt);
    select4.selectByIndex(adltrom);
    
    WebElement click = driver.findElement(By.id("Submit"));
    click.click();
	}
	
	@Test
	private void tc03() {
	
	WebElement clkChechBox = driver.findElement(By.id("radiobutton_0"));
	clkChechBox.click();
	WebElement btnContinue = driver.findElement(By.id("continue"));
	btnContinue.click();
	
	}
	
	@Parameters ({"firstname","lastname","address","ccnum","cctype","ccexpdate","expyear","ccv"})
	@Test
	private void tc04(String fn, String ln, String adress, String ccnum, int cctype,
			int ccexpmonth, int expyear, String cvv) {
		WebElement txtFirstName =driver.findElement(By.name("first_name"));
		txtFirstName.sendKeys(fn);
	
		WebElement txtLastName = driver.findElement(By.name("last_name"));
		txtLastName.sendKeys(ln);
		
		WebElement txtAddress = driver.findElement(By.name("address"));
		txtAddress.sendKeys(adress);
		
		WebElement txtCVV = driver.findElement(By.name("cc_num"));
		txtCVV.sendKeys(ccnum);
		
		WebElement dDnCCType = driver.findElement(By.name("cc_type"));
		Select select = new Select(dDnCCType);
		select.selectByIndex(cctype);
		
		WebElement dDnCCExpMonth = driver.findElement(By.name("cc_exp_month"));
		Select select1 = new Select(dDnCCExpMonth);
		select1.selectByIndex(ccexpmonth);
		
		WebElement dDnCCExpYear = driver.findElement(By.name("cc_exp_year"));
		Select select2 = new Select(dDnCCExpYear);
		select2.selectByIndex(expyear);
		
	    
		WebElement txtCCCvvNo = driver.findElement(By.name("cc_cvv"));
		txtCCCvvNo.sendKeys(cvv);
		WebElement btnBook = driver.findElement(By.name("book_now"));
		
		btnBook.click();
		

	}
	
	@Test
	private void tc05() {
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebElement no = driver.findElement(By.name("order_no"));
        String attribute = no.getAttribute("value");
        System.out.println(attribute);
	}
	

	@AfterMethod
	private void afterMethod() {
		Date date = new Date();
		System.out.println(date);
		

	}

}
