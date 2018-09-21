package fundamentos;

import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String[] args) {
		
		/*
		 * Eu que fiz:
		 * 
		String altura = JOptionPane.showInputDialog("Digite sua altura: ");
		String peso = JOptionPane.showInputDialog("Digite seu peso: ");
		
		double alt = Double.parseDouble(altura);
		double pes = Double.parseDouble(peso);
		
		double imc = pes / (alt * alt);
		
		System.out.printf("Seu IMC é: %.2f ", imc);
		*/
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite seu peso: ");
		double peso = scanner.nextDouble();
		
		System.out.println("Digite sua altura: ");
		double altura = scanner.nextDouble();
		
		double imc = peso / ( altura * altura);
		
		System.out.printf("Seu imc é: %.2f ",  imc);
		
		scanner.close();
		
	}

}
