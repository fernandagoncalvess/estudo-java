package ex3;

import java.util.Scanner;

public class ex3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite os 4 valores: ");
		Integer A = sc.nextInt();
		Integer B = sc.nextInt();
		Integer C = sc.nextInt();
		Integer D = sc.nextInt();

		Integer diferenca = A*B - C*D;

		System.out.println("DIFERENÇA = "+ diferenca);

		sc.close();

	}
}
