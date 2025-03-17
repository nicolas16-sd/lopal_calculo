package br.sp.senai.jandira.calculo;

import br.sp.senai.jandira.calculo.model.Retangulo;
import br.sp.senai.jandira.calculo.model.Quadrado;
import br.sp.senai.jandira.calculo.model.Triangulo;
import br.sp.senai.jandira.calculo.model.Circunferencia;
import br.sp.senai.jandira.calculo.model.Trapezio;

public class calculoApp {
	
	public static void main(String []args) {
		// TODO Auto-generated method stub
		
		Retangulo r1 = new Retangulo();
		System.out.println(r1);
		
		r1.setAltura(5);
		r1.setBase(10);
		r1.calcularPerimetro();
		r1.mostrarDados();
		
		Quadrado q1 = new Quadrado();
		System.out.println(q1);
		
		q1.setLado1(5);
		q1.setLado2(10);
		q1.calcularPerimetro();
		q1.mostrarDados();
		
		Triangulo t1 = new Triangulo();
		t1.setAltura(10);
		t1.setBase(12);
		t1.mostrarDados();
		
		Trapezio t2 = new Trapezio();
		t2.setBaseMaior(22);
		t2.setBaseMenor(15);
		t2.setAltura(12);
		t2.mostrarDados();
		
		Circunferencia c1 = new Circunferencia();
		c1.setRaio(8);
		c1.mostrarDados();
	}
}
