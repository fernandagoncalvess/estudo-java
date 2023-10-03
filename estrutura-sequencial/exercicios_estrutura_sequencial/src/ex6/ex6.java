package ex6;

import java.util.Locale;
import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;

		System.out.println("Digite 3 números em ponto flutuante: ");
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();

		triangulo = A * C/2.0;
		circulo = 3.14159 * C * C;
		trapezio = (A+B)/2.0*C;
		quadrado = B*B;
		retangulo = A*B;
		

		System.out.printf("TRIANGULO: %.3f %nCIRCULO: %.3f %nTRAPEZIO: %.3f %nQUADRADO: %.3f %nRETANGULO: %.3f",
				triangulo, circulo, trapezio, quadrado, retangulo);

		sc.close();

	}

}
