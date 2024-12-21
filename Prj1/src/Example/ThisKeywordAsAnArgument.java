package Example;

public class ThisKeywordAsAnArgument {

	void m(ThisKeywordAsAnArgument obj) {
		System.out.println("Method is invoked");
	}
	void p()
	{
		m(this);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThisKeywordAsAnArgument s1=new ThisKeywordAsAnArgument();
		s1.p();
	}

}
