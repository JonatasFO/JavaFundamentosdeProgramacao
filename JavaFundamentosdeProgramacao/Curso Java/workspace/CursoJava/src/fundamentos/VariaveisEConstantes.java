package fundamentos;

public class VariaveisEConstantes {

	public static void main(String[] args) {


		double raio = 4.5;
		final double PI = 3.1416;
		double area = PI * raio * raio;
		
		System.out.println("�rea � " + area + " m�");

		System.out.printf("�rea � %f m�\n", area);
		System.out.printf("�rea � %.2f m� ", area);
	}

}
