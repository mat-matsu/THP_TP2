package thp.tp2.actividad3.ejercicio13;

public class Computadora {
	private String marca;
	private String tipo;
	private Procesador procesador;
	private LectoraDvd lectoraDvd;
	
	public Computadora(String marca, String tipo, Procesador procesador) {
		this.marca = marca;
		this.tipo = tipo;
		this.procesador = procesador;
	}
	
	public Computadora(String marca, String tipo, Procesador procesador, LectoraDvd lectoraDvd) {
		this.marca = marca;
		this.tipo = tipo;
		this.procesador = procesador;
		this.lectoraDvd = lectoraDvd;
	}
	
	public LectoraDvd getLectoraDvd() {
		return this.lectoraDvd;
	}
	
	public void prender() {
		
	}
	
	public void apagar() {
		
	}
	
	public void reiniciar() {
		
	}

	@Override
	public String toString() {
		return "Computadora [marca=" + marca + ", tipo=" + tipo + ", procesador=" + procesador + ", lectoraDvd="
				+ lectoraDvd + "]";
	}
	
	
}
