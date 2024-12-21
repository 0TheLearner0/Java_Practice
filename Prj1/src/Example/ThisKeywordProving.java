package Example;
/*
 * Proving that this keyword refers to the current class instance variable.
 * we are printing the reference variable and this, output of both variables are the
 * same.
 */

public class ThisKeywordProving {

	void m()
	{
		System.out.println(this);//prints the same reference ID
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeywordProving obj=new ThisKeywordProving();
		System.out.println(obj);//Prints the reference ID
		obj.m();
		
	}

}
