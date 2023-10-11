public class Mango extends Fruit 
{
    public 
    Mango(double weight){

        super("Mango", "yellow", weight, true);
    }

    public void pulp()
    {
        System.out.println("extracting juice");
        System.out.println(super.getName());
    }

    @Override
    public void taste()
    {
        System.out.println("sweet taste");
    }

}
