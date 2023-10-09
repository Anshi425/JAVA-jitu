package arrays;

import java.util.Scanner;

import com.cdac.core.Box;

public class TestBoxArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of boxes to make");
		Box[] boxes=new Box[sc.nextInt()];
		System.out.println("Name of Box[] class "+boxes.getClass());
		System.out.println("Init def array contents");
		for(Box b : boxes)
			System.out.println(b);//null : def value of ref type var=null
		for(int i=0;i<boxes.length;i++)
		{
			System.out.println("Enter Box dims : w d h");
			boxes[i]=new Box(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
		}
		System.out.println("array contents again ");
		for(Box b : boxes) {
			System.out.println(b);//not null(hashCode)
			//display dims n vol
			System.out.println(b.getBoxDetails());
			System.out.println("Volume "+b.getBoxVolume());	
		}
		System.out.println("\n\n");
		for(Box b : boxes) {
			if(b.getBoxVolume() > 100)
			{
				System.out.println("before update: " + b.getBoxDetails());
				b.doubleWidth();
				System.out.println("after update: " + b.getBoxDetails());
			}
			
//			System.out.println(b);
			
		}
		sc.close();

	}

}
