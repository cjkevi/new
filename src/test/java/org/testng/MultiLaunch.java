package org.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiLaunch {
	@DataProvider(name = "MultiLaunch")
	public Object[][] launchBrower() {
		
		return new Object[][] {
			{"oppo"," a50"},{"samsung"," m51"},{"iphone"," 13"},{"oneplus"," 9R"},{"mi", " 11i"},{"jbl", "earphone"},
		   {"fog", "perfume"},{"oppo"," earbuds"},{"nautica"," perfume"},{"wildcraft"," bags"}

	};
	}	
	
	@Test(dataProvider="MultiLaunch")
	private void tco1(String s,String s2) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement txt = driver.findElement(By.id("twotabsearchtextbox"));
		txt.sendKeys(s);
		txt.sendKeys(s2);
		
		
		WebElement btn = driver.findElement(By.id("nav-search-submit-button"));
		btn.click();

	}
	

		
}
