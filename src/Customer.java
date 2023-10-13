package code;

public class Customer {

	public int id;
	public String name;
	public String address;

	private Customer()
	{
		System.out.println("in customer constructor !!");
	}
	
	public Customer(int id, String name ,String address) {
		
		this.id = id;
		this.name = name;
		this.address = address;
		
	}
	
	public void getId()
	{
		System.out.println("id is : " + id);
	}
	
	public void getName()
	{
		System.out.println("id is : " + name);
	}

	public void getAddress()
	{
		System.out.println("id is : " + address);
	}

//	FixedStack f;
//	FixedStack.push(cust);
	
	
//	Customer cust_para_less = new Customer();
	
//	public void print_ToString()
//	{
//		System.out.println(cust_para_less);;
//	}
	
}
