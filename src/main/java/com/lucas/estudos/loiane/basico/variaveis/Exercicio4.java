package com.lucas.estudos.loiane.basico.variaveis;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /**
         *
         * Faça um Programa que peça as 4 notas bimestrais e mostre a média.
         * **/

        System.out.println("digite a primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.println("digite a segunda nota: ");
        double nota2 = sc.nextDouble();
        System.out.println("digite a terceira nota: ");
        double nota3 = sc.nextDouble();
        System.out.println("digite a quarta nota: ");
        double nota4 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println(media);

    }
}
