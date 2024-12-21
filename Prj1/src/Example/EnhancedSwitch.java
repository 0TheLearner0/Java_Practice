package Example;
import java.util.*;
public class EnhancedSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice between 1 and 3");
		int choice=sc.nextInt();
		 switch(choice)
		 {
		 case 1 -> System.out.println("Don't Loose your hope!");
		 case 2 -> System.out.println("Be humble to everyone.");
		 case 3 -> System.out.println("Give Empathy to Everyone who are in pain.");
			 
		 }

		 sc.close();
	}

}
