package lista1For;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n1, n2, i;

		System.out.println("\nDigite o primeiro número: ");
		n1 = sc.nextInt();
		System.out.println("\nDigite o segundo número: ");
		n2 = sc.nextInt();

		if (n1 < n2) {

			for (i = n1; i <= n2; i++) {
				if (i % 3 == 0 && i % 5 == 0) {
					System.out.println(i + " é múltiplo de 3 e 5");
				}
			}
		} else {

			System.out.println("Intervalo inválido!");

		}
		sc.close();
	}
}
