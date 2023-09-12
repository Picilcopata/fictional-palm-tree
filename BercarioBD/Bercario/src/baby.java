import java.util.Date;

import javax.swing.JOptionPane;

public class baby {
    
    Date birthDate = new Date();

    static String name = JOptionPane.showInputDialog(null, "Informe o nome do bebê: ");
    static String birthWeightString = JOptionPane.showInputDialog(null, "Informe o peso do bebê: ");
    static Double birthWeight = Double.parseDouble (birthWeightString);
        
    static void status(){
        System.out.println("Nome do bebê: " + name);
        System.out.println("Peso: " + birthWeight + " Quilos \n");
    }

}
