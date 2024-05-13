/*
 * Programa: Receba o número da base e do expoente. Calcule e mostre o valor da potência.
 * Programador: LucasPOliveira
 * versão: 2.0 
*/
package lotedejava1p2;

// trazer biblioteca: 
import javax.swing.JOptionPane;

public class Ex44Lote1p2 {
    // código principal - início:
    public static void main(String[] args) {
        // Criar / definir variáveis:
        int base, expoente, cto, total;
        // ENTRADA DE DADOS:
        base = Integer.parseInt(JOptionPane.showInputDialog("Digite a base: "));
        expoente = Integer.parseInt(JOptionPane.showInputDialog("Digite o expoente: "));
        // Processamento de dados:
        total = base;
        for (cto = 1; cto <= expoente; cto++) {
            if (cto == expoente) {
                JOptionPane.showMessageDialog(null, "Resultado: " + total);
            } else {
                total = total * base;
            }
        }

    }
}
