package encapsulation;

public class DemoEncap {

	public static void main(String[] args) {
		
		EncapClass encap = new EncapClass();
		
		encap.setType(10);
		
		System.out.println("Type is: " + encap.getType());

	}

}
