package listaExercicioONE;

import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double raio;
		double perimetro;
		double area;
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a dimensão da raio do retângulo");
		
		raio = scan.nextDouble();
		
		perimetro = Math.PI * raio * 2;
		area = Math.PI * Math.sqrt(raio);
		System.out.println("A área total do círculo é:" + area
							+ "\n O perímetro é: " + perimetro);
		
		

	}

}
