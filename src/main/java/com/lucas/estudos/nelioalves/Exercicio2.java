package com.lucas.estudos.nelioalves;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        /**
         * Faça um programa para ler o valor do raio de um círculo,
         * e depois mostrar o valor da área deste círculo com quatro
         * casas decimais conforme exemplos.
         * Fórmula da área: area = π . raio2
         * Considere o valor de π = 3.14159
         *
         * **/

        System.out.println("Entre com o valor do raio: ");
        double raio = sc.nextDouble();

        double pi = 3.14159;
        double area = pi * (raio*raio);

        System.out.printf("O valor da área do círculo é: %.4f%n", area);

    }
}
