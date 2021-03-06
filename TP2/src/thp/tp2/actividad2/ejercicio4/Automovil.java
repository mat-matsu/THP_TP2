package thp.tp2.actividad2.ejercicio4;

public class Automovil {
	final private int MAX_GRADOS = 90;
	final private int VEL_PERMITIDA = 40;
	final private int MIN_VEL = 0;
	
	private String marca;
	private String modelo;
	private String color;
	private int velMax;
	private int velActual = 0;
	private boolean encendido = false;
	
	public Automovil(String marca, String modelo, String color, int velMax) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.velMax = velMax;
	}
	
	public void encender() {
		if(!this.encendido) {
			this.encendido = true;
		}
		System.out.println("Automovil encendido.");
	}
	
	public void apagar() {
		if(this.encendido) {
			this.encendido = false;
		}
		
		System.out.println("Automovil apagado.");
	}
	
	public void acelerar(int velocidad) {
		this.velActual += velocidad;
		if(this.velActual > VEL_PERMITIDA) {
			this.velActual = VEL_PERMITIDA;
		}
		
		System.out.println("La velocidad actual es de: " + this.velActual);
	}
	
	public void frenar(int velocidad) {
		this.velActual -= velocidad;
		if(this.velActual < MIN_VEL) {
			this.velActual = MIN_VEL;
		}
		
		System.out.println("La velocidad actual es de: " + this.velActual);
	}
	
	public void girar(Direccion direccion, int grados) {
		if (grados > MAX_GRADOS) {
			grados = MAX_GRADOS;
		}
		
		System.out.println("Se giro " + grados + "? a la " + direccion);
	}
	
}