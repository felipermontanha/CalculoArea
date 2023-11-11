//Importação:
import java.util.Locale;

public class Exercicio1 {

	public static void main(String[] args) {
		//Definição:
		String produto1 = "Computador";
		String produto2 = "Mesa de trabalho";
		
		int idade = 30;
		int codigo = 5290;
		char genero = 'F';
		
		double preco1 = 2100.0;
		double preco2 = 650.50;
		double medida = 53.234567;
		
		//Algoritmo:
		
		System.out.printf("Produtos: %n" + "%s, qual o preço é R$ %.2f%n" +  "%s, qual o preço é R$ %.2f%n%n" + "Registro: %d anos, código %d e gênero %s%n" + "Medida com oito posições decimais: %.8f%n%n" + "Arredondado (três posições decimais): %.3f%n", produto1, preco1, produto2, preco2, idade, codigo, genero, medida, medida);
		Locale.setDefault(Locale.US);
		System.out.printf("US ponto decimal: %.3f", medida);
	}

}
