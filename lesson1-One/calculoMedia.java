import javax.swing.JOptionPane;

public class calculoMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variables creation
		double nota1;
		double nota2;
		double nota3;
		double nota4;
		
		double media;
		String nomeAluno;
		
		//Exibindo mensagem na tela do computador
		JOptionPane.showMessageDialog(
										null, 
										"Calculando a média final",
										"Média final",
										JOptionPane.INFORMATION_MESSAGE);
		
		nomeAluno = JOptionPane.showInputDialog(null, "Informe o seu nome");
		
		nota1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a nota 01.")); 
		
		nota2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a nota 02."));
		
		nota3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a nota 03."));
		
		nota4 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a nota 04."));
		
		media = (nota1 + nota2 + nota3 + nota4)/4d; //ou 4.0
		
		//Exibindo mensagem na tela do computador
				JOptionPane.showMessageDialog(
												null, 
												System.out.printf(
														"O aluno %s, obteve as seguintes notas: %d, %d, %d, %d. Sua média final é %.2f", 
														nomeAluno, nota1, nota2, nota3, nota4, media),
												"Média final",
												JOptionPane.INFORMATION_MESSAGE);
		
		
		
	}

}
