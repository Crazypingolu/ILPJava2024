/* 
 * Programa: baskhara
 * Programador: LucasPOliveira
 * versão: 3.0 
*/
package lotedejava1p2;

import javax.swing.JOptionPane;

public class Ex20Lote1p2 {
    // criar variaveis globais:
    static float a, b, c, d;

    // main:
    public static void main(String[] args) {
        // entrada de dados:
        a = Float.parseFloat(JOptionPane.showInputDialog("Digite 'a': "));
        b = Float.parseFloat(JOptionPane.showInputDialog("Digite 'b': "));
        c = Float.parseFloat(JOptionPane.showInputDialog("Digite 'c': "));
        // processamento de dados:
        d = (float) Math.pow(b, 2) - (4 * a * c);
        if (d < 0) {
            JOptionPane.showMessageDialog(null, "Sem Raízes reais.");
        } else if (d == 0) {
            JOptionPane.showMessageDialog(null, "Uma única raíz: " + raizUnica(d));
        } else {
            raizdupla();
        }
    }

    static float raizUnica(float delta) {
        // Criar variável:
        float x;
        // processamento de dados:
        x = ((b * -1) / (2 * a));
        // saída de dados:
        return x;
    }

    static void raizdupla() {
        // criar variáveis:
        float x1, x2;
        // processamento de dados:
        x1 = ((-1 * b) + ((float) Math.sqrt(d))) / (2 * a);
        x2 = ((-1 * b) - ((float) Math.sqrt(d))) / (2 * a);
        // saída:
        JOptionPane.showMessageDialog(null, "Duas raízes: \n" + x1 + "\n" + x2);
    }
}
