import java.util.Scanner;

public class Exercicio1_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		int y;
		int A;

		System.out.println("Digite o primeiro valor: ");
		x = sc.nextInt();
		System.out.println("Digite o segundo valor: ");
		y = sc.nextInt();
		A = x + y;
		System.out.println("Soma: " + A);
		sc.close();
	}

}
