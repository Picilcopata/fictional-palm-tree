package outros;

import javax.swing.JOptionPane;

public class Calculadora {
    public static void main(String[] args) {
        
        double numero1, numero2, resultado;

        
        String num = JOptionPane.showInputDialog(null,"Digite um número: ");
        Double numDigitado1 = Double.parseDouble(num);
        numero1 = numDigitado1;

        String op = JOptionPane.showInputDialog(null, "Digite o operador: ");
        char operador = op.charAt(0);

        if (operador == 'v') {
            resultado = Math.sqrt(numero1);
            JOptionPane.showMessageDialog(null, "O resultado é: " + resultado);

        } else if (operador == '+' || operador == '-' || operador == '*' || operador == '/' || operador == '^') {
    
            String num2 = JOptionPane.showInputDialog(null,"Digite um número: ");
            Double numDigitado2 = Double.parseDouble(num2);

            numero2 = numDigitado2;

                    switch (operador) {
                        case '+':
                            resultado = numero1 + numero2;
                            break;
                        case '-':
                            resultado = numero1 - numero2;
                            break;
                        case '*':
                            resultado = numero1 * numero2;
                            break;
                        case '/':
                            if(numero2 == 0) {
                                System.out.println("Todo número dividido por 0 tem o resultado 1");
                                return;
                            }
                            resultado = numero1 / numero2;
                            break;
                        case '^':
                            resultado = Math.pow(numero1, numero2);  
                            break;
                        /*case 'v':
                            resultado = Math.sqrt(numero1);
                            break;*/

                        default:
                            System.out.println("Operador Inválido!");
                            return;
                    }
                    JOptionPane.showMessageDialog(null, "O resultado é: " + resultado);
                }

    }
}
