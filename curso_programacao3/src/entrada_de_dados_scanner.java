import java.util.Locale;
import java.util.Scanner;

public class entrada_de_dados_scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String x;
		int y;
		double z;
		
		x = sc.next();
		System.out.println("Você digitou: " + x);
		
		y = sc.nextInt();
		System.out.println("Você digitou: " + y);
				
		z = sc.nextDouble();
		System.out.println("Você digitou: " + z);
		
		sc.close();
	}

}
