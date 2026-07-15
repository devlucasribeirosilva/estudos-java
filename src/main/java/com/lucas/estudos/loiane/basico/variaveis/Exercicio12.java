package com.lucas.estudos.loiane.basico.variaveis;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /**
         *
         * Tendo como dados de entrada a altura de uma pessoa,
         * construa um algoritmo que calcule seu peso ideal, usando a seguinte fórmula:
         *
         * (72.7*altura) - 58
         * **/

        System.out.println("Digite a sua altura: ");
        double altura = sc.nextDouble();

        double pesoIdeal = (72.7*altura) - 58;

        System.out.println("Seu peso ideal é de: " + pesoIdeal);
    }
}
