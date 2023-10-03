package ex3;

import java.util.Locale;
import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Integer A = sc.nextInt();
		Integer B = sc.nextInt();

		if (A % B == 0 || B % A == 0)
			System.out.println("Sao multiplos");
		else
			System.out.println("Não são multiplos");

		sc.close();

	}

}
