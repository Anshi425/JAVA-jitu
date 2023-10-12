package pkg;

//4.1 Can you arrange Fruit,Apple,Orange,Mango in inheritance hierarchy ?
//Use tight encapsulation.
//
//4.2 Properties (instance variables)  : color : String , weight : double , name:String, fresh : boolean
//
//4.3 Add suitable constructor
//
//4.4 Override  toString correctly to return state of all fruits (return only  : name ,color , weight )
//
//4.5 Add a taste() method : public String taste()
//
//For Fruit : Can you identify taste of any general fruit ? NO
//So add a taste() with this definition : returns "no specific taste" 
//
//Apple : should return  "sweet n sour"
//Mango : should return  "sweet"
//Orange : should return  "sour"
public class Fruits {
	private String colour;
	private double weight;
	private String name;
	private boolean fresh;

	public Fruits(String n, String c, double w, boolean f) {

//		System.out.println("in fruits constructor");

		colour = c;
		weight = w;
		name = n;
		fresh = f;
	}

	public String taste() {
		return "no specific taste";
	}

	public String toString() {
		return "Name : " + name + "|| Color : " + colour + "|| weight : " + weight;
	}

	public String getName() {
		return name;
	}

	public String getColor() {
		return colour;
	}

	public double getWeight() {
		return weight;
	}

	public boolean getFresh() {
		return fresh;
	}
	public void changeFresh()
	{
		fresh = false;
	}
	
}

class Mango extends Fruits {
	public Mango(String name, String colour, double weight) {
		super(name, colour, weight, true);

//		System.out.println("in Mango constructor");
	}

	public String taste() {
		return "Sweet";
	}
//	public String toString() {
//		return super.toString();
//	}

	public void pulp() {
		System.out.println(super.getName() + " " + super.getColor() + " " + " creating pulp");
	}
}

class Apple extends Fruits {

	public Apple(String name, String colour, double weight) {
		super(name, colour, weight, true);
//		System.out.println("in Apple constructor");
	}

	public String taste() {
		return "Sweet n sour";
	}

	public String toString() {
		return super.toString();
	}

	public void jam() {
		System.out.println(super.getName() + " " + " creating jam");
	}

}

class Orange extends Fruits {
	public Orange(String name, String colour, double weight) {
		super(name, colour, weight, true);
//		System.out.println("in Orange constructor");
	}

	public String taste() {
		return "sour";
	}


	public String toString() {
		return super.toString();
	}

	public void juice() {
		System.out.println(super.getName() + " " + super.getWeight() + " " + " creating juice");
	}

}
