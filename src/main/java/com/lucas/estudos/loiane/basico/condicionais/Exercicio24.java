package com.lucas.estudos.loiane.basico.condicionais;
import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas notas deseja informar? ");
        int n = sc.nextInt();

        double soma = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Digite a " + i + "ª nota: ");
            soma += sc.nextDouble();
        }

        System.out.println("Média aritmética: " + (soma / n));
    }
}
