package com.lucas.estudos.loiane.basico.condicionais;
import java.util.Scanner;

public class Exercicio31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char continuar;

        do {
            double total = 0;
            int produto = 1;
            double valor;

            System.out.println("Lojas Tabajara");
            do {
                System.out.print("Produto " + produto + " (0 para finalizar): R$ ");
                valor = sc.nextDouble();
                if (valor > 0) {
                    System.out.println("Produto " + produto + ": R$ " + valor);
                    total += valor;
                    produto++;
                }
            } while (valor != 0);

            System.out.println("Total: R$ " + total);
            System.out.print("Dinheiro: R$ ");
            double dinheiro = sc.nextDouble();
            System.out.println("Troco: R$ " + (dinheiro - total));

            System.out.print("Registrar nova compra? (s/n): ");
            continuar = sc.next().charAt(0);
        } while (continuar == 's');
    }
}
