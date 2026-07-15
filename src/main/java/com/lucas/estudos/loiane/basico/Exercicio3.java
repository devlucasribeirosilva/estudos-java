package com.lucas.estudos.loiane.basico;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        /**
         *
         * Faça um Programa que peça dois números e imprima a soma.
         * **/
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite o primeiro numero: ");
        int numero = sc.nextInt();
        System.out.println("Digite o segundo numero: ");
        int numero1 = sc.nextInt();

        int resultado = numero + numero1;

        System.out.println(resultado);
    }
}
