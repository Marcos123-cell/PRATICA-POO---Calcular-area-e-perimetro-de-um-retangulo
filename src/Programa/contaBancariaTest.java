package Programa;

import Dominio.ContaBancaria;

import java.util.Scanner;

public class contaBancariaTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaBancaria cb = new ContaBancaria();

        System.out.println("Bem-vindo ao Banco Santander!");

        System.out.println("\nVamos fazer seu cadastro!\n\nMe fala seu nome completo: ");
        cb.setTitular(sc.nextLine());

        System.out.println("\nAgora como você quer que eu te chame: ");
        cb.apelido = sc.nextLine();

        System.out.println("Beleza, " + cb.apelido + "esta é sua conta");

        System.out.println("Titular: " + cb.getTitular() + "\nSaldo R$ " + cb.getSaldo());

        System.out.println("É necessario fazer um primeiro depósito, pois se não, não consiguiremos liberar sua conta, qual seria o valor?");
        cb.depositar(sc.nextDouble());

        System.out.println("Seu saldo foi atualizado e sua conta foi liberada." + "\nConta atualizada: " + cb.getTitular() + ", " + cb.getSaldo());

        System.out.println("Deseja algo mais?");





    }
}
