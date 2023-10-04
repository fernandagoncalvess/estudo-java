package exwhile;

import java.util.Locale;
import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int alcool = 0, gasolina = 0, diesel = 0;

		System.out.printf("Informe o código do tipo de combustível %n1 - Ácool%n2 - Gasolina%n3 - Diesel%n4 - Fim%n");
		int codigo = sc.nextInt();

		while (codigo != 4) {

			if (codigo <= 0 || codigo > 4) {
				System.out.printf("Código inválido. %nPor favor digite um código válido: %n");
			} else if (codigo == 1) {
				alcool = alcool + 1;

			} else if (codigo == 2) {
				gasolina = gasolina + 1;
			} else if (codigo == 3) {
				diesel = diesel + 1;
			}
			codigo = sc.nextInt();
		}
		System.out.printf("MUITO OBRIGADO%nAcool: %d%nGasolina: %d%nDiesel: %d", alcool, gasolina, diesel);
		sc.close();
	}
}
