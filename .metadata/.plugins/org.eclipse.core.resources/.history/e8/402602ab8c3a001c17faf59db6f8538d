package thp.tp2.actividad3.ejercicio11;

public class Superheroe {
	final private int MAX_VALOR = 100;
	final private int MIN_VALOR = 0;
	
	private String nombre;
	private int fuerza;
	private int resistencia;
	private int superpoderes;
	
	public Superheroe(String nombre, int fuerza, int resistencia, int superpoderes) {
		this.nombre = nombre;
		setFuerza(fuerza);
		setResistencia(resistencia);
		setSuperpoderes(superpoderes);
	}
	
	private void setFuerza(int fuerza) {
		this.fuerza = validarValor(fuerza);
	}
	
	private void setResistencia(int resistencia) {
		this.resistencia = validarValor(resistencia);
	}
	
	private void setSuperpoderes(int superpoderes) {
		this.superpoderes = validarValor(superpoderes);
	}
	
	private int getFuerza() {
		return this.fuerza;
	}
	
	private int getResistencia() {
		return this.resistencia;
	}
	
	private int getSuperpoderes() {
		return this.superpoderes;
	}
	
	private int validarValor(int valor) {
		if(valor < MIN_VALOR) {
			valor = MIN_VALOR;
		} else if (valor > MAX_VALOR) {
			valor = MAX_VALOR;
		}		
		return valor;
	}
	
	private int compararValor(int valor1, int valor2) {
		if(valor1 > valor2) {
			return 100;
		} else if (valor1 < valor2) {
			return 10;
		}
		return 1;
	}

	@Override
	public String toString() {
		return "Superheroe [nombre=" + nombre + ", fuerza=" + fuerza + ", resistencia=" + resistencia
				+ ", superpoderes=" + superpoderes + "]";
	}

	public void competir(Superheroe superheroe) {
		int contador = 0;
		Resultado resultado = Resultado.EMPATE;
		
		contador += compararValor(this.fuerza, superheroe.getFuerza());
		contador += compararValor(this.resistencia, superheroe.getResistencia());
		contador += compararValor(this.superpoderes, superheroe.getSuperpoderes());
		
		if(contador > 200) {
			resultado = Resultado.TRIUNFO;
		} else if((contador > 20 && contador <= 30) || contador >= 120) {
			resultado = Resultado.DERROTA;
		}
		
		System.out.println(resultado);
	}
	
	 
}
