package thp.tp2.actividad2.ejercicio5;

public class Automovil {
	private String marca;
	private String modelo;
	private String patente;
	private double capacidadTanque;
	private double cantidadDeCombustible;
	private double rendimientoPorLitro;
	
	public Automovil(String marca, String modelo, String patente, double capacidadTanque) {
		this.marca = marca;
		this.modelo = modelo;
		this.patente = patente;
		this.capacidadTanque = capacidadTanque;
	}
	
	public void setRendimientoPorLitro(double rendimiento) {
		this.rendimientoPorLitro = rendimiento;
	}
	
	private double calcularConsumo(double distanciaARecorrer) {
		return distanciaARecorrer/this.rendimientoPorLitro;
	}
	
	private double calcularDistancia(double litrosAConsumir) {
		return litrosAConsumir*this.rendimientoPorLitro;
	}
	
	private double consumirCombustible(double litrosCombustible) {
		double combustibleFaltante = 0;
		this.cantidadDeCombustible -= litrosCombustible;
		if(this.cantidadDeCombustible < 0) {
			combustibleFaltante = -1 * this.cantidadDeCombustible;
			this.cantidadDeCombustible = 0;
		}
		return combustibleFaltante;
	}
	
	public double viajar(double distanciaARecorrer) {
		double cantCombustible = calcularConsumo(distanciaARecorrer);
		double combustibleFaltante = consumirCombustible(cantCombustible);
		
		return calcularDistancia(cantCombustible - combustibleFaltante);
	}
	
	public boolean cargarCombustible(double cantCombustible) {
		if(cantCombustible <= 0 || cantCombustible > espacioDisponible()) {
			return false;
		}
		
		this.cantidadDeCombustible += cantCombustible;
		return true;
	}
	
	private double espacioDisponible() {
		return this.capacidadTanque - this.cantidadDeCombustible;
	}
	
	public boolean pocoCombustible() {
		boolean bajoCombustible = false;
		if(this.cantidadDeCombustible < (this.capacidadTanque*0.15)) {
			bajoCombustible = true;
		}
		
		return bajoCombustible;
		
	}

	@Override
	public String toString() {
		return "Automovil [marca=" + marca + ", modelo=" + modelo + ", patente=" + patente + ", capacidadTanque="
				+ capacidadTanque + ", cantidadDeCombustible=" + cantidadDeCombustible + ", rendimientoPorLitro="
				+ rendimientoPorLitro + ", espacioDisponible()=" + espacioDisponible() + ", pocoCombustible()="
				+ pocoCombustible() + "]";
	}
	
	
}