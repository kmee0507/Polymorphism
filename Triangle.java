
public class Triangle extends Shape {
	protected double base;
	protected double height;
	
	Triangle(String color, double b, double h){
		super(color);
		base = b;
		height = h;
	}
	public double getArea(){
		return (.5*base*height);
	}
	public String toString(){
		return super.toString() + " Base: " + base + " Height: " + height;
	}

}
