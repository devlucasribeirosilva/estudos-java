package com.lucas.estudos.loiane.basico.condicionais;
import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int n = sc.nextInt();

        boolean primo = true;
        if (n < 2) {
            primo = false;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    primo = false;
                    break;
                }
            }
        }

        System.out.println(n + (primo ? " é primo." : " não é primo."));
    }
}
