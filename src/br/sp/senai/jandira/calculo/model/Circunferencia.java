package br.sp.senai.jandira.calculo.model;

public class Circunferencia {
	
	private double raio;
	
	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	public double getRaio() {
		return raio;
	}
	
	public double calcularArea() {
		double area = Math.PI * (raio * raio);
		return area;
	}
}
