
public class TestShape {
	public static void main(String[] args){
		Triangle t = new Triangle("Green", 5, 10);
		System.out.println(t);
		System.out.println(t.getArea());
		
		Rectangle r = new Rectangle("Orange", 3.4, 5.8);
		System.out.println(r);
		System.out.println(r.getArea());		
		
	}

}
