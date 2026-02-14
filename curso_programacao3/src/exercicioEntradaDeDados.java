import java.util.Locale;
import java.util.Scanner;

public class exercicioEntradaDeDados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo1, codigo2, quant1, quant2;
		double preco1, preco2, total;
		
		codigo1 = sc.nextInt();
		quant1 = sc.nextInt();
		preco1  = sc.nextDouble();
		
		codigo2 = sc.nextInt();
		quant2 = sc.nextInt();
		preco2  = sc.nextDouble();
		
		total = quant1 * preco1 + quant2 * preco2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
		
		sc.close();
	}

}
