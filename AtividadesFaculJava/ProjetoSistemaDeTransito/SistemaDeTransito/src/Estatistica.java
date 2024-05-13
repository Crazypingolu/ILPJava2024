// Classe Abstrata
class Estatistica {
    int codigoCidade;
    String nomeCidade;
    int quantidadeAcidentes;
// Método construtor vazio
    Estatistica(){
        this(0,"",0);
    }
// Metodo Procedimento
    Estatistica(int cod, String nom, int qtd){
        codigoCidade = cod;
        nomeCidade = nom;
        quantidadeAcidentes = qtd;
    }
}
