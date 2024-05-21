public class ContaCorrente {
    int codContaC;
    String nomeClienteC;
    double salContaC;
    double limContaC;
    int tipoContaC;
    ContaCorrente(){
        this(0,"",0,0,0);
    }
    ContaCorrente(int cod, String nome, double saldo, double limite, int tipo){
        codContaC = cod;
        nomeClienteC = nome;
        salContaC = saldo;
        limContaC = limite;
        tipoContaC = tipo;
    }
}
