import javax.swing.JOptionPane;
public class MetodosMenuConsu {
    // Procedure - quem é o vencedor:
    public void vencedor(Votacao[] votos){
        int vef1 = 0, vef2 = 0;
        for(int c = 0 ; c < votos.length ; c++){
            if(votos[c].codCandidato == 1){
                vef1 += 1;
            }
            if(votos[c].codCandidato == 2){
                vef2 += 1;
            }
        }
        if (vef1 > vef2){
            JOptionPane.showMessageDialog(null, "Candidato 1 é o vencedor!");
        } else if (vef1 < vef2){
            JOptionPane.showMessageDialog(null, "Candidato 2 é o vencedor!");
        } else {
            JOptionPane.showMessageDialog(null, "Empate");
        }
    }
    // Proedure - segundo lugar:
    public void segundoLugar(Votacao[] votos){
        int vef1 = 0, vef2 = 0;
        for(int c = 0 ; c < votos.length ; c++){
            if(votos[c].codCandidato == 1){
                vef1 += 1;
            }
            if(votos[c].codCandidato == 2){
                vef2 += 1;
            }
        }
        if (vef1 < vef2){
            JOptionPane.showMessageDialog(null, "Candidato 1 ficou em segundo lugar.");
        } else if (vef1 > vef2){
            JOptionPane.showMessageDialog(null, "Candidato 2 ficou em segundo lugar.");
        } else {
            JOptionPane.showMessageDialog(null, "Empate");
        }
    }
    // Procedure - Contabilização de votos nulos:
    public void votosNulos(Votacao[] votos){
        int contabilizador = 0;
        for(int cto = 0 ; cto < votos.length ; cto++){
            if (votos[cto].codCandidato == 4){
                contabilizador += 1;
            }
        }
        JOptionPane.showMessageDialog(null, "Votos NULOS: " + contabilizador);
    }
    // Procedure - Contabilização de votos em branco:
    public void votosEmBranco(Votacao[] votos){
        int contabilizador = 0;
        for(int cto = 0 ; cto < votos.length ; cto++){
            if (votos[cto].codCandidato == 3){
                contabilizador += 1;
            }
        }
        JOptionPane.showMessageDialog(null, "Votos em BRANCO: " + contabilizador);
    }
    // Procedure - Mostrar eleitores:
    public void mostraEleitores(Eleitor[] eleitores){
        for(int cto = 0 ; cto < eleitores.length ; cto++){
            System.out.println(
                "\nNome: " + eleitores[cto].nomeEleitor +
                "\nCódigo do eleitor: " + eleitores[cto].numEleitor + 
                "\nSeção: " + eleitores[cto].secaoEleitor + "\n");
        }
        JOptionPane.showMessageDialog(null, "Procedure Concluído");
    }
    // Procedure - Mostra apuração:
    public void mostraApuracao(Votacao[] apuracao){
        for(int cto = 0 ; cto < apuracao.length ; cto++){
            System.out.println(
                "\nVoto: " + apuracao[cto].codCandidato +
                "\nCódigo do eleitor" + apuracao[cto].numEleitorVotacao +
                "\nSeção: " + apuracao[cto].secaoVotacao + "\n");
        }
        JOptionPane.showMessageDialog(null, "Procedure Concluído");
    }
}
