package exercicios;

import javax.swing.*;

public class Ex3 {
    public static void main(String[] args) {
        int numero = 0;

        String inputUsuario = JOptionPane.showInputDialog("digite um numero");

        if (inputUsuario == null) {
            System.exit(0);
        }

        if (inputUsuario.isEmpty()) {
            JOptionPane.showMessageDialog(null,"o campo de escrita não pode ser vazio");
            System.exit(0);
        }

        try {
            numero = Integer.parseInt(inputUsuario);

            String retorno = String.format(
                "Você escolheu o número %d, que é antecessor do número %d e sucessor do número %d",
                numero,
                (numero + 1),
                (numero - 1)
            );

            JOptionPane.showMessageDialog(null, retorno);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "o campo de escrita deve conter apenas numeros");
            System.exit(0);
        }
    }
}

