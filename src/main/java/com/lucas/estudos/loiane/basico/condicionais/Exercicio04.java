package com.lucas.estudos.loiane.basico.condicionais;

public class Exercicio04 {
    public static void main(String[] args) {
        double popA = 80000, popB = 200000;
        double taxaA = 0.03, taxaB = 0.015;
        int anos = 0;

        while (popA < popB) {
            popA += popA * taxaA;
            popB += popB * taxaB;
            anos++;
        }

        System.out.println("A população do país A ultrapassa a de B em " + anos + " anos.");
    }
}
