/* 
 * Programa: Receba 2 valores reais.
 * Calcule e mostre o maior deles. 
 * Programador: LucasP, Crazypingolu
 * versão: 2.0
*/
import javax.swing.JOptionPane;
public class Ex19L1p2 {
    public static void main(String[] args) {
        // Definir variáveis:
        Double num1, num2;
        // Entrada de Dados:
        num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o 1º valor: "));
        num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o 2º valor: "));
        // Processamento na saída:
        JOptionPane.showMessageDialog(null,"O NUM de maior valor é:  " + maiorNUM(num1, num2));
    }
    // Criar Função - maiorNum:
    static Double maiorNUM(Double num1, Double num2){
        if(num1 > num2){ // verifica se 1 > 2.
            return num1;
        } else { // caso 2 > 1 ou 1 == 2.
            return num2;
        }
    }
}
