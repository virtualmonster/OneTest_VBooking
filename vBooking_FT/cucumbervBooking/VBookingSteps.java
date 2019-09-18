package cucumbervBooking;
import resources.cucumbervBooking.VBookingStepsHelper;
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

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import java.util.Collection;

import com.ibm.rational.test.ft.object.interfaces.sapwebportal.*;

/**
 * Description   : Functional Test Script
 * @author Mayakkannan.r
 */

public class VBookingSteps extends VBookingStepsHelper
{
	/**
	 * Script Name   : <b>VBookingSteps</b>
	 * Generated     : <b>27-Aug-2019 1:56:28 PM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 10.0  Build 17134 ()
	 * 
	 * @since  2019/08/27
	 * @author Mayakkannan.r
	 */
	public void testMain(Object[] args){ 
		
	}
	
	@Given("^I Open Vacation Booking Portal$")
	public void i_Open_Vacation_Booking_Portal() throws Throwable {
	    startBrowser("Chrome", "http://localhost:8090/vbooking-home/");
	    sleep(5);
	}

	@Given("^I Open Vacation Booking Admin Portal$")
	public void i_Open_Vacation_Booking_Admin_Portal() throws Throwable {
		startBrowser("Chrome", "http://localhost:8090/vbooking-admin/");
		sleep(5);
	}

	@Then("^I Book a Flight from \"([^\"]*)\" to \"([^\"]*)\" on \"([^\"]*)\" "
			+ "for \"([^\"]*)\"$")
	public void i_Book_a_Flight_from_to_on_for(String fromCity, String toCity, 
			String fromDate, String passenger) throws Throwable {
		
		label_flight().click();
		list_flyingfrom().select(fromCity);
		list_flyingto().select(toCity);
		text_from().setText(fromDate);
		button_searcHsubmit().click();
		sleep(5);
		flight = (String) html_flightNumberUI().getProperty(".text");
		cost = (String) html_flightCost().getProperty(".text");
		list_passengerSelector().select(passenger);
		VBookingSteps.passenger = passenger;
		button_proceeDsubmit().click();
		sleep(5);
		resNum = (String) html_flightReservationNumber().getProperty(".text");
		scenario.write("Flight "+flight+" is reserved with Number:"+resNum+" at the "
				+ "cost of "+cost);
	}

	@Then("^I Close Portal$")
	public void i_Close_Portal() throws Throwable {
		browser_htmlBrowser(ANY,DEFAULT_FLAGS).close();
	}

	@Then("^I Check-in above Passenger$")
	public void i_Check_in_Passenger() throws Throwable {
//		flight = "VB043";
//		resNum = "A00020";
		link_passengerCheckIn().click();
		sleep(5);
		TestObject[] link_flights = browser_htmlBrowser().find(atDescendant(".class","Html.A",".text",flight));
		((GuiTestObject)link_flights[0]).click();
		
		sleep(5);
		TestObject[] lnk_resNums = browser_htmlBrowser().find(atDescendant(".class","Html.A",".text", resNum));
		((GuiTestObject)lnk_resNums[0]).click();
		
		document_passengerCheckin().click(atXpath("//body/div/table/tbody/tr[2]/td/table/tbody/tr[8]/td/input"));
		button_verifiedbutton().click();
//		text_apiComment().click(atPoint(99,15));
		button_checkInsubmit().click();
		sleep(5);
		scenario.write("Checked in "+passenger+" with Reservation Number:"+resNum+" in Flight:"+flight);
	}

	@Then("^I Board above Passenger with Passport Num \"([^\"]*)\"$")
	public void i_Board_the_Passenger_with_Passport_Num(String passNum) throws Throwable {
//		flight = "VB299";
//		resNum = "A00030";
		link_passengerBoarding().click();
		TestObject[] link_flights = browser_htmlBrowser().find(atDescendant(".class","Html.A",".text",flight));
		((GuiTestObject)link_flights[0]).click();
		sleep(5);
		TestObject[] lnk_passList = browser_htmlBrowser().find(atDescendant(".class","Html.A"));
//		System.out.println("No of Links:"+lnk_passList.length);
		for(int i=0;i<lnk_passList.length;i++) {
			String passName = ((Href) lnk_passList[i].getProperty(".href")).getHref();
			if(passName.contains(resNum)) {
				((GuiTestObject)lnk_passList[i]).click();
				break;
			}
		}
		text_passportID().setText(passNum);
		button_boardPassengersubmit().click();
		sleep(5);
		scenario.write("Boarded "+passenger+" with Reservation Number:"+resNum+" in Flight:"+flight);
	}
	
	@Then("^I Check-in Passenger with ReserveNum \"([^\"]*)\" in Flight \"([^\"]*)\"$")
	public void i_Check_in_Passenger_with_ReserveNum_in_Flight(String resNum, String flight) throws Throwable {
		link_passengerCheckIn().click();
		sleep(5);
		TestObject[] link_flights = browser_htmlBrowser().find(atDescendant(".class","Html.A",".text",flight));
				((GuiTestObject)link_flights[0]).click();
		sleep(5);
		TestObject[] lnk_resNums = browser_htmlBrowser().find(atDescendant(".class","Html.A",".text", resNum));
			((GuiTestObject)lnk_resNums[0]).click();
		document_passengerCheckin().click(atXpath("//input[@value='Request Upgrade']"));
		button_verifiedbutton().click();
//		text_apiComment().click(atPoint(99,15));
		button_checkInsubmit().click();
		sleep(5);
		scenario.write("Checked in passenger with Reservation Number:"+resNum+" in Flight:"+flight);
	}

	@Then("^I Board Passenger with ReserveNum \"([^\"]*)\" and Passport Num \"([^\"]*)\" in Flight \"([^\"]*)\"$")
	public void i_Board_Passenger_with_ReserveNum_and_Passport_Num_in_Flight(String resNum, String passNum, String flight) throws Throwable {
		link_passengerBoarding().click();
		TestObject[] link_flights = browser_htmlBrowser().find(atDescendant(".class","Html.A",".text",flight));
		((GuiTestObject)link_flights[0]).click();
		sleep(5);
		TestObject[] lnk_passList = browser_htmlBrowser().find(atDescendant(".class","Html.A"));
		for(int i=0;i<lnk_passList.length;i++) {
			String passName = ((Href) lnk_passList[i].getProperty(".href")).getHref();
			if(passName.contains(resNum)) {
				passenger = (String) lnk_passList[i].getProperty(".text");
				((GuiTestObject)lnk_passList[i]).click();
				break;
			}
		}
		text_passportID().setText(passNum);
		button_boardPassengersubmit().click();
		sleep(5);
		scenario.write("Boarded "+passenger.trim()+" with Reservation Number:"+resNum+" in Flight:"+flight);
	}
	
	private Scenario scenario;
	private static String flight=null, cost=null,resNum=null,passenger=null;
	
	@Before
	public void beforetest(Scenario scenario) {
		this.scenario =  scenario;
	}
}

