import java.util.Scanner;
import java.util.Locale;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		int funcionario;
		int horas;
		double valor;
		double salario;

		System.out.println("Número do funcionario: ");
		funcionario = sc.nextInt();
		System.out.println("Horas trabalhadas: ");
		horas = sc.nextInt();
		System.out.println("Valor por hora: ");
		valor = sc.nextDouble();

		System.out.println("Funcionario: " + funcionario);
		salario = valor * horas;
		System.out.printf("Salário: U$%.2f",salario);

		sc.close();
	}

}
