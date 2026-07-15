package com.lucas.estudos.loiane.basico;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        /**
         *
         * Faça um Programa que pergunte quanto você ganha por hora e o número de horas
         * trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.
         * **/

        System.out.println("Qual o valor da hora trabalhada? ");
        double valorHora = sc.nextDouble();
        System.out.println("Quantas horas você trabalhou no mês");
        int horasTrabalhadas = sc.nextInt();

        double salario = valorHora * horasTrabalhadas;

        System.out.println("Seu salario é de: " + salario);
    }
}
