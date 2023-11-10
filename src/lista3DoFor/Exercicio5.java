package lista3DoFor;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num, numTotal = 0;

		do {
			System.out.println("Digite um número: ");
			num = sc.nextInt();
			if (num > 0) {
				numTotal += num;
			}
		} while (num != 0);
		System.out.println("A soma dos números positivos é: " + numTotal);
		sc.close();
	}
}
