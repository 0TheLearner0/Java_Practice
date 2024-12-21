package ScannerClassProperty;
import java.util.*;
public class hasNextBigDecimal3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String s = "Hello JavaTpoint! 13 + 13.0 = 26";  
         Scanner scanner = new Scanner(s);  
         while (scanner.hasNext()) {             
            //Check if the scanner's next token is a BigDecimal  
            System.out.println("" + scanner.hasNextBigDecimal());  
            System.out.println("" + scanner.next());  
         }  
         scanner.close();  
	}

}
