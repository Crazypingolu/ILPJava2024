package listadeexerciciosderecursiva;
/*
 * Programa: calcular a sequencia: n/1 + (n-1)/2 + ... + (1/n); usando recursiva
 * Programador: LucasPOliveira
 * versão: 2.0
*/
//trazer biblioteca:
import javax.swing.JOptionPane;
public class Ex04Recursiva {
	// código principal:
	public static void main(String[] args) {
		// criar/definir variáveis:
		float num1, num2 = 1;
		// entrada de dados:
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1º valor: "));
		// saida de dados:
		JOptionPane.showMessageDialog(null, "Total: " + F4(num1, num2));
	}
	// código da recursiva:
	static float F4(float n1, float n2) {
		// criar/definir variável:
		float total;
		// processamento de dados:
		if(n1 == 1) {
			return n1/n2;
		} else {
			total = n1/n2 + F4(n1 - 1,n2 + 1);
			return total;
		}
		
	}
}
