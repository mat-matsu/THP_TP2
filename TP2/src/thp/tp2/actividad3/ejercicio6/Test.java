package thp.tp2.actividad3.ejercicio6;

public class Test {

	public static void main(String[] args) {
		String nombre, apellido, fechaNacimiento, calle, barrio;
		int dni, altura;
		
		Persona persona1 = new Persona(12345678, "Fulano", "G?mez", "01/01/1990", "Yatay", 240, "Almagro");
				
		CuentaBancaria cuentaBancaria1 = new CuentaBancaria(persona1, TipoCuenta.CAJA_AHORRO);
		
		Persona persona2 = new Persona(90123456, "Mengana", "Torres", "28/02/2000","Yatay", 240, "Almagro");
		
		CuentaBancaria cuentaBancaria2 = new CuentaBancaria(persona2, TipoCuenta.CUENTA_CORRIENTE);
		
		String mensaje = "Una cuenta bancaria de tipo " + cuentaBancaria1.datosPersona() + ", y otra de tipo "
				+ cuentaBancaria2.datosPersona() + ".";
		
		String mensaje2 = "Ambos son pareja y viven junto en " + cuentaBancaria1.datosPersonaDomicilio();
		
		System.out.println(mensaje);
		System.out.println(mensaje2);
		
	}

}
