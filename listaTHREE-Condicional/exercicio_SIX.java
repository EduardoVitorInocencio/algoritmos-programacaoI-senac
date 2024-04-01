package listaExerciciosCondicionais02;

import java.util.Scanner;

public class exercicio_SIX {

	public static void main(String[] args) {
		
		double salario, bonificacao, auxEscola;
		
		auxEscola = 0;
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Informe seu salário.");
		
		salario = scan.nextDouble();
		
		if (salario <= 2000.) {
			
			bonificacao = 0.1;
			
		}else if (salario <= 3000) {
			
			bonificacao = 0.08;
			
		}else {
			
			bonificacao = 0.05;
		}
		
		
		if (salario <= 2500) {
			
			auxEscola = 350.;
			
		}else if (salario > 2500.){
			
			auxEscola = 300.;
		}
		
		salario = salario * (1 + bonificacao) + auxEscola;
		
		System.out.println(salario);
		

	}

}
