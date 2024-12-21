 package MenuDriven;
import java.util.Scanner;
public class Example1 {
 public static void main(String x[])
 {
	 int i,n,ch;
	 int ar[]=new int[5];
	 Scanner obj=new Scanner(System.in);
	 System.out.println("----MENU----");
	 System.out.println("1: Insert");
	 System.out.println("2: Display");
	 System.out.println("3: Search");
	 System.out.println("4: Modify");
	 System.out.println("5: Delete");
	 System.out.println("6: Sort");
	 System.out.println("7: Exit");
	 
	 lp : while(true) //Labeling the while loop
	 {
		 System.out.println(">>Make Your Choice<<");
		 ch=obj.nextInt();
		 switch(ch)
		 {
		 case 1:
			  System.out.println("Enter Term");
			  n=obj.nextInt();
			  for(i=0;i<n;i++)
			  {
				  System.out.println("Enter Num");
				  ar[i]=obj.nextInt(); 
			  }
			  break;
		 
		 
		 
		 case 7:
			 System.out.println("You have exited from the MENU");
			 break lp;
			 default:
				 System.out.println("Please Choose available option");
		 }
	 }
	 
 }
}
