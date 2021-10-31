package thp.tp2.actividad3.ejercicio6;

public class Domicilio {
	private String calle;
	private int altura;
	private String barrio;
	
	public Domicilio (String calle, int altura, String barrio) {
		this.calle = calle;
		this.altura = altura;
		this.barrio = barrio;
	}
	
	public String getDomilioCompleto() {
		return this.calle + " " + this.altura + ", " + this.barrio + ".";
	}

	public String getCalle() {
		return calle;
	}

	public int getAltura() {
		return altura;
	}

	public String getBarrio() {
		return barrio;
	}
	
}
