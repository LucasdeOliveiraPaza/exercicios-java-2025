package exercicios;

import javax.swing.*;

public class Ex7 {
    public static void main(String[] args) {
        double horas, salario;

        String inputHoras = JOptionPane.showInputDialog("Digite o numero de horas trabalhadas no mês (separe a casa decimal com .)");
    
        if (inputHoras == null) {
            System.exit(0);
        }

        if (inputHoras.isEmpty()) {
            JOptionPane.showMessageDialog(null,"o campo de escrita não pode ser vazio");
            System.exit(0);
        }

        String inputSalario = JOptionPane.showInputDialog("Digite o valor do quanto você ganha por hora (separe a casa decimal com .)");
    
        if (inputSalario == null) {
            System.exit(0);
        }

        if (inputSalario.isEmpty()) {
            JOptionPane.showMessageDialog(null,"o campo de escrita não pode ser vazio");
            System.exit(0);
        }

        try {
            horas = Double.parseDouble(inputHoras);
            salario = Double.parseDouble(inputSalario);

            String retorno = String.format("você recebeu %.2f reais de salario esse mês", (horas * salario));

            JOptionPane.showMessageDialog(null, retorno);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "os campos de escrita devem conter um valor numerico");
            System.exit(0);
        }
    }
}
