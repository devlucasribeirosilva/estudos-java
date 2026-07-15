package com.lucas.estudos.nelioalves.condicionais;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /**
         *
         * Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
         * **/

        System.out.println("Digite um numero");
        int numero = sc.nextInt();

        if (numero % 2 ==0) {
            System.out.println("o numero é par");
        } else {
            System.out.println("O numero é impar");
        }
    }
}
