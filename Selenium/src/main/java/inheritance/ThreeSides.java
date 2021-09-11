package inheritance;

public class ThreeSides {

	public static void main(String[] args) {
		Triangle t1 = new Triangle();
		
		t1.base = 2.0;
		t1.height = 4.0;
		t1.style = "Style 7";
		
		System.out.println("T1 information is:");
		t1.showStyle();
		t1.showDimension();
		System.out.println("its area is: " + t1.area());
		
		System.out.println();
		
		Triangle t2 = new Triangle();
		
		t2.base = 7.5;
		t2.height = 3.0;
		t2.style = "Style 4";
		
		System.out.println("T2 information is:");
		t2.showStyle();
		t2.showDimension();
		System.out.println("its area is: " + t2.area());

	}

}
