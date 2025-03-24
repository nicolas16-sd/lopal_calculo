package br.sp.senai.jandira.calculo.model;

public class Quadrado {
	private double lado;
	
	public void setLado(double lado) {
		this.lado = lado;
	}
	
	public double getlado(double lado) {
		return lado;
	}
	
	public double calcularArea() {
		double area = lado * lado;
		return area;
	}
	
	public double calcularPerimetro() {
		double perimetro = 2 * (lado + lado);
		return perimetro;
	}
	
	public void mostrarDados() {
		String unidadeMedida = "Cm.";
		String unidadeArea = "cm.";
		System.out.println("=================================");
		System.out.println("QUADRADO");
		System.out.println("=================================");
		System.out.printf("LADO  %s %s\n", lado, unidadeMedida);
		System.out.println("=================================");
		System.out.printf("AREA %s %s\n", calcularArea(), unidadeArea);
		System.out.println("=================================");
		System.out.printf("PERIMETRO %s %s\n", calcularPerimetro(), unidadeArea);
		System.out.println("=================================");
		
	}
}
