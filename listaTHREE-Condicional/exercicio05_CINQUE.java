package listaExerciciosCondicionais02;

import java.util.Scanner;

public class exercicio05_CINQUE {

	public static void main(String[] args) {
		
		
		char genre;
		double weight, height, idealWeight, factor;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual o seu gênero? [M] Masculino, [F] Feminino.");
		genre = scan.next().toLowerCase().charAt(0);
		
		System.out.println("Qual é o seu peso em KG?");
		weight = scan.nextDouble();
		
		System.out.println("Qual sua altura em metros?");
		height = scan.nextDouble();
		
		if (genre == 'm') {
			
			factor = 0.75;			
			
		}else {
			
			factor = 0.67;
			
		}
		
		
		idealWeight = 52 + (factor * (height - 152.4));
		S
		System.out.println(idealWeight);

	}

}
