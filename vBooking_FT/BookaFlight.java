
import resources.BookaFlightHelper;
import com.rational.test.ft.*;
import com.rational.test.ft.object.interfaces.*;
import com.rational.test.ft.object.interfaces.SAP.*;
import com.rational.test.ft.object.interfaces.WPF.*;
import com.rational.test.ft.object.interfaces.dojo.*;
import com.rational.test.ft.object.interfaces.siebel.*;
import com.rational.test.ft.object.interfaces.flex.*;
import com.rational.test.ft.object.interfaces.generichtmlsubdomain.*;
import com.rational.test.ft.script.*;
import com.rational.test.ft.value.*;
import com.rational.test.ft.vp.*;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.ibm.rational.test.ft.object.interfaces.sapwebportal.*;
/**
 * Description   : Functional Test Script
 * @author Mayakkannan.r
 */
public class BookaFlight extends BookaFlightHelper
{
	/**
	 * Script Name   : <b>BookaFlight</b>
	 * Generated     : <b>29-Aug-2019 6:33:48 PM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 10.0  Build 17134 ()
	 * 
	 * @since  2019/08/29
	 * @author Mayakkannan.r
	 */
	public void testMain(Object[] args) 
	{
		startApp("VacationBooking");
//	    startBrowser("Chrome", "http://localhost:8090/vbooking-home/");
	    sleep(5);
		label_flight().click();
		list_flyingfrom().select(dpString("fromCity"));
		list_flyingto().select(dpString("toCity"));
		
		String pattern = "dd/MM/yyyy";
		String fromDate = new SimpleDateFormat(pattern).format(new Date());
		text_from().setText(fromDate);

		button_searcHsubmit().click();
		sleep(10);
		list_passengerSelector().select(dpString("passenger"));
		String flight = (String) html_flightNumberUI().getProperty(".text");
		String fullName = (String) text_cardholdersname().getProperty(".value");
		button_proceeDsubmit().click();
		sleep(10);
		String resNum = (String) html_flightReservationNumber().getProperty(".text");
		browser_htmlBrowser(ANY,MAY_EXIT).close();
		System.out.println("Flight Reserved for "+fullName+
				" with Reservation Number#"+resNum+" in flight#"+flight);
	}
}

