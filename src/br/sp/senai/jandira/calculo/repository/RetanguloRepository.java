package br.sp.senai.jandira.calculo.repository;
import java.util.Scanner;
import br.sp.senai.jandira.calculo.model.Retangulo;

public class RetanguloRepository {
	public void criarRetangulo()	{
		Scanner leitor = new Scanner(System.in);
		System.out.println();
		System.out.println("Criando um retângulo...");
	
		Retangulo retangulo = new Retangulo();
		
		System.out.print("Qual a base do retângulo?");
		retangulo.setBase(leitor.nextDouble());
		System.out.print("Qual a altura do retângulo?");
		retangulo.setAltura(leitor.nextDouble());
		retangulo.mostrarDados();
		
		leitor.close();
}
}
