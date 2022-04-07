package pratica_03;

import java.util.Scanner;

public class Pratica_03_5 {

	public static void pratica() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("diagonal maior: ");
		float diagonalMa = scanner.nextFloat();
		
		System.out.println("diagonal menor: ");
		float diagonalMe = scanner.nextFloat();
		
		System.out.println("area losango: " + ((diagonalMa * diagonalMe)/2));
	}

}
