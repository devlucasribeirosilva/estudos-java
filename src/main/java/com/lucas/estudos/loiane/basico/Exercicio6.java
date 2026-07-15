package com.lucas.estudos.loiane.basico;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        /**
         *
         * Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
         * **/

        System.out.println("Digite o raio do circulo: ");
        double raio = sc.nextDouble();

        double pi = 3.14159;

        double area = pi * (raio * raio);

        System.out.println("O calculo da área é: " + area);
    }
}
