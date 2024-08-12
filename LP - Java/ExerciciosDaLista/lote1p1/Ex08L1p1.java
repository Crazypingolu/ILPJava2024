/* 
 * Programa: Receba o valor de um depósito em poupança.
 * Calcule e mostre o valor após 1 mês de aplicação sabendo que rende 1,3% a. m.
 * Programador: LucasP, Crazypingolu
 * versão: 2.0
*/
// Trazer bibliotecas:
import javax.swing.JOptionPane;
public class Ex08L1p1 {
    public static void main(String[] args) {
        // Declarar variáveis:
        double val0, valT;
        // Entrada de dados:
        val0 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor depositado:"));
        // Processamento de dados:
        valT = val0 * 1.013;
        // Saída de dados:
        System.out.println("Valor (aproximado) após 1 mês: \n" + valT);
    }
}
