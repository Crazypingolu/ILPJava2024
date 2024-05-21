// trazer bibliotecas:
import java.io.IOException;
import javax.swing.JOptionPane;
public class MenuPricipal {
    public static void main(String[] args) throws IOException{
        // intancia de classe:
        MetodosMP metodos = new MetodosMP(); // Metodos pro menu principal:
        ContaCorrente[] contas = new ContaCorrente[5];
        ContaCorrente[] contasAt = new ContaCorrente[5];
        MovimentoContas[] movimentacao = new MovimentoContas[10];
        // construtores:
        int cons; // contador.
        for(cons = 0 ; cons < contas.length ; cons++){ // contas - ContaCorrente 
            contas[cons] = new ContaCorrente();
        }
        for(cons = 0 ; cons < contasAt.length ; cons++){ // contasAt - ContaCorrente
            contasAt[cons] = new ContaCorrente();
        }
        for(cons = 0 ; cons < movimentacao.length ; cons++){ // movimentacao - MovimentoContas
            movimentacao[cons] = new MovimentoContas();
        }
        // Definir variaveis:
        int menu = 0;
        while (menu != 9) { // Loop de Entrada:
            menu = Integer.parseInt(JOptionPane.showInputDialog(
                "MENU PRINCIPAL " +
                "\n[1] - Cadastra conta corrente." +
                "\n[2] - (em desenvolvimento)" +
                "\n[3] - (em desenvolvimento)" +
                "\n[4] - Consulta cadastro." +
                "\n[9] - FINALIZAR."));
            switch (menu) {
                case 1: // cadastro de contas correntes:
                    metodos.cadastraContas(contas);
                break;
                case 2:
                    
                break;
                case 3:
                    
                break;
                case 4:
                    menuConsultaCadastro(contas, contasAt, movimentacao);
                break;
                case 9:
                break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
                break;
            }
        }
    }
    // Segundo menu - Consutas:
    static void menuConsultaCadastro(ContaCorrente[] contaBase, ContaCorrente[] contaAtu, MovimentoContas[] moviment){
        // Definir variáveis:
        int menu = 0;
        while (menu != 9) { // Loop entrada.
            menu = Integer.parseInt(JOptionPane.showInputDialog(
                "CONSULTA CADASTRO" +
                "\n[1] - (em desenvolivmento)" +
                "\n[2] - (em desenvolvimento)" +
                "\n[3] - (em desenvolvimento)" +
                "\n[9] - SAIR."));
                switch (menu) {
                    case 1: // cadastro de contas correntes:
    
                    break;
                    case 2:
                        
                    break;
                    case 3:
                        
                    break;
                    case 9:
                    break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opção inválida.");
                    break;
                }
        }
    }
}
