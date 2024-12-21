package Example;
class Address{
	
	String city,state,country;
	public Address(String city,String state,String country) {
		
		this.city=city;
		this.state=state;
		this.country=country;
	}
}


public class Aggregation1 {

	int id;
	String name;
	Address address;//Aggregation
	
	public Aggregation1(int id,String name,Address address)
	{
		this.id=id;
		this.name=name;
		this.address=address;
		
	}
	void display()
	{ 
		System.out.print("Emp-ID	NAME	City	State	Country\n");
		System.out.print("-----------------------------------------\n");
		System.out.println(id+" "+name);
		System.out.println(address.city+" "+address.state+" "+address.country);
		System.out.print("-----------------------------------------\n");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Address address1=new Address("Patna","Bihar","INDIA");
		Address address2=new Address("Ranchi","Jharkhand","INDIA");
		
		Aggregation1 emp=new Aggregation1(110,"Zishan",address1);
		Aggregation1 emp2=new Aggregation1(115,"Zedan",address2);
		
		emp.display();
		emp2.display();
	}

}
