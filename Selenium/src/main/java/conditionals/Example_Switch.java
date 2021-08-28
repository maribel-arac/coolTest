package conditionals;

public class Example_Switch {

	public static void main(String[] args) {
		int i = 5;
		
		switch (i) {
		case 0:
			System.out.print("i is zero");
			break;
		case 1:
			System.out.print("i is one");
			break;
		case 2:
			System.out.print("i is two");
			break;
		default:
			System.out.print("i is more than two");
		}

	}

}
