package com.lucas.estudos.loiane.basico.condicionais;
import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantidade de turmas: ");
        int turmas = sc.nextInt();

        int totalAlunos = 0;
        for (int i = 1; i <= turmas; i++) {
            int alunos;
            do {
                System.out.print("Quantidade de alunos da turma " + i + " (máx. 40): ");
                alunos = sc.nextInt();
            } while (alunos > 40 || alunos < 0);
            totalAlunos += alunos;
        }

        double media = (double) totalAlunos / turmas;
        System.out.println("Número médio de alunos por turma: " + media);
    }
}
