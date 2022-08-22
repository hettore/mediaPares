package mediaPares;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas posições o vetor terá? ");
		int n = sc.nextInt();
		
		int vetor[] = new int[n];
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextInt();
			
		}
		int soma = 0;
		int pares = 0;
		double media = 0;
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] % 2 == 0) {
				soma = soma + vetor[i];
				pares++;
			} 
		}
		
		if (pares == 0) {
		System.out.println("Nenhum número par.");
		}
		else {
			media = (double)soma / pares;
			
			System.out.printf("Média dos pares = %.1f\n", media);
		}
		sc.close();
	}

}
