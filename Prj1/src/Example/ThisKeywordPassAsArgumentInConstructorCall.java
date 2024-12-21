package Example;

class B{
	ThisKeywordPassAsArgumentInConstructorCall obj;
	B(ThisKeywordPassAsArgumentInConstructorCall obj)
	{
		this.obj=obj;
	}
	void display()
	{
		System.out.println(obj.data);//using data member of ThisKeywordPassAsArgumentInConstructorCall class
	}
}
public class ThisKeywordPassAsArgumentInConstructorCall {

	int data=10;
	ThisKeywordPassAsArgumentInConstructorCall(){
		B b=new B(this);
		b.display();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThisKeywordPassAsArgumentInConstructorCall a=new ThisKeywordPassAsArgumentInConstructorCall();
	}

}
