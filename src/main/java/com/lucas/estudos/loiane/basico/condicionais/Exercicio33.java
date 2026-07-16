package com.lucas.estudos.loiane.basico.condicionais;
import java.util.Scanner;

public class Exercicio33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double menor = Double.POSITIVE_INFINITY;
        double maior = Double.NEGATIVE_INFINITY;
        double soma = 0;
        int contador = 0;
        char continuar;

        do {
            System.out.print("Digite uma temperatura: ");
            double temp = sc.nextDouble();
            soma += temp;
            contador++;
            if (temp < menor) menor = temp;
            if (temp > maior) maior = temp;

            System.out.print("Deseja informar outra temperatura? (s/n): ");
            continuar = sc.next().charAt(0);
        } while (continuar == 's');

        System.out.println("Menor temperatura: " + menor);
        System.out.println("Maior temperatura: " + maior);
        System.out.println("Média das temperaturas: " + (soma / contador));
    }
}
