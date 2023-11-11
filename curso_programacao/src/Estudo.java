import java.util.Locale;
public class Estudo {

	public static void main(String[] args) {
		
		/*Tipo de variáveis:
		 * byte  - 8 bits  /   -128 a 127
		 * short - 16 bits /   -32768 a 32767
		 * int   - 32 bits /   -2147483648 a 2147483647
		 * long  - 64 bits /   -9223372036854770000 a 9223372036854770000
		 * 
		 * --Tipos Flutuantes--
		 * 
		 * float  - 32 bits /
		 * double - 64 bits /
		*/
		
		// Definir:
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		//int y = 32;
		//double x = 10.35784; //Definição de variáveis.
		//double c = 80.98765;
		
		//Algoritmo:
		
		//System.out.println(y); //System.out.println() - Retorna valores com quebra de linha.
		//System.out.printf("%.2f%n", c); - System.out.printf() - Retorna valores com formatação especifica.
		Locale.setDefault(Locale.US);  //Importa o comando Locale.
		//System.out.printf("%.4f%n", c);
		//System.out.println("RESULTADO =" + x + " METROS"); //Forma de concatenação sem formatação.
		//System.out.printf("RESULTADO = %.2f metros%n", x);
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda); //Forma de concatenação com formatação.
	}

}
