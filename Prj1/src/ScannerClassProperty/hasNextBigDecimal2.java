package ScannerClassProperty;
import java.util.*;
public class hasNextBigDecimal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String str1 = "4564.00";        
	        Scanner scanner = new Scanner(str1);   
	        System.out.println("Result: "+scanner.hasNextBigDecimal());  
	        System.out.println("String Value: "+scanner.next());           
	        scanner.close();  
	}

}
