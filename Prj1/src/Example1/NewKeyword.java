package Example1;
import java.util.Formattable;
/*
 * In java new keyword used to create an instance of class. In other words, it
 * instantiates a class by allocating memory for a new object and returning a 
 * reference memory.
 * 
 * New keyword also used to create the array object.
 * it allocates memory at runtime.
 * All objects occupy memory in the Heap area(Whenever an object is created ,it's always
 * stored in the Heap space.)
 * It invokes the object constructor.
 * It requires the single, postfix argument to call the constructor.
 * 
 */

public class NewKeyword {
	void eg()
	{
		String name="Zishan";
		String name1="Adil";
		String name2="King";
		
		System.out.println(name);
		System.out.println(name1);
		System.out.println(name2);
		
		System.out.println("After applying equals to ignore case:");
		System.out.println(name.equalsIgnoreCase(name1));
		
		System.out.println("After applying replace() method:");
		System.out.println(name=name.replace("Zishan", "King"));
		/*name= name.replace("Zishan","King") here we are making change into name String by using
		by using replace() method
		*/
		
		/*String updatestring = new String(name.replace("Zishan","Shubh"));
		
		System.out.println(updatestring);
		name=updatestring;
		*/
		System.out.println(name+" "+name1+" "+name2);
		
		//String updatedString=String.replace("Quadir","Zishan");
		//System.out.println(updatedString);
		
		System.out.println(name.equals(name2));
		
		System.out.println(name.contains("Zishan"));
		
	}
	
	void display()
	{
		System.out.println("Yes you are Moron!.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 NewKeyword obj= new NewKeyword();
 obj.display();
 obj.eg();
 
 
 
	}

}
