import javax.swing.JOptionPane;
public class MetodosMenuPrincipal {
    // Função cadastraEleitor:
    public Eleitor[] CadastraEleitor(Eleitor[] eleitor){
        // criar ListaSecao de Seções + seu verificador:
        int[] ListaSecao = {1,3,4,5,9,10};
        int temLista = 0; // variavel de controle para loop valida seção.
        int[] verificador = new int[2];
        // loop entrada de dados:
        for(int cad = 0 ; cad < eleitor.length ; cad++){
            eleitor[cad].nomeEleitor = JOptionPane.showInputDialog("Digite o NOME do "+ (cad+1) +"º eleitor: ");
            eleitor[cad].numEleitor = Integer.parseInt(JOptionPane.showInputDialog("Digite o NÚMERO do "+ (cad+1) +"º eleitor: "));
            // loop valida seção:
            while (temLista != 1){
                eleitor[cad].secaoEleitor = Integer.parseInt(JOptionPane.showInputDialog("Digite a SEÇÃO do "+ (cad+1) +"º eleitor: ")); // Entrada do valor da Seção
                for(int vef = 0 ; vef < ListaSecao.length ; vef++){ // loop para verificar se o valor está da lista de Seções
                    if(ListaSecao[vef] == eleitor[cad].secaoEleitor){ // o valor está na lista.
                         // verifica se o valor pertence a seção 1 e se tem espaço na seção 1 (5)
                        if(eleitor[cad].secaoEleitor == 1 && eleitor[cad].secaoEleitor == 3 && eleitor[cad].secaoEleitor == 4 || verificador[0] != 5){
                            temLista = 1; // permite a gravação do valor seção
                        }
                         // verifica se o valor pertence a seção 2 e se tem espaço na seção 2 (5)
                        if(eleitor[cad].secaoEleitor == 5 && eleitor[cad].secaoEleitor == 9 && eleitor[cad].secaoEleitor == 10 || verificador[1] != 5){ 
                            temLista = 1; // permite a gravação do valor seção
                        }
                    }
                }
                if(temLista != 1){
                    JOptionPane.showMessageDialog(null, "Seção inválida, insira novamente");

                }
            }
        }
        return eleitor;
    }
}
