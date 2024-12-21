package ScannerClassProperty;
import java.util.*;
import java.util.regex.Pattern;
public class findInLineStringPattern {

	public static void main(String args[]){   
        String str = "Hello World! Hello India! ";  
        //Create a new scanner Object  
        Scanner scanner = new Scanner(str);  
        //Find a pattern of any letter plus "ello"  
        System.out.println("Output: "+scanner.findInLine(Pattern.compile(".ello")));  
        //Print the next line of the string  
        System.out.println("Left String: " + scanner.nextLine());  
        //Close the scanner  
        scanner.close();  
    }    
}
