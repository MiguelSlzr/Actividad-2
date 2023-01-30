package Actividad2;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		boolean bandera = true;
		
		
		while(bandera == true) {
			System.out.println("Ingrese un número acorde a las siguientes opciones:");
			System.out.println("");
			
			System.out.println("1. Calcular la diagonal de un cuadrado");
			System.out.println("2. Calcular el perímetro de un cuadrado");
			System.out.println("3. Calcular el área de un cuadrado");
			System.out.println("4. Calcular el perímetro de un círculo");
			System.out.println("5. Calcular el área de un círculo");
			System.out.println("6. Salir del menú");
			int decision = Integer.parseInt(scan.nextLine());
			
			int lado;
			int radio;
			Cuadrado miCuadrado = new Cuadrado();
			Circulo miCirculo = new Circulo();
			
			switch (decision) {
				case 1:
					System.out.println("Escriba el valor del lado del cuadrado:");
					lado = Integer.parseInt(scan.nextLine());
					
					miCuadrado.lado = lado;
					
					System.out.println("El lado del cuadrado es: " + miCuadrado.laDiagonal());
					System.out.println("");
					break;
				case 2:
					System.out.println("Escriba el valor del lado del cuadrado:");
					lado = Integer.parseInt(scan.nextLine());
					miCuadrado.lado = lado;
					System.out.println("El lado del cuadrado es: " + miCuadrado.elPerimetro());
					System.out.println("");
					break;
				case 3:
					System.out.println("Escriba el valor del lado del cuadrado:");
					lado = Integer.parseInt(scan.nextLine());
					miCuadrado.lado = lado;
					System.out.println("El lado del cuadrado es: " + miCuadrado.elArea());
					System.out.println("");
					break;
				case 4:
					System.out.println("Escriba el valor del radio del círculo:");
					radio = Integer.parseInt(scan.nextLine());
					miCirculo.radio = radio;
					System.out.println("La circunferencia del círculo es: " + miCirculo.elArea());
					System.out.println("");
					break;
				case 5:
					System.out.println("Escriba el valor del radio del círculo:");
					radio = Integer.parseInt(scan.nextLine());
					miCirculo.radio = radio;
					System.out.println("La circunferencia del círculo es: " + miCirculo.laCircunferencia());
					System.out.println("");
					break;
				case 6:	
					System.out.println("Saliendo...");
					bandera = false;
					break;
				default:
					System.out.println("Por favor elija una opción válida.");
					System.out.println("");
					break;
			}
		}
		scan.close();
	}	
}