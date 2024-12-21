package ScannerClassProperty;

import java.util.Scanner;

public class Rough {

	public static void main(String[] args) {
	    Scanner se = new Scanner(System.in);
	    int q=se.nextInt();
	    int result = 0;

	    for(int i=0;i<q;i++){
	        int a=se.nextInt();
	        int b=se.nextInt();
	        int n=se.nextInt();
	        for(int j=0;j<n;j++){
	            a=a+(int)(Math.pow(2,j)*b);
	            result = a;
	            System.out.print(a+" ");
	        }
	        System.out.println();
	    }
	}

}
