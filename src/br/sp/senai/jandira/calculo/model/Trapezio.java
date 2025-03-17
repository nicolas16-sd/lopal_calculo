package br.sp.senai.jandira.calculo.model;

public class Trapezio {
	private double baseMenor;
	private double altura;
	private double baseMaior;
	
	public void setBaseMenor(double baseMenor) {
		this.baseMenor = baseMenor;
	}
	
	public void setBaseMaior(double baseMaior) {
		this.baseMaior = baseMaior;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getAltura(double altura) {
		return altura;
	}
	
	public double getBaseMenor(double base) {
		return baseMenor;
	}
	
	public double getBaseMaior(double base) {
		return baseMaior;
	}
	
	public double calcularArea() {
		double area = (baseMenor + baseMaior)* altura/2;
		return area;
	}
	
	public void mostrarDados() {
		String unidadeMedida = "Cm.";
		String unidadeArea = "cm.";
		System.out.println("=================================");
		System.out.println("TRAPÉZIO");
		System.out.println("=================================");
		System.out.printf("BASE MAIOR %s %s\n", baseMaior, unidadeMedida);
		System.out.printf("BASE MENOR %s %s\n", baseMenor, unidadeMedida);
		System.out.printf("ALTURA %s %s\n", altura, unidadeMedida);
		System.out.println("=================================");
		System.out.printf("AREA %s %s\n", calcularArea(), unidadeArea);
		System.out.println("=================================");
	}
}

