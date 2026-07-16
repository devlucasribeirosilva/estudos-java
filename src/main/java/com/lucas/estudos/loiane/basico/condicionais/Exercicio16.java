package com.lucas.estudos.loiane.basico.condicionais;

public class Exercicio16 {
    public static void main(String[] args) {
        int a = 0, b = 1;
        System.out.print(a + " " + b + " ");

        while (b <= 500) {
            int proximo = a + b;
            if (proximo > 500) break;
            System.out.print(proximo + " ");
            a = b;
            b = proximo;
        }
        System.out.println();
    }
}
