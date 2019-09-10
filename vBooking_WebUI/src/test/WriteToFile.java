package test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.ibm.rational.test.lt.kernel.services.ITestExecutionServices;

/**
 * @author unknown
 */
public class WriteToFile implements com.ibm.rational.test.lt.kernel.custom.ICustomCode2 {

	/**
	 * Instances of this will be created using the no-arg constructor.
	 */
	public WriteToFile() {
	}

	/**
	 * For javadoc of ICustomCode2 and ITestExecutionServices interfaces, select 'Help Contents' in the
	 * Help menu and select 'Extending Rational Performance Tester functionality' -> 'Extending test execution with custom code'
	 */
	public String exec(ITestExecutionServices tes, String[] args) {
		
		if(args[0].isEmpty()){
			System.out.println("String value to write is empty");
			return null;
		}
		
		if(args[1].isEmpty()){
			System.out.println("Please specify the type of info(Reservation / Flight) Number in argument");
			return null;
		}
		
		String dirPath = "../"; //ends with \\
		String filePath = "";
		if(args[1].equalsIgnoreCase("Reservation"))
			filePath = dirPath +"ReservationNumber.txt"; 
		else if(args[1].equalsIgnoreCase("Flight"))
			filePath = dirPath +"FlightNumber.txt"; 
		
		File dirFile = new File(dirPath);
		if(!dirFile.exists()){
			if(dirFile.mkdirs())
				System.out.println("Directory created");
			else
				System.out.println("Directory not created");
		}else 
			System.out.println("Directory exists");
		
		File inputFile = new File(filePath);

		try {
			if(!inputFile.exists()){
				if (inputFile.createNewFile())
				    System.out.println("File created");
				else
				    System.out.println("File not created");
			}else
				System.out.println("File exists");
			
			if(inputFile.exists()){
				String incTicketNum = args[0];
	            BufferedWriter output;
            	output= new BufferedWriter(new FileWriter(inputFile));
                output.write(incTicketNum);
            	output.close();
        	}else{
				System.out.println("File does not exist");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "Done";
	}

}
