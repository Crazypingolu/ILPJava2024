/* 
 * Programa: Receber 2 valores reais e ver o maior
 * Programador: LucasPOliveira
 * versão: 2.0 
*/
package lotedejava1p2;
//trazer biblioteca:
import javax.swing.JOptionPane;
public class Ex19Lote1p2 {
    // Criar variáveis globais:
    static float maior;
    // main:
    public static void main(String[] args){
        // gerar variáveis:
        float n1,n2;
        // entrada de dados:
        n1 = Float.parseFloat(JOptionPane.showInputDialog("Digite n1: "));
        n2 = Float.parseFloat(JOptionPane.showInputDialog("Digite n2: "));
        // processamento:
        maior(n1,n2);
        // saída de dados:
        JOptionPane.showMessageDialog(null,"Maior número: " + maior);

    }
    static void maior(float x1, float x2){
        //processamento de dados:
        if(x1 > x2){
            maior = x1;
        } else{
            maior = x2;
        }
    }
}
