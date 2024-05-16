/* 
 * Receba a base e a altura de um triângulo.
 * Calcule e mostre a sua área. 
 * Programador: LucasP, Crazypingolu
 * versão: 2.0
*/
import javax.swing.JOptionPane;
public class Ex03L1p1 {
    public static void main(String[] args) {
        // Declarar variáveis:
        float area, base, altura;
        // Entrada de dados:
        base = Float.parseFloat(JOptionPane.showInputDialog("Digite a BASE do triângulo: "));
        altura = Float.parseFloat(JOptionPane.showInputDialog("Digite a ALTURA do triângulo: "));
        // Processamento de dados:
        area = (base*altura)/2;
        // Saída de dados:
        JOptionPane.showMessageDialog(null,"O total da ÁREA é igual a: " + area);
    }
}
