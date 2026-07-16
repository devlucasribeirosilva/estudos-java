package com.lucas.estudos.loiane.basico.condicionais;
import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Preço do pão: R$ ");
        double preco = sc.nextDouble();

        System.out.println("Panificadora Pão de Ontem - Tabela de preços");
        for (int i = 1; i <= 50; i++) {
            System.out.printf("%d - R$ %.2f%n", i, i * preco);
        }
    }
}
