package ScannerClassProperty;
import java.util.Scanner;
import java.util.regex.Pattern;

public class findWithinHorizon2 {
	
	public static void main(String[] ar)
	{
		 //Initialize scanner object  
        Scanner scan = new Scanner("x12 13 16 210");  
        //Declare horizon  
        int horizon = 8;  
        //Print the result  
        System.out.println("Print the string that satisifies the pattern within the horizon-");  
        System.out.println("Result: "+scan.findWithinHorizon("[0-9].*", horizon));  
        scan.close();  
	}

}
