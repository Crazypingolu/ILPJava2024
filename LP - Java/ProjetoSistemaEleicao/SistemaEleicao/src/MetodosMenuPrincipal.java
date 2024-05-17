import javax.swing.JOptionPane;
public class MetodosMenuPrincipal {
    // Função cadastraEleitor:
    public Eleitor[] CadastraEleitor(Eleitor[] eleitor){
        // criar ListaSecao de Seções + seu verificador:
        int temLista = 0; // variavel de controle para loop valida seção.
        int[] verificador = new int[2];
        // loop entrada de dados:
        for(int cad = 0 ; cad < eleitor.length ; cad++){
            eleitor[cad].nomeEleitor = JOptionPane.showInputDialog("Digite o NOME do "+ (cad+1) +"º eleitor: ");
            eleitor[cad].numEleitor = Integer.parseInt(JOptionPane.showInputDialog("Digite o NÚMERO do "+ (cad+1) +"º eleitor: "));
            // loop valida seção:
            while (temLista != 1){
                eleitor[cad].secaoEleitor = Integer.parseInt(JOptionPane.showInputDialog("Digite a SEÇÃO do "+ (cad+1) +"º eleitor: ")); // Entrada do valor da Seção
                    // verifica se o valor pertence a seção 1 e se tem espaço na seção 1 (5)
                    if((eleitor[cad].secaoEleitor == 1 || eleitor[cad].secaoEleitor == 3 || eleitor[cad].secaoEleitor == 4) && verificador[0] != 5){
                        temLista = 1; // permite a gravação do valor seção
                        verificador[0] += 1;
                    }
                    // verifica se o valor pertence a seção 2 e se tem espaço na seção 2 (5)
                    if((eleitor[cad].secaoEleitor == 5 || eleitor[cad].secaoEleitor == 9 || eleitor[cad].secaoEleitor == 10) && verificador[1] != 5){ 
                        temLista = 1; // permite a gravação do valor seção
                        verificador[1] += 1;
                    }
                if(temLista != 1){
                    JOptionPane.showMessageDialog(null, "Seção inválida, insira novamente");
                }
            }
            temLista = 0;
        }
        return eleitor;
    }
    public Votacao[] agrupar(Votacao[] v01, Votacao[] v02, Votacao[] apurado){
        int v2 = 0;
        for(int apu = 0 ; apu < apurado.length ; apu++){
            if(apu <= 4){
                apurado[apu].codCandidato = v01[apu].codCandidato;
                apurado[apu].numEleitorVotacao = v01[apu].numEleitorVotacao;
                apurado[apu].secaoVotacao = v01[apu].secaoVotacao;
            } else {
                apurado[apu].codCandidato = v02[v2].codCandidato;
                apurado[apu].numEleitorVotacao = v02[v2].numEleitorVotacao;
                apurado[apu].secaoVotacao = v02[v2].secaoVotacao;
                v2 += 1;
            }
        }
        JOptionPane.showMessageDialog(null, "Concatenação concluída.");
        return apurado;
    }
}
