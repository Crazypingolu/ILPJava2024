package listadeexerciciosderecursiva;
/*
 * Programa: calcular a sequencia: n + (n-1) + ... + (1); usando recursiva
 * Programador: LucasPOliveira
 * versão: 2.0
*/
// trazer biblioteca:
import javax.swing.JOptionPane;
public class Ex02Recursiva {
	// Código: princial
	public static void main(String[] args) {
		// criar/definir variáveis:
		int num;
		// entrada de dados:
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de num: "));
		// saída + função:
		JOptionPane.showMessageDialog(null, "A soma de 1 até num é: " + de1ParaN(num));
	}
	// código: função recursiva
	static int de1ParaN(int n) {
		// criar/ definir variáveis:
		int total;
		// processamento de dados:
		// condição de saída:
		if(n == 1) {
			// retorna valor 01:
			return 1;
		// processamento de recursividade:
		} else {
			total = n + de1ParaN(n - 1);
			// retorna valor 02:
			return total;
		}
	}
}
