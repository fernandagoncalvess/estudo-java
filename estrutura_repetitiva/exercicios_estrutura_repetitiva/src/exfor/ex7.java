package exfor;

import java.util.Locale;
import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 1; i < n + 1; i++) {

			double quadrado = Math.pow(i, 2);
			double cubo = Math.pow(i, 3);

			System.out.printf("%d %.0f %.0f%n", i, quadrado, cubo);
		}

		sc.close();
	}

}
