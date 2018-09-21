package fundamentos;

import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Farenheit: ");
		double farenheit = scanner.nextDouble();
		
		// Fórmula para conver °F °C >>> °C = ( °F - 32 ) / 1.8;
		double celsius = (farenheit - 32) / 1.8;
		
		System.out.println("Valor em Celsius: " + celsius);
	}

}