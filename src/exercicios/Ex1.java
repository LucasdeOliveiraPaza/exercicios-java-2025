package exercicios;

import java.util.Scanner;

public class Ex1 {
     public static void main(String[] args) {
        int numero = 0;
     
        Scanner scan = new Scanner(System.in);

        System.out.println("digite um numero");
        numero = scan.nextInt();

         System.out.printf(
            "Você escolheu o número %d, que é antecessor do número %d e sucessor do número %d",
            numero,
            (numero + 1),
            (numero - 1)
        );
     }
}
