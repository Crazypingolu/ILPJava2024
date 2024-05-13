package lotedejava1p1;
/*
 Programa: coletar o valor do lado do quadrado e calcular sua área
 programador: LucasPOliveira
 versão: 1.0
*/
import javax.swing.JOptionPane;
public class Ex01Lote1p1 {
    public static void main(String args[]){
    //Declarar variável:
      float lado,area;
      lado = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do lado: "));
      area = lado * lado;
      JOptionPane.showMessageDialog(null,"área: " + area);
    }
}
