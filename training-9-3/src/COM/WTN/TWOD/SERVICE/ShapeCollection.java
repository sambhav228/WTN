package COM.WTN.TWOD.SERVICE;
import java.util.ArrayList;
import java.util.Collections;

import COM.WTN.TWOD.ENTITY.Shape;
public class ShapeCollection {
private ArrayList<Shape> sc;

//constructor

public ShapeCollection()
{
	this.sc=new ArrayList<Shape>();
}

//functional methods

public boolean addNewShape(Shape s){
	boolean result =false;
	if(s!=null)
	{
		sc.add(s);
		result =true;
	
	}
	else result =false;
	return result;
}
public void sortShape()
{
	Collections.sort(sc);
}
//deleting the min. area
//method todelete

public Object sortShape1() {
	// TODO Auto-generated method stub
	return null;
}

}
