package thp.tp2.actividad3.ejercicio7;

public class Robot {
	private String nombre;
	
	public Robot(String nombre) {
		this.nombre = nombre;
	}
	
	public void saludar() {
		System.out.println("Hola, mi nombre es " + this.nombre + ". �En qu� puedo ayudarte?");
	}
	
	public void saludar(Persona persona) {
		System.out.println("Hola " + persona.getNombre() + ", mi nombre es " + this.nombre + ". �En qu� puedo ayudarte?");
	}
}
