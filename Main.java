package Actividad2;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Escoja círculo o cuadrado:");
		String opc = scan.nextLine();
		
/*		System.out.println(opc + " <--- esto es lo que contiene el String llamado figura");
        System.out.println((opc.contains("cuadrado")) + " <--- esto es usando el método String.Contains()" );        
        System.out.println((opc.equals("cuadrado")) + " <--- esto es usando el método String.Equals()");
        System.out.println((opc == "cuadrado") + " <--- esto es usando ==");
 */
		if (opc.equals("cuadrado")) {
			System.out.println("¿Cuánto mide el lado del cuadrado?");
			
			String lado2 = scan.nextLine();
			int lado = Integer.parseInt(lado2);
			Cuadrado miCuadrado = new Cuadrado(lado);
			
			
			System.out.println("¿Qué desea calcular?");
			System.out.println("1. La diagonal");
			System.out.println("2. El área");
			System.out.println("3. El perímetro");
			
			String dec2 = scan.nextLine();
			int dec = Integer.parseInt(dec2);
			
			
			if(dec == 1) {
				System.out.println(miCuadrado.laDiagonal());

			} else if(dec == 2) {
				System.out.println(miCuadrado.elArea());
			} else if(dec == 3) {
				System.out.println(miCuadrado.elPerimetro());
			} else {
				System.out.println("Lo siento, solo se puede escoger 1, 2 o 3.");
			}
			
		} else if (opc.equals("círculo")) {
			System.out.println("Cuanto mide el radio:");
			
			String radio2 = scan.nextLine();
			int radio = Integer.parseInt(radio2);
			Circulo miCirculo = new Circulo(radio);
			
			
			
			System.out.println("Que quieres calcular:");
			System.out.println("1. La circunferencia");
			System.out.println("2. El área");
			
			String dec2 = scan.nextLine();
			int dec = Integer.parseInt(dec2);
		
	      

			if(dec == 1) {
				System.out.println(miCirculo.laCircunferencia());
			} else if(dec == 2) {
				System.out.println(miCirculo.elArea());
			} else {
				System.out.println("Lo siento, solo se puede escoger 1 o 2.");
			}
			
		} else {
			System.out.println("Esa no es una opción, inténtelo de nuevo.");
		}
		scan.close();
	}	
}