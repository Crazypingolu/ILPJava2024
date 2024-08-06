/* 
 * Receba 4 notas bimestrais de um aluno. Calcule e mostre a média aritmética. 
 * Mostre a mensagem de acordo com a média:
 * a. Se a média for >= 6,0 exibir “APROVADO”;
 * b. Se a média for >= 3,0 ou < 6,0 exibir “EXAME”;
 * c. Se a média for < 3,0 exibir “RETIDO”.
 * Programador: LucasP, Crazypingolu
 * versão: 2.0
*/
// trazer biblioteca:
import javax.swing.JOptionPane;
public class Ex21L1p2 {
    public static void main(String[] args) {
        // definir variáveis:
        Double[] notas = new Double[4];
        Double media = 0.0;
        // Entrada de dados:
        for(int cto = 0; cto < notas.length; cto++){
            notas[cto] = Double.parseDouble(JOptionPane.showInputDialog("Digite a " + (cto+1) + "º nota: "));
            media = notas[cto];
        }
        // Processamento + saída:
        relatMedia(media);
    }
    static void relatMedia(Double m){
        if(m >= 6) {
            JOptionPane.showMessageDialog(null,"APROVADO");
        } else if(m >= 3) {
            JOptionPane.showMessageDialog(null,"EXAME");    
        } else {
            JOptionPane.showMessageDialog(null,"RETIDO");
        }
    }
}
