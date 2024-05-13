/*
 * Programa: Calcule e mostre a série 1 – 2/4 + 3/9 – 4/16 + 5/25 - ... + 15/225
 * Programador: LucasPOliveira
 * versão: 2.0 
*/
package lotedejava1p2;

public class Ex45Lote1p2 {
    // início - CÓDIGO principal:
    public static void main(String[] args) {
        // criar / declarar variável:
        float x = 1;
        // saída + função
        System.out.println(somaSerie(x));
        // fim - código principal;
    }

    // início - código função:
    static float somaSerie(float x) {
        // declarar/criar variável:
        float total;
        // processamento de dados:
        // saída da recursiva:
        if (x == 15) {
            return x / (x * x);
        } else {
            if (x % 2 == 0) { // número seguinte é impar
                total = x / (x * x) + somaSerie(x + 1);
                return total;
            } else { // numero seguinte é par
                total = x / (x * x) - somaSerie(x + 1);
                return total;
            }
        }
    }
}
