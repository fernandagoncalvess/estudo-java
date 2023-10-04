package exfor;

import java.util.Locale;
import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int conta = 1;
		int n = sc.nextInt();

		for (int i = n; i >= 1; i--) {
			conta = conta * i;
		}
		System.out.println(conta);

		sc.close();
	}

}
