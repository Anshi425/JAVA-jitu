package Q2;

public class Test3 {

	public static void main(String[] args) {

		String s1 = "abc", s2 = "abcd";

		int m = s1.length(), n = s2.length();
		if (Math.abs(m - n) > 1) {
			System.out.println("Not one away.");
			System.exit(0);
		}

		int count = 0;

		int i = 0, j = 0;
		while (i < m && j < n) {

			if (s1.charAt(i) != s2.charAt(j)) {
				if (count == 1)
					System.out.println("Not one away.");
				System.exit(0);

				if (m > n)
					i++;

				else if (m < n)
					j++;

				else {
					i++;
					j++;
				}

				count++;
			}

			else {
				i++;
				j++;
			}
		}

		if (i < m || j < n)
			count++;

		if (count == 1)
			System.out.println("Is a one away.");
		else
			System.out.println("Same string");
	}
}
