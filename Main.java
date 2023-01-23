package Actividad2;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Desea circulo o cuadrado:");
		String line = scan.nextLine();
		
		if (line == "circulo") {
			System.out.println("Elegiste circulo");
			
		}
		if (line == "cuadrado") {
			System.out.println("Elegiste cuadrado");
			
		}
	}
		//int num = Integer.parseInt(line);
		
}

