public class Eleitor {
    // variáveis:
    int numEleitor;
    String nomeEleitor;
    int secaoEleitor;
    // Construtor vazio:
    Eleitor(){
        this(0,"",0);
    }
    // Procedure:
    Eleitor(int nE, String noE, int se){
        numEleitor = nE;
        nomeEleitor = noE;
        secaoEleitor = se;
    }
}
