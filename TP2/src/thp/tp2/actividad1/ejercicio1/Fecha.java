package thp.tp2.actividad1.ejercicio1;

public class Fecha {
	private int dia;
	private int mes;
	private int anio;
	
	public Fecha(int dia, int mes, int anio) {
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}
	
	public void mostarComoCadena() {
		System.out.println(dia + "/" + mes + "/" + anio);
	}
	
	public void mostarDiasTranscurridos() {
		// alguna l?gica y sysout para mostrar salida
	}
}
