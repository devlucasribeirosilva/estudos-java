package com.lucas.estudos.loiane.basico;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        /**
         *
         *  Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho em metros
         *  quadrados da área a ser pintada.
         *  Considere que a cobertura da tinta é de 1 litro para cada 6 metros quadrados e que a
         *  tinta é vendida em latas de 18 litros, que custam R$ 80,00 ou em galões de 3,6 litros,
         *  que custam R$ 25,00.
         * - Informe ao usuário as quantidades de tinta a serem compradas e os respectivos preços em
         * 3 situações:
         * - comprar apenas latas de 18 litros;
         * - comprar apenas galões de 3,6 litros;
         * - misturar latas e galões, de forma que o preço seja o menor. Acrescente 10% de folga e
         * sempre arredonde os valores para cima, isto é, considere latas cheias.
         *
         * **/
        Scanner scanner = new Scanner(System.in);

        System.out.print("Area a ser pintada (m2): ");
        double area = scanner.nextDouble();

        double litrosNecessarios = (area / 6) * 1.10; // +10% de folga

        // Situacao 1: so latas de 18L
        int latas1 = (int) Math.ceil(litrosNecessarios / 18);
        double preco1 = latas1 * 80.0;

        // Situacao 2: so galoes de 3.6L
        int galoes2 = (int) Math.ceil(litrosNecessarios / 3.6);
        double preco2 = galoes2 * 25.0;

        // Situacao 3: misturar, buscando o menor preco
        double menorPreco = Double.MAX_VALUE;
        int melhorLatas = 0;
        int melhorGaloes = 0;

        int maxLatas = (int) Math.ceil(litrosNecessarios / 18);
        for (int latas = 0; latas <= maxLatas; latas++) {
            double restante = litrosNecessarios - (latas * 18);
            int galoes = restante > 0 ? (int) Math.ceil(restante / 3.6) : 0;
            double preco = (latas * 80.0) + (galoes * 25.0);

            if (preco < menorPreco) {
                menorPreco = preco;
                melhorLatas = latas;
                melhorGaloes = galoes;
            }
        }

        System.out.println("--- So latas de 18L ---");
        System.out.println("Latas: " + latas1 + " | Preco: R$ " + String.format("%.2f", preco1));

        System.out.println("--- So galoes de 3.6L ---");
        System.out.println("Galoes: " + galoes2 + " | Preco: R$ " + String.format("%.2f", preco2));

        System.out.println("--- Misturando (menor preco) ---");
        System.out.println("Latas: " + melhorLatas + " | Galoes: " + melhorGaloes
                + " | Preco: R$ " + String.format("%.2f", menorPreco));

        scanner.close();
    }
}