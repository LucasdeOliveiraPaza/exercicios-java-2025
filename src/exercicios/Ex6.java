package exercicios;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Há quanto anos você fuma? ");
        int anosFumando = sc.nextInt();

        System.out.println("Quanto cigarros você fuma por dia? ");
        int cigarrosPorDia = sc.nextInt();

        System.out.println("Qual o preço de uma carteira? ");
        double precoCarteira = sc.nextDouble();

        int totalDias = anosFumando * 365;
        int totalCigarros = cigarrosPorDia * totalDias;

        double totalCarteiras = totalCigarros / 20.0;
        double gastoTotal = totalCarteiras * precoCarteira;

        System.out.printf("Você já gastou aproximadatemente R$ %.2f com cigarros.\n",gastoTotal);

        sc.close();
    }
}
