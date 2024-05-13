/* 
 * Programa: receber 4 notas bimestrais e calcular a média aritimética e as 3 saídas
 * 1 - arpovado (>=6), 2 - Exame (>=4), 3 - reprovado (<4);
 * Programador: LucasPOliveira
 * versão: 2.0 
*/
package lotedejava1p2;

// Trazer biblioteca:
import javax.swing.JOptionPane;

public class Ex21Lote1p2 {
    // Código principal:
    public static void main(String[] args) {
        // criar/definir váriáveis (local):
        double nota1, nota2, nota3, nota4; // "n" - número da avaliação.
        // entrada de dados:
        nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 1ª nota: "));
        nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 2ª nota: "));
        nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 3ª nota: "));
        nota4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a última nota: "));
        // saída com processamento de funções:
        JOptionPane.showMessageDialog(null, "Resultado: " + resultadoAcademico(nota1, nota2, nota3, nota4));
    }

    // código função (resultado)
    static String resultadoAcademico(double n1, double n2, double n3, double n4) {
        // criar váriaveis (local):
        Double total;
        // processamento de dados
        total = (n1 + n2 + n3 + n4) / 4;
        // saída:
        if (total >= 6) {
            return "Aprovado";
        } else if (total > 4) {
            return "Exame";
        } else {
            return "Reprovado";
        }
    }
}
