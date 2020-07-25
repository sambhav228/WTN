package COM.WTN.TWOD.MAIN;
import COM.WTN.TWOD.SERVICE.ShapeCollection;
import COM.WTN.TWOD.ENTITY.Shape;
import java.util.Scanner;
public class MainClass {
	private static Scanner sc=new Scanner(System.in);
	private static ShapeCollection s=new ShapeCollection();
	public static void main(String args[])
	{
		boolean repeat=true;
		while(repeat){
		
		int m = displayMenu();
		
		switch(m)
		{
		
		case 1:
			Shape sh=createnewshape();
			s.addNewShape(sh);break;
		case 6:
			displayAll();break;
			default :repeat=false;
		}
	}
	}
	private static int displayMenu(){
		System.out.println("1.create a new shape");
		System.out.println("2.sort all shape object");
		System.out.println("3.delete the shape(s) with least area");
		System.out.println("4. delete all shapes");
		System.out.println("5. draw a frame whose circumfrence is same as the square");
		System.out.println("6.Display all Shapes areas and perimeter");
		System.out.println("Choose any other number to exit");
		return sc.nextInt();
		
		
	}
	private static Shape createnewshape(){
		System.out.println("Which shape you wish to create ?");
		System.out.println("1.Rectangle ");
		System.out.println("2.Circle");
		int shapeType =sc.nextInt();
		Shape s = null;
		if(shapeType==1){
			System.out.println("Enter Length and Width");
			double l=sc.nextDouble();
			double w=sc.nextDouble();
			s= new Rectangle(l,w);
		}
		return s;
		
	}
	
private static void displayAll()
{
	for(Shape sh:s.getCollection()){
		
	}
}
	
	

}
