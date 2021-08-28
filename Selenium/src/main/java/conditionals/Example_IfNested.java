package conditionals;

public class Example_IfNested {

	public static void main(String[] args) {
		int temperature = 19;
		
		if(temperature > 15) {
			if(temperature > 25) {
				System.out.print("Let's go to Bacalar");
			} else {
				System.out.print("Let's go to Mazamitla");
			}
		} else {
			System.out.print("Stay home my dear and relax");
		}

	}

}
