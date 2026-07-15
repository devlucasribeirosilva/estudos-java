package com.lucas.estudos.loiane.basico.variaveis;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /**
         *
         * Faça um Programa que peça a temperatura em graus Farenheit,
         * transforme e mostre a temperatura em graus Celsius.
         *
         * **/

        System.out.println("Digite a temperatura em Farenheit: ");
        int temperaturaF = sc.nextInt();

        int temperaturaC = (5 * (temperaturaF-32)) / 9;

        System.out.println("A temperatura em Celsius é de: " + temperaturaC);
    }
}
