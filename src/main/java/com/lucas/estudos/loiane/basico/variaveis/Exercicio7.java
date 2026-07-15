package com.lucas.estudos.loiane.basico.variaveis;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        /**
         *
         * Faça um Programa que calcule a
         * área de um quadrado, em seguida mostre o dobro desta área para o usuário.
         * **/

        System.out.println("Digite a área do quadrado: ");
        int area = sc.nextInt();

        int areaQuadrado = area * area;
        int dobro = areaQuadrado * 2;

        System.out.println("A área do quadrado é: " + areaQuadrado);
        System.out.println("O dobro da área é: " + dobro);
    }
}
