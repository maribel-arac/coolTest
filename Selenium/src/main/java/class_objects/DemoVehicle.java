package class_objects;

public class DemoVehicle {

	public static void main(String[] args) {
		
		int rango;
		
		Vehicle minivan = new Vehicle();
		
		//assignin values to minivan
		minivan.pasajeros = 9;
		minivan.capacidad = 15;
		minivan.kmh= 20;
		
		//calcular rango de un tanque lleno
		rango = minivan.capacidad * minivan.kmh;
		
		System.out.println("La minivan can take " + minivan.pasajeros + " pasajeros con rango de " + rango + "km");
		
		Vehicle car = new Vehicle();
		car.pasajeros = 4;
		System.out.println("Numero de pasajeros en carro es: " + car.pasajeros);

	}

}
