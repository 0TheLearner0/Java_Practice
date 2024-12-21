package ScannerClassProperty;
import java.util.Scanner;
public class hasNextBigDecimal1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String str1 = "JavaTpoint.com";     
	        Scanner scanner = new Scanner(str1);   
	        System.out.println("Result: "+scanner.hasNextBigDecimal());  
	        System.out.println("String: "+scanner.next());           
	        scanner.close();  
	}

}
