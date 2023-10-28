package Q2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			System.out.println("Enter the number of elements you want: ");
			int size = sc.nextInt();
			ArrayList<Integer> aList = new ArrayList<Integer>(size);

			for (int x = 1; x <= size; x++) {

				System.out.println("Enter the element no " + x + ": ");
				aList.add(sc.nextInt());
			}

			Map<Integer, Integer> map = new HashMap<>();

			for (Integer i : aList) {

				if (!map.containsKey(i))
					map.put(i, 1);

				else
					map.put(i, map.get(i) + 1);
			}

			int maxValueInMap = (Collections.max(map.values()));

			for (Map.Entry<Integer, Integer> in : map.entrySet()) {

				if (in.getValue() == maxValueInMap)
					System.out.println("Most occuring element in the array is: " + in.getKey());

			}

		} catch (Exception e) {
			System.out.println("Empty array.");
		}
	}

}
