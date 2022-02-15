package org.POM;

	import org.neww.BaseClassSyntax;
    import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

	public class BookAHotel extends BaseClassSyntax {
		public BookAHotel() {
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(name = "first_name")
		private WebElement firstname;

		@FindBy(name = "last_name")
		private WebElement lastname;

		@FindBy(name = "address")
		private WebElement address;

		@FindBy(name = "cc_num")
		private WebElement ccnum;

		@FindBy(name = "cc_type")
		private WebElement cctype;

		@FindBy(name = "cc_exp_month")
		private WebElement exmonth;

		@FindBy(name = "cc_exp_year")
		private WebElement expyear;

		@FindBy(name = "cc_cvv")
		private WebElement cvv;

		@FindBy(name = "book_now")
		private WebElement book;

		public WebElement getFirstname() {
			return firstname;
		}

		public WebElement getLastName() {
			return lastname;
		}

		public WebElement getAddress() {
			return address;
		}

		public WebElement getccnum() {
			return ccnum;
		}

		public WebElement getCctype() {
			return cctype;
		}

		public WebElement getExmonth() {
			return exmonth;
		}

		public WebElement getExpyear() {
			return expyear;
		}

		public WebElement getCvv() {
			return cvv;
		}

		public WebElement getBook() {
			return book;
		}

		public void bookHotel(String firstname, String lastname, String address, String ccnum, String cctype,
				String ccexpmonth, String expyear, String cvv) {

		   insertValue(getFirstname(), firstname);
		   insertValue(getLastName(), lastname);
           insertValue(getAddress(), address);
			selectOptionsByText(getCctype(), cctype);
			selectOptionsByText(getExmonth(), ccexpmonth);
			selectOptionsByText(getExpyear(), expyear);
		   insertValue(getCvv(), cvv);
			click(getBook());
			

			
			
			
		}

	}



