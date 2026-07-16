package com.lucas.estudos.loiane.basico.condicionais;
import java.util.Scanner;

public class Exercicio41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Valor da dívida: R$ ");
        double valor = sc.nextDouble();
        System.out.print("Quantidade de parcelas (1, 3, 6, 9 ou 12): ");
        int parcelas = sc.nextInt();

        double percentualJuros;
        switch (parcelas) {
            case 1: percentualJuros = 0; break;
            case 3: percentualJuros = 10; break;
            case 6: percentualJuros = 15; break;
            case 9: percentualJuros = 20; break;
            case 12: percentualJuros = 25; break;
            default:
                System.out.println("Quantidade de parcelas inválida!");
                return;
        }

        double juros = valor * (percentualJuros / 100);
        double valorParcela = (valor + juros) / parcelas;

        System.out.println("Valor da Dívida | Valor dos Juros | Quantidade de Parcelas | Valor da Parcela");
        System.out.printf("R$ %.2f | R$ %.2f | %d | R$ %.2f%n", valor, juros, parcelas, valorParcela);
    }
}
