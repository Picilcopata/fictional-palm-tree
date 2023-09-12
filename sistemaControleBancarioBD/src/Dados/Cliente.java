package Dados;

public class Cliente extends Conta{
    public Cliente(int numero, float saldo) {
        super(numero, saldo);
    
    }



    public Cliente(int numero, float saldo, int rG, String nome, String cidade) {
        super(numero, saldo);
        RG = rG;
        this.nome = nome;
        this.cidade = cidade;
    }



    int RG;
    String nome, cidade;



    public void status(){
        System.out.println("Nome: " + this.nome + "\nRegistro Geral: " + this.RG + "\nCidade: " + this.cidade + "\nConta: " + this.numero + "\nSaldo: " + this.saldoInicial + "\n");
    }
    
}
