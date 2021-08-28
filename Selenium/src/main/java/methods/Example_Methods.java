package methods;

public class Example_Methods {

	public static void main(String[] args) {
		int result = sum(8,2);
		System.out.println(result);
		
		int result2 = sum(345,3546);
		System.out.println(result2);
		
		int result3 = sum(93,452);
		System.out.println(result3);
		
		String vehicles = car(4);
		System.out.println(vehicles);

	}
	public static int sum(int a, int b) {
		int c = a + b;
		return c;
	}
	
	public static String car(int a) {
		String[] automobiles = {"Ferrari", "Jeep", "Tesla", "Toyota", "Lamborghini"};
		return automobiles[a];
	}

}
