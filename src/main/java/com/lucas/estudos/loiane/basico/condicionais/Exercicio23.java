package com.lucas.estudos.loiane.basico.condicionais;
import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor de N: ");
        int n = sc.nextInt();

        int testes = 0;
        System.out.println("Números primos entre 1 e " + n + ":");

        for (int num = 2; num <= n; num++) {
            boolean primo = true;
            for (int i = 2; i < num; i++) {
                testes++;
                if (num % i == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo) {
                System.out.println(num);
            }
        }
        System.out.println("Número de divisões (testes) executados: " + testes);
    }
}
