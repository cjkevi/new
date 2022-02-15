package org.POM;

	import org.neww.BaseClassSyntax;
    import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

	public class SelectHotel extends BaseClassSyntax {
		public SelectHotel() {
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(id="radiobutton_0")
		private WebElement btnradio;
		
		@FindBy(name="continue")
		private WebElement btncontinu;

		public WebElement getBtnradio() {
			return btnradio;
		}

		public WebElement getBtncontinu() {
			return btncontinu;
		}
	    
		public void selectHotel() {
			click(getBtnradio());
			click(getBtncontinu());

		}
	    
	}


