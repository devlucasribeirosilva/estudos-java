package com.lucas.estudos.loiane.basico.condicionais;
import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número total de eleitores: ");
        int eleitores = sc.nextInt();

        int[] votos = new int[4]; // índices 1, 2 e 3 são os candidatos

        for (int i = 1; i <= eleitores; i++) {
            int candidato;
            do {
                System.out.print("Eleitor " + i + ", vote (1, 2 ou 3): ");
                candidato = sc.nextInt();
            } while (candidato < 1 || candidato > 3);
            votos[candidato]++;
        }

        System.out.println("Resultado da votação:");
        System.out.println("Candidato 1: " + votos[1] + " votos");
        System.out.println("Candidato 2: " + votos[2] + " votos");
        System.out.println("Candidato 3: " + votos[3] + " votos");
    }
}
