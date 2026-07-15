package com.lucas.estudos.nelioalves.condicionais;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /**
         *
         * Fazer um programa para ler um número inteiro,
         * e depois dizer se este número é negativo ou não
         * **/

        System.out.println("digite um numero: ");
        int numero = sc.nextInt();

        if (numero > 0) {
            System.out.println("O numero é positivo");
        } else {
            System.out.println("O numero é negativo");
        }
    }
}
