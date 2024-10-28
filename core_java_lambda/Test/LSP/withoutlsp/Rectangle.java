package withoutlsp;

public class Rectangle {
	
	protected int height;
	protected int width;
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	
	public void getArea() {
		
		System.out.println("area= "+ height * width);
	}


}
