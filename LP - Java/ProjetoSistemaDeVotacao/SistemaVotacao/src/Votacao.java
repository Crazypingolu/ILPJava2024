//Classe Abstrata
public class Votacao {
    // Variáveis da classe:
    int numeroSecao;
    int numeroCandidato;
    // Construtor:
    Votacao(){
        this(0,0);
    }
    // Método de Procedimento:
    Votacao(int nS, int nC){
        numeroSecao = nS;
        numeroCandidato = nC;
    }
}
