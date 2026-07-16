package com.lucas.estudos.loiane.basico.condicionais;
import java.util.Scanner;

public class Exercicio39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int alunoMaisAlto = 0, alunoMaisBaixo = 0;
        double maiorAltura = Double.NEGATIVE_INFINITY;
        double menorAltura = Double.POSITIVE_INFINITY;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Número do aluno " + i + ": ");
            int numero = sc.nextInt();
            System.out.print("Altura (cm) do aluno " + i + ": ");
            double altura = sc.nextDouble();

            if (altura > maiorAltura) { maiorAltura = altura; alunoMaisAlto = numero; }
            if (altura < menorAltura) { menorAltura = altura; alunoMaisBaixo = numero; }
        }

        System.out.println("Aluno mais alto: número " + alunoMaisAlto + " (" + maiorAltura + " cm)");
        System.out.println("Aluno mais baixo: número " + alunoMaisBaixo + " (" + menorAltura + " cm)");
    }
}
