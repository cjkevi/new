package org.neww;

import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JunitExtends extends BaseClassSyntax {
	
	static WebDriver driver;
	
	@BeforeClass
	public static void beforeClass() {
		getDriver();
		loadUrl("https://adactinhotelapp.com/index.php");
		maximize();
		
		
	}
	@AfterClass
	public static void AfterClass() throws InterruptedException {
		Thread.sleep(10000);
		quit();
		
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
	public void test() throws IOException, InterruptedException {
		
	
	
	WebElement txtuser = findLocaterById("username");
	String data = getData("data", 1, 0);
	insertValue(txtuser, data);
	String name = txtuser.getAttribute("value");
	Assert.assertEquals("verify username", "selvabharathi", name);
	
	WebElement txtpass = findLocaterById("password");
	String data2 = getData("data", 1, 1);
	insertValue(txtpass, data2);
	
	WebElement btnlogin = findLocaterById("login");
	click(btnlogin);
	
	WebElement dDnloc = findLocaterById("location");
	selectOptionsByIndex(dDnloc, 2);
	
	WebElement dDnhotl = findLocaterById("hotels");
	selectOptionsByIndex(dDnhotl, 3);
	
	WebElement dDnroom =findLocaterById("room_type");
    selectOptionsByIndex(dDnroom, 3);
    
    WebElement dDnAdultRoom = findLocaterById("adult_room");
	dropdownbyIndex(dDnAdultRoom, 1);
	
	WebElement dDnChildRoom = findLocaterById("child_room");
	dropdownbyIndex(dDnChildRoom, 1);
	
	WebElement btnSubmit = findLocaterById("Submit");
	click(btnSubmit);
	
	threadSleep(5000);
	
	WebElement clkChechBox = findLocaterById("radiobutton_0");
	click(clkChechBox);
	
	WebElement btnContinue = findLocaterById("continue");
	click(btnContinue);
	threadSleep(5000);
	
	WebElement txtFirstName = findLocaterById("first_name");
	String firstName = getData("data", 1, 4);
	
	insertValue(txtFirstName, firstName);
	WebElement txtLastName = findLocaterById("last_name");

	String lastName = getData("data", 1, 5);
	insertValue(txtLastName, lastName);
	
	WebElement txtAddress = findLocaterById("address");
	String address = getData("data", 1, 6);
	insertValue(txtAddress, address);

	WebElement txtCVV = findLocaterById("cc_num");
	String ccNum = getData("data", 1, 7);
	insertValue(txtCVV, ccNum);
	
	WebElement dDnCCType = findLocaterById("cc_type");
	dropdownbyIndex(dDnCCType, 2);
	
	WebElement dDnCCExpMonth = findLocaterById("cc_exp_month");
	dropdownbyIndex(dDnCCExpMonth, 5);
	
	WebElement dDnCCExpYear = findLocaterById("cc_exp_year");
	dropdownbyIndex(dDnCCExpYear, 12);
	
	WebElement txtCCCvvNo = findLocaterById("cc_cvv");
	String CCCvvNo = getData("data", 1, 8);
	
	insertValue(txtCCCvvNo, CCCvvNo);
	WebElement btnBook = findLocaterById("book_now");
	click(btnBook);
	
	threadSleep(5000);
	
	WebElement txtOrderNo = findLocaterById("order_no");
	String OrderNo = getAttributeValue(txtOrderNo);
	writeData("data", 1, 9,OrderNo);
	
	WebElement className = findLocatorByClassName("login_title");
	
	WebElement slctHotel = findLocatorByXpath("//td[text()='Select Hotel ']");
	String title = getTitle();
	boolean b = title.contains("Select Hotel ");
	Assert.assertTrue("verify title",b);
	System.out.println(b);
	
		


	
	}
	
	
}


