package com.lucas.estudos.nelioalves.condicionais;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /**
         *
         * Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
         * Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
         * ordem crescente ou decrescente.
         * **/

        System.out.println("Digite o primeir valor: ");
        int A = sc.nextInt();
        System.out.println("Digite o segunto valor: ");
        int B = sc.nextInt();

        if (A % B == 0 || B % A == 0) {
            System.out.println("São multiplos");
        } else {
            System.out.println("Não são multiplos");
        }
    }
}
