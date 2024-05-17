import javax.swing.JOptionPane;
public class MetodosMenuVota {
    // função cadastra votos01:
    public Votacao[] CadastraVota01(Votacao[] votos, Eleitor[] eleitor){
        // criar váriavel:
        int validaCandidato = 0, c = 0; // validar o código inserido como voto.
        for(int ct = 0 ; ct < eleitor.length ; ct++){ // loop para entrada de 5 votos e suas informações.
            if (eleitor[ct].secaoEleitor == 1 || eleitor[ct].secaoEleitor == 3 || eleitor[ct].secaoEleitor == 4) { // verifica se a seção é correspondente com vota01
                votos[c].secaoVotacao = eleitor[ct].secaoEleitor; // adicionas as informações necessárias
                votos[c].numEleitorVotacao = eleitor[ct].numEleitor; // adiciona as informações necessárias
                while (validaCandidato < 1 || validaCandidato > 4) { // loop pra validar o voto (se for maior que 1 e menor que 4 ele roda dnv)
                    validaCandidato = Integer.parseInt(JOptionPane.showInputDialog(
                        "SELECIONE UMA DAS OPÇÕES ABAIXO: " +
                        "\n[1] - Candidato 1." +
                        "\n[2] - Candidato 2." +
                        "\n[3] - Branco." +
                        "\n[4] - Nulo."));
                    if(validaCandidato >= 1 && validaCandidato <= 4 ){ //voto é válido (1 < x < 4)
                        votos[c].codCandidato = validaCandidato;
                    } else{
                        JOptionPane.showMessageDialog(null,"Opção inválida.");
                    }
                }
                validaCandidato = 0;
                c += 1;
            }
        }
        return votos;
    }
    // função cadastra votos02:
    public Votacao[] CadastraVota02(Votacao[] votos, Eleitor[] eleitor){
        // criar váriavel:
        int validaCandidato = 0, c = 0; // validar o código inserido como voto.
        for(int ct = 0 ; ct < eleitor.length ; ct++){ // loop para entrada de 5 votos e suas informações.
            if (eleitor[ct].secaoEleitor == 5 || eleitor[ct].secaoEleitor == 9 || eleitor[ct].secaoEleitor == 10) { // verifica se a seção é correspondente com vota02
                votos[c].secaoVotacao = eleitor[ct].secaoEleitor; // adicionas as informações necessárias
                votos[c].numEleitorVotacao = eleitor[ct].numEleitor; // adiciona as informações necessárias
                while (validaCandidato < 1 || validaCandidato > 4) { // loop pra validar o voto (se for maior que 1 e menor que 4 ele roda dnv)
                    validaCandidato = Integer.parseInt(JOptionPane.showInputDialog(
                        "SELECIONE UMA DAS OPÇÕES ABAIXO: " +
                        "\n[1] - Candidato 1." +
                        "\n[2] - Candidato 2." +
                        "\n[3] - Branco." +
                        "\n[4] - Nulo."));
                    if(validaCandidato >= 1 && validaCandidato <= 4 ){ //voto é válido (1 < x < 4)
                        votos[c].codCandidato = validaCandidato;
                    } else{
                        JOptionPane.showMessageDialog(null,"Opção inválida.");
                    }
                }
                validaCandidato = 0;
                c += 1;
            }
        }
        return votos;
    }
}