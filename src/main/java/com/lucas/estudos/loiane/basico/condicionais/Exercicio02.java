package com.lucas.estudos.loiane.basico.condicionais;
import java.util.Scanner;


public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String usuario, senha;
        do {
            System.out.print("Usuário: ");
            usuario = sc.nextLine();
            System.out.print("Senha: ");
            senha = sc.nextLine();
            if (senha.equals(usuario)) {
                System.out.println("Erro: a senha não pode ser igual ao nome de usuário!");
            }
        } while (senha.equals(usuario));
        System.out.println("Cadastro realizado com sucesso!");
    }
}
