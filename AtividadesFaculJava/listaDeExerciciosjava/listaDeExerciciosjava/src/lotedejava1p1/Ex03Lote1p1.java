package lotedejava1p1;
/*
 *Programa: Calcular a Área de um triângulo
 *Programador: LucasPOliveira
 *versão: 1.0 
*/
import javax.swing.JOptionPane;
public class Ex03Lote1p1 {
	public static void main(String[] args) {
		//Declarar variável:
		float alt,ba,ar;
		//Entrada de dados:
		alt = Float.parseFloat(JOptionPane.showInputDialog("Digite a altura do triângulo: "));
		ba = Float.parseFloat(JOptionPane.showInputDialog("Digite a Base: "));
		//Processamento de dados:
		ar = (alt * ba)/2;
		JOptionPane.showMessageDialog(null,"Área: " + ar);
	}
}
