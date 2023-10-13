package code;

import java.util.Scanner;

public class Tester_stack {

	public static void main(String[] args) {

		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		while (!flag) {

			System.out.println("Enter your choice: \n 1. Fixed Stack \t \t 2. Growable Stack \n"
					+ " 3. Push Data \t \t 4. Pop Data and Display the same \n 5. Exit");

			switch (sc.nextInt())

			{
			case 1:

				break;

			case 2:

				break;

			case 3:
				System.out.println("Enter the details of the customer"
						+ " (ID , Name , Address): ");
				
				Customer cust = new Customer(sc.nextInt(), sc.next(), sc.next());
				FixedStack f = new FixedStack();
				f.push(cust);
				
				break;

			case 4:

				break;

			case 5:

				flag = true;
				System.out.println("Exiting...");
				System.exit(1);

				break;

			}

		}

	}

}
