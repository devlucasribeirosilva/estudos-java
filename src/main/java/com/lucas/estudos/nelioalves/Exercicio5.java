package com.lucas.estudos.nelioalves;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /**
         *
         * Fazer um programa para ler o código de uma peça 1,
         * o número de peças 1, o valor unitário de cada peça 1, o
         * código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2.
         * Calcule e mostre o valor a ser pago
         * **/

        System.out.println("Digite o código da peça1: ");
        int codigo1 = sc.nextInt();
        System.out.println("Digite a quantidade de peças1: ");
        int qtdPecas1 = sc.nextInt();
        System.out.println("Digite o valor da da peça 1: ");
        double valorPeca1 = sc.nextDouble();
        System.out.println("Digite o código da peça 2:");
        int codigo2 = sc.nextInt();
        System.out.println("Digite a quantidade de peças 2: ");
        int qtdPecas2 = sc.nextInt();
        System.out.println("Digite o valor da da peça 2: ");
        double valorPeca2 = sc.nextDouble();

        double totalPecas1 = qtdPecas1 * valorPeca1;
        double totalPecas2 = qtdPecas2 * valorPeca2;
        double valotTotal  = totalPecas1 + totalPecas2;

        System.out.println("VALOR TOTAL A PAGAR: " + valotTotal);



    }
}
