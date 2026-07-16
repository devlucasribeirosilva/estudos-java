package com.lucas.estudos.loiane.basico.condicionais;
import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Base: ");
        int base = sc.nextInt();
        System.out.print("Expoente: ");
        int expoente = sc.nextInt();

        long resultado = 1;
        for (int i = 1; i <= expoente; i++) {
            resultado *= base;
        }
        System.out.println(base + " elevado a " + expoente + " = " + resultado);
    }
}
