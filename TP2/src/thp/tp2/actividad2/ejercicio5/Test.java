package thp.tp2.actividad2.ejercicio5;

public class Test {

	public static void main(String[] args) {
		Automovil automovil = new Automovil("Ford", "Fiesta", "ABCD123", 40);
		automovil.setRendimientoPorLitro(10);
		automovil.cargarCombustible(20);
		
		System.out.println(automovil);
		
		System.out.println(automovil.viajar(180));
		
		System.out.println(automovil);
		
		System.out.println(automovil.viajar(50));
		
		System.out.println(automovil);

	}

}
