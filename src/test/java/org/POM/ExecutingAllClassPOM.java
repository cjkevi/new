package org.POM;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.neww.BaseClassSyntax;

public class ExecutingAllClassPOM extends BaseClassSyntax {
	@BeforeClass
	public static void beforeClass() {
		getDriver();
		loadUrl("https://adactinhotelapp.com/index.php");
		maximize();
	}
	
	@AfterClass
	public static void afterclass() {
		quit();

	}

	@Test 
	public void BookAHotel() throws InterruptedException {
	login login = new login();
	
	login.login("selvabharathi","Selvaa031");
	
	SearchHotel search= new SearchHotel();
	search.searchHotels("Melbourne", "Hotel Hervey", "Deluxe", "4 - Four","3 - Three");
	
	SelectHotel select = new SelectHotel();
	select.selectHotel();
	
	BookAHotel book = new BookAHotel();
	book.bookHotel("kevin", "cj", "chennai", "1313345678909876", "VISA", "May", "2022", "1222");
	 
	driver.close();
	
	CancelBooking cancel = new CancelBooking();
	cancel.canacelbooking();
	
	
	driver.close();
	
	}


}
