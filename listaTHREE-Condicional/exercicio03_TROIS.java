package listaExerciciosCondicionais02;

import java.util.Scanner;

public class exercicio03_TROIS {

	public static void main(String[] args) {
		
		int score1, score2, score3, score4, finalAverage;
		String name;
		String finalResult;
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("What's your name?");
		name = scan.next();
		System.out.println("Plese, enter with your score 1");
		score1 = scan.nextInt();
		System.out.println("Plese, enter with your score 2");
		score2 = scan.nextInt();
		System.out.println("Plese, enter with your score 3");
		score3 = scan.nextInt();
		System.out.println("Plese, enter with your score 4");
		score4 = scan.nextInt();
		
		finalAverage= (score1 + score2 + score3 + score4) / 4;
		
		
		if (finalAverage <= 20) {
			
			finalResult = "\u001B[31m❌Péssimo" + "\u001B[0m";
			
		}else if (finalAverage <=40) {
			
			finalResult = "\u001B[31m❌Ruim" + "\u001B[0m";
		
		}else if (finalAverage <= 60) {
			
			finalResult = "\u001B[33m⚠️Regular" + "\u001B[0m";
			
		}else if (finalAverage <= 80) {
			
			finalResult = "\u001B[34m🫡Bom" + "\u001B[0m";
			
		}else {
			
			finalResult = "\u001B[32m✔️Ótimo" + "\u001B[0m";
			
		}

		
		System.out.printf("\t********************	%n");
		System.out.printf("\t   FINAL GRADE IN \n\t   SCIENCE COMPUTER \n");
		
		System.out.printf("\t*********************	%n");
		System.out.printf("\t | %8s | %-10s |%n", "TEST Nº", "GRADE");
		System.out.printf("\t --------------------------	%n");
		
		System.out.printf("\t | %8s | %-10s |	%n", "n1", score1);
		System.out.printf("\t --------------------------	%n");
		
		System.out.printf("\t | %8s | %-10s |	%n", "n2", score2);
		System.out.printf("\t --------------------------	%n");
		
		System.out.printf("\t | %8s | %-10s |	%n", "n3", score3);
		System.out.printf("\t --------------------------	%n");
		
		System.out.printf("\t | %8s | %-10s |	%n", "n4", score4);
		System.out.printf("\t --------------------------	%n");
		
		System.out.printf("\t | %8s | %-10s |	%n", "Average", finalAverage);
		System.out.printf("\t --------------------------	%n");
		
		System.out.printf("\t | %8s | %-4s |	%n", "Final Result", finalResult);
		System.out.printf("\t --------------------------	%n");
		
		System.out.printf("\t | %1s :| %-4s |", "Student", name);
		
		
		
		

	}

}
