package exfor;

import java.util.Locale;
import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int quantidade_dentro = 0, quantidade_fora = 0;

		int tamanho = sc.nextInt();

		for (int i = 0; i < tamanho; i++) {
			int numero = sc.nextInt();
			if (numero >= 10 && numero < 21) {
				quantidade_dentro = quantidade_dentro + 1;
			} else {
				quantidade_fora = quantidade_fora + 1;
			}
		}

		System.out.printf("%d in%n%d out", quantidade_dentro, quantidade_fora);

		sc.close();
	}

}
