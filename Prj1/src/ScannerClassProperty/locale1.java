package ScannerClassProperty;
import java.util.*;
public class locale1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String str = "Hello JavaTpoint! 12 + 13.0 = 25 ";  
	        //Create a new scanner with the specified String Object  
	        Scanner scan = new Scanner(str);  
	        //Print the scan line  
	        System.out.println("Scan string: "+scan.nextLine());  
	        //Print the current locale  
	        System.out.println("Current Locale: "+scan.locale());        
	        scan.close();  
	}

}
/*
 * 
*/