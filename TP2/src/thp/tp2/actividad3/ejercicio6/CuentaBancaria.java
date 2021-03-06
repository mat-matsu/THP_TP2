package thp.tp2.actividad3.ejercicio6;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class CuentaBancaria {
	private String cbu;
	private TipoCuenta tipo;
	private double saldo;
	private LocalDate fechaApertura;
	private Persona persona;
	
	private DateTimeFormatter formatter = new DateTimeFormatterBuilder().append(DateTimeFormatter.ofPattern("dd/MM/yyyy")).toFormatter();
	
	public CuentaBancaria (Persona persona, TipoCuenta tipo) {
		this.cbu = generarCbu();
		this.saldo = 0;
		this.fechaApertura = obtenerFechaDeHoy();
		this.persona = persona;
		this.tipo = tipo;
	}
	
	private String generarCbu() {
		int minRandomInicio = 10;
		int maxRandomInicio = 99;
		int maxRandomFin = Integer.MAX_VALUE;
		
		String inicio = Double.toString(Math.floor(Math.random()*(maxRandomInicio-minRandomInicio+1)+minRandomInicio));
		String medio = Double.toString(Math.floor(Math.random()*(maxRandomFin+1)));
		String fin = Double.toString(Math.floor(Math.random()*(maxRandomFin+1)));
		
		return inicio + medio + fin;
	}
	
	private LocalDate obtenerFechaDeHoy() {
		LocalDate ahora = LocalDate.now();
		
		return LocalDate.parse(ahora.format(formatter), formatter);
	}
	
	public Double verSaldo() {
		return this.saldo;
	}
	
	public void depositar(Double deposito) {
		this.saldo += deposito;
	}
	
	public boolean extraer(Double extraccion) {
		Boolean flag = false;
		
		if (this.saldo >= extraccion) {
			this.saldo -= extraccion;
			flag = true;
		}
		
		return flag;
	}
	
	public TipoCuenta getTipo() {
		return this.tipo;
	}
	
	public String datosPersona() {
		return this.tipo + " le pertenece a " + this.persona.toString();
	}
	
	public String datosPersonaDomicilio() {
		return this.persona.domicilioPersona();
	}
}
