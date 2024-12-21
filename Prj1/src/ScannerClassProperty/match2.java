package ScannerClassProperty;
import java.util.*;
public class match2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 //Initialize Scanner object  
        Scanner scan = new Scanner("D A 4 1 3");              
        scan.useRadix(16);  
        //Print the radix the Scanner object is using  
        System.out.println("Radix:"+scan.radix());  
        //Printing the tokenized Strings  
        while(scan.hasNextInt()){  
            scan.nextInt();  
            //Printing the index where the string object has been found  
            System.out.println("Pattern match at index:"+scan.match().start());  
        }  
        scan.close();  
	}

}
/*
 * Radix:16
 * Pattern match at index:0
 * Pattern match at index:2
 * Pattern match at index:4
 * Pattern match at index:6
 * Pattern match at index:8
*/