package com.lucas.estudos.loiane.basico.condicionais;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome;
        do {
            System.out.print("Nome (mais de 3 caracteres): ");
            nome = sc.nextLine();
        } while (nome.length() <= 3);

        int idade;
        do {
            System.out.print("Idade (entre 0 e 150): ");
            idade = sc.nextInt();
        } while (idade < 0 || idade > 150);

        double salario;
        do {
            System.out.print("Salário (maior que zero): ");
            salario = sc.nextDouble();
        } while (salario <= 0);

        char sexo;
        do {
            System.out.print("Sexo ('f' ou 'm'): ");
            sexo = sc.next().charAt(0);
        } while (sexo != 'f' && sexo != 'm');

        char estadoCivil;
        do {
            System.out.print("Estado civil ('s','c','v','d'): ");
            estadoCivil = sc.next().charAt(0);
        } while ("scvd".indexOf(estadoCivil) == -1);

        System.out.println("Dados válidos!");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado civil: " + estadoCivil);
    }
}
