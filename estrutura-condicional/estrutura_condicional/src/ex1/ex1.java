package ex1;

import java.util.Locale;
import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Integer numero = sc.nextInt();

		if (numero < 0)
			System.out.println("NEGATIVO");
		else
			System.out.println("NAO NEGATIVO");

		sc.close();

	}

}
