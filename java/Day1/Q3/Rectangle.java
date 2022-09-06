package secondques;

public class Rectangle extends Shape {
	Rectangle(int length,int width,int height){
		super(length,width,height);
	}
	public int calArea() {
		return length*width;
	}

}
