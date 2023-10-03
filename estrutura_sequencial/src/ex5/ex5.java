package ex5;

import java.util.Locale;
import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite as informações da compra: ");
		
		
		Integer codigo1 = sc.nextInt();
		Integer quantidade1 = sc.nextInt();
		Double valor_unitario1 = sc.nextDouble();

		Integer codigo2 = sc.nextInt();
		Integer quantidade2 = sc.nextInt();
		Double valor_unitario2 = sc.nextDouble();
		
		Double preco_pago = quantidade1 * valor_unitario1 + quantidade2 * valor_unitario2;
		
		System.out.printf("VALOR A PAGAR = U$ %.2f", preco_pago);
		sc.close();
		

	}

}
