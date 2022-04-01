package pratica_04;

import java.util.Scanner;

public class Pratica_04_1 {

	public static void pratica() {
		Scanner scan = new Scanner(System.in);

		System.out.println("nota1: ");
		int nota1 = scan.nextInt();

		System.out.println("nota2: ");
		int nota2 = scan.nextInt();

		mediaCalc(nota1, nota2);
	}

	public static void mediaCalc(int num1, int num2) {
		if ((num1 + num2) / 2 >= 7) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}
	}
}
