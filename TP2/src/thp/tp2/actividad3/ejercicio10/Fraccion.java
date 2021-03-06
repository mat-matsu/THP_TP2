package thp.tp2.actividad3.ejercicio10;

public class Fraccion {
	private int numerador;
	private int denominador;
	
	public Fraccion(int numerador, int denominador) {
		this.numerador = numerador;
		this.denominador = denominador;
	}
	
	public double valorReal() {
		return (double) (this.numerador)/(double) (this.denominador);
	}
	
	public Fraccion sumar(int entero) {
		int num = this.numerador + (entero * this.denominador);
		
		return new Fraccion(num, this.denominador);
	}
	
	public Fraccion sumar(Fraccion fraccion2) {
		int num;
		int den;
		
		if (this.denominador%fraccion2.getDenominador() == 0) {
			den = this.denominador;
		} else if (fraccion2.getDenominador()%this.denominador == 0) {
			den = fraccion2.getDenominador();
		} else {
			den = fraccion2.getDenominador() * this.denominador;
		}
		
		num = (this.numerador*(den/this.denominador)) + (fraccion2.getNumerador()*(den/fraccion2.getDenominador())); 
		
		return new Fraccion(num, den);
	}
	
	public int getNumerador() {
		return numerador;
	}

	public int getDenominador() {
		return denominador;
	}

	@Override
	public String toString() {
		return this.numerador + "/" + this.denominador;
	}
}
