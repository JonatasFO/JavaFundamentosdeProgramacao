package fundamentos;

import java.util.Scanner;

public class Exercicio5 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digita o valor da base do tri�ngulo: ");
		double base = scanner.nextDouble();
		
		System.out.println("Digita o valor da altura do tri�ngulo: ");
		double altura = scanner.nextDouble();
		
		double area = (base * altura) / 2;
		
		System.out.println("A �rea do tri�ngulo �: " + area);
				
		scanner.close();

	}

}
