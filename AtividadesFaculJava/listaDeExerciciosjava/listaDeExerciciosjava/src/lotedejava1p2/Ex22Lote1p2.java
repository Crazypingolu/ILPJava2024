/*
 * Programa:Receba 2 valores inteiros e diferentes. Mostre seus valores em ordem crescente.
 * Programador: LucasPOliveira
 * versão: 2.0 
*/
package lotedejava1p2;

// trazer biblioteca: 
import javax.swing.JOptionPane;

public class Ex22Lote1p2 {
    // início - código principal:
    public static void main(String[] args) {
        // declarar variáveis locais:
        int primeiroNum, segundoNum;
        // entrada de dados:
        primeiroNum = Integer.parseInt(JOptionPane.showInputDialog("Digite o PRIMEIRO número inteiro: "));
        segundoNum = Integer.parseInt(JOptionPane.showInputDialog("Digite o SEGUNDO número inteiro: "));
        // processamento + saída:
        organizaNum(primeiroNum, segundoNum);
    } // fim código principal;

    // início - código de procedure "organizaNum":
    static void organizaNum(int x1, int x2) {
        // saída:
        if (x1 > x2) {
            JOptionPane.showMessageDialog(null, "Maior: " + x1 + "\nMenor: " + x2);
        } else {
            JOptionPane.showMessageDialog(null, "Maior: " + x2 + "\nMenor: " + x1);
        }
    }
}
