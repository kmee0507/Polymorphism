
public abstract class Shape {
	protected String color;
	Shape(String c){
		color = c;
	}
	public String toString(){
		return "Color: " +color;
	}
	public abstract double getArea();
}
