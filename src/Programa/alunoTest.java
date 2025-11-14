package Programa;

import Dominio.Aluno;

import java.util.Scanner;

public class alunoTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ola, vamos calcular sua média!");

        System.out.print("\nAntes, me fala seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Beleza, vamos começar com a nota do seu 1° bimestre: ");
        double nota1 = sc.nextDouble();

        System.out.println("nota do 2° bimestre: ");
        double nota2 = sc.nextDouble();

        System.out.println("nota do 3° bimestre: ");
        double nota3 = sc.nextDouble();

        System.out.println("nota do 4° bimestre: ");
        double nota4 = sc.nextDouble();

        Aluno al = new Aluno(nome, nota1, nota2, nota3, nota4);

        al.estaAprovado();
    }
}
