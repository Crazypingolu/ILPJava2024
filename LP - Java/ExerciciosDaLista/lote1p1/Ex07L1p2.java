/* 
 * Programa: Receba os valores do comprimento, largura e altura de um paralelepípedo. Calcule e mostre seu volume.
 * Programador: LucasP, Crazypingolu
 * versão: 2.0
*/
// Trazer bibliotecas:
import javax.swing.JOptionPane;
public class Ex07L1p2 {
    public static void main(String[] args) {
        // Declarar variáveis:
        float altura, largura, comprimento, total;
        // Entrada de dados:
        altura = Float.parseFloat(JOptionPane.showInputDialog("Digite a altura: "));
        largura = Float.parseFloat(JOptionPane.showInputDialog("Digite a largura: "));
        comprimento = Float.parseFloat(JOptionPane.showInputDialog("Digite o comprimento: "));
        // processamento de dados:
        total = (largura * comprimento) * altura;
        // Saída de dados:
        System.out.println(" \n" + total);
    }    
}
