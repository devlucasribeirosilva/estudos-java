package com.lucas.estudos.loiane.basico.condicionais;
import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char repetir;

        do {
            int n;
            do {
                System.out.print("Digite um número inteiro positivo menor que 16: ");
                n = sc.nextInt();
            } while (n < 0 || n >= 16);

            long fatorial = 1;
            for (int i = n; i >= 1; i--) {
                fatorial *= i;
            }
            System.out.println(n + "! = " + fatorial);

            System.out.print("Deseja calcular outro fatorial? (s/n): ");
            repetir = sc.next().charAt(0);
        } while (repetir == 's');
    }
}
