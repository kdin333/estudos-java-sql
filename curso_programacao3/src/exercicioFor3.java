import java.util.Locale;
import java.util.Scanner;

public class exercicioFor3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if (b != 0) {
			Double divisao = (double)  a / b;
			System.out.println(divisao);
		
		} 	else {
			System.out.println("divisão impossível :/");
		}
			
			
	}
		
		
		sc.close();
	}

}

