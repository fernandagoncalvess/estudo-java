package exfor;

import java.util.Locale;
import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		
		for(int i=1; i<numero+1 ;i++) {
			if(!(i%2 ==0)) {
				System.out.println(i);
			}
		}
		
		sc.close();
	}

}
