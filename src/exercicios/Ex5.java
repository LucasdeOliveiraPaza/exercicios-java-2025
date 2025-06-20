package exercicios;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        double horas, salario;
    
        Scanner scan = new Scanner(System.in);
    
        System.out.println("Digite o numero de horas trabalhadas no mês (separe a casa decimal com ,)");
        horas = scan.nextFloat();
        
        System.out.println("Digite o valor do quanto você ganha por hora (separe a casa decimal com ,)");
        salario = scan.nextDouble();

        System.out.printf("você recebeu %.2f reais de salario esse mês", (horas * salario));

        scan.close();
    }
}
