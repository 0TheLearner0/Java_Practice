/*
Let's see a simple example of Java Scanner where we are getting a single input from the user. 
Here, we are asking for a string through in.nextLine() method.
*/
package ScannerClassProperty;
import java.util.Scanner;

public class SingleInput {

	public static void main(String args[]){  
        Scanner obj = new Scanner(System.in);  
        System.out.print("Enter your name: ");  
        String name = obj.nextLine();  
        System.out.println("Name is: " + name);             
        obj.close();             
        }  
}
