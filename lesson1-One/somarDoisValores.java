import java.util.Scanner;

public class somarDoisValores {
	public static void main(String[] args) {
		
		//declaração de variáveis
		
		double num1, num2, soma;
		
		Scanner leia = new Scanner(System.in); //Entrada de dados
		
		//solicitando os números ao usuário
		System.out.println("Informe o primeiro número");
		num1 = leia.nextDouble(); //Leia o número 1
		System.out.println("Informe o segundo número");
		num2 = leia.nextDouble(); //Leia o número 2
		
		soma = num1 + num2;
		
		System.out.println(soma);
	}
	

}


