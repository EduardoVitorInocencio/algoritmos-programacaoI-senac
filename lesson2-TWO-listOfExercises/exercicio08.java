package listaExercicioONE;

import java.util.Scanner;

public class exercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double pesoSacoRacao;
		double qtdeDiariaRacao;
		double qtdeGatos = 2;
		double diasMes = 30;
		double qtde5Dias;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a quantidade disponível de ração");
		
		pesoSacoRacao = scan.nextDouble();
		qtdeDiariaRacao = ((pesoSacoRacao * 1000)/ diasMes)/qtdeGatos;		
		qtde5Dias = pesoSacoRacao - ((qtdeDiariaRacao * 5)/1000);
		
		System.out.println("A quantidade de ração diária para cada gato é: " + qtde5Dias + "gramas."
							+ "\n" +"A quantidade restante após 5 dias é: "+ qtde5Dias);
		

	}

}
