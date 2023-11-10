package lista1For;

import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n,totalPar=0,totalImp=0;
		
		for(int i = 1; i<=10;  i ++) {
			System.out.println("\nDigite o " + i + "º número: ");
			n = sc.nextInt();
			if(n%2 == 0) {
				totalPar ++;
			} else {
				totalImp ++;
			}	
		}
		System.out.println("\nTotal de números pares: " + totalPar + "\nTotal de números ímpares: " + totalImp);
		sc.close();
	}
}
