package cucumberSample;
import resources.cucumberSample.cucumberSampleRunnerHelper;
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

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import com.ibm.rational.test.ft.object.interfaces.sapwebportal.*;
/**
 * Description   : Functional Test Script
 * @author Mayakkannan.r
 */
@FTCucumberOptions(cucumberOptions = {
		"cucumberSample\\cucumberSample.feature"
})
public class cucumberSampleRunner extends cucumberSampleRunnerHelper
{
	/**
	 * Script Name   : <b>cucumberSampleRunner</b>
	 * Generated     : <b>10-Sep-2019 3:38:19 PM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 10.0  Build 17134 ()
	 * 
	 * @since  2019/09/10
	 * @author Mayakkannan.r
	 */
	public void testMain(Object[] args) 
	{
		// TODO Insert code here
	}
	
	@Given("^I Start ClassicsJavaA App$")
	public void i_start_app() throws Throwable {
		startApp("ClassicsJavaA");
		sleep(5);
	}
	
	@Then("^I Close the App$")
	public void i_close_app() throws Throwable {
		classicsCD(ANY,MAY_EXIT).close();
	}
	
	@Then("^I Maximize the App$")
	public void i_maximize_app() throws Throwable {
		classicsCD().maximize();
		sleep(5);
	}
	
	@Then("^I Restore the App$")
	public void i_restore_app() throws Throwable {
		classicsCD().minimize();
		sleep(5);
	}
	
	@Then("^I use all top options of the App$")
	public void i_use_all_top_options_of_the_App() throws Throwable {
		jmb().click(atPath("Order"));
		sleep(5);
		album().click(atText("Album"));
		jmb().click(atPath("Admin"));
		sleep(5);
		album().click(atText("Album"));
		jmb().click(atPath("Help"));
		sleep(5);
		album().click(atText("Album"));
	}
	
}

