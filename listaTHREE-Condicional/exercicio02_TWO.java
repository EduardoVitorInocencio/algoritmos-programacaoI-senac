package listaExerciciosCondicionais02;

import java.util.Scanner;

public class exercicio02_TWO {

	public static void main(String[] args) {
		
		int num1, num2, num3;
		String mensagem = null;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o primeiro valor");
		num1 = scan.nextInt();
		
		System.out.println("Informe o segundo valor");
		num2 = scan.nextInt();
		
		System.out.println("Informe o terceiro valor");
		num3 = scan.nextInt();
		
		
		if ((num1 > num2) && (num1 > num3)) {
			
			mensagem = "O maior valor é o número 01, cujo valor é: " + num1;
			
		}else if ((num2 > num1) && (num2 > num3)) {
			
			mensagem = "O maior valor é o número 02, cujo valor é: " + num2;
			
		}else if ((num3 > num1) && (num3 > num2)) {
			
			mensagem = "O maior valor é o número 03, cujo valor é: " + num3;
			
		}
		
		System.out.println(mensagem);
		
		
	}

}
