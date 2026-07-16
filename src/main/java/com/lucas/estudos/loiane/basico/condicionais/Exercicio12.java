package com.lucas.estudos.loiane.basico.condicionais;
import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número entre 1 e 10: ");
        int n = sc.nextInt();

        System.out.println("Tabuada de " + n + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " X " + i + " = " + (n * i));
        }
    }
}
