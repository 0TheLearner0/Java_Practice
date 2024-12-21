package Example1;
import java.util.Scanner;


public class scanner {
	public static void main(String[] ar)
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("What is your name?");
		String name=obj.nextLine();
		System.out.printf("Hello %s I hope you are fine. How old are you? ",name);
	    int age=obj.nextInt();
	    
	    obj.nextLine();
	    
	    System.out.printf("%d years of age is good for being a better student everyday. ",age);
		System.out.println("What you do in your free time?");
		//System.out.println("");
		String hobby=obj.nextLine();
		System.out.printf("I %s in my free time.",hobby);		
		obj.close();
	}

}
