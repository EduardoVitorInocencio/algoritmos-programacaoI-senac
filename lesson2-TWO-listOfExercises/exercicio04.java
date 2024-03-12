package listaExercicioONE;

import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double base;
		double altura;
		double area;
		char unidade;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a dimensão da base do retângulo");
		
		base = scan.nextDouble();
		
		System.out.println("Informe a dimensão da base do retângulo");
		
		altura = scan.nextDouble();
		
		System.out.println("Qual a unidade de medida do retângulo?");
		
		unidade = scan.next().charAt(0);
		
		area = base * altura;
		
		System.out.println("A área total do retângulo é de " + area + " " + unidade + "².");
		
		

	}

}
