package thp.tp2.actividad2.ejercicio4;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Persona persona = new Persona("Fulano", "Gomez", 12345678, new Automovil("Giat", "Halio", "Gris Oscuro", 180));
		Persona persona = new Persona("Fulano", "Gomez", 12345678);
		persona.comprarAutomovil("Giat", "Halio", "Gris Oscuro", 180);
				
		persona.darUnaVuelaManzana(40, Direccion.IZQUIERDA);
		

	}

}
