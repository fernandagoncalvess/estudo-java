package ex5;

import java.util.Locale;
import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Integer codigo = sc.nextInt();
		Integer quantidade = sc.nextInt();
		Double total = null;

		if (codigo == 1) {

			total = quantidade * 4.00;
		} else if (codigo == 2) {
			total = quantidade * 4.50;
		} else if (codigo == 3) {
			total = quantidade * 5.00;
		} else if (codigo == 4) {
			total = quantidade * 2.00;
		} else if (codigo == 5) {
			total = quantidade * 1.00;
		} else {
			System.out.println("esse código não existe");
		}

		System.out.printf("TOTAL: R$ %.2f ", total);

		sc.close();

	}

}
