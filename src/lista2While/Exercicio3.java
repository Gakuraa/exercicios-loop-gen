package lista2While;

import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String[] args) {
		
		int idade, pessoas,contador=0, pessoasMenor=0,pessoasMaior=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nDigite o número de pessoas que deseja: ");
		pessoas = sc.nextInt();
		
		while(contador<pessoas) {
			System.out.println("\nDigite a idade: ");
			idade = sc.nextInt();
			if (idade<=21) {
				pessoasMenor++;
			} else if (idade >= 50){
				pessoasMaior++;
			}	
			contador++;
		}
		System.out.println("Total de pessoas menores de 21 anos: " + pessoasMenor);
		System.out.println("Total de pessoas maiores de 50 anos: " + pessoasMaior);
		sc.close();
	}
}
