package ex1;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Integer numero1 = sc.nextInt();
		Integer numero2 = sc.nextInt();

		Integer soma = numero1 + numero2;

		System.out.println("SOMA = " + soma);

		sc.close();

	}

}
