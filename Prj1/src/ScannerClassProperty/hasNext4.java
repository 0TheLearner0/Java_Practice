package ScannerClassProperty;
import java.util.*;
public class hasNext4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "JavaTpoint.com 15 + 15 = 18.0";  
        Scanner scanner = new Scanner(str);  
        //Checking scanner's next token matches "c"  
        System.out.println("Result: "+scanner.hasNext("JavaTpoint.com"));  
        //Checking scanner's next token matches "="  
        System.out.println("Result: "+scanner.hasNext("T"));  
        //Print the rest of the string  
        System.out.println("Rest of String: "+scanner.nextLine());  
        scanner.close();  
	}
 
}
