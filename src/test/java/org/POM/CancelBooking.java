package org.POM;

import java.awt.Checkbox;

import org.neww.BaseClassSyntax;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.tethering.model.Accepted;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CancelBooking extends BaseClassSyntax{
	public CancelBooking() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Booked Itinerary']")
    private WebElement bookingReference;

	@FindBy(xpath="(//input[@type='checkbox'])[2]")
	private WebElement checkbox;

	public WebElement getClick() {
		return bookingReference;
	}

	public WebElement getCheckbox() {
		return checkbox;
	}
	
    public void canacelbooking() {
    	click(getClick());
    	click(getCheckbox());
    	
    	
		

	}
		
	

}
