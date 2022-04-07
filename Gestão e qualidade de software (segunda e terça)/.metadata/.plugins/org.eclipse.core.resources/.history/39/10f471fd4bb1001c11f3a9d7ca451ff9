package teste;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {

		/*
		 * Scanner scan = new Scanner(System.in);
		 * 
		 * System.out.println("nota1: "); int nota1 = scan.nextInt();
		 * 
		 * System.out.println("nota2: "); int nota2 = scan.nextInt();
		 * 
		 * mediaCalc(nota1, nota2);
		 */

		/*
		 * Scanner scan = new Scanner(System.in);
		 * 
		 * System.out.println("lado1: "); int lado1 = scan.nextInt();
		 * System.out.println("lado2: "); int lado2 = scan.nextInt();
		 * System.out.println("lado3: "); int lado3 = scan.nextInt();
		 * 
		 * tipoTrian(lado1, lado2, lado3);
		 */

		Scanner scan = new Scanner(System.in);
		int num1 = 0, num2 = 0, num3 = 0;
		do {
			System.out.println("nota1 de 0 a 10: ");
			num1 = scan.nextInt();
			System.out.println("nota2 de 0 a 10: ");
			num2 = scan.nextInt();
			System.out.println("nota3 de 0 a 10: ");
			num3 = scan.nextInt();
		} while (num1 < 0 || num1 > 10 || num2 < 0 || num2 > 10 || num3 < 0 || num3 > 10);
		
		mediaCalc(num1, num2, num3);
	}

	public static void mediaCalc(int num1, int num2) {
		if ((num1 + num2) / 2 >= 7) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}
	}

	public static void tipoTrian(int num1, int num2, int num3) {
		if (num1 == num2 || num1 == num3 || num2 == num3) {
			if (num1 == num2 && num2 == num3) {
				System.out.println("Equilátero");
			} else {
				System.out.println("Isóceles");
			}
		} else {
			System.out.println("Escaleno");
		}
	}

	public static void mediaCalc(int num1, int num2, int num3) {
		float media = (num1 + num2 + num3) / 3;

		if (media >= 0 && media < 3) {
			System.out.println("Reprovado");
		} else if (media >= 3 && media < 7) {
			System.out.println("EXAME");
		} else if (media >= 7 && media <= 10) {
			System.out.println("APROVADO");
		}
	}
}
