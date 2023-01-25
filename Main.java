package Actividad2;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Desea circulo o cuadrado:");
		String opc = scan.nextLine();
		
/*		System.out.println(opc + " <--- esto es lo que contiene el String llamado figura");
        System.out.println((opc.contains("cuadrado")) + " <--- esto es usando el método String.Contains()" );        
        System.out.println((opc.equals("cuadrado")) + " <--- esto es usando el método String.Equals()");
        System.out.println((opc == "cuadrado") + " <--- esto es usando ==");
 */
		if (opc.equals("cuadrado")) {
			System.out.println("Cuanto mide el lado:");
			
			String lado2 = scan.nextLine();
			int lado = Integer.parseInt(lado2);
			
			System.out.println("Que quieres calcular:");
			System.out.println("1. La diagonal");
			System.out.println("2. El area");
			System.out.println("3. El perimetro");
			
			String dec2 = scan.nextLine();
			int dec = Integer.parseInt(dec2);
			
			if(dec == 1) {
				double diag = Math.sqrt(2*(lado*lado));
				System.out.println(diag);
			}
			if(dec == 2) {
				int area = lado*lado;
				System.out.println(area);
			}
			if(dec == 3) {
				int peri = lado*4;
				System.out.println(peri);
			}
		}
		
		if (opc.equals("circulo")) {
			System.out.println("Cuanto mide el radio:");
			
			String radio2 = scan.nextLine();
			int radio = Integer.parseInt(radio2);
			
			System.out.println("Que quieres calcular:");
			System.out.println("1. La circunferencia");
			System.out.println("2. El area");
			
			String dec2 = scan.nextLine();
			int dec = Integer.parseInt(dec2);
		
		//	System.out.println(dec + "");
	      

			if(dec == 1) {
				double circ = Math.PI*2*radio;
				System.out.println(circ);
			}
			if(dec == 2) {
				double area = Math.PI*radio*radio;
				System.out.println(area);
			}
	
			
		}
	}
		//int num = Integer.parseInt(line);
		
}
