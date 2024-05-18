/* 
 * Programa: Receba os coeficientes A, B e C de uma equação do 2º grau 
 * (AX²+BX+C=0). Calcule e mostre as raízes reais 
 * (considerar que a equação possue 2 raízes).
 * Programador: LucasP, Crazypingolu
 * versão: 2.0
*/
import javax.swing.JOptionPane;
public class Ex05L1p1 {
    public static void main(String[] args) {
        // Definir variáveis:
        int a, b, c, delta;
        int x1,x2;
        // Entrada de dados:
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A: "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B: "));
        c = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de C: "));
        // Processamento de dados:
        delta = ((b*b) - (4*a*c)); // calculo de delta
        x1 = ((-1 * b) + ((int) Math.sqrt(delta))) / (2*a); // calculo de x1 (primeira raiz).
        x2 = ((-1 * b) - ((int) Math.sqrt(delta))) / (2*a); // calculo de x2 (segunda raiz).
        // Saída de dados:
        JOptionPane.showMessageDialog(null,
            "Valor de x1:  " + x1 +
            "Valor de x2:  " + x2);
    }
}
