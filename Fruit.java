public class Fruit
{
    private String name;
    private String color;
    private double weight;
    private boolean fresh;
    // Fruit(){};

    Fruit(String n, String c, double w, boolean f)
    {
        this.name = n;
        this.color = c;
        this.weight = w;
        this.fresh = f;
        // System.out.println(name);
    }


    public String getName()
    {
        return name;
    }

    public void taste()
    {
        System.out.println("no specific taste");
    }

}


