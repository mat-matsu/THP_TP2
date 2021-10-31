package thp.tp2.actividad3.ejercicio13;

public class Persona {
	private String nombre;
	private String apellido;
	private int dni;
	private Computadora computadora;
	
	public Persona(String nombre, String apellido, int dni, Computadora computadora) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.computadora = computadora;
	}
	
	public void trabajar() {
		
	}
	
	public void descansar() {
		
	}
	
	public Grabado grabar(Dvd dvd) {
		LectoraDvd lectora = this.computadora.getLectoraDvd(); 
		if(lectora == null) {
			return Grabado.SIN_DVD;
		} else if (lectora.getGraba()) {
			return Grabado.GRABACION_OK;
		}
		return Grabado.UNIDAD_SIN_GRABADO;
	}
}
