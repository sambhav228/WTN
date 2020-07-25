package COM.WTN.TWOD.ENTITY;

public class Rectangle extends Shape
{
	//members
	private double s2;
	
	//setters
	public void setSide1(double s)
	{
		this.setSide(s);
	}
	public void setSide2(double s){
		this.s2=(s>0 && s<10)? s:-1;
	}
	
	//constructor
	
	public Rectangle(double l,double w){
		super(l);
		this.setSide2(w);
		
	}
	
	
	
public double calcArea()
{
	
	return this.getSide()*this.s2;
}
public double calcPeri()
{
	return 2*(this.getSide()+this.s2);
}
	

}
