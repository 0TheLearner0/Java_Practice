package Example;

public class StaticVariableExample {
	static int count=0;//Static variable
	int instanceCount=0;// regular variable
	
	StaticVariableExample(){
		count++;
		instanceCount++;
	}
	
	public static void main(String[] arg)
	{
		StaticVariableExample c1=new StaticVariableExample();
		StaticVariableExample c2=new StaticVariableExample();
		
		System.out.println("Static count: " +StaticVariableExample .count); // Output: 2 (shared across c1 and c2)
        System.out.println("Instance count for c1: " + c1.instanceCount); // Output: 1 (specific to c1)
        System.out.println("Instance count for c2: " + c2.instanceCount); // Output: 1 (specific to c2)
    
	/*
	 * Counter is representing class'StaticVariableExample'
	 * 'Counter .count' is shared, so every new 'Counter' instance modifies the same variable.
	 * 
	 * 'instanceCount' is unique to each object and thus maintains seperate values for  each instance.
	 * 
	 */
	
	
	
	
	}
	

}
