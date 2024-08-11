/* 
 * Programa: Receba a hora de início e de final de um jogo (HH,MM), calcular o tempo do 
 * jogo em horas e minutos, sabendo que o tempo máximo é menor que 24 horas 
 * e pode começar num dia e terminar noutro.
 * Programador: LucasP, Crazypingolu
 * versão: 2.0
*/
// trazer biblioteca:
import javax.swing.JOptionPane;
public class Ex25L1p2 {
    public static void main(String[] args) {
        // Definir variáveis:
        int hIni, hFim, mIni, mFim;
        // Entrada de dados:
        hIni = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora inicial: "));
        mIni = Integer.parseInt(JOptionPane.showInputDialog("Digite o minuto inicial: "));
        hFim = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora final: "));
        mFim = Integer.parseInt(JOptionPane.showInputDialog("Digite o minuto final: "));
        // Processamento + saída de dados:
        calculaTempo(hIni, hFim, mIni, mFim);
    }
    static void calculaTempo(int hI, int hF, int mI, int mF){
        // Definir variáveis:
        int hT, mT;
        // Processamento de dados:
        hT = hF - hI;
        mT = mF - mI;
        if (hF <= hI) {
            hT += 24;
        }
        if (mF < mI) {
            mT += 60;
            hT -= 1;
        }
        // Saída de dados:
        JOptionPane.showMessageDialog(null, "Total de horas: " + hT + "\nTotal de minutos: " + mT);
    }
}
