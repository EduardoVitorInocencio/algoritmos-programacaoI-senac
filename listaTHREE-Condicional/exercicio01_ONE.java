package listaExerciciosCondicionais02;

import java.util.Scanner;

public class exercicio01_ONE {

	public static void main(String[] args) {
		
		int num1, num2, aux;
		String mensagem;
		
		Scanner scan  = new Scanner(System.in);
		
		System.out.println("INFORME O PRIMEIRO VALOR: ");
		num1 = scan.nextInt();
		System.out.println("INFORME O SEGUNDO VALOR: ");
		num2 = scan.nextInt();
		
		if (num1 > num2) {
			
			mensagem = "O número 01 (" + num1 + ") é maior que o número 2 (" + num2 + ").";
			
		}else if (num1 < num2) {
			
			mensagem = "O número 02 (" + num2 + ") é maior que o número 1 (" + num1 + ").";
			
		}else {
			
			mensagem = "Os número 01 (" + num1 + ") número 2 (" + num2 + ") são iguais!";
		}
		
		
		System.out.println(mensagem);
		
		
	}

}
