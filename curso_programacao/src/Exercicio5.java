// Importações 

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
	//Chamadas
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
	//Definições
		
		int codPeca1, codPeca2, numPeca1, numPeca2;
		double valPeca1, valPeca2, total;
	
	//Entradas
		
		System.out.println("Código da primeira peça: ");
		codPeca1 = sc.nextInt();
		System.out.println("Número de primeiras peças: ");
		numPeca1 = sc.nextInt();
		System.out.println("Valor unitário de cada primeira peça: ");
		valPeca1 = sc.nextDouble();
		System.out.println("Código da segunda peça: ");
		codPeca2 = sc.nextInt();
		System.out.println("Número de segundas peças: ");
		numPeca2 = sc.nextInt();
		System.out.println("Valor unitário de cada segunda peça: ");
		valPeca2 = sc.nextDouble();
	
	//Processamento
		
		total = (numPeca1 * valPeca1) + (numPeca2 * valPeca2);
	
	//Saída 
		
		System.out.printf("Valor Total a Pagar: R$%.2f%n",total);
		System.out.println("Código das peças: " + codPeca1 + "," + codPeca2);
	sc.close();
	}

}
