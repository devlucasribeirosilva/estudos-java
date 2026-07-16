package com.lucas.estudos.loiane.basico.condicionais;
import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantidade de CDs: ");
        int qtd = sc.nextInt();

        double total = 0;
        for (int i = 1; i <= qtd; i++) {
            System.out.print("Valor do CD " + i + ": R$ ");
            total += sc.nextDouble();
        }

        System.out.println("Valor total investido: R$ " + total);
        System.out.println("Valor médio por CD: R$ " + (total / qtd));
    }
}
