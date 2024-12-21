package ScannerClassProperty;
import java.util.*;
public class match1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String str = "Hello World! 123 JTP ";  
	       //Create a new scanner with the specified String Object  
	       Scanner scanner = new Scanner(str);  
	       //Check if next token is "Hello"  
	       System.out.println("Scan String True/False: "+scanner.hasNext("Hello"));  
	       //Find and Print the last match  
	       System.out.println("Last Match String: "+scanner.match());  
	       //Print the line  
	       System.out.println("" +scanner.nextLine());  
	       scanner.close();  
	}

}
