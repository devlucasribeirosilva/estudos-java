package com.lucas.estudos.loiane.basico.variaveis;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /**
         *
         * Faça um Programa que
         * peça a temperatura em graus Celsius, transforme e mostre em graus Farenheit.
         *
         * **/

        System.out.println("Digite a temperatura em Graus Celsius: ");
        int temperaturaC = sc.nextInt();

        int temperaturaF = (temperaturaC * 9/5) + 32;

        System.out.println("A temperatura em Farenheit é de: " + temperaturaF);
    }
}
