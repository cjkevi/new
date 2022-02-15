package org.neww;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Greens {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenscart.in/#/login?returnUrl=%2F");
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("//input[@class='form-control-1']"));
		element.click();
	}
	

}
