package exercicios;

import javax.swing.*;

public class Ex4 {

    public static void main(String[] args) {
        String entrada1 = JOptionPane.showInputDialog("Digite o primeiro número: ");
        if (entrada1 == null || entrada1.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null,"Entrada inválida. Encerrando.");
            System.exit(0);
        }

        String entrada2 = JOptionPane.showInputDialog("Digite o segundo número:");
        if (entrada2 == null || entrada2.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null,"Entrada inválida. Encerrando.");
            System.exit(0);
        }
        try {
            double num1 = Double.parseDouble(entrada1.trim().replace(",", "."));
            double num2 = Double.parseDouble(entrada2.trim().replace(",", "."));

            double soma = num1 + num2;
            double media = soma / 2.0;

            String resultado = String.format("Primeiro número: %.2f\nSegundo número: %.2f\nSoma total: %.2f\nMédia: %.2f",num1, num2, soma, media);

            JOptionPane.showMessageDialog(null, resultado);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro: Certifique-se de digitar apenas número válidos.");
            System.exit(0);
        }
    }
}
