package ScannerClassProperty;
import java.util.Scanner;
import java.util.regex.Pattern;
public class findWithinHorizon3 {
	
	public static void main(String[] ar)
	{
		Scanner scan = new Scanner(System.in);  
	       String userName;    
	       System.out.print("Enter your email address: ");  
	       userName = scan.findWithinHorizon(Pattern.compile("[a-z]+"), 16);  
	       System.out.println("Output:"+userName);  
	       scan.close();  
	}

}
