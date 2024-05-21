import javax.swing.JOptionPane;
public class MetodosMP {
    public ContaCorrente[] cadastraContas(ContaCorrente[] contaC){
        // declarar variáveis:
        int validaTipo = 0, validaCod = 0;
        for(int cont = 0 ; cont < contaC.length ; cont++){
            while(validaTipo != 1){ // loop para validar o tipo da conta.
                contaC[cont].tipoContaC = Integer.parseInt(JOptionPane.showInputDialog("Digite o TIPO da conta: "));
                if (contaC[cont].tipoContaC < 1 || contaC[cont].tipoContaC > 4 ) { // verifica se o tipo está no intervalo (1-4).
                    validaTipo = 1;
                } else {
                    JOptionPane.showMessageDialog(null, "Tipo inválido, digite novamente.");
                } // Fim - If
            } // Fim - While
            while(validaCod == 0){
                contaC[cont].codContaC = Integer.parseInt(JOptionPane.showInputDialog("Digite o CÓDIGO da conta (ex: 000):"));
                for(int vef = 0 ; vef < contaC.length ; vef++){
                    if(contaC[vef].codContaC == contaC[cont].codContaC){
                        validaCod = 1;
                    }
                } // Fim - For
            }
            contaC[cont].nomeClienteC = JOptionPane.showInputDialog("Digite o NOME do cliente: ");
            contaC[cont].salContaC = Double.parseDouble(JOptionPane.showInputDialog("Digite o SALDO da conta: "));
        } // Fim - For
        return contaC;
    }
}
