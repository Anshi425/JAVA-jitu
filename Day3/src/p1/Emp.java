package p1;
public class Emp
{
	private int id;
	private String name;
	private double sal;
	public Emp(int i,String s,double sa)
	{
		id=i;
		name=s;
		sal=sa;
	}
	public void setSal(double sal)
	{
		this.sal=sal;
	}
	public double getSal()
	{
		return sal;
	}
}
