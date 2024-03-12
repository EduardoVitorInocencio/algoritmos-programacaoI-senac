package listaExercicioONE;

import java.util.Scanner;

public class exercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char valor1;
		char valor2;
		char standBy;
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe um primeiro valor");
		valor1 = scan.next().charAt(0);
		System.out.println("Informe um segundo valor");
		
		valor2 = scan.next().charAt(0);
		standBy = valor1;
		
		valor1 = valor2;
		
		valor2 = standBy;
		System.out.println("Primeiro valor De: " + valor2 + " Para: " + valor1 + " (novo valor)"
							+ "\n" + "Segundo valor De: " + valor1 + " Para: " + valor2 + " (novo valor)");
				
	}

}
