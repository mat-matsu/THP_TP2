package thp.tp2.actividad3.ejercicio8;

public class Turnera {
	private int turnoActual = 0;
	
	public Turnera() {}
	
	public int otorgarProximoNumero() {
		return ++turnoActual;
	}
	
	public void verUltimoNumeroOtorgado() {
		System.out.println(turnoActual);
	}
	
	public void resetearContador() {
		turnoActual = 0;
	}
	
	public void resetearContador(int turno) {
		turnoActual = turno;
	}
}
