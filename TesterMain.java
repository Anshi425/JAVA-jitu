
public class TesterMain {
    public static void main(String[] str)
    {
        Point2D p1 = new Point2D(3, 2);
        Point2D p2 = new Point2D(7, 8);

        System.out.println("Co-ordinates at p1: " + p1.show());
        System.out.println("Co-ordinates at p2: " + p2.show());
        
        if(p1.isEqual(p2))
        System.out.println("value of x and y are equal");
        else
        System.out.println("Distance between the two points is: " + p1.calculateDistance(p2));
        // System.out.println("value of x and y are NOT equal");
        
        
        
    }    
}

