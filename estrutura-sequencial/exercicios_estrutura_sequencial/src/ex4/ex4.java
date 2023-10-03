package ex4;

import java.util.Locale;
import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite as informações do funcionário: ");
		Integer numero = sc.nextInt();
		Integer horas_trabalhadas = sc.nextInt();
		Double valor_hora = sc.nextDouble();

		Double salario = valor_hora * horas_trabalhadas;

		System.out.println("NUMBER = " + numero);
		System.out.printf("SALARY = U$ %.2f", salario);

		sc.close();
	}
}
