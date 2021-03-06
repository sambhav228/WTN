package COM.WTN.TWOD.ENTITY;

public abstract class Shape implements Comparable<Shape>{
	//members
	private double s;

	//setter or mutators
	protected boolean setSide(double s) {
		boolean result=false;
		if(s>0 && s<=10)
		{
			this.s=s;
			result=true;
		}
		if(s<=0 || s>10){
			result=false;
		}
		return result;
	}

	//getter or accessor
	protected double getSide(){
		return this.s;
	}
	
	//constructor
	private Shape()
	{
		this.s=-1;
	}
	protected Shape(double s)
	{
		this();
		this.setSide(s);
	}
	
	//functional methods
	public abstract double calcArea();
	public abstract double calcPeri();
	
	public final String toString(){
		return String.format("Area = %.2f%nPerimeter = %.2f%n",this.calcArea(),this.calcPeri());
	
	}
	
	public int compareTo(Shape s){
		int result=0;
		if(this.calcArea() <s.calcArea()) result = -1;
		
		if(this.calcArea() == s.calcArea()) result = 0;
		
		if(this.calcArea() >s.calcArea()) result = 1;
		return result;
	}
	}
