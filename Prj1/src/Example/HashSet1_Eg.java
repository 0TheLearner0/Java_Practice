 package Example;

import java.util.HashSet;
//add() method : when element added to the list it returns the true value if not it returns the false value
//contains() method :  Used to find if any element exist in the set or not
//remove() method
public class HashSet1_Eg {
	public static void main(String hs[])
	{
		HashSet<String> hashSet=new HashSet<>();
		hashSet.add("A");
		hashSet.add("B");
		boolean r1=hashSet.add("C");
		//we are checking the boolean value 
		System.out.println("first C added then it'll be true : "+r1);
		boolean r2=hashSet.add("C");
		System.out.println("Second C added then it'll be true : "+r2);
		
		System.out.println(hashSet);
		
		// we are checking the C if it exist or not in the set by using contains(); 
		System.out.println("List contains C or Not ?");
		System.out.println("Answer is "+hashSet.contains("C"));
		
		//Removing the element A from the list
		hashSet.remove("A");
		
		System.out.print("Afterv  removing the element A list is : ");
		for(String item:hashSet)
		{
			System.out.print(item+" ");
		}
		
		
		
	}

}
