package listaExercicioONE;

import java.util.Scanner;

public class exercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String texto;
		Scanner scan = new Scanner(System.in);
		
		texto ="";
		
		System.out.println("Informe o valor de saque:");
		int valorSaque = scan.nextInt();
		
		if (valorSaque >= 100) {
			
			int notas100 = valorSaque/100;
			valorSaque %= 100;
			texto = texto + "Notas de 100: " + notas100 + "\n";
			
		}
		
		if (valorSaque >=50) {
		
			int notas50 = valorSaque/100;
			valorSaque %= 50;
			texto = texto + "\n" + "Notas de 50: " + notas50 + "\n";
			
		}
		
		if (valorSaque >= 20) {
			
			int notas20 = valorSaque/20;
			valorSaque %= 20;
			texto = texto + "\n" + "Notas de 20: " + notas20 + "\n";
			
		}
		
		if (valorSaque >= 10) {
			
			int notas10 = valorSaque/10;
			valorSaque %= 10;
			texto = texto + "\n" + "Notas de 10: " + notas10 + "\n";
			
		}
		
		if (valorSaque >=5){
			int notas5 = valorSaque / 5;
			texto = texto + "\n" + "Notas de 5: " + notas5 + "\n";
		}

        System.out.println(texto);
        scan.close();
		
	}

}
