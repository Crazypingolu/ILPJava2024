public class Votacao {
    int secaoVotacao;
    int codCandidato;
    int numEleitorVotacao;
    Votacao(){
        this(0,0,0);
    }
    Votacao(int seV, int cC, int nuEV){
        secaoVotacao = seV;
        codCandidato = cC;
        numEleitorVotacao = nuEV;
    }
}
