package ScannerClassProperty;
import java.util.*;
public class hasNext3 {

	public static void main(String[] args) {
		
		 //Create Scanner object  
        Scanner scan = new Scanner("Program:Java;Python;Android");  
        //Initialize the String pattern  
        String pattern = "Program:.*";  
        //Check if pattern satisfies the String content  
        if(scan.hasNext(pattern)){  
          System.out.println("Pattern found");  
        }  
        else{  
          System.out.println("Pattern not found");  
        }  
        scan.close();  
	}

}
