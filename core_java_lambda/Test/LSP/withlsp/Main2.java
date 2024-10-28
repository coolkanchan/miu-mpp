package withlsp;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle rc = new Rectangle();
		rc.setHeight(10);
		rc.setWidth(5);
		
		rc.getArea();
		
		
		
		Square rc1 = new Square();
		
		rc1.setSide(5);
		rc1.getArea();
		
		
		Shape shapeRectangle = new Rectangle();
		
		((Rectangle) shapeRectangle).setHeight(10);
		
		((Rectangle)shapeRectangle).setWidth(5);
		shapeRectangle.getArea();
		
		Shape shapeRSquare = new Square();
		
		((Square)shapeRSquare).setSide(5);
		
		shapeRSquare.getArea();
		
	}

}
