package listaExercicioONE;

import javax.swing.JOptionPane;

public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome;
		String entrada;
		double salarioBruto;
		double salarioLiquido;
		double valorGratificacao;
		double percentualDesconto;
		double valorImposto;
		
		/*=====================================================================================*/
		
		nome = JOptionPane.showInputDialog("Digite o seu nome");
		entrada = JOptionPane.showInputDialog("Informe seu salário atual");
		salarioBruto = Double.parseDouble(entrada);
		valorGratificacao = salarioBruto * 0.1;
		percentualDesconto = 0.15;
		
		/*=====================================================================================*/
		
		valorImposto = (salarioBruto + valorGratificacao) * 0.15;
		salarioLiquido = (salarioBruto + valorGratificacao) - valorImposto;
		
		/*=====================================================================================*/
		
		System.out.println("***** Demonstrativo de pagamento salarial*****" + 
							"\n Nome do funcionário: " + nome + 
							"\n Salário Bruto: R$" + salarioBruto + 
							"\n Valor da Gratificação (10%): R$" + valorGratificacao + 
							"\n Valor do Desconto (15%): " + valorImposto + 
							"\n Salário Líquido: R$" + salarioLiquido);

	}

}
