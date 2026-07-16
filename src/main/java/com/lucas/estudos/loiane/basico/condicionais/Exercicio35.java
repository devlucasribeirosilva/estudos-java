package com.lucas.estudos.loiane.basico.condicionais;
import java.util.Scanner;

public class Exercicio35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int n = sc.nextInt();

        System.out.println("Números primos entre 1 e " + n + ":");
        for (int num = 2; num <= n; num++) {
            boolean primo = true;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
}
