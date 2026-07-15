package com.lucas.estudos.loiane.basico;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /**
         *
         * Tendo como dados de entrada a altura e o sexo de uma pessoa,
         * construa um algoritmo que calcule seu peso ideal, utilizando as seguintes fórmulas:
         *
         * Para homens: (72.7h) - 58
         * a. Para mulheres: (62.1h) - 44.7 (h = altura)
         * b. Peça o peso da pessoa e informe se ela está dentro, acima ou abaixo do peso.
         * **/

        System.out.println("Digite a sua altura: ");
        double altura = sc.nextDouble();
        System.out.println("Qual o seu sexo: ");
        String sexo = sc.nextLine();

        double pesoIdeal;

        if (sexo.equals("masculino")) {
           pesoIdeal = (72.7 * altura) - 58;
        } else if (sexo.equals("feminino")) {
            pesoIdeal = (62.1 * altura) - 44.7;
        } else {
            System.out.println("Sexo invalido. ");
            sc.close();
            return;
        }
        System.out.printf("Peso ideal: %.2f kg%n", pesoIdeal);

        System.out.print("Informe seu peso atual (kg): ");
        double pesoAtual = sc.nextDouble();

        if (pesoAtual == pesoIdeal) {
            System.out.println("Voce esta dentro do peso ideal.");
        } else if (pesoAtual > pesoIdeal) {
            System.out.println("Voce esta acima do peso ideal.");
        } else {
            System.out.println("Voce esta abaixo do peso ideal.");
        }

        sc.close();
    }
}
