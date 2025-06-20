package exercicios;

import javax.swing.*;
import java.util.Locale;

public class Ex8 {

    private static final int CIGARROS_POR_CARTEIRA = 20;

    public static void main(String[] args) {

        String anosStr = JOptionPane.showInputDialog(
                null,
                "Há quantos anos você fuma?",
                "Dinheiro gasto (fumante)",
                JOptionPane.QUESTION_MESSAGE);

        if (isNullOrEmpty(anosStr)) System.exit(0);

        String cigDiaStr = JOptionPane.showInputDialog(
                null,
                "Quantos cigarros você fuma por dia?",
                "Dinheiro gasto (fumante)",
                JOptionPane.QUESTION_MESSAGE);

        if (isNullOrEmpty(cigDiaStr)) System.exit(0);

        String precoStr = JOptionPane.showInputDialog(
                null,
                "Qual o preço de uma carteira?",
                "Dinheiro gasto (fumante)",
                JOptionPane.QUESTION_MESSAGE);

        if (isNullOrEmpty(precoStr)) System.exit(0);

        try {
            int anosFumando = Integer.parseInt(anosStr.trim());
            int cigarrosPorDia = Integer.parseInt(cigDiaStr.trim());


            double precoCarteira = Double.parseDouble(precoStr.trim().replace(',', '.'));

            int totalDias = anosFumando * 365;
            int totalCigarros = totalDias * cigarrosPorDia;
            double totalCarteiras = totalCigarros / (double) CIGARROS_POR_CARTEIRA;
            double gastoTotal = totalCarteiras * precoCarteira;

            String resposta = String.format(
                    Locale.forLanguageTag("pt-BR"),
                    "Em %d ano(s) fumando %d cigarro(s) por dia,\n"
                            + "você já gastou aproximadamente R$ %.2f.",
                    anosFumando, cigarrosPorDia, gastoTotal);

            JOptionPane.showMessageDialog(
                    null,
                    resposta,
                    "Resultado",
                    JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Erro: verifique se todos os valores numéricos foram digitados corretamente.",
                    "Entrada inválida",
                    JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
    }
    private static boolean isNullOrEmpty(String s) {
        return s == null || s.trim().isEmpty();
    }
}