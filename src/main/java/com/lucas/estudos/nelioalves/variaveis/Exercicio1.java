package com.lucas.estudos.nelioalves.variaveis;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /**
         * Faça um programa para ler dois valores inteiros,
         * e depois mostrar na tela a soma desses números com uma
         * mensagem explicativa, conforme exemplos.
         * **/

        System.out.println("Entre com o primeiro número: ");
        int num1 = sc.nextInt();
        System.out.println("Entre com o segundo número: ");
        int num2 = sc.nextInt();

        int resultado = num1 + num2;
        System.out.println("SOMA =  " + resultado);
    }
}
