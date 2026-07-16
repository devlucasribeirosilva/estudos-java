package com.lucas.estudos.loiane.basico.condicionais;
import java.util.Scanner;

public class Exercicio37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codMaisAlto = 0, codMaisBaixo = 0, codMaisGordo = 0, codMaisMagro = 0;
        double maiorAltura = Double.NEGATIVE_INFINITY;
        double menorAltura = Double.POSITIVE_INFINITY;
        double maiorPeso = Double.NEGATIVE_INFINITY;
        double menorPeso = Double.POSITIVE_INFINITY;
        double somaAlturas = 0, somaPesos = 0;
        int total = 0;

        while (true) {
            System.out.print("Código do cliente (0 para encerrar): ");
            int codigo = sc.nextInt();
            if (codigo == 0) break;

            System.out.print("Altura (m): ");
            double altura = sc.nextDouble();
            System.out.print("Peso (kg): ");
            double peso = sc.nextDouble();

            somaAlturas += altura;
            somaPesos += peso;
            total++;

            if (altura > maiorAltura) { maiorAltura = altura; codMaisAlto = codigo; }
            if (altura < menorAltura) { menorAltura = altura; codMaisBaixo = codigo; }
            if (peso > maiorPeso) { maiorPeso = peso; codMaisGordo = codigo; }
            if (peso < menorPeso) { menorPeso = peso; codMaisMagro = codigo; }
        }

        System.out.println("Cliente mais alto: código " + codMaisAlto + " (" + maiorAltura + " m)");
        System.out.println("Cliente mais baixo: código " + codMaisBaixo + " (" + menorAltura + " m)");
        System.out.println("Cliente mais gordo: código " + codMaisGordo + " (" + maiorPeso + " kg)");
        System.out.println("Cliente mais magro: código " + codMaisMagro + " (" + menorPeso + " kg)");
        System.out.println("Média de alturas: " + (somaAlturas / total));
        System.out.println("Média de pesos: " + (somaPesos / total));
    }
}
