package tester;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.app.core.Fashion;
import static utils.FashionValidationRules.*;
import static Fashion_utils.FunctionsOfFashion.*;

public class FMS {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			Map<Integer, Fashion> fMap = new HashMap<>();

			boolean flag = false;

			while (!flag) {

				System.out
						.println( "\t \t-------------MENU--------------\n1. Add new Cloth.\n" + "2. Update Stock of a Cloth.\n"
								+ "3. Set Discount for all clothes of given Category and Brand.\n"
								+ "4. Remove Clothes Which are out of Stock for Last 2 Months.\n"
								+ "5. List Out Clothes which are Out of Stock Today.\n" + "0. Exit\n"
								+ "\t \t-------------------------------\n");

				try {

					switch (sc.nextInt()) {
					case 1:
//						Category cloth, int stock, LocalDate stockUpdateDate, Size sizeValue, int price,
//						Brand brandName, String color
						System.out.println("\n Enter Category(MENS_TSHIRT, MENS_SHIRTS, WOMENS_JEANS), "
								+ "stock quantity, stock Update date, size(S,M,L,XL), price, "
								+ "brand Name(VANS, PUMA, LEE),color: \n");
						Fashion clothRef = validateAllInputs(sc.next(), sc.nextInt(), sc.next(), sc.next(),
								sc.nextInt(), sc.next(), sc.next());
						fMap.put(clothRef.getClothId(), clothRef);
						System.out.println("\n Successfully added Cloth !! \n");

						break;

					case 2:

						System.out.println("\n Enter StockId and new Stock Quantity:");
						updateStock(sc.nextInt(), sc.nextInt(), fMap);

						break;

					case 3:
						if (fMap.size() != 0) {
							System.out.println("\n Enter category, brand and discount-value in: \n");
							setDiscount(sc.next(), sc.next(), sc.nextInt(), fMap);
							System.out.println("\n discount successfully Set for given category and brand Clothes !! \n");
						} else
							System.out.println("empty map !!");

						break;

					case 4:

						if (fMap.size() != 0) {
							removeClothes(fMap);
							System.out.println("\n successfully removed Clothes !! \n");
						} else
							System.out.println("empty map !!");

						break;

					case 5:

						if (fMap.size() != 0) {
							System.out.println("\n Details of All Out Of Stock Clothes Today: \n");
							listOutClothOutOfStockToday(fMap);
						} else
							System.out.println("\n empty map !! \n");

						break;

					case 0:
						System.out.println("Exiting ...");
						flag = true;

						break;

					default:
						System.out.println("Invalid choice, Enter again.");
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
