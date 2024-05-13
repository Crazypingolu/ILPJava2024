package lotedejava1p1;
import javax.swing.JOptionPane;
/*
 *Programa: calcular o reajuste de 30%
 *Programador: LucasPOliveira
 *versão: 1.0 
*/
public class Ex08Lote1p1 {
	public static void main(String args[]){
		// Declarar variáveis:
		float sal, reaj;
		// Entrada de dados:
		sal = Float.parseFloat(JOptionPane.showInputDialog("Digite o salário: "));
		// Processamento de dados:
		reaj = sal * (float)1.3;
		// Saída de dados:
		JOptionPane.showMessageDialog(null,"Reajuste: " + reaj);
	}
}
