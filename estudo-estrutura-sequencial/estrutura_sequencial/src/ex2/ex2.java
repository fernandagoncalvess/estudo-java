package ex2;

import java.util.Locale;
import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor do raio: ");
		Double raio = sc.nextDouble();
		
		
		double area = 3.14159 * (Math.pow(raio, 2));

		System.out.printf("Area = %.4f%n", area);

		sc.close();

	}

}
