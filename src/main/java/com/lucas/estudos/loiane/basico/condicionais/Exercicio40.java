package com.lucas.estudos.loiane.basico.condicionais;
import java.util.Scanner;

public class Exercicio40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] codigos = new int[5];
        int[] veiculos = new int[5];
        int[] acidentes = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("--- Cidade " + (i + 1) + " ---");
            System.out.print("Código da cidade: ");
            codigos[i] = sc.nextInt();
            System.out.print("Número de veículos de passeio (1999): ");
            veiculos[i] = sc.nextInt();
            System.out.print("Número de acidentes com vítimas (1999): ");
            acidentes[i] = sc.nextInt();
        }

        int somaVeiculos = 0, somaAcidentes = 0;
        int maiorIndiceCidade = codigos[0], menorIndiceCidade = codigos[0];
        double maiorIndice = -1, menorIndice = Double.POSITIVE_INFINITY;
        int somaAcidentesMenos2000 = 0, cidadesMenos2000 = 0;

        for (int i = 0; i < 5; i++) {
            somaVeiculos += veiculos[i];
            somaAcidentes += acidentes[i];

            double indice = (double) acidentes[i] / veiculos[i];
            if (indice > maiorIndice) { maiorIndice = indice; maiorIndiceCidade = codigos[i]; }
            if (indice < menorIndice) { menorIndice = indice; menorIndiceCidade = codigos[i]; }

            if (veiculos[i] < 2000) {
                somaAcidentesMenos2000 += acidentes[i];
                cidadesMenos2000++;
            }
        }

        System.out.println("Cidade com maior índice de acidentes: " + maiorIndiceCidade);
        System.out.println("Cidade com menor índice de acidentes: " + menorIndiceCidade);
        System.out.println("Média de veículos nas 5 cidades: " + (somaVeiculos / 5.0));
        if (cidadesMenos2000 > 0) {
            System.out.println("Média de acidentes nas cidades com menos de 2000 veículos: " + ((double) somaAcidentesMenos2000 / cidadesMenos2000));
        } else {
            System.out.println("Nenhuma cidade com menos de 2000 veículos.");
        }
    }
}
