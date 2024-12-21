package Example;
class employee{
	int salary=10000;
}
class bonus extends employee{
	int bonus=500;
}
public class Inheritance extends bonus {

	public static void main(String[] args){
		// TODO Auto-generated method stub

		Inheritance obj=new Inheritance();
		System.out.println("Salary of employee is: "+obj.salary);
		System.out.println("Bonus is: "+obj.bonus);
	}

}
