package exfor;

import java.util.Locale;
import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 1; i < n + 1; i++) {
			if (n % i == 0) {
				System.out.println(i);
			}
		}
		sc.close();
	}

}
