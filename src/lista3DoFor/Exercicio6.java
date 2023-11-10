package lista3DoFor;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num, contador = 0, numTotal = 0;
		float media = 0;

		do {
			System.out.println("Digite um número (digite 0 para encerrar): ");
			num = sc.nextInt();
			if (num % 3 == 0 && num != 0) {
				numTotal += num;
				contador++;
			}
		} while (num != 0);

		if (contador != 0) {
			media = (float) numTotal / contador;
			System.out.printf("A média de todos os números múltiplos de 3 é: %.1f%n", media);
		} else {
			System.out.println("Não foi possível calcular a média, pois nenhum número múltiplo de 3 foi inserido.");
		}
		sc.close();
	}
}
