package thp.tp2.actividad3.ejercicio14;

public class Acumulador {
	private double acumulador;
	
	public Acumulador() {
		this.acumulador = 0;
	}
	
	public void modificarValor(double valor) {
		this.acumulador += valor;
	}
	
	public double obtenerValor() {
		return this.acumulador;
	}
}
