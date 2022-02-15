package org.neww;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class BaseClass1 {
	public static void main(String[] args) throws IOException, InterruptedException {
		BaseClassSyntax baseClass = new BaseClassSyntax();
		baseClass.getDriver();
		baseClass.loadUrl("https://adactinhotelapp.com/index.php");
		baseClass.maximize();
		Thread.sleep(3000);
		
		WebElement txtuser = baseClass.findLocaterById("username");
		String data = baseClass.getData("data", 1, 0);
		baseClass.insertValue(txtuser, data);
		
		Thread.sleep(3000);
		WebElement txtpass = baseClass.findLocaterById("password");
		String data2 = baseClass.getData("data", 1, 1);
		baseClass.insertValue(txtpass, data2);
		
		WebElement btnlogin = baseClass.findLocaterById("login");
		baseClass.click(btnlogin);
		
		WebElement dDnloc = baseClass.findLocaterById("location");
		baseClass.selectOptionsByIndex(dDnloc, 2);
		
		WebElement dDnhotl = baseClass.findLocaterById("hotels");
		baseClass.selectOptionsByIndex(dDnhotl, 3);
		
		WebElement dDnroom = baseClass.findLocaterById("room_type");
		baseClass.selectOptionsByIndex(dDnroom, 3);
		
		WebElement dDnAdultRoom = baseClass.findLocaterById("adult_room");
		baseClass.dropdownbyIndex(dDnAdultRoom, 1);
		
		WebElement dDnChildRoom = baseClass.findLocaterById("child_room");
		baseClass.dropdownbyIndex(dDnChildRoom, 1);
		
		WebElement btnSubmit = baseClass.findLocaterById("Submit");
		baseClass.click(btnSubmit);
		
		baseClass.threadSleep(5000);
		WebElement clkChechBox = baseClass.findLocaterById("radiobutton_0");
		baseClass.click(clkChechBox);
		
		WebElement btnContinue = baseClass.findLocaterById("continue");
		baseClass.click(btnContinue);
		baseClass.threadSleep(5000);
		
		WebElement txtFirstName = baseClass.findLocaterById("first_name");
		String firstName = baseClass.getData("data", 1, 4);
		
		baseClass.insertValue(txtFirstName, firstName);
		WebElement txtLastName = baseClass.findLocaterById("last_name");

		String lastName = baseClass.getData("data", 1, 5);
		baseClass.insertValue(txtLastName, lastName);
		
		WebElement txtAddress = baseClass.findLocaterById("address");
		String address = baseClass.getData("data", 1, 6);
		baseClass.insertValue(txtAddress, address);

		WebElement txtCVV = baseClass.findLocaterById("cc_num");
		String ccNum = baseClass.getData("data", 1, 7);
		baseClass.insertValue(txtCVV, ccNum);
		
		WebElement dDnCCType = baseClass.findLocaterById("cc_type");
		baseClass.dropdownbyIndex(dDnCCType, 2);
		
		WebElement dDnCCExpMonth = baseClass.findLocaterById("cc_exp_month");
		baseClass.dropdownbyIndex(dDnCCExpMonth, 5);
		
		WebElement dDnCCExpYear = baseClass.findLocaterById("cc_exp_year");
		baseClass.dropdownbyIndex(dDnCCExpYear, 12);
		
		WebElement txtCCCvvNo = baseClass.findLocaterById("cc_cvv");
		String CCCvvNo = baseClass.getData("data", 1, 8);
		
		baseClass.insertValue(txtCCCvvNo, CCCvvNo);
		WebElement btnBook = baseClass.findLocaterById("book_now");
		baseClass.click(btnBook);
		
		baseClass.threadSleep(5000);
		
		WebElement txtOrderNo = baseClass.findLocaterById("order_no");
		String OrderNo = baseClass.getAttributeValue(txtOrderNo);
		baseClass.writeData("data", 1, 9,OrderNo);

	}
}
