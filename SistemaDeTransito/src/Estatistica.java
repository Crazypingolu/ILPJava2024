// Classe Abstrata
class Estatistica {
    int codigoDaCidade;
    String nomeDaCidade;
    int quantidadeDeAcidentes;
// Método construtor
    Estatistica(){
        this(0,"",0);
    }
// Metodo Procedimento
    Estatistica(int codigo, String nome, int Qtd){
        codigoDaCidade = codigo;
        nomeDaCidade = nome;
        quantidadeDeAcidentes = Qtd;
    }
}
