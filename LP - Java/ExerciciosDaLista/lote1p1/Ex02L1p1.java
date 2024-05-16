/* 
 * Programa: Receba o salário de um funcionário e mostre
 * o novo salário com reajuste de 15%.
 * Programador: LucasP, Crazypingolu
 * versão: 2.0
*/
import javax.swing.JOptionPane;
public class Ex02L1p1 {
    public static void main(String[] args) {
        // Declarar variáveis:
        float salario, reajuste;
        // Entrada de dados:
        salario = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do salário: "));
        reajuste = salario + (salario * (float) 0.15);
        // Saída de dados:
        JOptionPane.showMessageDialog(null, "Reajuste: " + reajuste);
    }
}
