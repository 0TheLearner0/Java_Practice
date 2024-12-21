//                          Hash Map Class
//HashMap is a part of  Java's collection since Java 1.2. This class is found in java.util
//package.It provides the basic implementation of the Map interface of Java.
//It Stores the data in(Key, Value) pairs, and we can access them by an index of another
//type(e.g. an Integer). One object is used as a key (index) to another object (value).
//If we try to insert duplicate key , it will replace the element of the corresponding key.
package Collection;
import java.util.*;
import java.util.Collections;
import java.io.*;
public class Hashmap {
 public static void main(String f[])throws IOException
 {
	 int i,n,ch,r;
	 long mob;
	 String str,na;
	 Boolean st=false;
	 Scanner sc=new Scanner(System.in);
	 HashMap<String,Integer> hm=new HashMap <String,Integer>(0);
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 do
	 {
		 System.out.println("Menu");
		 System.out.println("*_*_*-*_*_*");
		 System.out.println("1-ADD");
		 System.out.println("2-Key");
		 System.out.println("3-Exit");
		 System.out.println("4-Search");
		 System.out.println("5-Key Value");
		 System.out.println("6-Remove");
		 System.out.println("Enter Your Choice");
		 ch=sc.nextInt();
		 switch(ch)
		 {
		 case 1:
			 System.out.println("Enter term");
			 n=sc.nextInt();
			 for(i=0;i<n;i++)
			 {
				 System.out.println("Enter Name");
				 na=br.readLine();
				 na=na.toUpperCase();
				 System.out.println("Enter Roll");
				 str=br.readLine();
				 r=Integer.parseInt(str);
				 hm.put(na,r);
			 }
			 break;
		 case 2:
			 if(hm.isEmpty())
			 {
				 System.out.println("There is no Element in HashMap");
			 }
			 Set <String> set=new HashSet<String> (0);
			 set=hm.keySet();
			 System.out.println("Display String");
			 System.out.println(set);
			 break;
		 case 3:
			 System.exit(0);
			 default:
				 System.out.println("Invalid choice");
		 case 4:
			 try
			 {
				 System.out.println("Enter Name");
				 na=br.readLine();
				 na=na.trim();
				 r=hm.get(na);
				 System.out.println("Your Roll ="+r);
			 }
			 catch(NullPointerException e)
			 {
				 System.out.println("Name not Found");
			 }
			 break;
		 case 5:
			 Collection col=hm.values();
			 System.out.println(col);
			 break;
		 case 6:
			 st=false;
			 System.out.println("Enter Name for Remove");
			 str=br.readLine();
			 str=str.toUpperCase();
			 System.out.println("After Element Deleted"+hm.remove(str));
			break;	 
		 }
	 }
	 while(2>1);
 }
}
