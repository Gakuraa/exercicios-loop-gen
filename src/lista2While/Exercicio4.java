package lista2While;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int totalColab=0,idade, idadeTotal = 0, idGen, func, totalBack = 0, totalMulherCis = 0, totalMulherTrans = 0,
				totalHomemCis = 0, totalhomemTrans = 0, totalNaoBina = 0, totalOutros = 0
				,mulherCisBack=0, mulherTransBack=0, homemCisMob=0,homemTransMob=0,naoBiMaior=0;
		char continuar = 'S';

		while (Character.toUpperCase(continuar) == 'S') {

			System.out.println("\nDigite a idade do colaborador(a): ");
			idade = sc.nextInt();
			System.out.println(
					"\nDigite o número que identifique o gênero: \n\n1-Mulher Cis\n2-Homem Cis\n3-Não Binário\n4-Mulher Trans\n5-Homem Trans\n6-Outros");
			idGen = sc.nextInt();
			System.out.println("\nDigite a função do colaborador(a): \n\n1-Backend\n2-Frontend\n3-Mobile\n4-FullStack");
			func = sc.nextInt();
			System.out.println("\nDeseja continuar adicionar novos(a) colaboradores? (S/N)");
			continuar = sc.next().charAt(0);
			idadeTotal += idade;
			totalColab++;
			if (func == 1) {
				totalBack++;
			} else if (idGen == 1 && func == 2) {
				mulherCisBack++;
			} else if (idGen == 4 && func == 2) {
				mulherTransBack++;
			} else if (idGen == 1 && func == 3 && idade>40) {
				homemCisMob++;
			} else if (idGen == 5 && func == 3 && idade>40) {
				homemTransMob++;
			} else if (idGen == 3 && idade>30 && func==4) {
				naoBiMaior++;
			}

			else if (idGen == 1) {
				totalMulherCis++;
			} else if (idGen == 4) {
				totalMulherTrans++;
			} else if (idGen == 2) {
				totalHomemCis++;
			} else if (idGen == 5) {
				totalhomemTrans++;
			} else if (idGen == 3) {
				totalNaoBina++;
			} else if (idGen == 6) {
				totalOutros++;
			}
		}

		System.out.println("\nO número total de pessoas desenvolvedoras BackEnd: " + totalBack);
		System.out.println("\nO número total de mulheres cis e trans desenvolvedoras frontend: " + (mulherCisBack + mulherTransBack));
		System.out.println("\nO número de homens cis e trans desenvolvedores mobile: " + (homemCisMob + homemTransMob));
		System.out.println("\nO número de não binários desenvolvedores FullStack menores de 30: " + naoBiMaior);
		System.out.println("\nO total de pessoas que responderam a pesquisa: " + (totalMulherCis + totalhomemTrans + totalMulherTrans + totalNaoBina + totalHomemCis + totalOutros));
		System.out.println("\nA média de idade das pessoas é: " + (idadeTotal/totalColab));
		sc.close();

	}
}
