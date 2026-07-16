package com.lucas.estudos.loiane.basico.condicionais;
import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos números deseja informar? ");
        int n = sc.nextInt();

        double menor = Double.POSITIVE_INFINITY;
        double maior = Double.NEGATIVE_INFINITY;
        double soma = 0;

        for (int i = 1; i <= n; i++) {
            double valor;
            do {
                System.out.print("Digite o " + i + "º número (entre 0 e 1000): ");
                valor = sc.nextDouble();
            } while (valor < 0 || valor > 1000);

            soma += valor;
            if (valor < menor) menor = valor;
            if (valor > maior) maior = valor;
        }

        System.out.println("Menor valor: " + menor);
        System.out.println("Maior valor: " + maior);
        System.out.println("Soma: " + soma);
    }
}
