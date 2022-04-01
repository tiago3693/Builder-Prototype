package pratica_04;

import java.util.Scanner;

public class Pratica_04_9 {

	public static void pratica() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("cateto1: ");
		float cateto1 = scanner.nextFloat();
		
		System.out.println("cateto2: ");
		float cateto2 = scanner.nextFloat();
		
		System.out.println("hipotenusa: " + (Math.sqrt((Math.pow(cateto1, 2) + Math.pow(cateto2, 2)))));

	}

}
