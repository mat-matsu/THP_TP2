package thp.tp2.actividad3.ejercicio7;

public class Test {

	public static void main(String[] args) {
		Robot robot = new Robot("Johnny 5");
		Persona persona = new Persona("Fulano", 45678901);
		
		robot.saludar();
		
		robot.saludar(persona);
	}

}
