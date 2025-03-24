package br.sp.senai.jandira.calculo.model;

public class Triangulo {
	public double ladoA;
	public double ladoB;
	public double ladoC;
	
	public void tipoTriangulo() {

		if (ladoA < ladoB + ladoC && ladoB < ladoA + ladoC && ladoC < ladoA + ladoB) {

		if (ladoA == ladoB && ladoB == ladoC) {

		System.out.println("É um triângulo EQUILÁTERO!");

		} else if (ladoA != ladoB && ladoB != ladoC) {

		System.out.println("É um triângulo ESCALENO!");

		} else {

		System.out.println("É um triângulo ISÓSCELES!");

		}

		} else {

		System.out.println("As medidas informadas não são de um triângulo!");
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

