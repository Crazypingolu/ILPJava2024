/* 
 * Programa: Coletar o valor do lado de um quadrado, calcular sua área e apresentar o resultado.
 * Programador: LucasP, Crazypingolu
 * versão: 2.0
*/
import javax.swing.JOptionPane;
public class Ex01L1p1 {
    public static void main(String[] args) {
        // variáveis
        int lado, total;
        // entrada
        lado = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do lado: "));
        total = lado*lado;
        // saída
        JOptionPane.showMessageDialog(null, "Total: " + total);
    }
}
