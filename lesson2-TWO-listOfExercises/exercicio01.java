package listaExercicioONE;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double nota1;
		double nota2;
		double nota3;
		
		double peso1;
		double peso2;
		double peso3;
	
		double media;
		double totalPesos;
		
		/*------------------------------------------------------------------------------*/
		System.out.println("Digite a nota 1");
		
		Scanner scan = new Scanner(System.in);
		nota1 = scan.nextDouble();
		
		System.out.println("Digite o peso da nota 1");
		peso1 = scan.nextDouble();
		
		System.out.println("Digite nota 2");
		nota2 = scan.nextDouble();
		
		System.out.println("Digite o peso da nota 2");
		peso2 = scan.nextDouble();

		System.out.println("Digite a nota 3");
		nota3 = scan.nextDouble();

		System.out.println("Digite o peso da nota 2");
		peso3 = scan.nextDouble();
		
		/*------------------------------------------------------------------------------*/
		
		totalPesos = peso1 + peso2 + peso3;
		media = (nota1*peso1 + nota2*peso2 + nota3*peso3)/totalPesos;
		
		System.out.println("Sua média final é: " + media);;

		
	}

}
