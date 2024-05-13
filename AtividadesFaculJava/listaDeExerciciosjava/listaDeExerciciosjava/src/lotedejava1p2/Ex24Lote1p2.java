/*
 * Programa:Receba Receba um valor inteiro. Verifique e mostre se é divisível por 2 e 3
 * Programador: LucasPOliveira
 * versão: 2.0 
*/
package lotedejava1p2;

// trazer bilbioteca:
import javax.swing.JOptionPane;

public class Ex24Lote1p2 {
    // Início - código principal:
    public static void main(String[] args) {
        // criar/definir variáveis:
        int valorInteiro;
        // entrada de dados:
        valorInteiro = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 valor interio qualquer: "));
        // saída de dados + chamada de função:
        JOptionPane.showMessageDialog(null,
                "Divisível por 3: " + divPor3(valorInteiro) + "\nDivisível por 2: " + divPor2(valorInteiro));
        // Fim - código principal;
    }

    // Início - código Função (Divisível por 3):
    static String divPor3(int x) {
        // processamento de dados:
        if ((x % 3) == 0) {
            return "Sim";
        } else {
            return "Não";
        }
        // Fim - código função divPor3;
    }

    // Início - código Função (divPor2):
    static String divPor2(int x) {
        // processamento de dados:
        if ((x % 2) == 0) {
            return "Sim";
        } else {
            return "Não";
        }
    }
}
