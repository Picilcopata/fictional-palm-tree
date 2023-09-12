package outros;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class InterfaceGrafica extends JFrame {
    public InterfaceGrafica() {
        setTitle("Calculadora");
        setVisible(true);
        setSize(200, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);

        JButton jButtonDireita = new JButton("Calculadora");
        jButtonDireita.setBounds(20, 10, 150, 50);
        jButtonDireita.setFont(new Font("Arial", Font.BOLD, 20));
        jButtonDireita.setForeground(new Color(237, 241, 238));
        jButtonDireita.setBackground(new Color(9, 10, 9));
        
        JButton jButtonEsquerda = new JButton("Tabuada");
        jButtonEsquerda.setBounds(20, 80, 150, 50);
        jButtonEsquerda.setFont(new Font("Arial", Font.BOLD, 20));
        jButtonEsquerda.setForeground(new Color(237, 241, 238));
        jButtonEsquerda.setBackground(new Color(9, 10, 9));

        jButtonDireita.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                Calculadora.main(null);
            }
        });

        // Adicionando ActionListener para o botão "Tabuada"
        jButtonEsquerda.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
               Tabuada.main(null);
            }
        });

        add(jButtonDireita);
        add(jButtonEsquerda);
    
            
    }


    public static void main(String[] args) {
        new InterfaceGrafica();
    }
}
