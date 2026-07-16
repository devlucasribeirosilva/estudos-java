package com.lucas.estudos.loiane.basico.condicionais;
import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int n = sc.nextInt();

        boolean primo = true;
        StringBuilder divisores = new StringBuilder();

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                primo = false;
                divisores.append(i).append(" ");
            }
        }

        if (primo) {
            System.out.println(n + " é primo.");
        } else {
            System.out.println(n + " não é primo. É divisível por: " + divisores);
        }
    }
}
