package Actividad2;

public class Examen {
	String myString = "hello";

	public String primeraMayuscula(String myString) {
		char firstChar = myString.charAt(0);
		
		String firstLetter = String.valueOf(firstChar);
		
		String upperString = firstLetter.toUpperCase();
		
		String newString = myString.replace(firstLetter, upperString);
		
		return (newString);
		
		
		
		
//		public Examen(String myString) {
//			this.myString = myString;
			
//		}
	}
}

/*	
	String invertirCadena("String") {
		
	}
	
	String vocalesMayuscula("String") {
		
	}
	
	void Fizzbuzz() {
		
	}
	
	boolean palindromo("String") {
	
	}
*/	


