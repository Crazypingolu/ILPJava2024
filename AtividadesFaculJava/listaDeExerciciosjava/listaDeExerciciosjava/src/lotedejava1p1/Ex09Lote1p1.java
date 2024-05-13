package lotedejava1p1;
/*
 *Programa: Soma de dois numeros ao quadrado
 *Programador: LucasPOliveira
 *versão: 1.0 
*/
// Trazer biblioteca:
import javax.swing.JOptionPane;
public class Ex09Lote1p1 {
	public static void main(String args[]){
		// Declarar variáveis:
		int num1, num2,anw;
		// Entrada de Dados:
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1º num: "));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2º num: "));
		// Processamento de Dados:
		num1 = (int)Math.pow(num1, 2);
		num2 = (int)Math.pow(num2, 2);
		anw = num1 + num2;
		// Saída de Dados:
		JOptionPane.showMessageDialog(null, "Soma dos quadrados: " + anw);
		
	}
}
