/**@generated
 * WARNING  Changes you make to this file may be lost.
 *           File is generated and may be re-generated without warning.
 * @RPT-Core-generated Version 8.6
 */
/******************************************************************
* Licensed Materials - Property of IBM and/or HCL
* Copyright IBM Corporation 2013, 2017. All Rights Reserved.
* Copyright HCL Technologies Ltd. 2017, 2020.  All Rights Reserved.
* 
* U.S. Government Users Restricted Rights - Use, duplication or 
* disclosure restricted by GSA ADP Schedule Contract with IBM Corp.
******************************************************************/
/* TestScript.template - Suitable for collaborative code generation */
package test;

import com.ibm.rational.test.lt.datacorrelation.execution.action.AssignVariableAction;
import com.ibm.rational.test.lt.datacorrelation.execution.action.VariableAction;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.DataCorrelationVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.DataHarvester;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.DataVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.IDCCoreVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.IDataCorrelationVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.IDataHarvester;
import com.ibm.rational.test.lt.datacorrelation.execution.proto.ProtoAdapterHandler;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.DataSub;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.IDataSub;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.ISubRule;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.SubRule;
import com.ibm.rational.test.lt.execution.core.impl.LTTestScript;
import com.ibm.rational.test.lt.execution.moeb.action.EndMoebStepBatchAction;
import com.ibm.rational.test.lt.execution.moeb.action.MoebStepBatchAction;
import com.ibm.rational.test.lt.execution.moeb.services.*;
import com.ibm.rational.test.lt.kernel.IDataArea;
import com.ibm.rational.test.lt.kernel.action.IContainer;

@SuppressWarnings("all")
public class Test_A1E9C34688412AD0EEA7E33737383461 extends LTTestScript  {

    static ProtoAdapterHandler pa = new ProtoAdapterHandler();
    static {           
        pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.protocol.core.CoreProtoAdapter", "coreAdapter");
pa.addPA("com.ibm.rational.test.lt.execution.moeb.dc.MoebDataAdapter", "com.ibm.rational.test.lt.execution.moeb.action.MoebStepBatchAction");
    }
	private IDataCorrelationVar[] dcVars = DataCorrelationVar.getArrayDCVars(1);
	private DataVar[] vars = new DataVar[8];
	
    
    
	
	public Test_A1E9C34688412AD0EEA7E33737383461(IContainer container, String invocationId) {
		super(container, "Check-in Passenger", invocationId, "A1E9C34688412AD0EEA7E33737383461");
		setArmEnabled(false);
		stopAtYourConvenience=false;
		
	}

    public void execute() {
    	try {
			
	    		if (!isScheduleRun()) setThinkMax(2000);
	
	if (!isScheduleRun()){
}
	
	
	        	this.add(varAction_1(this));
	this.add(applicationContext_1(this));
	this.add(applicationContext_2(this));
	this.add(applicationContext_3(this));
	this.add(applicationContext_4(this));
	this.add(applicationContext_5(this));
	this.add(applicationContext_6(this));
	this.add(applicationContext_7(this));
	this.add(applicationContext_8(this));
	this.add(dataVarAssign_1(this));
	this.add(applicationContext_9(this));
			this.addFinally(new EndMoebStepBatchAction(this));

	    } catch (Throwable e) {
		     log("Test Execution: Test_A1E9C34688412AD0EEA7E33737383461 ",e);
	    } finally {
	        super.execute();
		}	    
    }
    
	public void preFinish() {
		
		super.preFinish();
	}
	
	public void stop() {
		
		super.stop();
	}	
	
	private VariableAction varAction_1(final IContainer parent) {

	VariableAction vc = new VariableAction(parent, "", "A1E9C346884151F3EEA7E33737383461");	
			vars[0] = new DataVar("#hidden#`11`", "11", IDataArea.TEST, "IGNORE", false, false);

	
		vars[1] = new DataVar("#hidden#`Reservation`", "Reservation", IDataArea.TEST, "IGNORE", false, false);

	
		vars[2] = new DataVar("#hidden#`Flight`", "Flight", IDataArea.TEST, "IGNORE", false, false);

	
		vars[3] = new DataVar("RTW_WebUI_Browser_Selection", "Firefox", IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[4] = new DataVar("ReservationNumber", "", IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[5] = new DataVar("FlightNumber", "", IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[6] = new DataVar("Comment", "", IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[7] = new DataVar("localhost", "10.10.10.10", IDataArea.VIRTUALUSER, "IGNORE", false, false);

		
	vc.add(vars);
	return vc;
	
}
	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_1(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Start vBooking-admin",
												  "A1E9C34688460CD0EEA7E33737383461",
												  "{\"variables\":[{\"id\":\"9\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"http:\\/\\/localhost:8090\\/vbooking-admin\\/\",\"key\":\"appAddress@Moeb\"}],\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"description\":\"Start <b><subst key=\\\"appAddress@Moeb\\\">vBooking-admin<\\/subst><\\/b>\",\"to_overriden\":false,\"application_uid\":\"23547eca-6d19-43f5-b890-7f6001e5888e\",\"timeout\":0,\"uid\":\"A1E9C34688460CD0EEA7E33737383461\",\"application_package\":\"com.ibm.rational.test.mobile.android.browser\",\"application_os\":\"WebUI\",\"substitutionParameters\":[{\"name\":\"web_app_address\",\"variableKey\":\"appAddress@Moeb\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"http:\\/\\/localhost:8090\\/vbooking-admin\\/\"}],\"isWeb\":false,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"start\",\"parameters\":[{\"name\":\"activity\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"com.ibm.rational.test.mobile.android.browser.BrowserMainActivity\"},{\"name\":\"rmot_kind_of_launch\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"playback\"},{\"name\":\"starting_url\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"http:\\/\\/localhost:8090\\/vbooking-admin\\/\"},{\"$ref\":\"2\"},{\"name\":\"web_app_protocol\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"\"},{\"name\":\"web_app_context\",\"id\":\"8\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"1\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceHWActionStep\"}],\"timeout\":60}",
												  "/vBooking_WebUI/Check-in Passenger.testsuite",
												  null,
												  "<default>");
		IDataSub subContainer_1 = new DataSub();
		stepBatch.addDataSub(subContainer_1);
	ISubRule sub_0 = new SubRule("appAddress@Moeb", 7, 9, false, (IDCCoreVar)vars[7], false, "localhost", null, 0, false);
	subContainer_1.addSubInstruction(sub_0);
	


		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_2(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Hyperlink whose Content is Passenger check-in - vBooking-admin",
												  "A1E9C34688465B01EEA7E33737383461",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E9C34688465B01EEA7E33737383461\",\"preferredThinktime\":0,\"thinktime\":1000,\"isWeb\":false,\"description\":\"Think <i>1,000<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"23547eca-6d19-43f5-b890-7f6001e5888e\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Hyperlink<\\/b> whose <b>Content<\\/b> is <b>Passenger check-in<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"23547eca-6d19-43f5-b890-7f6001e5888e\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"uid\":\"A1E9C34688465B01EEA7E33737383461\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Passenger check-in\"},\"name\":\"content\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:169;left:601;bottom:192;right:762\\\", \\\"Geometry\\\": { \\\"height\\\": 23, \\\"width\\\": 161, \\\"x\\\": 601, \\\"y\\\": 169 }, \\\"Style$array$\\\": \\\"background-color:rgba(0, 0, 0, 0);background-repeat:repeat;color:rgb(0, 0, 255);font-family:\\\\\\\"Open Sans\\\\\\\", Tahoma;font-size:19.0667px;font-style:normal;font-weight:400;line-height:23px;margin-bottom:0px;margin-left:0px;margin-right:0px;margin-top:0px;opacity:1;padding-bottom:0px;padding-left:0px;padding-right:0px;padding-top:0px;text-align:center;text-decoration:underline;visibility:visible;z-index:auto;\\\", \\\"background-color\\\": \\\"00000000\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 192, \\\"color\\\": \\\"0000FFFF\\\", \\\"content\\\": \\\"Passenger check-in\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"font-family\\\": \\\"\\\\\\\"Open Sans\\\\\\\", Tahoma\\\", \\\"font-size\\\": \\\"19.0667\\\", \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"href\\\": \\\"checkin-signin.jsp?menu=checkin-select\\\", \\\"left\\\": 601, \\\"line-height\\\": \\\"23\\\", \\\"margin-bottom\\\": 0, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 0, \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": 0, \\\"padding-left\\\": 0, \\\"padding-right\\\": 0, \\\"padding-top\\\": 0, \\\"proxyClass\\\": \\\"HtmlAProxy\\\", \\\"proxyName\\\": \\\"a\\\", \\\"right\\\": 762, \\\"tagname\\\": \\\"a\\\", \\\"text-align\\\": \\\"center\\\", \\\"text-decoration\\\": \\\"underline\\\", \\\"top\\\": 169, \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"57\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/body\\\\\\/div\\\\\\/table\\\\\\/tbody\\\\\\/tr[2]\\\\\\/td\\\\\\/h3\\\\\\/a\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.a\"}}],\"timeout\":60}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_3(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Hyperlink whose Content is VB298 - vBooking-admin",
												  "A1E9C346884E9851EEA7E33737383461",
												  "{\"variables\":[{\"id\":\"8\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"VB298\",\"key\":\"MOEB_FIELD\\/IDB:A1E9C3468856FCC0EEA7E33737383461\"}],\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E9C346884E9851EEA7E33737383461\",\"preferredThinktime\":0,\"thinktime\":1000,\"isWeb\":false,\"description\":\"Think <i>1,000<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"23547eca-6d19-43f5-b890-7f6001e5888e\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Hyperlink<\\/b> whose <b>Content<\\/b> is <b><subst key=\\\"MOEB_FIELD\\/IDB:A1E9C3468856FCC0EEA7E33737383461\\\">VB298<\\/subst><\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"23547eca-6d19-43f5-b890-7f6001e5888e\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"uid\":\"A1E9C346884E9851EEA7E33737383461\",\"substitutionParameters\":[{\"name\":\"content\",\"variableKey\":\"MOEB_FIELD\\/IDB:A1E9C3468856FCC0EEA7E33737383461\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"VB298\"}],\"isWeb\":true,\"action\":{\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"$ref\":\"3\"},\"name\":\"content\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:329;left:431;bottom:347;right:481\\\", \\\"Geometry\\\": { \\\"height\\\": 18, \\\"width\\\": 50, \\\"x\\\": 431, \\\"y\\\": 329 }, \\\"Style$array$\\\": \\\"background-color:rgba(0, 0, 0, 0);background-repeat:repeat;color:rgb(0, 0, 255);font-family:\\\\\\\"Open Sans\\\\\\\", Tahoma;font-size:14.6667px;font-style:normal;font-weight:700;line-height:18px;margin-bottom:0px;margin-left:0px;margin-right:0px;margin-top:0px;opacity:1;padding-bottom:0px;padding-left:0px;padding-right:0px;padding-top:0px;text-align:center;text-decoration:underline;visibility:visible;z-index:auto;\\\", \\\"background-color\\\": \\\"00000000\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 347, \\\"color\\\": \\\"0000FFFF\\\", \\\"content\\\": \\\"VB298\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"font-family\\\": \\\"\\\\\\\"Open Sans\\\\\\\", Tahoma\\\", \\\"font-size\\\": \\\"14.6667\\\", \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"700\\\", \\\"href\\\": \\\"checkin-select.jsp?flight-no=VB298\\\", \\\"left\\\": 431, \\\"line-height\\\": \\\"18\\\", \\\"margin-bottom\\\": 0, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 0, \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": 0, \\\"padding-left\\\": 0, \\\"padding-right\\\": 0, \\\"padding-top\\\": 0, \\\"proxyClass\\\": \\\"HtmlAProxy\\\", \\\"proxyName\\\": \\\"a\\\", \\\"right\\\": 481, \\\"tagname\\\": \\\"a\\\", \\\"text-align\\\": \\\"center\\\", \\\"text-decoration\\\": \\\"underline\\\", \\\"top\\\": 329, \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"81\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/body\\\\\\/div\\\\\\/table\\\\\\/tbody\\\\\\/tr[2]\\\\\\/td\\\\\\/table\\\\\\/tbody\\\\\\/tr[5]\\\\\\/td\\\\\\/a\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.a\"}}],\"timeout\":60}",
												  null,
												  null,
												  "<default>");
		IDataSub subContainer_2 = new DataSub();
		stepBatch.addDataSub(subContainer_2);
	ISubRule sub_1 = new SubRule("MOEB_FIELD/IDB:A1E9C3468856FCC0EEA7E33737383461", 0, 5, false, (IDCCoreVar)vars[5], false, "VB298", null, 0, false);
	subContainer_2.addSubInstruction(sub_1);
	


		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_4(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Hyperlink whose Content is A00011 - vBooking-admin",
												  "A1E9C34688574AE4EEA7E33737383461",
												  "{\"variables\":[{\"id\":\"8\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"A00011\",\"key\":\"MOEB_FIELD\\/IDB:A1E9C346885FFD70EEA7E33737383461\"}],\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E9C34688574AE4EEA7E33737383461\",\"preferredThinktime\":0,\"thinktime\":1000,\"isWeb\":false,\"description\":\"Think <i>1,000<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"23547eca-6d19-43f5-b890-7f6001e5888e\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Hyperlink<\\/b> whose <b>Content<\\/b> is <b><subst key=\\\"MOEB_FIELD\\/IDB:A1E9C346885FFD70EEA7E33737383461\\\">A00011<\\/subst><\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"23547eca-6d19-43f5-b890-7f6001e5888e\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"uid\":\"A1E9C34688574AE4EEA7E33737383461\",\"substitutionParameters\":[{\"name\":\"content\",\"variableKey\":\"MOEB_FIELD\\/IDB:A1E9C346885FFD70EEA7E33737383461\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"A00011\"}],\"isWeb\":true,\"action\":{\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"$ref\":\"3\"},\"name\":\"content\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:263;left:243;bottom:292;right:463\\\", \\\"Geometry\\\": { \\\"height\\\": 29, \\\"width\\\": 220, \\\"x\\\": 243, \\\"y\\\": 263 }, \\\"Style$array$\\\": \\\"background-color:rgba(180, 180, 180, 0.7);background-repeat:repeat;color:rgb(0, 58, 140);font-family:\\\\\\\"Open Sans\\\\\\\", Tahoma;font-size:14.6667px;font-style:normal;font-weight:700;line-height:18px;margin-bottom:0px;margin-left:0px;margin-right:0px;margin-top:0px;opacity:1;padding-bottom:5px;padding-left:5px;padding-right:5px;padding-top:5px;text-align:center;text-decoration:none;visibility:visible;z-index:auto;\\\", \\\"background-color\\\": \\\"B4B4B4B3\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 292, \\\"color\\\": \\\"003A8CFF\\\", \\\"content\\\": \\\"A00011\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"font-family\\\": \\\"\\\\\\\"Open Sans\\\\\\\", Tahoma\\\", \\\"font-size\\\": \\\"14.6667\\\", \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"700\\\", \\\"left\\\": 243, \\\"line-height\\\": \\\"18\\\", \\\"margin-bottom\\\": 0, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 0, \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": 5, \\\"padding-left\\\": 5, \\\"padding-right\\\": 5, \\\"padding-top\\\": 5, \\\"position\\\": \\\"1 : 1\\\", \\\"proxyClass\\\": \\\"HtmlTableCellProxy\\\", \\\"proxyName\\\": \\\"td\\\", \\\"right\\\": 463, \\\"tagname\\\": \\\"td\\\", \\\"text-align\\\": \\\"center\\\", \\\"text-decoration\\\": \\\"none\\\", \\\"top\\\": 263, \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"73\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/body\\\\\\/div\\\\\\/table\\\\\\/tbody\\\\\\/tr[2]\\\\\\/td\\\\\\/div\\\\\\/table\\\\\\/tbody\\\\\\/tr[2]\\\\\\/td\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.a\"}}],\"timeout\":60}",
												  null,
												  null,
												  "<default>");
		IDataSub subContainer_3 = new DataSub();
		stepBatch.addDataSub(subContainer_3);
	ISubRule sub_2 = new SubRule("MOEB_FIELD/IDB:A1E9C346885FFD70EEA7E33737383461", 0, 6, false, (IDCCoreVar)vars[4], false, "A00011", null, 0, false);
	subContainer_3.addSubInstruction(sub_2);
	


		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_5(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Submit button whose Content is Request Upgrade - vBooking-admin",
												  "A1E9C3468876B9C2EEA7E33737383461",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E9C3468876B9C2EEA7E33737383461\",\"preferredThinktime\":0,\"thinktime\":1000,\"isWeb\":false,\"description\":\"Think <i>1,000<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"23547eca-6d19-43f5-b890-7f6001e5888e\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Submit button<\\/b> whose <b>Content<\\/b> is <b>Request Upgrade<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"23547eca-6d19-43f5-b890-7f6001e5888e\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"uid\":\"A1E9C3468876B9C2EEA7E33737383461\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Request Upgrade\"},\"name\":\"content\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:370;left:508;bottom:398;right:658\\\", \\\"Geometry\\\": { \\\"height\\\": 28, \\\"width\\\": 150, \\\"x\\\": 508, \\\"y\\\": 370 }, \\\"Style$array$\\\": \\\"background-color:rgb(160, 160, 160);background-repeat:repeat;color:rgb(255, 255, 255);font-family:MS Shell Dlg \\\\\\\\32 ;font-size:17.6px;font-style:normal;font-weight:400;line-height:22px;margin-bottom:0px;margin-left:0px;margin-right:0px;margin-top:0px;opacity:1;padding-bottom:0px;padding-left:9px;padding-right:7px;padding-top:0px;text-align:center;text-decoration:none;visibility:visible;z-index:auto;\\\", \\\"background-color\\\": \\\"A0A0A0FF\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 398, \\\"class\\\": \\\"btn\\\", \\\"color\\\": \\\"FFFFFFFF\\\", \\\"content\\\": \\\"Request Upgrade\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"font-family\\\": \\\"MS Shell Dlg \\\\\\\\32 \\\", \\\"font-size\\\": \\\"17.6\\\", \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"left\\\": 508, \\\"line-height\\\": \\\"22\\\", \\\"margin-bottom\\\": 0, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 0, \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": 0, \\\"padding-left\\\": 9, \\\"padding-right\\\": 7, \\\"padding-top\\\": 0, \\\"proxyClass\\\": \\\"HtmlSubmitProxy\\\", \\\"proxyName\\\": \\\"inputsubmit\\\", \\\"right\\\": 658, \\\"tagname\\\": \\\"input\\\", \\\"text-align\\\": \\\"center\\\", \\\"text-decoration\\\": \\\"none\\\", \\\"top\\\": 370, \\\"type\\\": \\\"submit\\\", \\\"value\\\": \\\"Request Upgrade\\\", \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"113\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/body\\\\\\/div\\\\\\/table\\\\\\/tbody\\\\\\/tr[2]\\\\\\/td\\\\\\/table\\\\\\/tbody\\\\\\/tr[8]\\\\\\/td\\\\\\/input\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.inputsubmit\"}}],\"timeout\":60}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_6(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Image button whose Class is btn - vBooking-admin",
												  "A1E9C3468881DD54EEA7E33737383461",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E9C3468881DD54EEA7E33737383461\",\"preferredThinktime\":0,\"thinktime\":1000,\"isWeb\":false,\"description\":\"Think <i>1,000<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"23547eca-6d19-43f5-b890-7f6001e5888e\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Image button<\\/b> whose <b>Class<\\/b> is <b>btn<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"23547eca-6d19-43f5-b890-7f6001e5888e\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"uid\":\"A1E9C3468881DD54EEA7E33737383461\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"class\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"btn\"},\"name\":\"class\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:467;left:525;bottom:495;right:641\\\", \\\"Geometry\\\": { \\\"height\\\": 28, \\\"width\\\": 116, \\\"x\\\": 525, \\\"y\\\": 467 }, \\\"Style$array$\\\": \\\"background-color:rgb(160, 160, 160);background-repeat:repeat;color:rgb(255, 255, 255);font-family:MS Shell Dlg \\\\\\\\32 ;font-size:17.6px;font-style:normal;font-weight:400;line-height:22px;margin-bottom:0px;margin-left:0px;margin-right:0px;margin-top:0px;opacity:1;padding-bottom:0px;padding-left:9px;padding-right:7px;padding-top:0px;text-align:center;text-decoration:none;visibility:visible;z-index:auto;\\\", \\\"background-color\\\": \\\"A0A0A0FF\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 495, \\\"class\\\": \\\"btn\\\", \\\"color\\\": \\\"FFFFFFFF\\\", \\\"content\\\": \\\"Verified\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"font-family\\\": \\\"MS Shell Dlg \\\\\\\\32 \\\", \\\"font-size\\\": \\\"17.6\\\", \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"left\\\": 525, \\\"line-height\\\": \\\"22\\\", \\\"margin-bottom\\\": 0, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 0, \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": 0, \\\"padding-left\\\": 9, \\\"padding-right\\\": 7, \\\"padding-top\\\": 0, \\\"proxyClass\\\": \\\"HtmlSubmitProxy\\\", \\\"proxyName\\\": \\\"button\\\", \\\"right\\\": 641, \\\"tagname\\\": \\\"button\\\", \\\"text-align\\\": \\\"center\\\", \\\"text-decoration\\\": \\\"none\\\", \\\"top\\\": 467, \\\"type\\\": \\\"button\\\", \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"155\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/body\\\\\\/div\\\\\\/table\\\\\\/tbody\\\\\\/tr[2]\\\\\\/td\\\\\\/table\\\\\\/tbody\\\\\\/tr[13]\\\\\\/td\\\\\\/button\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.button\"}}],\"timeout\":60}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_7(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Submit button whose Class is btn - vBooking-admin",
												  "A1E9C3468891E2E4EEA7E33737383461",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E9C3468891E2E4EEA7E33737383461\",\"preferredThinktime\":0,\"thinktime\":1000,\"isWeb\":false,\"description\":\"Think <i>1,000<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"23547eca-6d19-43f5-b890-7f6001e5888e\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Submit button<\\/b> whose <b>Class<\\/b> is <b>btn<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"23547eca-6d19-43f5-b890-7f6001e5888e\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"uid\":\"A1E9C3468891E2E4EEA7E33737383461\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"class\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"btn\"},\"name\":\"class\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:370;left:525;bottom:398;right:641\\\", \\\"Geometry\\\": { \\\"height\\\": 28, \\\"width\\\": 116, \\\"x\\\": 525, \\\"y\\\": 370 }, \\\"Style$array$\\\": \\\"background-color:rgb(160, 160, 160);background-repeat:repeat;color:rgb(255, 255, 255);font-family:MS Shell Dlg \\\\\\\\32 ;font-size:17.6px;font-style:normal;font-weight:400;line-height:22px;margin-bottom:0px;margin-left:0px;margin-right:0px;margin-top:0px;opacity:1;padding-bottom:0px;padding-left:9px;padding-right:7px;padding-top:0px;text-align:center;text-decoration:none;visibility:visible;z-index:auto;\\\", \\\"background-color\\\": \\\"A0A0A0FF\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 398, \\\"class\\\": \\\"btn\\\", \\\"color\\\": \\\"FFFFFFFF\\\", \\\"content\\\": \\\"Check-in\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"font-family\\\": \\\"MS Shell Dlg \\\\\\\\32 \\\", \\\"font-size\\\": \\\"17.6\\\", \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"left\\\": 525, \\\"line-height\\\": \\\"22\\\", \\\"margin-bottom\\\": 0, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 0, \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": 0, \\\"padding-left\\\": 9, \\\"padding-right\\\": 7, \\\"padding-top\\\": 0, \\\"proxyClass\\\": \\\"HtmlSubmitProxy\\\", \\\"proxyName\\\": \\\"inputsubmit\\\", \\\"right\\\": 641, \\\"tagname\\\": \\\"input\\\", \\\"text-align\\\": \\\"center\\\", \\\"text-decoration\\\": \\\"none\\\", \\\"top\\\": 370, \\\"type\\\": \\\"submit\\\", \\\"value\\\": \\\"Check-in\\\", \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"261\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/body\\\\\\/div\\\\\\/table\\\\\\/tbody\\\\\\/tr[2]\\\\\\/td\\\\\\/table\\\\\\/tbody\\\\\\/tr[15]\\\\\\/td\\\\\\/input\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.inputsubmit\"}}],\"timeout\":60}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_8(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Hyperlink whose Content is Back to passenger list - vBooking-admin",
												  "A1E9C400D6C29037E318B63337303735",
												  "{\"variables\":[{\"id\":\"16\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"key\":\"Comment\"}],\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E9C400D6C29037E318B63337303735\",\"preferredThinktime\":0,\"thinktime\":1000,\"isWeb\":false,\"description\":\"Think <i>1,000<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"23547eca-6d19-43f5-b890-7f6001e5888e\",\"timeout\":0},{\"revealPref\":\"true\",\"variableKey\":\"Comment\",\"description\":\"Variable 'Comment' is set from property 'Content' of <b>Table cell<\\/b> whose <b>Position<\\/b> is <b>2 : 8<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"23547eca-6d19-43f5-b890-7f6001e5888e\",\"type\":\"TString\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"uid\":\"A1E9C401251A1AF4E318B63337303735\",\"isWeb\":true,\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSetVarStep\",\"propertyId\":\"content\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"position\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"2 : 8\"},\"name\":\"position\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.td\"}},{\"revealPref\":\"true\",\"description\":\"Verify (with retry) that <b>Content<\\/b> equals <b>Checkin process complete.<\\/b> on <b>Heading H2<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"23547eca-6d19-43f5-b890-7f6001e5888e\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"vpExpression\":{\"parameter\":{\"name\":\"content\",\"id\":\"9\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Checkin process complete.\"},\"name\":\"content\",\"id\":\"8\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"translatedName\":\"Content\",\"operator\":\"TEquals\"},\"uid\":\"A1E9C400E9DAB760E318B63337303735\",\"isWeb\":true,\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"retry\":true,\"object\":{\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.h2\"}},{\"revealPref\":\"true\",\"description\":\"Click on <b>Hyperlink<\\/b> whose <b>Content<\\/b> is <b>Back to passenger list<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"23547eca-6d19-43f5-b890-7f6001e5888e\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"uid\":\"A1E9C400D6C29037E318B63337303735\",\"isWeb\":true,\"action\":{\"id\":\"11\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"12\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"10\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"15\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Back to passenger list\"},\"name\":\"content\",\"id\":\"14\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"13\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.a\"}}],\"timeout\":60}",
												  null,
												  null,
												  "<default>");

		IDataHarvester harvestContainer_1 = new DataHarvester();
		stepBatch.addDataHarvester(harvestContainer_1);
	harvestContainer_1.addHarvestInstruction("Comment", dcVars[0], ".*", 1, 0, false, "Comment", null, true);

		return stepBatch;
	}


private AssignVariableAction dataVarAssign_1(final IContainer parent) {
	AssignVariableAction varAction = new AssignVariableAction(parent, "A1E9C401251A1AF4E318B63337303735");

	varAction.add(vars[6] , dcVars[0]);

	return varAction;
}
	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_9(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Hyperlink whose Content is Main menu - vBooking-admin",
												  "A1E9C34688A6CA74EEA7E33737383461",
												  "{\"variables\":[{\"id\":\"16\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"\\/\\/td\\/a[text()='A00012']\\/..\\/following-sibling::td[5]\",\"key\":\"MOEB_FIELD\\/IDB:A1E9C403EDF31E70E318B63337303735\"},{\"id\":\"17\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"OK : UPGD#9425\",\"key\":\"MOEB_FIELD\\/TEX:A1E9C403EDF31E7DE318B63337303735\\/TPM:A1E9C403EDF31E81E318B63337303735\"}],\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E9C34688A6CA74EEA7E33737383461\",\"preferredThinktime\":0,\"thinktime\":1000,\"isWeb\":false,\"description\":\"Think <i>1,000<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"23547eca-6d19-43f5-b890-7f6001e5888e\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Verify (with retry) that <b>Content<\\/b> equals <b><subst key=\\\"MOEB_FIELD\\/TEX:A1E9C403EDF31E7DE318B63337303735\\/TPM:A1E9C403EDF31E81E318B63337303735\\\">OK : UPGD#9425<\\/subst><\\/b> on <b>Table cell<\\/b> whose <b>Xpath<\\/b> is <b><subst key=\\\"MOEB_FIELD\\/IDB:A1E9C403EDF31E70E318B63337303735\\\">\\/\\/td\\/a[text()='A00012']\\/..\\/following-sibling::td[5]<\\/subst><\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"23547eca-6d19-43f5-b890-7f6001e5888e\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"vpExpression\":{\"parameter\":{\"$ref\":\"4\"},\"name\":\"content\",\"id\":\"9\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"translatedName\":\"Content\",\"operator\":\"TEquals\"},\"uid\":\"A1E9C403EDF31E77E318B63337303735\",\"substitutionParameters\":[{\"name\":\"xpathProp\",\"variableKey\":\"MOEB_FIELD\\/IDB:A1E9C403EDF31E70E318B63337303735\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"\\/\\/td\\/a[text()='A00012']\\/..\\/following-sibling::td[5]\"},{\"name\":\"content\",\"variableKey\":\"MOEB_FIELD\\/TEX:A1E9C403EDF31E7DE318B63337303735\\/TPM:A1E9C403EDF31E81E318B63337303735\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"OK : UPGD#9425\"}],\"isWeb\":true,\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"retry\":true,\"object\":{\"identifier\":{\"parameter\":{\"$ref\":\"3\"},\"name\":\"xpathProp\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"secondaryLocator\":{\"parameter\":{\"name\":\"index\",\"id\":\"8\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TInteger\",\"value\":\"5\"},\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LPosition\"},\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.td\"}},{\"revealPref\":\"true\",\"description\":\"Click on <b>Hyperlink<\\/b> whose <b>Content<\\/b> is <b>Main menu<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"23547eca-6d19-43f5-b890-7f6001e5888e\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"uid\":\"A1E9C34688A6CA74EEA7E33737383461\",\"isWeb\":true,\"action\":{\"id\":\"11\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"12\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"10\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"15\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Main menu\"},\"name\":\"content\",\"id\":\"14\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:508;left:487;bottom:531;right:579\\\", \\\"Geometry\\\": { \\\"height\\\": 23, \\\"width\\\": 92, \\\"x\\\": 487, \\\"y\\\": 508 }, \\\"Style$array$\\\": \\\"background-color:rgba(0, 0, 0, 0);background-repeat:repeat;color:rgb(0, 0, 255);font-family:\\\\\\\"Open Sans\\\\\\\", Tahoma;font-size:19.0667px;font-style:normal;font-weight:400;line-height:23px;margin-bottom:0px;margin-left:0px;margin-right:0px;margin-top:0px;opacity:1;padding-bottom:0px;padding-left:0px;padding-right:0px;padding-top:0px;text-align:start;text-decoration:underline;visibility:visible;z-index:auto;\\\", \\\"background-color\\\": \\\"00000000\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 531, \\\"color\\\": \\\"0000FFFF\\\", \\\"content\\\": \\\"Main menu\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"font-family\\\": \\\"\\\\\\\"Open Sans\\\\\\\", Tahoma\\\", \\\"font-size\\\": \\\"19.0667\\\", \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"href\\\": \\\"index.jsp\\\", \\\"left\\\": 487, \\\"line-height\\\": \\\"23\\\", \\\"margin-bottom\\\": 0, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 0, \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": 0, \\\"padding-left\\\": 0, \\\"padding-right\\\": 0, \\\"padding-top\\\": 0, \\\"proxyClass\\\": \\\"HtmlAProxy\\\", \\\"proxyName\\\": \\\"a\\\", \\\"right\\\": 579, \\\"tagname\\\": \\\"a\\\", \\\"text-align\\\": \\\"start\\\", \\\"text-decoration\\\": \\\"underline\\\", \\\"top\\\": 508, \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"188\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/body\\\\\\/div\\\\\\/table\\\\\\/tbody\\\\\\/tr[2]\\\\\\/td\\\\\\/div\\\\\\/h3[3]\\\\\\/a\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"13\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.a\"}}],\"timeout\":60}",
												  null,
												  null,
												  "<default>");
		IDataSub subContainer_4 = new DataSub();
		stepBatch.addDataSub(subContainer_4);
	ISubRule sub_3 = new SubRule("MOEB_FIELD/IDB:A1E9C403EDF31E70E318B63337303735", 15, 6, false, (IDCCoreVar)vars[4], false, "A00012", null, 0, false);
	subContainer_4.addSubInstruction(sub_3);
	
	ISubRule sub_4 = new SubRule("MOEB_FIELD/TEX:A1E9C403EDF31E7DE318B63337303735/TPM:A1E9C403EDF31E81E318B63337303735", 0, 14, false, (IDCCoreVar)vars[6], false, "OK : UPGD#9425", null, 0, false);
	subContainer_4.addSubInstruction(sub_4);
	


		return stepBatch;
	}

}
