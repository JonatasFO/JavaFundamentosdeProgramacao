package fundamentos;

import java.util.Scanner;

public class Exercicio4 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		double valor = scanner.nextDouble();
		
		double quadrado = Math.pow(valor, 2);
		double cubo = Math.pow(valor, 3);
		
		System.out.println("\nValor digitado ao quadrado �: " + quadrado + "\n\nValor digitado ao cubo �: " + cubo);
		
		
		/*
		 * Outra forma de fazer:
		double quadrado = valor * valor;
		double cubo = valor * valor * valor;
		
		System.out.println("Valor digitado ao quadrado: " + quadrado);
		System.out.println("Valor digitado ao cubo: " + cubo);
		*/
		
		/*
		 * Outra forma de fazer:
		System.out.println("Valor digitado ao quadrado: " + valor * valor);
		System.out.println("Valor digitado ao cubo: " + valor * valor * valor);
		*/
		
		scanner.close();
	}

}
