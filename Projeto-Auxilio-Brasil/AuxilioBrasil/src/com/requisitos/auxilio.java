package com.requisitos;
import java.util.*;

public class auxilio {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int mesesAno = 12;
        boolean situacaoUm;
        boolean situacaoDois;
        double salarioReal;
        int mesesTrabalhado;
        int quantidadeFilhos;
        double salarioMinimo = 1212.45;

        System.out.println("Qual seu salário nos ultimos 12 meses?");
        salarioReal = input.nextDouble();

        System.out.println("Quantos meses você trabalhou nos ultimos 12 meses?");
        mesesTrabalhado = input.nextInt();

        System.out.println("Você é casado?");
        boolean seCasado;
        seCasado = input.nextBoolean();

        int casado;

        if (seCasado == true) {
            casado = 2;
        } else {
            casado = 1;
        }
        System.out.println("Quantos filhos você tem?");
        quantidadeFilhos = input.nextInt();

        double decimoTerceiro;
        decimoTerceiro = salarioReal / mesesAno * mesesTrabalhado;

        double salarioAnual;
        salarioAnual = salarioReal * mesesTrabalhado + decimoTerceiro;

        double rendaPercapita;
        int totalPessoas;
        totalPessoas = quantidadeFilhos + casado;
        rendaPercapita = salarioReal / totalPessoas;

        if (salarioAnual <= salarioMinimo * 13) {
            situacaoUm = true;
        } else {
            situacaoUm = false;
        }

        if (rendaPercapita <= salarioMinimo) {
            situacaoDois = true;
        } else {
            situacaoDois = false;
        }

        boolean requisitos;
        requisitos = situacaoUm && situacaoDois;

        if (requisitos == true) {
            System.out.println("Você atende aos requisitos necessários!");
        } else {
            System.out.println("Você não atende aos requisitos necessários!");
        }
    }
}
