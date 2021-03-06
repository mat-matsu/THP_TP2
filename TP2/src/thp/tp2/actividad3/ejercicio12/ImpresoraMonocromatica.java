package thp.tp2.actividad3.ejercicio12;

public class ImpresoraMonocromatica {
	final private int CONSUMO_TINTA = 50;
	final private int CONSUMO_HOJAS = 20;
	final private int MAX_HOJAS = 35;
	
	private boolean encendido;
	private int cantidadHojas;
	private int nivelTinta;
	
	public ImpresoraMonocromatica() {
		this.encendido = false;
		this.cantidadHojas = 0;
		this.nivelTinta = 100;
	}
	
	public void imprimir(Documento documento) {
		int cantCaracteres = documento.getCuerpoTextoSize();
		int tintaConsumir = nivelSegunCantCaracteres(cantCaracteres);
		int hojasConsumir = cantCaracteres/CONSUMO_HOJAS;
		
		if(tintaConsumir <= this.nivelTinta && this.cantidadHojas > 0) {
			System.out.println(documento);
			this.nivelTinta -= tintaConsumir;
			this.cantidadHojas -= hojasConsumir;
		} else {
			System.out.println("No se puede imprimir. No hay hojas o el nivel de tinta no alcanza para imprimir el documento.");
		}
	}
	
	private int nivelSegunCantCaracteres(int cantCaracteres) {
		return cantCaracteres/CONSUMO_TINTA;
	}
	
	public void recargarBandeja(int hojas) {
		if((this.cantidadHojas + hojas) > MAX_HOJAS) {
			this.cantidadHojas = MAX_HOJAS;
		} else if(hojas > 0) {
			this.cantidadHojas += hojas;
		}
	}
}
