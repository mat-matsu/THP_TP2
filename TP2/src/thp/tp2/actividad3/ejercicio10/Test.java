package thp.tp2.actividad3.ejercicio10;

public class Test {

	public static void main(String[] args) {
		Fraccion fraccion1 = new Fraccion(1,2);
		Fraccion fraccion2 = new Fraccion(5,3);
		CalculadoraDeFraccion calculadora = new CalculadoraDeFraccion();
		
		System.out.println(calculadora.valorReal(fraccion1));
		System.out.println(calculadora.valorReal(fraccion2));
		
		System.out.println(calculadora.sumar(fraccion1, 5));
		System.out.println(calculadora.sumar(fraccion1, fraccion2));
	}

}
