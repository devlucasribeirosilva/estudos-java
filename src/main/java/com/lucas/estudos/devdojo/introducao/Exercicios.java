package com.lucas.estudos.devdojo.introducao;

import java.util.Date;

/**
 * Prática
 *
 * Crie variaveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem
 *
 * Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salário de <salario>, na
 * data <data>
 * **/

public class Exercicios {
    public static void main(String[] args) {
        String nome = "Lucas";
        String endereco = "QNM 19 CJ B LT 19";
        double salario = 3500;
        String data = "14/07/2026";

        System.out.println("Eu " + nome +
                ", morando no endereço " + endereco +
                ", confirmo que recebi o salário de " + salario + " na data " + data);
    }
}
