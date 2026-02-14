import java.util.Locale;
import java.util.Scanner;

public class exercicoEstruturaCondicional {

	public static void main(String[] args) { // exercicio
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US); // força o uso do ponto como separador decimal
		Locale.setDefault(Locale.US);
		
		
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		if (x == 0.0 && y == 0.0) {
			System.out.println("Origem");
			
		} else if( x == 0.0) {
			System.out.println("Eixo Y");
			
		} else if( y == 0.0) {
				System.out.println("Eixo X");
		
		} else if (x > 0.0 && y > 0.0){
			System.out.println("Q1");
			
		} else if (x < 0.0 && y > 0.0){
			System.out.println("Q2");
			
		} else if (x < 0.0 && y < 0.0){
			System.out.println("Q3");
			
		} else {
			System.out.println("Q4");
		}
		
		
		sc.close();
	}

}
