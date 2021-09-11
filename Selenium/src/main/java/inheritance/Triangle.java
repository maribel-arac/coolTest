package inheritance;

public class Triangle extends TwoDimensions {
	String style;
	
	double area() {
		return base*height/2; 
	}
	
	void showStyle() {
		System.out.println("Triangle is: " + style);
	}

}
