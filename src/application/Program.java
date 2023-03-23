package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	// curso udemy vetores

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// variaveis
		int n;
		double media, soma;
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		n =sc.nextInt();
		
		// vetor
		double[] vect = new double[n];
		
		for (int i=0; i<n; i++ ) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();	
		}
		
		 soma = 0;
		for (int i=0; i<n; i++) {
			soma += vect[i];		
		}
		
		// soma
		media = soma / n;
		System.out.printf("Media do vetor: %.2f%n", + media);
		System.out.println("Elementos abaixo da média");
		
		for (int i=0; i<n; i++) {
			if (vect[i] < media ) {
				System.out.printf("%.1f%n", vect[i]);
			}			
		}
		sc.close();
	}
}
