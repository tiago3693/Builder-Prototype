package pratica_03;

import java.util.Scanner;

public class Pratica_03_3 {

	public static void pratica() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("cotacao dolar em reais: ");
		float dolarC = scanner.nextFloat();
		System.out.println("valor em dolar: ");
		float dolarV = scanner.nextFloat();

		System.out.println("valor em reais: " + dolarV * dolarC);

	}

}
