
// import java.lang.*;
import java.util.Scanner;

class Point2D {
	private int x;
	private int y;

	Point2D(int a, int b) {
		this.x = a;
		this.y = b;
	}

	void displayPoint() {
		System.out.println("X co-ordinate : " + x + ". Y co-ordinate : " + y);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number of points :");

		Point2D[] arr;
		arr = new Point2D[sc.nextInt()];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter values of x and y co-ordinate");
			arr[i] = new Point2D(sc.nextInt(), sc.nextInt());

		}
		for (Point2D b : arr) {
			b.displayPoint();
		}

		sc.close();
	}

}
