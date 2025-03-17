package br.sp.senai.jandira.calculo.model;

public class Triangulo {
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
		double area = (base * altura) /2;
		return area;
	}
	
	public void mostrarDados() {
		String unidadeMedida = "Cm.";
		String unidadeArea = "cm.";
		System.out.println("=================================");
		System.out.println("TRIÂNGULO");
		System.out.println("=================================");
		System.out.printf("BASE %s %s\n", base, unidadeMedida);
		System.out.printf("ALTURA %s %s\n", altura, unidadeMedida);
		System.out.println("=================================");
		System.out.printf("AREA %s %s\n", calcularArea(), unidadeArea);
		System.out.println("=================================");
	}
}

