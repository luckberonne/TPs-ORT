package edu.ort.t1.tp2.ejercicios.models;


public class CuentaBancaria {
	 public enum TipoCuenta {
	     CAJA_AHORRO,
	     CUENTA_CORRIENTE
	 }
	
	 private String cbu;
	 private TipoCuenta tipo;
	 private double saldo;
	 private PersonaEj9 titular;
	
	 public CuentaBancaria(TipoCuenta tipo, PersonaEj9 titular) {
	     this.tipo = tipo;
	     this.titular = titular;
	     this.saldo = 0.0;
	     this.cbu = generarCBU();
	 }
	
	 private String generarCBU() {
	     int parte1 = 10 + tipo.ordinal();
	     int dni = titular.getDni();
	     return String.format("%02d-%08d-%d", parte1, dni, dni % 10);
	 }
	
	 public double obtenerSaldo() {
	     return saldo;
	 }
	
	 public void depositar(double monto) {
	     if (monto > 0) {
	         saldo += monto;
	     }
	 }
	
	 public boolean extraer(double monto) {
	     if (monto <= saldo) {
	         saldo -= monto;
	         return true;
	     }
	     return false;
	 }
	
	 @Override
	 public String toString() {
	     return "Cuenta " + tipo + " | CBU: " + cbu + " | Saldo: $" + saldo + "\nTitular: " + titular;
	 }
}
