import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double raio;
		double area;
		double pi = 3.14159;

		System.out.println("Informe o raio do circulo: ");
		raio = sc.nextFloat();
		area = pi * (Math.pow(raio, 2));
		sc.close();
		System.out.println("A = " + area);

	}

}
