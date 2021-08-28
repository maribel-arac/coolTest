package arrays;

public class Example_TwoDimensionalArray {

	public static void main(String[] args) {
		//Example aareglo de una dimension
		int [] intArray = new int [] {1,2,3,4,5};
		
		//Declarando e inicializando en 2D
		int arr[][] = {{2,7,9},{3,6,1},{5,8,2}};
		
		// System.out.println(arr[1][2]); es para imprimir el array en la posicion 1 y dntro de, la posicion 2, resutado= 1
		
		for(int i = 0; i < 3;i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
