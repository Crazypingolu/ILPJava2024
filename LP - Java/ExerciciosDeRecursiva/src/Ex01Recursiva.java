/* Programa: calcular a soma dos números de 1 a 100, usando recursiva
 * Programador: LucasP, Crazypingolu
 * versão: 2.0
*/
public class Ex01Recursiva {
	// Programa principal:
	public static void main(String[] args) {
		// Criar/definir variáveis:
		int num = 1;
		// saída de dados:
		System.out.println("\nSoma dos números: " + soma100(num)); // saída com chamada de função.
	}

	// programa função "soma100()":
	static int soma100(int n) {
		// criar/definir variável:
		int total;
		// processamento de dados
		if (n < 100) {
			total = n + soma100(n + 1);
			// saída 01:
			return total;
		} else {
			// saída 02:
			return 100;
		}
	}
}
