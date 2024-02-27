import java.util.Scanner;

public class conversaoMetroCentimetro {
	public static void main(String[] args) {
		
		//Declaração de variáveis
		
		double metros;
		double resultado;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira o valor em metros");
		metros = input.nextDouble();
		resultado = metros * 100;
		
		System.out.println(resultado);
		
	}

}
