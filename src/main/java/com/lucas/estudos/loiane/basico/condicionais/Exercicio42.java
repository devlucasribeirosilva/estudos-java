package com.lucas.estudos.loiane.basico.condicionais;
import java.util.Scanner;

public class Exercicio42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int faixa1 = 0, faixa2 = 0, faixa3 = 0, faixa4 = 0;

        while (true) {
            System.out.print("Digite um número positivo (negativo para encerrar): ");
            int n = sc.nextInt();
            if (n < 0) break;

            if (n <= 25) faixa1++;
            else if (n <= 50) faixa2++;
            else if (n <= 75) faixa3++;
            else if (n <= 100) faixa4++;
        }

        System.out.println("[0-25]: " + faixa1);
        System.out.println("[26-50]: " + faixa2);
        System.out.println("[51-75]: " + faixa3);
        System.out.println("[76-100]: " + faixa4);
    }
}
