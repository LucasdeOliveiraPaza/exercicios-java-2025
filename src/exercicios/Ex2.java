package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(new Locale("pt", "BR"));

        System.out.println("Digite o primeiro numero: ");
        double num1 = sc.nextDouble();
        System.out.println("Digite o segundo numero: ");
        double num2 = sc.nextDouble();

        double media = (num1 + num2) / 2.0;

        System.out.printf(" Primeiro número: %.2f\n Segundo Número: %.2f\n Média: %.2f\n", num1, num2, media);

        sc.close();
    }
}
