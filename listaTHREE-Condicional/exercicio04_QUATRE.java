package listaExerciciosCondicionais02;

import java.util.Scanner;

public class exercicio04_QUATRE {

	public static void main(String[] args) {
		
		int num1, num2, num3, aux;
		String mensagem;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		num1 = scan.nextInt();
		System.out.println("Digite o segundo valor: ");
		num2 = scan.nextInt();
		System.out.println("Digite o terceiro valor: ");
		num3 = scan.nextInt();
		
		if (num1 > num2) {
			
			aux = num2;
			num2 = num1;
			num1 = aux;
			
		}
		
		if ((num3 > num1) && (num3 < num2)) {
			
			mensagem = "O terceiro valor informado está entre os números 1 e 2.";
			
		}else {
			
			mensagem = "O terceiro valor informado não está entre os números 1 e 2.";

		}
		
		System.out.println(mensagem);
		

	}

}
