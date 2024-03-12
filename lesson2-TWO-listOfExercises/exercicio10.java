package listaExercicioONE;

import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double cateto1;
		double cateto2;
		double hipotenusa;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a dimensão do Cateto 1");
		cateto1 = scan.nextDouble();
		System.out.println("Informe a dimensão do Cateto 2");
		cateto2 = scan.nextDouble();
		
		hipotenusa = Math.sqrt(Math.pow(cateto1,2) + Math.pow(cateto2, 2));
	
		System.out.println("*********** Teorema de Pitágoras h = (Cat1 ^ 2 + Cat2 ^2)^1/2 *************"
							+ "\n" + "Cateto 1 = " + cateto1
							+ "\n" + "Cateto 2 = " + cateto2
							+ "\n"
							+ "\n"
							+ "\n" + "Hipotenusa = " + hipotenusa);

	}

}
