package thp.tp2.actividad3.ejercicio14;

public class Test {

	public static void main(String[] args) {
		Promedio promedio = new Promedio();
		
		promedio.incrementar(10);
		promedio.incrementar(5);
		promedio.incrementar(10);
		promedio.incrementar(5);
		promedio.incrementar(10);
		promedio.incrementar(5);
		promedio.incrementar(10);
		promedio.incrementar(5);
		
		System.out.println(promedio.obtenerValor());
		
	}

}
