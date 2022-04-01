package pratica_04;

import java.util.Scanner;

public class Pratica_04_11 {

	public static void pratica() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("numero: ");
		int numero = scanner.nextInt();
		
		for(int i=0; i <= 10; i++) {
			System.out.println(numero + " x " + i + " = " + numero*i);
		}

	}

}
