package exfor;

import java.util.Locale;
import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int numero = sc.nextInt();

		for (int i = 0; i < numero; i++) {
			double a = sc.nextDouble();
			double b = sc.nextDouble();

			if (b == 0)
				System.out.println("Divisao impossivel");
			else {
				double divisao = (double) a % b;
				System.out.printf("%n%.1f%n", divisao);
			}
		}
		sc.close();
	}

}
