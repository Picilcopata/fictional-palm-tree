package Dados;
public class Agencia {
    
    int numero;
    String cidade;
    
    //Funcionários da agência:
    //Funcionario funcionario1 = new Funcionario("Julio", "Rua 12", 1200f);


    public void status(){
        System.out.println("Número da agência: " + this.numero + "\nCidade localizada: " + this.cidade + "\n");
    }

    public Agencia(int numero, String cidade) {
        this.numero = numero;
        this.cidade = cidade;
    }

}
