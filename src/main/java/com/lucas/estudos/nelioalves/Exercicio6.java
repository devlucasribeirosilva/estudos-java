package com.lucas.estudos.nelioalves;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /**
         *
         * Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C.
         * Em seguida, calcule e
         * mostre:
         * a) a área do triângulo retângulo que tem A por base e C por altura.
         * b) a área do círculo de raio C. (pi = 3.14159)
         * c) a área do trapézio que tem A e B por bases e C por altura.
         * d) a área do quadrado que tem lado B.
         * e) a área do retângulo que tem lados A e B
         *
         * **/

        System.out.println("Digite o primeiro valor: ");
        float A = sc.nextFloat();
        System.out.println("Digite o segundo valor:" );
        float B = sc.nextFloat();
        System.out.println("Digite o terceiro valor: ");
        float C = sc.nextFloat();

        double pi = 3.14159;

        double trianguloRetangulo = A*C/2;
        double circulo = pi * (C*C);
        double trapezio = (A+B)*C/2;
        double quadrado = B*B;
        double retangulo = A*B;

        System.out.println(trianguloRetangulo);
        System.out.println(circulo);
        System.out.println(trapezio);
        System.out.println(quadrado);
        System.out.println(retangulo);


    }

}
