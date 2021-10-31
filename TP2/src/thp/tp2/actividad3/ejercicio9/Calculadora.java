package thp.tp2.actividad3.ejercicio9;

public class Calculadora {
	
	public Calculadora() {}
	
	public int sumar(int nroA, int nroB) {
		return nroA + nroB;
	}
	
	public int restar(int nroA, int nroB) {
		return nroA - nroB;
	}

	public int multiplicar(int nroA, int nroB) {
		return nroA * nroB;
	}
	
	public int dividir(int nroA, int nroB) {
		if(nroB != 0) {
			return nroA / nroB;
		}
		System.out.println("No se puede dividir por 0.");
		return 0;
	}
	
}
