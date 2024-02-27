import javax.swing.JOptionPane;

public class conversionCelsiusKevin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Variables creation
		double kelvin;
		float fator = 273.15F;
		
		//Inserção da variável Celsius
		double celsius = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a temperatura em graus celsius"));
		
		//Convertendo
		
		kelvin = celsius + fator;
		
		//Exibindo o resultado no console
		
		System.out.println("°C: " + celsius + "/ K: " + kelvin);
		
		JOptionPane.showMessageDialog(null, celsius +  "°C equivale a " + kelvin + "K.");
	}

}
