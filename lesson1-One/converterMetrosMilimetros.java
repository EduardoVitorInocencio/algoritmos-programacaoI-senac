import javax.swing.JOptionPane;

public class converterMetrosMilimetros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double metros;
		double multiplicador;
		double resultado;
		
		//Caixa de mensagem
		JOptionPane.showMessageDialog(
				null, 
				"Hey fag! Let's to calculate!", 
				"Starting, mother fuckerrrrrr!", 
				JOptionPane.WARNING_MESSAGE
				);
		
		
		//Caixa de entrada
		metros = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor em metros a ser convertido!"));
		
		multiplicador = Double.parseDouble(JOptionPane.showInputDialog("Digite o multiplicador!"));
		
		resultado = metros * multiplicador;
		
		JOptionPane.showMessageDialog(null,resultado, "Resultado da operação!",JOptionPane.INFORMATION_MESSAGE);
		
	}

}
