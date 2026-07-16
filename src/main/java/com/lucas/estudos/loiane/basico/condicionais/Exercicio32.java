package com.lucas.estudos.loiane.basico.condicionais;
import java.util.Scanner;

public class Exercicio32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int n = sc.nextInt();

        long fatorial = 1;
        for (int i = n; i >= 1; i--) {
            fatorial *= i;
        }
        System.out.println("Fatorial de: " + n);
        System.out.println(n + "! = " + fatorial);
    }
}
