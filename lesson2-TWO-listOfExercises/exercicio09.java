package listaExercicioONE;

import java.util.Scanner;

public class exercicio09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double pes;
		double polegadas;
		double jardas;
		double milhas;
		
		/* ========================================================= */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("************ Conversão de Unidades *************"
							+ "\n" + "Informe o valor em pés para converter:"
							+ "\n" + "\n");
		
		pes = scan.nextDouble();
		
		/* ========================================================= */

		polegadas = pes * 12;
		jardas = pes/3;
		milhas = (pes / 3)/ 1760;
		
		/* ========================================================= */

		System.out.println("***************** Resultados *********************"
							+ "\n" + "pés: " + pes + "ft"
							+ "\n" + "polegadas: " + polegadas +"inch"
							+ "\n" + "jardas: " + jardas + "jardas"
							+ "\n" + "milhas: " + milhas + "miles");
		
		
	}

	
}
