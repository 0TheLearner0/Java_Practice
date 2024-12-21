package ScannerClassProperty;
import java.util.*;
public class nextLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Scanner scan = new Scanner(System.in);  
          System.out.print("Enter Item ID: ");  
      String itemID = scan.nextLine();  
      System.out.print("Enter Item price: ");  
      String priceStr = scan.nextLine();  
      double price = Double.valueOf(priceStr);         
      System.out.println("Price of Item "+itemID + " is $"+price);  
          scan.close();  
	}

}
/*
 * The nextLine() method of Java Scanner class is used to get the input string 
 * that was skipped of the Scanner object.
 */
