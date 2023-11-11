//Importações

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
	//Chamadas
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
	//Definições
		
		float A, B, C;
		double pi = 3.14159;
		double areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;
		
		
	//Entradas
		
		System.out.println("Valor A: ");
			A = sc.nextFloat();
		System.out.println("Valor B: ");
			B = sc.nextFloat();
		System.out.println("Valor C: ");
			C = sc.nextFloat();
			
	//Processamento
		
		areaTriangulo = (A * C) / 2;
		areaCirculo = pi * (Math.pow(C, 2));
		areaTrapezio = (A + B) * C / 2;
		areaQuadrado = Math.pow(B, 2);
		areaRetangulo = A * B;
		
	//Saída
		
		System.out.printf("Area Triangulo: %.3f%n", areaTriangulo);
		System.out.printf("Area Circulo: %.3f%n", areaCirculo);
		System.out.printf("Area Trapezio: %.3f%n", areaTrapezio);
		System.out.printf("Area Quadrado: %.3f%n", areaQuadrado);
		System.out.printf("Area Retangulo: %.3f%n", areaRetangulo);
	sc.close();;
	}
}
