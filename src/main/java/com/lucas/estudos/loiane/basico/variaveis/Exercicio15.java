package com.lucas.estudos.loiane.basico.variaveis;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {

        /**
         *
         *
         * Faça um Programa que pergunte quanto você ganha por hora e o número de horas
         * trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês,
         * sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o INSS e 5%
         * para o sindicato, faça um programa que nos dê:
         *
         * salário bruto.
         * a. quanto pagou ao INSS.
         * b. quanto pagou ao sindicato.
         * c. o salário líquido.
         * d. calcule os descontos e o salário líquido, conforme a tabela abaixo:
         *
         *
         *
         *     + Salário Bruto : R$ - IR (11%) : R$ - INSS (8%) : R$ - Sindicato (5%) :
         *     R$ = Salário Líquido : R$
         * Obs.: Salário Bruto - Descontos = Salário Líquido.
         * **/

        Scanner scanner = new Scanner(System.in);

        System.out.print("Valor da hora: ");
        double valorHora = scanner.nextDouble();

        System.out.print("Horas trabalhadas no mes: ");
        double horas = scanner.nextDouble();

        double salarioBruto = valorHora * horas;
        double ir = salarioBruto * 0.11;
        double inss = salarioBruto * 0.08;
        double sindicato = salarioBruto * 0.05;
        double salarioLiquido = salarioBruto - ir - inss - sindicato;

        System.out.printf("Salario bruto: R$ %.2f%n", salarioBruto);
        System.out.printf("IR (11%%): R$ %.2f%n", ir);
        System.out.printf("INSS (8%%): R$ %.2f%n", inss);
        System.out.printf("Sindicato (5%%): R$ %.2f%n", sindicato);
        System.out.printf("Salario liquido: R$ %.2f%n", salarioLiquido);

        scanner.close();
    }
}