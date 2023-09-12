import javax.swing.JOptionPane;

public class Doctor {
    
    static String doctorName = JOptionPane.showInputDialog(null, "Informe o médico responsável: ");
    static String CRMstring = JOptionPane.showInputDialog(null, "CRM do médico: ");
    static String specialization = JOptionPane.showInputDialog(null, "Especialização do médico: ");

    static int CRM = Integer.parseInt(CRMstring);

    static void status(){
    System.out.println("Nome do médico: " + doctorName);
    System.out.println("CRM: " + CRM);
    System.out.println("Especialização: " + specialization + "\n");
    }
}