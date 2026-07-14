package com.lucas.estudos.nelioalves;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /**
         *
         * Fazer um programa que leia o número de um funcionário,
         * seu número de horas trabalhadas, o valor que recebe por
         * hora e calcula o salário desse funcionário. A seguir,
         * mostre o número e o salário do funcionário, com duas casas
         * decimais.
         *
         * **/

        System.out.println("Digite o seu numero de funcionario: ");
        int numero = sc.nextInt();
        System.out.println("Digite as horas trabalhadas: ");
        int horasTrabalhadas = sc.nextInt();
        System.out.println("Digite o valor que recebe por hora trabalhada: ");
        double valorHora = sc.nextDouble();

        double salarioFuncionario = valorHora * horasTrabalhadas;

        System.out.println("O número de funcionario é: " + numero);
        System.out.printf("O seu salario é de:  %.2f%n", salarioFuncionario);
    }
}
