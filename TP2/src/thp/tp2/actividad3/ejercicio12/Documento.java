package thp.tp2.actividad3.ejercicio12;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class Documento {
	private LocalDate fecha;
	private String titulo;
	private String cuerpoTexto;
	
	private DateTimeFormatter formatter = new DateTimeFormatterBuilder().append(DateTimeFormatter.ofPattern("dd/MM/yyyy")).toFormatter();
	
	public Documento(String titulo, String cuerpoTexto) {
		this.fecha = obtenerFechaDeHoy();
		this.titulo = titulo;
		this.cuerpoTexto = cuerpoTexto;
	}
	
	public int getCuerpoTextoSize() {
		return this.cuerpoTexto.length();
	}
	
	private LocalDate obtenerFechaDeHoy() {
		LocalDate ahora = LocalDate.now();
		
		return LocalDate.parse(ahora.format(formatter), formatter);
	}

	@Override
	public String toString() {
		return fecha + "          **" + titulo + "**\n" + cuerpoTexto;
	}
	
	
}
