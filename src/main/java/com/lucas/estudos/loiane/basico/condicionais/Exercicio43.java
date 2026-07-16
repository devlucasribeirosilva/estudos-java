package com.lucas.estudos.loiane.basico.condicionais;
import java.util.Scanner;

public class Exercicio43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] codigos = {100, 101, 102, 103, 104};
        String[] nomes = {"Cachorro Quente", "Bauru Simples", "Bauru com ovo", "Hambúrguer", "Cheeseburguer"};
        double[] precos = {1.20, 1.30, 1.50, 1.20, 1.30};

        System.out.println("Cardápio:");
        for (int i = 0; i < codigos.length; i++) {
            System.out.printf("%d - %s - R$ %.2f%n", codigos[i], nomes[i], precos[i]);
        }

        double totalPedido = 0;
        int codigo;

        do {
            System.out.print("Código do item (0 para encerrar): ");
            codigo = sc.nextInt();

            if (codigo != 0) {
                int indice = -1;
                for (int i = 0; i < codigos.length; i++) {
                    if (codigos[i] == codigo) {
                        indice = i;
                        break;
                    }
                }

                if (indice == -1) {
                    System.out.println("Código inválido!");
                } else {
                    System.out.print("Quantidade: ");
                    int quantidade = sc.nextInt();
                    double valorItem = precos[indice] * quantidade;
                    totalPedido += valorItem;
                    System.out.printf("%s x%d = R$ %.2f%n", nomes[indice], quantidade, valorItem);
                }
            }
        } while (codigo != 0);

        System.out.printf("Total geral do pedido: R$ %.2f%n", totalPedido);
    }
}
