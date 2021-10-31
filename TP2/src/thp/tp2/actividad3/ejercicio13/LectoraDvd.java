package thp.tp2.actividad3.ejercicio13;

public class LectoraDvd {
	private String marca;
	private boolean graba;
	
	public LectoraDvd(String marca, boolean graba) {
		this.marca = marca;
		this.graba = graba;
	}
	
	public boolean getGraba() {
		return this.graba;
	}
}
