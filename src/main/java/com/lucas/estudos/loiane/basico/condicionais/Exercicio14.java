package com.lucas.estudos.loiane.basico.condicionais;
import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pares = 0, impares = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int n = sc.nextInt();
            if (n % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        System.out.println("Números pares: " + pares);
        System.out.println("Números ímpares: " + impares);
    }
}
