/* 
 * Programa: Receba 3 coeficientes A, B, e C de uma equação do 2º grau da fórmula 
 * AX²+BX+C=0. Verifique e mostre a existência de raízes reais e se caso exista, 
 * calcule e mostre 
 * Programador: LucasP, Crazypingolu
 * versão: 2.0
*/
import javax.swing.JOptionPane;
public class Ex20L1p2 {
    public static void main(String[] args) {
        // definir variáveis:
        int a, b,c, del;
        // entrada de dados:
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o coeficiente 'a':"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o coeficiente 'b':"));
        c = Integer.parseInt(JOptionPane.showInputDialog("Digite o coeficiente 'c':"));
        // Processamento de dados:
        del = (int)Math.pow(b, 2) - 4 * a * c;
        if (del >= 0) { // 1 ou + raízes
            calcRaiz(del, a, b, c); // saída
        } else { // 0 raízes, saída:
            JOptionPane.showMessageDialog(null, "Não existem raízes (delta < 0)");
        }
    }
    static void calcRaiz(int d, int A, int B, int C){
        // definir variáveis:
        int x1, x2;
        // Processamento:
        x1 = ((B*-1) + (int) Math.sqrt(d))/(2 * A);
        x2 = ((B*-1) - (int) Math.sqrt(d))/(2 * A);
        // Saída de dados:
        JOptionPane.showMessageDialog(null, "Raiz 1: " + x1 + "\nRaiz 2: " + x2);
    }    
}
