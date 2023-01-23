package Actividad2;

public class Cuadrado {
	public int lado;
	
	public int laLongitud() {
		return lado;
	}
	
	public double laDiagonal() {
		return Math.sqrt((lado*lado)+(lado*lado));
	}
	
	public int elPerimetro() {
		return lado*4;
	}
	
	public int elArea() {
		return lado*lado;
	}
	
	public Cuadrado(int lado) {
		this.lado = lado;
	}
	
	public Cuadrado() {
		this(174720);
	}
}