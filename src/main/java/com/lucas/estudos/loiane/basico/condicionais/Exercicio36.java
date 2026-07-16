package com.lucas.estudos.loiane.basico.condicionais;
import java.util.Scanner;

public class Exercicio36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Montar a tabuada de: ");
        int numero = sc.nextInt();

        int inicio, fim;
        do {
            System.out.print("Começar por: ");
            inicio = sc.nextInt();
            System.out.print("Terminar em: ");
            fim = sc.nextInt();
            if (fim < inicio) {
                System.out.println("O valor final não pode ser menor que o inicial!");
            }
        } while (fim < inicio);

        System.out.println();
        System.out.println("Vou montar a tabuada de " + numero + " começando em " + inicio + " e terminando em " + fim + ":");
        for (int i = inicio; i <= fim; i++) {
            System.out.println(numero + " X " + i + " = " + (numero * i));
        }
    }
}
