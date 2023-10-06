
public class TesterMain {
    public static void main(String[] str)
    {
        Point2D p1 = new Point2D(3, 2);
        Point2D p2 = new Point2D(3, 2);

        System.out.println("Co-ordinates at p1: " + p1.show());
        System.out.println("Co-ordinates at p2: " + p2.show());
        
        System.out.print("Distance between these two points is: ");

        if(p1.isEqual(p2))
        System.out.println("0\nBecause value of x and y are equal");
        else
        System.out.println(p1.calculateDistance(p2));
        // System.out.println("value of x and y are NOT equal");
        
    }    
}

