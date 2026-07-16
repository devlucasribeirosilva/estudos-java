package com.lucas.estudos.loiane.basico.condicionais;
import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite até qual termo deseja gerar a série: ");
        int n = sc.nextInt();

        int a = 1, b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 3; i <= n; i++) {
            int proximo = a + b;
            System.out.print(proximo + " ");
            a = b;
            b = proximo;
        }
        System.out.println();
    }
}
