package org.POM;

import org.neww.BaseClassSyntax;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login extends BaseClassSyntax{
	public login() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username")
	private WebElement TxtUsername;
	
	@FindBy(id="password")
	private WebElement Txtpassword;
	
	@FindBy(id = "login")
	private WebElement login;

	public WebElement getTxtUsername() {
		return TxtUsername;
	}

	public WebElement getTxtpassword() {
		return Txtpassword;
	}

	public WebElement getLogin() {
		return login;
	}
	
	public void login (String username,String password) {
		insertValue(getTxtUsername(), username);
		insertValue(getTxtpassword(), password);
		click(getLogin());
		
}}