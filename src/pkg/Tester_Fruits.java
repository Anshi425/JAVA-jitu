//4.7 Add all of above classes under the package "com.app.fruits"
//4.8 Create java application FruitBasket , with main method , as a tester
//4.9 Prompt user for the basket size n create suitable data structure
//
//4.10 Supply options
//1. Add Mango
//2. Add Orange
//3. Add Apple
//NOTE : You will be ALWAYS adding a fresh fruit in the basket , in all of above options.
//
//4. Display names of all fruits in the basket.
//
//5. Display name,color,weight , taste of all fresh fruits , in the basket.
//
//
//6. Mark a fruit in a basket , as stale(=not fresh)
//i/p : index 
//o/p : error message (in case of invalid index) or mark it stale
//
//7. Mark all sour fruits stale 
//Hint : Use equals() method of the String class.
//
//8. Invoke fruit specific functionality (pulp / juice / jam)
//i/p : index
//Invoke correct functionality (pulp / juice / jam)
//
//9. Exit 
package pkg;
import java.util.Scanner;

public class Tester_Fruits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Mango m = new Mango("Alphonso","yellow",1.4);
//		Orange o = new Orange ("orange",0.23,"santra",false);
//		Apple a = new Apple ("Red",1.2,"kashmiri",true);
		
//		System.out.println(m.taste());
//		System.out.println(o.taste());
//		System.out.println(a.taste());
		m.pulp();
//		o.juice();
//		a.jam();
		
	
		
		sc.close();
	}

}
