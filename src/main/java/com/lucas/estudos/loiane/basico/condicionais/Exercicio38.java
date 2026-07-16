package com.lucas.estudos.loiane.basico.condicionais;
import java.util.Scanner;

public class Exercicio38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Salário inicial do funcionário (contratado em 1995): R$ ");
        double salario = sc.nextDouble();

        double percentual = 1.5; // aumento de 1996
        salario += salario * (percentual / 100);

        for (int ano = 1997; ano <= 2026; ano++) {
            percentual *= 2;
            salario += salario * (percentual / 100);
        }

        System.out.println("Salário atual do funcionário: R$ " + salario);
    }
}
