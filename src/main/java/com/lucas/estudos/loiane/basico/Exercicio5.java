package com.lucas.estudos.loiane.basico;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /**
         *
         * Faça um Programa que converta metros para centímetros.
         * **/

        System.out.println("Digite o valor em metro: ");
        int metro = sc.nextInt();

        int centimentos = metro * 100;

        System.out.println("O valor em centimetros é: " + centimentos);
    }
}
