package outros;


import javax.swing.JOptionPane;

public class Tabuada {

    public static void main(String[] args) {

        String num = JOptionPane.showInputDialog(null, "Digite um número ");
        int numero = Integer.parseInt(num);
        
        
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + "x" + i + "=" + resultado);
            
        }

    }

    
}
