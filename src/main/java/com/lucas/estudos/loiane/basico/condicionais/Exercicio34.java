package com.lucas.estudos.loiane.basico.condicionais;
import java.util.Scanner;

public class Exercicio34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int n = sc.nextInt();

        boolean primo = n >= 2;
        for (int i = 2; i < n && primo; i++) {
            if (n % i == 0) {
                primo = false;
            }
        }

        System.out.println(n + (primo ? " é primo." : " não é primo."));
    }
}
