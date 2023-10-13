package code;

public class FixedStack implements Stack {

	Customer[] fs = new Customer[STACK_SIZE];
	int i=0;
	
	public FixedStack() {
		
	}
	
	public void push(Customer c)
	{
//		fs[0].getName();
		fs[i++] = c;
		System.out.println("in Fixed stack push method !!");
		fs[0].getName();
	}
	
	public void pop(Customer c)
	{
	}
}
