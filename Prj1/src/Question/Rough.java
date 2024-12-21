package Question;

public class Rough {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char a='Z';
		char b='Z';
		int comp=Character.compare(a, b);
		if(comp==0)
		{
			System.out.println("a is equal to b");
			
		}
		else
		{
			System.out.println("a is not equal to b");
		}
		
		for(int i=0;i<5;i++)
		{
			System.out.println(a+ " "+b);
		}

	}

}
