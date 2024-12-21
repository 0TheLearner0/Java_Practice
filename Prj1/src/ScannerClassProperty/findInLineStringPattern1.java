package ScannerClassProperty;
import java.util.Scanner;  
import java.util.regex.Pattern;     
public class findInLineStringPattern1 {
	  
	 public static void main(String args[]){   
	       Scanner scan = new Scanner(System.in);  
	       String userName;    
	       System.out.print("Enter your email address: ");  
	       userName = scan.findInLine(Pattern.compile("[a-z]+"));  
	       System.out.println("Output:"+userName);  
	       scan.close();  
	   }    
    }  


