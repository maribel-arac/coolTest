package arrays;

public class Example_Array {

	public static void main(String[] args) {
		//ambas declaraciones son validas
		int intArray[];
		int[] intArray2;
		
	
		String[] arr; 	//Declarar un array de strings.
		arr = new String[5]; // se asigno 5 objetos en el array
		arr[0] = "zero";
		arr[1] = "one";
		arr[2] = "two";
		arr[3] = "three";
		arr[4] = "four";
	

		// cuando quieres imprimir SOLO un elemento del array, se hace asi: System.out.println("The element in index 2: " + arr[1]);
		
		//esto es para imprimir todos los elementos del array
		for(int i = 0; i < arr.length; i++) {
			System.out.println("the element in index " + i + ": " + arr[i]); 
		}
	}

}
