package thp.tp2.actividad3.ejercicio9;

public class Test {

	public static void main(String[] args) {
		int nroA = 10;
		int nroB = 3;
		int nroC = 0;
		
		Calculadora calculadora = new Calculadora();
		
		System.out.println(calculadora.sumar(nroA, nroB));
		System.out.println(calculadora.restar(nroA, nroB));
		System.out.println(calculadora.multiplicar(nroA, nroB));
		System.out.println(calculadora.dividir(nroA, nroB));
		System.out.println(calculadora.dividir(nroA, nroC));
		
	}

}
