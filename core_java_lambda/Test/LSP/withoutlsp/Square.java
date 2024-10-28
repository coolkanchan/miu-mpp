package withoutlsp;

public class Square  extends Rectangle {

	
    @Override
    public void setWidth(int width) {
        this.width = width;
        this.height = width;  // This ensures that width = height
    }

    @Override
    public void setHeight(int height) {
        this.width = height;  // Ensures width = height
        this.height = height;
    }
}
