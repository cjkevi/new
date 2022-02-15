package org.POM;
	import org.neww.BaseClassSyntax;
    import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;

	public class BookingConfirmation extends BaseClassSyntax{
	       
		@FindBy(id="search_hotel")
		private WebElement searchhotel;

		public WebElement getSearchhotel() {
			return searchhotel;
		}
		
		private void bookingconfirm() {
			click(getSearchhotel());

		}
		
	}



