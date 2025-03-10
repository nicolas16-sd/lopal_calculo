package br.sp.senai.jandira.calculo.model;

public class Retangulo {
	private double base;
	private double altura;
	
	public void setBase(double base) {
		this.base = base;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getAltura(double altura) {
		return altura;
	}
	
	public double calcularArea() {
		double area = base * altura;
		return area;
	}
	
	public double calcularPerimetro() {
		double perimetro = 2 * (base + altura);
		return perimetro;
	}
	
	public void mostrarDados() {
		String unidadeMedida = "Cm.";
		String unidadeArea = "cm².";
		System.out.println("=================================");
		System.out.println("RETÂNGULO");
		System.out.println("=================================");
		System.out.printf("BASE %s %s\n", base, unidadeMedida);
		System.out.printf("ALTURA %s %s\n", altura, unidadeMedida);
		System.out.println("=================================");
		System.out.printf("AREA %s %s\n", calcularArea(), unidadeArea);
		System.out.println("=================================");
		System.out.printf("PERIMETRO %s %s\n", calcularPerimetro(), unidadeArea);
		System.out.println("=================================");
		
	}
}
