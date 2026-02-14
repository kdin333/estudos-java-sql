import java.util.Locale;
import java.util.Scanner;

public class blocoDeNotas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three numbers:");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if (a > b && a > c) {
			System.out.println("Higher = "+ a);
		
		} else if (b > c) {
			System.out.println("Higher = "+ b);
		
		} else {
			System.out.println("Higher = "+ c);
		}
					
		sc.close();
	}

}
