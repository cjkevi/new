
	package org.POM;


	import org.neww.BaseClassSyntax;
    import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

	public class SearchHotel extends BaseClassSyntax {
		public SearchHotel() {
			PageFactory.initElements(driver, this);
		}

	    @FindBy(id="location")
		private WebElement dDnlocation;

		@FindBy(id="hotels")
		private WebElement dDnhotels;

	    @FindBy(id="room_type")
	    private WebElement dDnroomtype;

		@FindBy(id="room_nos")
		private WebElement dDnroomnos;
		
		 @FindBy(name="datepick_in")
		 private WebElement textcheckindate;
		 
		@ FindBy(name="datepick_out")
		private WebElement textcheckoutdate;
		
		 @FindBy(name="adult_room")
		 private WebElement dDn1;
		
		 @FindBy(name="Submit")
		 private WebElement btnsubmit;

		public WebElement getdDnlocation() {
			return dDnlocation;
		}

		public WebElement getdDnhotels() {
			return dDnhotels;
		}

		public WebElement getdDnroomtype() {
			return dDnroomtype;
		}

		public WebElement getdDnroomnos() {
			return dDnroomnos;
		}

		public WebElement getTextcheckindate() {
			return textcheckindate;
		}

		public WebElement getTextcheckoutdate() {
			return textcheckoutdate;
		}

		public WebElement getdDn1() {
			return dDn1;
		}

		public WebElement getBtnsubmit() {
			return btnsubmit;
		}
	public void searchHotels(String location,String hotels,String room_type,String room_nos,String adult_room) {
	        selectOptionsByText(getdDnlocation(), location);
	        selectOptionsByText(dDnhotels, hotels);
	        selectOptionsByText(dDnroomtype, room_type);
	        selectOptionsByText(dDnroomnos, room_nos);
	     //   selectOptionsByText(getTextcheckindate(), datepick_in);
	     //   selectOptionsByText(getTextcheckoutdate(),datepick_out);
	        selectOptionsByText(getdDn1(), adult_room);
	        click(getBtnsubmit());
		 
		 

	}

}
