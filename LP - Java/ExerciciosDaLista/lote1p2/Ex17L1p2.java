/* 
 * Programa: Calcule a quantidade de litros gastos em uma viagem, sabendo que o automóvel faz 12 km/l.
 * Receber o tempo de percurso e a velocidade média.
 * Programador: LucasP, Crazypingolu
 * versão: 2.0
*/
import javax.swing.JOptionPane;
public class Ex17L1p2 {
    public static void main(String[] args){
        // Declarar variáveis:
        float tempo, velocidadeMedia;
        // Entrada de dados:
        tempo = Float.parseFloat(JOptionPane.showInputDialog("Digite o tempo percorrido (em horas): "));
        velocidadeMedia = Float.parseFloat(JOptionPane.showInputDialog("Digite a velocidade média (em km/h): "));
        // Processamento de dados:
        calculo(tempo, velocidadeMedia);
    }
    static void calculo(float t, float vm){
        // Declarar variável local:
        float total;
        // Cálculo:
        total = (t*vm)/12;
        // Saída:
        JOptionPane.showMessageDialog(null,
            "Litros gastos: " + total);
    }
}
