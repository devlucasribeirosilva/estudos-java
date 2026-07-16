package com.lucas.estudos.loiane.basico.condicionais;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int a = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int b = sc.nextInt();

        int inicio = Math.min(a, b);
        int fim = Math.max(a, b);

        for (int i = inicio; i <= fim; i++) {
            System.out.println(i);
        }
    }
}
