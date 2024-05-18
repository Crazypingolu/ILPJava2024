/* 
 * Programa: Receba a temperatura em graus Celsius. 
 * Calcule e mostre a sua temperatura convertida em fahrenheit F = (9*C+160) /5.
 * Programador: LucasP, Crazypingolu
 * versão: 2.0
*/
import javax.swing.JOptionPane;
public class Ex04L1p1 {
    public static void main(String[] args) {
        // Definir variáveis:
        float celcius  = 0, fahrenheit = 0;
        // Entrada de dados:
        celcius = Float.parseFloat(JOptionPane.showInputDialog("Digite a temperatura (em °C): "));
        // Processamento de dados:
        fahrenheit = ((9*celcius) + 160)/5;
        // Saída de dados:
        JOptionPane.showMessageDialog(null,"Total da conversão de °C para °F: " + fahrenheit);
    }
}
