package com.lucas.estudos.nelioalves.condicionais;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /**
         *
         * Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
         * começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
         * **/

        System.out.println("Digite a hora inicial");
        int horaInicial = sc.nextInt();
        System.out.println("Digite a hora final: ");
        int horaFinal = sc.nextInt();

        int duracao;

        if (horaFinal > horaInicial) {
            duracao = horaFinal - horaInicial;
        } else {
            duracao = (24-horaInicial) + horaFinal;
        }

        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
    }
}
