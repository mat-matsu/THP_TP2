package thp.tp2.actividad3.ejercicio8;

public class Test {

	public static void main(String[] args) {
		Turnera turnera = new Turnera();
		
		turnera.verUltimoNumeroOtorgado();
		
		System.out.println(turnera.otorgarProximoNumero());
		
		System.out.println(turnera.otorgarProximoNumero());
		
		turnera.resetearContador();
		
		turnera.verUltimoNumeroOtorgado();
		
		turnera.resetearContador(5);
		
		turnera.verUltimoNumeroOtorgado();
		
	}

}
