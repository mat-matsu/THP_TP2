package thp.tp2.actividad3.ejercicio14;

public class Promedio {
	private Contador contador;
	private Acumulador acumulador;
	
	public Promedio() {
		this.contador = new Contador();
		this.acumulador = new Acumulador();
	}
	
	public void incrementar(double valor) {
		this.contador.incrementarValor();
		this.acumulador.modificarValor(valor);
	}
	
	public double obtenerValor() {
		return promediar();
	}
	
	private double promediar() {
		if(this.contador.obtenerValor() == 0) {
			return 0;
		} else {
			return (double) (this.acumulador.obtenerValor()/(double) (this.contador.obtenerValor()));
		}
	}
}
