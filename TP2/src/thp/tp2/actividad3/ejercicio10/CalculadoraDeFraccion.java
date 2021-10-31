package thp.tp2.actividad3.ejercicio10;

public class CalculadoraDeFraccion {
	private Fraccion fraccion;
	
	public double valorReal(Fraccion fraccion) {
		return fraccion.valorReal();
	}
	
	public Fraccion sumar(Fraccion fraccion, int entero) {
		return fraccion.sumar(entero);
	}
	
	public Fraccion sumar(Fraccion fraccion1, Fraccion fraccion2) {
		return fraccion1.sumar(fraccion2);
	}
}
