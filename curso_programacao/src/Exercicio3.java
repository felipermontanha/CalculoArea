import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A, B, C, D;
		int diferenca;

		System.out.println("Digite A: ");
		A = sc.nextInt();
		System.out.println("Digite B: ");
		B = sc.nextInt();
		System.out.println("Digite C: ");
		C = sc.nextInt();
		System.out.println("Digite D: ");
		D = sc.nextInt();
		diferenca = A * B - C * D;
		System.out.println("Diferença : " + diferenca);
		sc.close();

	}

}
