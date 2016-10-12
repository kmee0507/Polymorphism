
public class Rectangle extends Shape {
	double length;
	double width;
	
	Rectangle(String color, double l, double w){
		super(color);
		length = l;
		width = w;
	}
	public double getArea(){
		return length*width;
	}
	public String toString(){
		return super.toString() + " Length: " + length + " Width: " + width;
	}
}
