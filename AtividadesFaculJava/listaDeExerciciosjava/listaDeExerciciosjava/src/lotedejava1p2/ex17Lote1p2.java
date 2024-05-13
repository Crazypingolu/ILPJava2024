/* 
 * Programa: calcular a quantidade de gasolina gasta em um automovel que faz 12km/l,
 * receber o tempo e velocidade média
 * Programador: LucasPOliveira
 * versão: 2.0 
*/
package lotedejava1p2;
import javax.swing.JOptionPane;
public class ex17Lote1p2 {
    // principal:
    public static void main(String[] args) {
        // definir variáveis:
        float velocidadeMedia, tempoPercorrido;
        // entrada de dados:
        velocidadeMedia = Float.parseFloat(JOptionPane.showInputDialog("Digite a velocidade média (km/h): "));
        tempoPercorrido = Float.parseFloat(JOptionPane.showInputDialog("Digite o tempo percorrido (horas): "));
        // saída de dados:
        JOptionPane.showMessageDialog(null, "Gasolina gasta: " + automovel1(velocidadeMedia, tempoPercorrido));
    }
    // função:
    static float automovel1(float vm, float tp){
        // definir variável:
        float total;
        total = (vm*tp)/12;
        return total;
    }
}
