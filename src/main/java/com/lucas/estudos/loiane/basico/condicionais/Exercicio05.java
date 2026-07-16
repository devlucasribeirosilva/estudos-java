package com.lucas.estudos.loiane.basico.condicionais;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char repetir;

        do {
            double popA, popB, taxaA, taxaB;

            System.out.print("População inicial do país A: ");
            popA = sc.nextDouble();
            System.out.print("Taxa de crescimento de A (ex: 0.03 para 3%): ");
            taxaA = sc.nextDouble();

            System.out.print("População inicial do país B: ");
            popB = sc.nextDouble();
            System.out.print("Taxa de crescimento de B (ex: 0.015 para 1.5%): ");
            taxaB = sc.nextDouble();

            int anos = 0;
            while (popA < popB) {
                popA += popA * taxaA;
                popB += popB * taxaB;
                anos++;
            }
            System.out.println("A população de A ultrapassa a de B em " + anos + " anos.");

            System.out.print("Deseja repetir? (s/n): ");
            repetir = sc.next().charAt(0);
            sc.nextLine();
        } while (repetir == 's');
    }
}
