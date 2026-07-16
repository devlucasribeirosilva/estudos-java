package com.lucas.estudos.loiane.basico.condicionais;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double maior = Double.NEGATIVE_INFINITY;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o " + i + "º número: ");
            double n = sc.nextDouble();
            if (n > maior) {
                maior = n;
            }
        }
        System.out.println("Maior número: " + maior);
    }
}
