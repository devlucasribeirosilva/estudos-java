package com.lucas.estudos.loiane.basico.condicionais;
import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas pessoas? ");
        int n = sc.nextInt();

        double somaIdades = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Idade da " + i + "ª pessoa: ");
            somaIdades += sc.nextInt();
        }

        double media = somaIdades / n;
        System.out.println("Média de idade da turma: " + media);

        if (media <= 25) {
            System.out.println("Turma jovem.");
        } else if (media <= 60) {
            System.out.println("Turma adulta.");
        } else {
            System.out.println("Turma idosa.");
        }
    }
}
