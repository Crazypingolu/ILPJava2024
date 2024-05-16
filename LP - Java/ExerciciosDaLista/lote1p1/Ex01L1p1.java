/* 
 * Programa: Coletar o valor do lado de um quadrado, calcular sua área e apresentar o resultado.
 * Programador: LucasP, Crazypingolu
 * versão: 2.0
*/
import javax.swing.JOptionPane;
public class Ex01L1p1 {
    public static void main(String[] args) {
        // Declarar variáveis:
        int lado, total;
        // Entrada de dados:
        lado = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do lado: "));
        total = lado*lado;
        // Saída de dados:
        JOptionPane.showMessageDialog(null, "Total: " + total);
    }
}
