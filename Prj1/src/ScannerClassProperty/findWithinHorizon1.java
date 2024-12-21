package ScannerClassProperty;
import java.util.Scanner;
import java.util.regex.Pattern;

public class findWithinHorizon1 {

	public static void main(String[] args) {
		
		String str = "Hello JavaTpoint! --> 1111, 2222, 3333";  
	       Pattern pattern = Pattern.compile("[0-9]+");  
	       Scanner scanner = new Scanner(str);  
	       while (scanner.hasNext()) {  
	             System.out.println("Output = " + scanner.findWithinHorizon(pattern, 26));  
	       }  
	
	       scanner.close();  
	}
	
	}
