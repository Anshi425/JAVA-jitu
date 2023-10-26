package tester;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.app.core.Cricketer;

import custom_ordering.SortByRating;

import static utils.CricketerValidationRules.*;

public class TesterCricketer {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			Map<String, Cricketer> cmap = new HashMap<>();
			boolean flag = false;
			while (!flag) {

				System.out.println(
						"1. Accept minimum 5 Cricketers in the collection.\n" + "2. Modify Cricketer's rating.\n"
								+ "3. Search Cricketer by name.\n" + "4. Display all Cricketers added in collection.\n"
								+ "5. Display All Cricketers in sorted form by rating.");

				try {
					switch (sc.nextInt()) {
					case 1:

						System.out.println("Enter Name, Age, Email, Phone, Rating: ");
						Cricketer player = validateAllInputs(sc.next(), sc.nextInt(), sc.next(), sc.next(),
								sc.nextInt(), cmap);
						cmap.put(player.getEmail(), player);
						System.out.println("Successfully added cricket player !!");

						break;

					case 2:

						if (cmap.size() != 0) {
							System.out.println("Enter Email and New Rating:");
							modifyCricketerRating(sc.next(), sc.nextInt(), cmap);
						} else
							System.out.println("Empty HashMap !!");

						break;

					case 3:

						if (cmap.size() != 0) {
							System.out.println("Enter Name of the Cricketer: ");
							System.out.println(searchByName(sc.next(), cmap));
						} else
							System.out.println("Empty HashMap !!");

						break;

					case 4:

						if (cmap.size() != 0) {
							for (Cricketer elem : cmap.values()) {
								System.out.println(elem);
							}
						} else
							System.out.println("Empty HashMap !!");

						break;

					case 5:

						if (cmap.size() != 0) {

							ArrayList<Cricketer> cList = new ArrayList<>(cmap.values());
							Collections.sort(cList, new SortByRating());

							for (Cricketer c : cList) {
								System.out.println(c);
							}

						} else
							System.out.println("Empty HashMap !!");

						break;

					case 0:

						System.out.println("Exiting ...");
						flag = true;

						break;

					default:
						System.out.println("Invalid choice, please enter again.");
						break;
					}

				} catch (Exception e) {
					e.printStackTrace();
					sc.nextLine();
				}

			}

		}

	}
}