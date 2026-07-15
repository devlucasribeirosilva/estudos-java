package com.lucas.estudos.loiane.basico;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        /**
         *
         *Faça um programa que peça o tamanho de um arquivo para download (em MB) e a
         * velocidade de um link de Internet (em Mbps), calcule e informe o tempo aproximado de
         * download do arquivo usando este link (em minutos).
         * **/
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tamanho do arquivo (MB): ");
        double tamanhoMB = scanner.nextDouble();

        System.out.print("Velocidade do link (Mbps): ");
        double velocidadeMbps = scanner.nextDouble();

        double velocidadeMBps = velocidadeMbps / 8;
        double tempoSegundos = tamanhoMB / velocidadeMBps;
        double tempoMinutos = tempoSegundos / 60;

        System.out.printf("Tempo estimado: %.2f minutos%n", tempoMinutos);

        scanner.close();
    }
}