/* 
 * Programa: Receba o número de voltas, a extensão do circuito (em metros) e o tempo de duração (minutos). Calcule e mostre a velocidade média em km/h
 * Programador: LucasP, Crazypingolu
 * versão: 2.0
*/
// trazer biblioteca:
import javax.swing.JOptionPane;
public class Ex27L1p2 {
    public static void main(String[] args) {
        // Definir variáveis:
        int vol, min;
        double tam;
        // Entrada de dados:
        vol = Integer.parseInt(JOptionPane.showInputDialog("Digite quantas voltas: "));
        min = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos minutos: "));
        tam = Double.parseDouble(JOptionPane.showInputDialog("Digite a extensão do circuito (em metros): "));
        // Processamento e saída:
        vm(vol, min, tam);
    }
    static void vm(int v, int m, double t){
        double per = (t * v);
        double vm = per/m;
        System.out.println(vm);
    }
}
