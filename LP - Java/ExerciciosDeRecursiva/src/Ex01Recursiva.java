package listadeexerciciosderecursiva;

/*
 * Programa: calcular a soma dos n�meros de 1 a 100, usando recursiva
 * Programador: LucasPOliveira
 * vers�o: 2.0
*/
public class Ex01Recursiva {
	// Programa principal:
	public static void main(String[] args) {
		// Criar/definir vari�veis Vari�veis:
		int num = 1;
		// sa�da de dados:
		System.out.println("Soma dos n�meros: " + soma100(num)); // sa�da com chamada de fun��o.
	}

	// programa fun��o "soma100()":
	static int soma100(int n) {
		// criar/definir vari�vel:
		int total;
		// processamento de dados
		if (n < 100) {
			total = n + soma100(n + 1);
			// sa�da 01:
			return total;
		} else {
			// sa�da 02:
			return 100;
		}
	}
}
