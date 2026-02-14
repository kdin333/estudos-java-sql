import java.util.Scanner;

public class estruturaCondicional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int hora;

		System.out.println("Que horas são?");

		hora = sc.nextInt();

		if (hora < 12) {
			System.out.println("bom dia");
		} else {
			if (hora <= 18) {
				System.out.println("boa tarde");
			} else {
				System.out.println("boa noite");
			}
		}
		sc.close();
	}

}
