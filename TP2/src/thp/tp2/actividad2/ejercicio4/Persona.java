package thp.tp2.actividad2.ejercicio4;

public class Persona {
	private String nombre;
	private String apellido;
	private int dni;
	private Automovil automovil;
	
	public Persona(String nombre, String apellido, int dni) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
	}
	
	public Persona(String nombre, String apellido, int dni, Automovil automovil) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.automovil = automovil;
	}
	
	public void comprarAutomovil(String marca, String modelo, String color, int velMax) {
		this.automovil = new Automovil(marca, modelo, color, velMax);
	}
	
	public void darUnaVuelaManzana(int velocidad, Direccion direccion) {
		this.automovil.encender();
		this.automovil.acelerar(velocidad);
		for (int i = 0; i < 4; i++) {
			this.automovil.girar(direccion, 90);
		}
		this.automovil.frenar(velocidad);
		this.automovil.apagar();
	}
}
