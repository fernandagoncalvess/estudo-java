package ex4;

import java.util.Locale;
import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Integer hora_inicial = sc.nextInt();
		Integer hora_final = sc.nextInt();
		Integer horas;

		if (hora_inicial < hora_final) {
			horas = hora_final - hora_inicial;

		} else {
			horas = 24 - hora_inicial + hora_final;
		}
		System.out.printf("O JOGO DUROU %d HORA(S)", horas);

		sc.close();

	}

}
