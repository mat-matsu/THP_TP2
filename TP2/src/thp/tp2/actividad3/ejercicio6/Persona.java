package thp.tp2.actividad3.ejercicio6;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class Persona {
	private int dni;
	private String nombre;
	private String apellido;
	private LocalDate fechaNacimiento;
	private Domicilio domicilio;
	
	private DateTimeFormatter formatter = new DateTimeFormatterBuilder().append(DateTimeFormatter.ofPattern("dd/MM/yyyy")).toFormatter();
	
	public Persona(int dni, String nombre, String apellido, String fechaNacimiento, String calle, int altura, String barrio) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = LocalDate.parse(fechaNacimiento, formatter);
		this.domicilio = new Domicilio(calle, altura, barrio);
	}
	
	@Override
	public String toString() {
		return this.nombre + " " + this.apellido + " cuyo DNI es " + this.dni;
	}
	
	public String domicilioPersona() {
		return this.domicilio.getDomilioCompleto();
	}
	
}
