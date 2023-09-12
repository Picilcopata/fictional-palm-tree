package Dados;

public class Funcionario {
    
    String nome, endereco;
    float salario;

    public void status(){

        System.out.println("Nome do funcionário: " + this.nome + "\n" + "Endereço: " + this.endereco + "\n" + "Salário: " + this.salario + "\n");
    }

    public Funcionario(String nome, String endereco, float salario) {
        this.nome = nome;
        this.endereco = endereco;
        this.salario = salario;
    }


    
}
