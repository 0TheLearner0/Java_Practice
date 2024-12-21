/*
 * Printing the Tokenizer String
 * 
 */

package ScannerClassProperty;
import java.util.*;
public class TokenizerString {
	 public static void main(String args[]){   
         //Create Scanner object  
   Scanner scan = new Scanner("Hello World!");  
   //Printing the delimiter used  
   System.out.println("Delimiter:"+scan.delimiter());  
   //Printing the tokenized Strings  
   while(scan.hasNext()){  
       System.out.println(scan.next());  
   }  
   //Closing the scanner  
   scan.close();       
 }    

}
