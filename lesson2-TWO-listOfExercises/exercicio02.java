package listaExercicioONE;

import javax.swing.JOptionPane;

public class exercicio2 {
	
	public static void main(String[] args) {
		
		String nome;
		String entrada;
		double salario;
		double valorAumento;
		double novoSalario;
		double percentualAumento;
		
		/*=====================================================================================*/
		
		nome = JOptionPane.showInputDialog("Digite o seu nome");
		entrada = JOptionPane.showInputDialog("Informe seu salário atual");
		salario = Double.parseDouble(entrada);
		percentualAumento = 0.25;
		
		/*=====================================================================================*/
		
		valorAumento = salario * percentualAumento;
		novoSalario = salario + valorAumento;
		
		/*=====================================================================================*/
		
		System.out.println("***** Demonstrativo de aumento salarial*****" + 
							"\n Nome do funcionário: " + nome + 
							"\n Salário atual: R$" + salario + 
							"\n Percentual de aumento: " + (percentualAumento * 100) + "%" + 
							"\n Valor do aumento: R$" + valorAumento + 
							"\n Novo salário: R$" + novoSalario);
		
	}

}
