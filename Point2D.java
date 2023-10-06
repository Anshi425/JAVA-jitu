public class Point2D {
    private int x;
    private int y;

    public Point2D(int x, int y)
    {
        this.x=x;
        this.y=y;
    }
    
    public String show()
    {
        return "x : "+x+" and y: "+y;
    }
    
    public boolean isEqual(Point2D p)
    {
    	if(this.x == p.x && this.y == p.y)
    	   	return true;
    	else
    		return false;
    }

    public double calculateDistance(Point2D p)
    {
        double DIST;
        double xSquare;
        double ySquare;
        xSquare = Math.pow((this.x-p.x), 2);
        ySquare = Math.pow((this.y-p.y), 2);
        DIST = Math.sqrt(xSquare+ySquare);
        // DIST = Math.sqrt((Math.pow((this.x - p.x),2))+(Math.pow((this.x - p.x),2)));

        return DIST;
    }

}
