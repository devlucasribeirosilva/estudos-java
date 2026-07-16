package com.lucas.estudos.loiane.basico.condicionais;

public class Exercicio29 {
    public static void main(String[] args) {
        double precoUnitario = 1.99;
        System.out.println("Lojas Quase Dois - Tabela de preços");
        for (int i = 1; i <= 50; i++) {
            System.out.printf("%d - R$ %.2f%n", i, i * precoUnitario);
        }
    }
}
