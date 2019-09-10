package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import com.ibm.rational.test.lt.kernel.services.ITestExecutionServices;

/**
 * @author unknown
 */
public class ReadFromFile implements com.ibm.rational.test.lt.kernel.custom.ICustomCode2 {

	/**
	 * Instances of this will be created using the no-arg constructor.
	 */
	public ReadFromFile() {
	}

	/**
	 * For javadoc of ICustomCode2 and ITestExecutionServices interfaces, select 'Help Contents' in the
	 * Help menu and select 'Extending Rational Performance Tester functionality' -> 'Extending test execution with custom code'
	 */
	public String exec(ITestExecutionServices tes, String[] args) {
		if(args.length==0){
			System.out.println("Please specify the (Reservation / Flight) Number in argument");
			return null;
		}
		String filePath = "";
		
		if(args[0].equalsIgnoreCase("Reservation"))
			filePath = "../ReservationNumber.txt";
		
		else if(args[0].equalsIgnoreCase("Flight"))
			filePath = "../FlightNumber.txt";
		
//		String cur_dir = System.getProperty("user.dir");
		
		File file = new File(filePath);
		if(!file.exists()){
			System.out.println("File does not exist");
			return null;
		}
		String incTicket = null,temp; 
		  
		BufferedReader br ;
		 try{
			 br = new BufferedReader(new FileReader(file));
             while((temp=br.readLine())!=null){
        		 incTicket=temp;
        	 }
             br.close();
             System.out.println("value retrieved from text file is:"+incTicket); 
		} catch (IOException e) {
			System.out.println(e);
		} 
		return incTicket;
	}
}
