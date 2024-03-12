package listaExercicioONE;

import java.util.Scanner;

public class exercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String funcao = "ax² + bx + c";
		double delta;
		double a;
		double b;
		double c;
		double x1;
		double x2;
		
		/*=======================================================*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("***** Função do segundo grau ******"
							+ "\n" + "Informe os valores de a, b e para" 
							+ "\n" + "obter os valores de delta e das raízes reais."
							+"\n" + "\n" + "\n" );
		
		System.out.println("Digite o valor de a");
		a = scan.nextDouble();
		
		System.out.println("Digite o valor de b");
		b = scan.nextDouble();
		
		System.out.println("Digite o valor de c");
		c = scan.nextDouble();
		
		delta = Math.pow(b,2) + 4 * 1 * 6;
		
		x1 = ((b * -1) + Math.sqrt(delta))/2 * a;
		x2 = ((b * -1) - Math.sqrt(delta))/2 * a;
		
		/*=======================================================*/
		
		System.out.println("f(x) = " + funcao + 
							"\n" + "delta = b² + 4ac" + 
							"\n" + "delta = " + delta +
							"\n" +
							"\n" +
							"**** Raizes da função ****" + 
							"\n" +
							"\n" + "x1 = (-b + delta ^1/2) / 2a" + 
							"\n" + "x2 = (-b - delta ^1/2) / 2a" +
							"\n" +
							"\n" +"x1 = " + x1 + 
							"\n" +"x2 = " + x2);
	}

}
