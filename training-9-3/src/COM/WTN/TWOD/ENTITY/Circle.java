package COM.WTN.TWOD.ENTITY;

public class Circle extends Shape{
	
	public Circle(double r)
	{
		super(r);
	}
	
	public double calcArea()
	{
		return Math.PI*Math.pow(this.getSide(),2);
	}

	@Override
	public double calcPeri() {
		// TODO Auto-generated method stub
		return 0;
	}
}
