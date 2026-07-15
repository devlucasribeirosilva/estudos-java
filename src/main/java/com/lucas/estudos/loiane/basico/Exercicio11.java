package com.lucas.estudos.loiane.basico;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /**
         *
         * Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
         * a. o produto do dobro do primeiro com metade do segundo.
         * b. a soma do triplo do primeiro com o terceiro.
         * c. o terceiro elevado ao cubo.
         *
         * **/

        System.out.println("Digite o primero numero: ");
        int A = sc.nextInt();
        System.out.println("Digite o segundo numero: ");
        int B = sc.nextInt();
        System.out.println("Digite o terceiro numero: ");
        double C = sc.nextDouble();

        int dobro = (A*2) / B;
        double triplo = (A*3) + C;
        double cubo = Math.pow(C,3);

        System.out.println(dobro);
        System.out.println(triplo);
        System.out.println(cubo);
    }
}
