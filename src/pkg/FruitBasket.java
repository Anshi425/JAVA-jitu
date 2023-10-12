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

public class FruitBasket {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of basket : ");
		int size = sc.nextInt();
		Fruits[] arr = new Fruits[size];

		boolean flag = false;
		int index = 0;
		while (!flag) {
			System.out.println(
					"Enter the choice \n 1. Add Mango \t \t \t \t \t \t"
					+ "2. Add Orange \n"
					+ "3. Add Apple \t \t \t \t \t \t"
					+ "4. Display name of all fruits \n"
					+ "5. Display name, color, weight of all fresh fruits \t"
					+ "6. Mark a fruit as stale with given index from user \n"
					+ "7. Mark all sour fruits as stale \t \t \t"
					+ "8. Characteristic of fruit"
					+ "9. Exit");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				if (index < size) {
					System.out.println("Enter name, color, weight: ");
					arr[index] = new Mango(sc.next(), sc.next(), sc.nextDouble());
					index++;
				} else
					System.out.println("basket is full !!!");

				break;

			case 2:
				if (index < size) {
					System.out.println("Enter name, color, weight: ");
					arr[index] = new Orange(sc.next(), sc.next(), sc.nextDouble());
					index++;
				} else
					System.out.println("basket is full !!!");

				break;

			case 3:
				if (index < size) {
					System.out.println("Enter name, color, weight: ");
					arr[index] = new Apple(sc.next(), sc.next(), sc.nextDouble());
					index++;
				} else
					System.out.println("basket is full !!!");

				break;

			case 4:

				for (Fruits a : arr) {
					System.out.println(a.getName() + " ");
				}

				break;

			case 5:
				for (Fruits b : arr) {
					if (b.getFresh()) {
						System.out.println(b.toString());
					}
				}
				break;

			case 6:

				System.out.println("enter index to make change: ");
				int ind = (sc.nextInt() - 1);
				if (ind > index) {
					System.out.println("fruit doesnt exist in given index !!!");
					break;
				}
				System.out.println("state of given fruit before is: " + (arr[ind].getFresh() ? "fresh" : "stale"));
				arr[ind].changeFresh();
				System.out.println("state of given fruit after is: " + (arr[ind].getFresh() ? "fresh" : "stale"));
				break;

			case 7:

				for (Fruits c : arr) {
					if (c.taste().equals("sour")) {
						System.out.println("state of given fruit before is: " + (c.getFresh() ? "fresh" : "stale"));
						c.changeFresh();
						System.out.println("state of given fruit after is: " + (c.getFresh() ? "fresh" : "stale"));
					}

				}
				break;
			case 8:
				
				for(Fruits d:arr) {
					if(d instanceof Mango)
					{
						((Mango) d).pulp();
					}
					if(d instanceof Apple)
					{
						((Apple) d).jam();
						
					}
					if(d instanceof Orange)
					{
						((Orange) d).juice();
					}
				}
				break;

			case 9:

				flag = true;
				System.out.println("Exit ");
				break;

			default:
				System.out.println("invalid choice");
				break;
			}
		}

		sc.close();

	}

}
