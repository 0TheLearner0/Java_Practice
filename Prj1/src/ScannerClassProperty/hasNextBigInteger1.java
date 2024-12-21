package ScannerClassProperty;
import java.util.*;

public class hasNextBigInteger1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //Initialize the scanner  
        Scanner scan = new Scanner(" 22 Double 75 number is 2123324.58");  
        //Iterate through the tokens  
        while(scan.hasNext()){  
            //Print Integer value  
            if(scan.hasNextBigInteger()){  
                System.out.println("Found Integer Value: "+scan.next());  
            }  
            else{  
                System.out.println("Not Found Integer Value: "+scan.next());  
            }  
        }  
        scan.close();  

	}

 }


