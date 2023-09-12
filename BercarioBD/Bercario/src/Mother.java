import javax.swing.JOptionPane;

public class Mother {
    
    static String motherName = JOptionPane.showInputDialog(null,"Informe o nome da mãe: ");
    static String address = JOptionPane.showInputDialog(null, "Informe o endereço: ");

    static void status(){
        System.out.println("Nome da mãe: " + motherName);
        System.out.println("Endereço residencial: " + address + "\n");
    }

}
