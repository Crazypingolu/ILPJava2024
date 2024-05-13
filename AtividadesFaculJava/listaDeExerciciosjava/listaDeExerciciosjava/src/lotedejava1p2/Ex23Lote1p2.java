/*
 * Programa:Receba 3 valores obrigatoriamente em ordem crescente e um 4º valor não necessariamente em ordem. Mostre os 4 números em ordem crescente.
 * Programador: LucasPOliveira
 * versão: 2.0 
*/
package lotedejava1p2;

// Trazer biblioteca:
import javax.swing.JOptionPane;

public class Ex23Lote1p2 {
    // início - código principal:
    public static void main(String[] args) {
        // criar/definir variáveis locais:
        int v1 = 10, v2 = 20, v3 = 30;
        float v4;
        // entrada de dados:
        v4 = Float.parseFloat(JOptionPane.showInputDialog("Digite o 4º valor: "));
        // chamada de procedure:
        ordenadorDeQuatroValores(v1, v2, v3, v4);
    } // Fim - código principal;

    // início - código de procedure (ordenadorDeQuatroValores()):
    static void ordenadorDeQuatroValores(int x1, int x2, int x3, float x4) {
        // processamento de dados:
        if (x4 < x1) {
            JOptionPane.showMessageDialog(null, "Ordem: " + x4 + ", " + x1 + ", " + x2 + ", " + x3);
        } else if (x4 < x2) {
            JOptionPane.showMessageDialog(null, "Ordem: " + x1 + ", " + x4 + ", " + x2 + ", " + x3);
        } else if (x4 < x3) {
            JOptionPane.showMessageDialog(null, "Ordem: " + x1 + ", " + x2 + ", " + x4 + ", " + x3);
        } else {
            JOptionPane.showMessageDialog(null, "Ordem: " + x1 + ", " + x2 + ", " + x3 + ", " + x4);
        }
    } // Fim - código procedure;
}
