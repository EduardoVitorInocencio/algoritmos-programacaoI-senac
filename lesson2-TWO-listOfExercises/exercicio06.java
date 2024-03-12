package listaExercicioONE;

public class exercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String funcao = "x² - 5x + 6";
		double delta;
		double a;
		double b;
		double c;
		double x1;
		double x2;
		
		/*=======================================================*/
		
		a = 1.;
		b = -5.;
		c = 6.;
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
