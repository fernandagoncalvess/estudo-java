package exwhile;

import java.util.Locale;
import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int x, y;

		do {
			x = sc.nextInt();
			y = sc.nextInt();

			if (x > 0 && y > 0) {
				System.out.println("primeiro");
			} else if (y < 0 && x > 0) {
				System.out.println("quarto");
			} else if (x < 0 && y > 0) {
				System.out.println("segundo");
			} else if (x < 0 && y < 0) {
				System.out.println("terceiro");
			}

		} while (x != 0 && y != 0);

		System.out.println("fimm");

		sc.close();
	}

}
