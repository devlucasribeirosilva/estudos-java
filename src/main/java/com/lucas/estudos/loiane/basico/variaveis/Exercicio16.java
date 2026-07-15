package com.lucas.estudos.loiane.basico.variaveis;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        /**
         *
         * Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho em
         * metros quadrados da área a ser pintada. Considere que a cobertura da tinta é de 1 litro
         * para cada 3 metros quadrados e que a tinta é vendida em
         * latas de 18 litros, que custam R$ 80,00. Informe
         * **/

        Scanner scanner = new Scanner(System.in);

        System.out.print("Area a ser pintada (m2): ");
        double area = scanner.nextDouble();

        double litrosNecessarios = area / 3;
        int latas = (int) Math.ceil(litrosNecessarios / 18);
        double precoTotal = latas * 80.0;

        System.out.println("Latas de 18L necessarias: " + latas);
        System.out.printf("Preco total: R$ %.2f%n", precoTotal);

        scanner.close();
    }
}