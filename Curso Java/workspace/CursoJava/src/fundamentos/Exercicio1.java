package fundamentos;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Celsius: ");
		double celsius = scanner.nextDouble();
		
		//F�rmula para converter �C em �F >>>> �F = (�C * 1.8) + 32
		double farenheit = ( celsius * 1.8 ) + 32;
		
		System.out.println("Valor em Farenheit: " + farenheit);
	}

}