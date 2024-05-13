package lotedejava1p1;
/*
 *Programa: converter celcius em f
 *Programador: LucasPOliveira
 *versão: 1.0 
*/
import javax.swing.JOptionPane;
public class Ex04Lote1p1 {
	public static void main(String args[]) {
		// Declarar variáveis:
		float tempC, tempF;
		// Entrada de Dados:
		tempC = Float.parseFloat(JOptionPane.showInputDialog("Digite a temp (ºC): "));
		// Processamento de Dados:
		tempF = ((tempC * 9)/5)+32;
		// Saída de Dados:
		JOptionPane.showMessageDialog(null,"Temperatura em ºF: "+ tempF);
	}
}
