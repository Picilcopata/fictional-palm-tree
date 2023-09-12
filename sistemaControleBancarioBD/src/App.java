import Dados.*;

import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args) throws Exception {
        
        Agencia agencia1 = new Agencia(1, "Nova Friburgo");
        agencia1.status();

        Funcionario funcionario1 = new Funcionario("José", "Rua Vereador Devair", 1700);
        funcionario1.status();

        Cliente cliente1 = new Cliente(245671, 2000, 105467753, "Fernando", "Três Rios");
        cliente1.status();
        
        //teste de inputs
        String texto1 = JOptionPane.showInputDialog(null, "Qual seu nome? ");
        String texto2 = JOptionPane.showInputDialog(null, "Qual sua idade? ");
        JOptionPane.showMessageDialog(null,"Seja bem vindo! " + texto1, null , 0);

        //System.out.println("Olá " + texto1 + "!" + "Sua idade é: " + texto2 + ". Correto? ");
        //String texto3 = "Sua idade está correta?";
        //int confirmacao = JOptionPane.showOptionDialog(null, texto3, "Confime!", 0, 0, null, args, texto3);

        
        
    }
}
