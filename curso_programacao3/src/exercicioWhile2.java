import java.util.Scanner;

public class exercicioWhile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		int combust = sc.nextInt();
		
		while (combust != 4) {
			if (combust == 1) {
				 alcool += 1;
			
			} else if (combust == 2) {
				gasolina += 1;
			
			} else if (combust == 3) {
				diesel += 1;	
			
			} else {
				
			}
		combust = sc.nextInt();	
		}	
		
		System.out.println("Muito Obrigado!");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);

		sc.close();
		
	}

}
