package com.lucas.estudos.loiane.basico.condicionais;
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double soma = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o " + i + "º número: ");
            soma += sc.nextDouble();
        }
        double media = soma / 5;
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
    }
}
