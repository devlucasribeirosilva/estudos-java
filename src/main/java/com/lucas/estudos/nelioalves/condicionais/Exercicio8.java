package com.lucas.estudos.nelioalves.condicionais;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salario = sc.nextDouble();

        if (salario <= 2000.0) {
            System.out.println("Isento");
        } else {
            double imposto = 0.0;

            if (salario > 2000.0) {
                imposto += (Math.min(salario, 3000.0) - 2000.0) * 0.08;
            }
            if (salario > 3000.0) {
                imposto += (Math.min(salario, 4500.0) - 3000.0) * 0.18;
            }
            if (salario > 4500.0) {
                imposto += (salario - 4500.0) * 0.28;
            }

            System.out.printf("R$ %.2f%n", imposto);
        }

        sc.close();
    }
}