package br.sp.senai.jandira.calculo.model;

public class Quadrado {
	private double lado1;
	private double lado2;
	
	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}
	
	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}
	
	public double getlado2(double lado2) {
		return lado2;
	}
	
	public double calcularArea() {
		double area = lado1 * lado2;
		return area;
	}
	
	public double calcularPerimetro() {
		double perimetro = 2 * (lado1 + lado2);
		return perimetro;
	}
	
	public void mostrarDados() {
		String unidadeMedida = "Cm.";
		String unidadeArea = "cm.";
		System.out.println("=================================");
		System.out.println("QUADRADO");
		System.out.println("=================================");
		System.out.printf("LADO 1 %s %s\n", lado1, unidadeMedida);
		System.out.printf("LADO 2 %s %s\n", lado2, unidadeMedida);
		System.out.println("=================================");
		System.out.printf("AREA %s %s\n", calcularArea(), unidadeArea);
		System.out.println("=================================");
		System.out.printf("PERIMETRO %s %s\n", calcularPerimetro(), unidadeArea);
		System.out.println("=================================");
		
	}
}
